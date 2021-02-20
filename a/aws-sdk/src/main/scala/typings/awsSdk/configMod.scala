package typings.awsSdk

import typings.awsSdk.anon.ConfigurationOptionsConfi
import typings.awsSdk.awsSdkBooleans.`true`
import typings.awsSdk.awsSdkStrings.latest_
import typings.awsSdk.configBaseMod.ConfigurationOptions
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions
import typings.awsSdk.configServicePlaceholdersMod.ConfigurationServicePlaceholders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("aws-sdk/lib/config", "Config")
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  class Config ()
    extends typings.awsSdk.configBaseMod.ConfigBase {
    def this(options: ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
    
    /**
      * Updates the current configuration object with new options.
      *
      * @param {ConfigurationOptions} options - a map of option keys and values.
      * @param {boolean} allowUnknownKeys - Whether unknown keys can be set on the configuration object.
      */
    @JSName("update")
    def update_true(options: ConfigurationOptionsConfi, allowUnknownKeys: `true`): Unit = js.native
  }
  
  @JSImport("aws-sdk/lib/config", "ConfigBase")
  @js.native
  class ConfigBase ()
    extends typings.awsSdk.configBaseMod.ConfigBase {
    def this(options: ConfigurationOptions) = this()
  }
  
  @js.native
  trait APIVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[latest_ | String] = js.native
    
    /**
      * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
      */
    var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.native
  }
  object APIVersions {
    
    @scala.inline
    def apply(): APIVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIVersions]
    }
    
    @scala.inline
    implicit class APIVersionsMutableBuilder[Self <: APIVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: latest_ | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    }
  }
  
  type GlobalConfigInstance = Config with ConfigurationServicePlaceholders with APIVersions
}
