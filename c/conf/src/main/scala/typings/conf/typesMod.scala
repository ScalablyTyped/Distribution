package typings.conf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.conf.mod.default
import typings.jsonSchemaTyped.mod.JSONSchema
import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.node.eventsMod.EventEmitter
import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Deserialize[T] = js.Function1[/* text */ String, T]
  
  type Migrations[T] = StringDictionary[js.Function1[/* store */ default[T], Unit]]
  
  type OnDidAnyChangeCallback[T] = js.Function2[/* newValue */ js.UndefOr[T], /* oldValue */ js.UndefOr[T], Unit]
  
  type OnDidChangeCallback[T] = js.Function2[/* newValue */ js.UndefOr[T], /* oldValue */ js.UndefOr[T], Unit]
  
  trait Options[T] extends StObject {
    
    /**
      Access nested properties by dot notation.
      @default true
      @example
      ```
      const config = new Conf();
      config.set({
      foo: {
      bar: {
      foobar: '🦄'
      }
      }
      });
      console.log(config.get('foo.bar.foobar'));
      //=> '🦄'
      ```
      Alternatively, you can set this option to `false` so the whole string would be treated as one key.
      @example
      ```
      const config = new Conf({accessPropertiesByDotNotation: false});
      config.set({
      `foo.bar.foobar`: '🦄'
      });
      console.log(config.get('foo.bar.foobar'));
      //=> '🦄'
      ```
      */
    val accessPropertiesByDotNotation: js.UndefOr[Boolean] = js.undefined
    
    /**
      The config is cleared if reading the config file causes a `SyntaxError`. This is a good default, as the config file is not intended to be hand-edited, so it usually means the config is corrupt and there's nothing the user can do about it anyway. However, if you let the user edit the config file directly, mistakes might happen and it could be more useful to throw an error when the config is invalid instead of clearing. Disabling this option will make it throw a `SyntaxError` on invalid config instead of clearing.
      @default true
      */
    var clearInvalidConfig: js.UndefOr[Boolean] = js.undefined
    
    /**
      Name of the config file (without extension).
      Useful if you need multiple config files for your app or module. For example, different config files between two major versions.
      @default 'config'
      */
    var configName: js.UndefOr[String] = js.undefined
    
    /**
      __You most likely don't need this. Please don't use it unless you really have to.__
      The only use-case I can think of is having the config located in the app directory or on some external storage. Default: System default user [config directory](https://github.com/sindresorhus/env-paths#pathsconfig).
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      Config used if there are no existing config.
      **Note:** The values in `defaults` will overwrite the `default` key in the `schema` option.
      */
    var defaults: js.UndefOr[T] = js.undefined
    
    /**
      Function to deserialize the config object from a UTF-8 string when reading the config file.
      You would usually not need this, but it could be useful if you want to use a format other than JSON.
      @default JSON.parse
      */
    val deserialize: js.UndefOr[Deserialize[T]] = js.undefined
    
    /**
      Note that this is __not intended for security purposes__, since the encryption key would be easily found inside a plain-text Node.js app.
      Its main use is for obscurity. If a user looks through the config directory and finds the config file, since it's just a JSON file, they may be tempted to modify it. By providing an encryption key, the file will be obfuscated, which should hopefully deter any users from doing so.
      It also has the added bonus of ensuring the config file's integrity. If the file is changed in any way, the decryption will not work, in which case the store will just reset back to its default state.
      When specified, the store will be encrypted using the [`aes-256-cbc`](https://en.wikipedia.org/wiki/Block_cipher_mode_of_operation) encryption algorithm.
      */
    var encryptionKey: js.UndefOr[String | Buffer | TypedArray | DataView] = js.undefined
    
    /**
      Extension of the config file.
      You would usually not need this, but could be useful if you want to interact with a file with a custom file extension that can be associated with your app. These might be simple save/export/preference files that are intended to be shareable or saved outside of the app.
      @default 'json'
      */
    var fileExtension: js.UndefOr[String] = js.undefined
    
    /**
      You can use migrations to perform operations to the store whenever a version is changed.
      The `migrations` object should consist of a key-value pair of `'version': handler`. The `version` can also be a [semver range](https://github.com/npm/node-semver#ranges).
      Note: The version the migrations use refers to the __project version__ by default. If you want to change this behavior, specify the `projectVersion` option.
      @example
      ```
      import Conf = require('conf');
      const store = new Conf({
      migrations: {
      '0.0.1': store => {
      store.set('debugPhase', true);
      },
      '1.0.0': store => {
      store.delete('debugPhase');
      store.set('phase', '1.0.0');
      },
      '1.0.2': store => {
      store.set('phase', '1.0.2');
      },
      '>=2.0.0': store => {
      store.set('phase', '>=2.0.0');
      }
      }
      });
      ```
      */
    var migrations: js.UndefOr[Migrations[T]] = js.undefined
    
    /**
      You only need to specify this if you don't have a package.json file in your project or if it doesn't have a name defined within it.
      Default: The name field in the `package.json` closest to where `conf` is imported.
      */
    var projectName: js.UndefOr[String] = js.undefined
    
    /**
      __You most likely don't need this. Please don't use it unless you really have to.__
      Suffix appended to `projectName` during config file creation to avoid name conflicts with native apps.
      You can pass an empty string to remove the suffix.
      For example, on macOS, the config file will be stored in the `~/Library/Preferences/foo-nodejs` directory, where `foo` is the `projectName`.
      @default 'nodejs'
      */
    val projectSuffix: js.UndefOr[String] = js.undefined
    
    /**
      You only need to specify this if you don't have a package.json file in your project or if it doesn't have a version defined within it.
      Default: The name field in the `package.json` closest to where `conf` is imported.
      */
    var projectVersion: js.UndefOr[String] = js.undefined
    
    /**
      [JSON Schema](https://json-schema.org) to validate your config data.
      Under the hood, the JSON Schema validator [ajv](https://github.com/epoberezkin/ajv) is used to validate your config. We use [JSON Schema draft-07](https://json-schema.org/latest/json-schema-validation.html) and support all [validation keywords](https://github.com/epoberezkin/ajv/blob/master/KEYWORDS.md) and [formats](https://github.com/epoberezkin/ajv#formats).
      You should define your schema as an object where each key is the name of your data's property and each value is a JSON schema used to validate that property. See more [here](https://json-schema.org/understanding-json-schema/reference/object.html#properties).
      @example
      ```
      import Conf = require('conf');
      const schema = {
      foo: {
      type: 'number',
      maximum: 100,
      minimum: 1,
      default: 50
      },
      bar: {
      type: 'string',
      format: 'url'
      }
      };
      const config = new Conf({schema});
      console.log(config.get('foo'));
      //=> 50
      config.set('foo', '1');
      // [Error: Config schema violation: `foo` should be number]
      ```
      **Note:** The `default` value will be overwritten by the `defaults` option if set.
      */
    var schema: js.UndefOr[Schema[T]] = js.undefined
    
    /**
      Function to serialize the config object to a UTF-8 string when writing the config file.
      You would usually not need this, but it could be useful if you want to use a format other than JSON.
      @default value => JSON.stringify(value, null, '\t')
      */
    val serialize: js.UndefOr[Serialize[T]] = js.undefined
    
    /**
      Watch for any changes in the config file and call the callback for `onDidChange` if set. This is useful if there are multiple processes changing the same config file.
      __Currently this option doesn't work on Node.js 8 on macOS.__
      @default false
      */
    val watch: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], T] (val x: Self & Options[T]) extends AnyVal {
      
      @scala.inline
      def setAccessPropertiesByDotNotation(value: Boolean): Self = StObject.set(x, "accessPropertiesByDotNotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPropertiesByDotNotationUndefined: Self = StObject.set(x, "accessPropertiesByDotNotation", js.undefined)
      
      @scala.inline
      def setClearInvalidConfig(value: Boolean): Self = StObject.set(x, "clearInvalidConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearInvalidConfigUndefined: Self = StObject.set(x, "clearInvalidConfig", js.undefined)
      
      @scala.inline
      def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDefaults(value: T): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setDeserialize(value: /* text */ String => T): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      @scala.inline
      def setEncryptionKey(value: String | Buffer | TypedArray | DataView): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      @scala.inline
      def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
      
      @scala.inline
      def setMigrations(value: Migrations[T]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
      
      @scala.inline
      def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
      
      @scala.inline
      def setProjectSuffix(value: String): Self = StObject.set(x, "projectSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectSuffixUndefined: Self = StObject.set(x, "projectSuffix", js.undefined)
      
      @scala.inline
      def setProjectVersion(value: String): Self = StObject.set(x, "projectVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectVersionUndefined: Self = StObject.set(x, "projectVersion", js.undefined)
      
      @scala.inline
      def setSchema(value: Schema[T]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSerialize(value: T => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type Schema[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Property in keyof T ]: conf.conf/dist/source/types.ValueSchema}
    */ typings.conf.confStrings.Schema & TopLevel[js.Any]
  
  type Serialize[T] = js.Function1[/* value */ T, String]
  
  type Unsubscribe = js.Function0[EventEmitter]
  
  type ValueSchema = JSONSchema
}
