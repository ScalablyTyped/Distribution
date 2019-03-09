package typings
package confLib.confMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  /**
  	 * The config is cleared if reading the config file causes a `SyntaxError`. This is a good default, as the config file is not intended to be hand-edited, so it usually means the config is corrupt and there's nothing the user can do about it anyway. However, if you let the user edit the config file directly, mistakes might happen and it could be more useful to throw an error when the config is invalid instead of clearing. Disabling this option will make it throw a `SyntaxError` on invalid config instead of clearing.
  	 *
  	 * @default true
  	 */
  val clearInvalidConfig: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Name of the config file (without extension).
  	 *
  	 * Useful if you need multiple config files for your app or module. For example, different config files between two major versions.
  	 *
  	 * @default 'config'
  	 */
  val configName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * **You most likely don't need this. Please don't use it unless you really have to.**
  	 *
  	 * The only use-case I can think of is having the config located in the app directory or on some external storage. Default: System default user [config directory](https://github.com/sindresorhus/env-paths#pathsconfig).
  	 */
  val cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Config used if there are no existing config.
  	 */
  val defaults: js.UndefOr[org.scalablytyped.runtime.StringDictionary[T]] = js.undefined
  /**
  	 * Function to deserialize the config object from a UTF-8 string when reading the config file.
  	 *
  	 * You would usually not need this, but it could be useful if you want to use a format other than JSON.
  	 *
  	 * @default JSON.parse
  	 */
  val deserialize: js.UndefOr[
    js.Function1[/* text */ java.lang.String, org.scalablytyped.runtime.StringDictionary[T]]
  ] = js.undefined
  /**
  	 * Note that this is **not intended for security purposes**, since the encryption key would be easily found inside a plain-text Node.js app.
  	 *
  	 * Its main use is for obscurity. If a user looks through the config directory and finds the config file, since it's just a JSON file, they may be tempted to modify it. By providing an encryption key, the file will be obfuscated, which should hopefully deter any users from doing so.
  	 *
  	 * It also has the added bonus of ensuring the config file's integrity. If the file is changed in any way, the decryption will not work, in which case the store will just reset back to its default state.
  	 *
  	 * When specified, the store will be encrypted using the [`aes-256-cbc`](https://en.wikipedia.org/wiki/Block_cipher_mode_of_operation) encryption algorithm.
  	 */
  val encryptionKey: js.UndefOr[
    java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView
  ] = js.undefined
  /**
  	 * Extension of the config file.
  	 *
  	 * You would usually not need this, but could be useful if you want to interact with a file with a custom file extension that can be associated with your app. These might be simple save/export/preference files that are intended to be shareable or saved outside of the app.
  	 *
  	 * @default 'json'
  	 */
  val fileExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * You only need to specify this if you don't have a `package.json` file in your project. Default: The name field in the `package.json` closest to where `conf` is imported.
  	 */
  val projectName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * **You most likely don't need this. Please don't use it unless you really have to.**
  	 *
  	 * Suffix appended to `projectName` during config file creation to avoid name conflicts with native apps.
  	 *
  	 * You can pass an empty string to remove the suffix.
  	 *
  	 * For example, on macOS, the config file will be stored in the `~/Library/Preferences/foo-nodejs` directory, where `foo` is the `projectName`.
  	 *
  	 * @default 'nodejs'
  	 */
  val projectSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Function to serialize the config object to a UTF-8 string when writing the config file.
  	 *
  	 * You would usually not need this, but it could be useful if you want to use a format other than JSON.
  	 *
  	 * @default value => JSON.stringify(value, null, '\t')
  	 */
  val serialize: js.UndefOr[
    js.Function1[/* value */ org.scalablytyped.runtime.StringDictionary[T], java.lang.String]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    clearInvalidConfig: js.UndefOr[scala.Boolean] = js.undefined,
    configName: java.lang.String = null,
    cwd: java.lang.String = null,
    defaults: org.scalablytyped.runtime.StringDictionary[T] = null,
    deserialize: js.Function1[/* text */ java.lang.String, org.scalablytyped.runtime.StringDictionary[T]] = null,
    encryptionKey: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView = null,
    fileExtension: java.lang.String = null,
    projectName: java.lang.String = null,
    projectSuffix: java.lang.String = null,
    serialize: js.Function1[/* value */ org.scalablytyped.runtime.StringDictionary[T], java.lang.String] = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearInvalidConfig)) __obj.updateDynamic("clearInvalidConfig")(clearInvalidConfig)
    if (configName != null) __obj.updateDynamic("configName")(configName)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (deserialize != null) __obj.updateDynamic("deserialize")(deserialize)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension)
    if (projectName != null) __obj.updateDynamic("projectName")(projectName)
    if (projectSuffix != null) __obj.updateDynamic("projectSuffix")(projectSuffix)
    if (serialize != null) __obj.updateDynamic("serialize")(serialize)
    __obj.asInstanceOf[Options[T]]
  }
}

