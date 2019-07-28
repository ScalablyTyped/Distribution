package typings.conf.confMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchema
import typings.node.Buffer
import typings.node.NodeJSNs.TypedArray
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
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
  val clearInvalidConfig: js.UndefOr[Boolean] = js.undefined
  /**
  		Name of the config file (without extension).
  		Useful if you need multiple config files for your app or module. For example, different config files between two major versions.
  		@default 'config'
  		*/
  val configName: js.UndefOr[String] = js.undefined
  /**
  		__You most likely don't need this. Please don't use it unless you really have to.__
  		The only use-case I can think of is having the config located in the app directory or on some external storage. Default: System default user [config directory](https://github.com/sindresorhus/env-paths#pathsconfig).
  		*/
  val cwd: js.UndefOr[String] = js.undefined
  /**
  		Config used if there are no existing config.
  		**Note:** The values in `defaults` will overwrite the `default` key in the `schema` option.
  		*/
  val defaults: js.UndefOr[StringDictionary[T]] = js.undefined
  /**
  		Function to deserialize the config object from a UTF-8 string when reading the config file.
  		You would usually not need this, but it could be useful if you want to use a format other than JSON.
  		@default JSON.parse
  		*/
  val deserialize: js.UndefOr[js.Function1[/* text */ String, StringDictionary[T]]] = js.undefined
  /**
  		Note that this is __not intended for security purposes__, since the encryption key would be easily found inside a plain-text Node.js app.
  		Its main use is for obscurity. If a user looks through the config directory and finds the config file, since it's just a JSON file, they may be tempted to modify it. By providing an encryption key, the file will be obfuscated, which should hopefully deter any users from doing so.
  		It also has the added bonus of ensuring the config file's integrity. If the file is changed in any way, the decryption will not work, in which case the store will just reset back to its default state.
  		When specified, the store will be encrypted using the [`aes-256-cbc`](https://en.wikipedia.org/wiki/Block_cipher_mode_of_operation) encryption algorithm.
  		*/
  val encryptionKey: js.UndefOr[String | Buffer | TypedArray | DataView] = js.undefined
  /**
  		Extension of the config file.
  		You would usually not need this, but could be useful if you want to interact with a file with a custom file extension that can be associated with your app. These might be simple save/export/preference files that are intended to be shareable or saved outside of the app.
  		@default 'json'
  		*/
  val fileExtension: js.UndefOr[String] = js.undefined
  /**
  		You only need to specify this if you don't have a `package.json` file in your project. Default: The name field in the `package.json` closest to where `conf` is imported.
  		*/
  val projectName: js.UndefOr[String] = js.undefined
  /**
  		__You most likely don't need this. Please don't use it unless you really have to.__
  		Suffix appended to `projectName` during config file creation to avoid name conflicts with native apps.
  		You can pass an empty string to remove the suffix.
  		For example, on macOS, the config file will be stored in the `~/Library/Preferences/foo-nodejs` directory, where `foo` is the `projectName`.
  		@default 'nodejs'
  		*/
  val projectSuffix: js.UndefOr[String] = js.undefined
  /**
  		[JSON Schema](https://json-schema.org) to validate your config data.
  		Under the hood, the JSON Schema validator [ajv](https://github.com/epoberezkin/ajv) is used to validate your config. We use [JSON Schema draft-07](http://json-schema.org/latest/json-schema-validation.html) and support all [validation keywords](https://github.com/epoberezkin/ajv/blob/master/KEYWORDS.md) and [formats](https://github.com/epoberezkin/ajv#formats).
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
  val schema: js.UndefOr[StringDictionary[JSONSchema]] = js.undefined
  /**
  		Function to serialize the config object to a UTF-8 string when writing the config file.
  		You would usually not need this, but it could be useful if you want to use a format other than JSON.
  		@default value => JSON.stringify(value, null, '\t')
  		*/
  val serialize: js.UndefOr[js.Function1[/* value */ StringDictionary[T], String]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    accessPropertiesByDotNotation: js.UndefOr[Boolean] = js.undefined,
    clearInvalidConfig: js.UndefOr[Boolean] = js.undefined,
    configName: String = null,
    cwd: String = null,
    defaults: StringDictionary[T] = null,
    deserialize: /* text */ String => StringDictionary[T] = null,
    encryptionKey: String | Buffer | TypedArray | DataView = null,
    fileExtension: String = null,
    projectName: String = null,
    projectSuffix: String = null,
    schema: StringDictionary[JSONSchema] = null,
    serialize: /* value */ StringDictionary[T] => String = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessPropertiesByDotNotation)) __obj.updateDynamic("accessPropertiesByDotNotation")(accessPropertiesByDotNotation)
    if (!js.isUndefined(clearInvalidConfig)) __obj.updateDynamic("clearInvalidConfig")(clearInvalidConfig)
    if (configName != null) __obj.updateDynamic("configName")(configName)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1(deserialize))
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension)
    if (projectName != null) __obj.updateDynamic("projectName")(projectName)
    if (projectSuffix != null) __obj.updateDynamic("projectSuffix")(projectSuffix)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[Options[T]]
  }
}

