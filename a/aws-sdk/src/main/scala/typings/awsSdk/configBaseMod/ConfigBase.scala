package typings.awsSdk.configBaseMod

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdk.anon.ConfigurationOptionskeyst
import typings.awsSdk.awsSdkBooleans.`false`
import typings.awsSdk.awsSdkBooleans.`true`
import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.credentialsMod.CredentialsOptions
import typings.awsSdk.errorMod.AWSError
import typings.std.PromiseConstructor
import typings.std.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/config-base", "ConfigBase")
@js.native
class ConfigBase () extends ConfigurationOptions {
  def this(options: ConfigurationOptions) = this()
  
  /**
    * Loads credentials from the configuration object.
    */
  def getCredentials(
    callback: js.Function2[
      /* err */ AWSError | Null, 
      /* credentials */ Credentials | CredentialsOptions | Null, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Gets the promise dependency the SDK will use wherever Promises are returned.
    */
  def getPromisesDependency(): (PromiseConstructor with (Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]), 
        Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ], 
    Promise[js.Object]
  ])) | Unit = js.native
  
  /**
    * Loads configuration data from a JSON file into this config object.
    * Loading configuration will reset all existing configuration on the object.
    * This feature is not supported in the browser environment of the SDK.
    *
    * @param {string} path - the path relative to your process's current working directory to load configuration from.
    */
  def loadFromPath(path: String): ConfigBase = js.native
  
  /**
    * Sets the promise dependency the SDK will use wherever Promises are returned.
    * @param {function} dep - a reference to a Promise constructor
    */
  def setPromisesDependency(dep: js.Any): Unit = js.native
  
  /**
    * Updates the current configuration object with new options.
    *
    * @param {ConfigurationOptions} options - a map of option keys and values.
    * @param {boolean} allowUnknownKeys - Defaults to false. Whether unknown keys can be set on the configuration object.
    */
  def update(options: ConfigurationOptions): Unit = js.native
  @JSName("update")
  def update_false(options: ConfigurationOptions, allowUnknownKeys: `false`): Unit = js.native
  /**
    * Updates the current configuration object with new options.
    *
    * @param {ConfigurationOptions} options - a map of option keys and values.
    * @param {boolean} allowUnknownKeys - Whether unknown keys can be set on the configuration object.
    */
  @JSName("update")
  def update_true(options: ConfigurationOptionskeyst, allowUnknownKeys: `true`): Unit = js.native
}
