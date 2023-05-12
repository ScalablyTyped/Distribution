package typings.awsSdk2Types

import typings.awsSdk2Types.anon.ConfigurationOptionsConfi
import typings.awsSdk2Types.awsSdk2TypesBooleans.`true`
import typings.awsSdk2Types.awsSdk2TypesStrings.latest
import typings.awsSdk2Types.clientsDynamodbMod.ClientConfiguration
import typings.awsSdk2Types.libConfigBaseMod.ConfigurationOptions
import typings.awsSdk2Types.libConfigServicePlaceholdersMod.ConfigurationServiceApiVersions
import typings.awsSdk2Types.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigMod {
  
  @JSImport("aws-sdk2-types/lib/config", "Config")
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  open class Config ()
    extends typings.awsSdk2Types.libConfigBaseMod.ConfigBase {
    def this(options: ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
    
    /**
      * Updates the current configuration object with new options.
      *
      * @param {ConfigurationOptions} options - a map of option keys and values.
      * @param {boolean} allowUnknownKeys - Whether unknown keys can be set on the configuration object.
      */
    @JSName("update")
    def update_true(options: ConfigurationOptionsConfi, allowUnknownKeys: `true`): Unit = js.native
  }
  
  @JSImport("aws-sdk2-types/lib/config", "ConfigBase")
  @js.native
  open class ConfigBase ()
    extends typings.awsSdk2Types.libConfigBaseMod.ConfigBase {
    def this(options: ConfigurationOptions) = this()
  }
  
  trait APIVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[latest | String] = js.undefined
    
    /**
      * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
      */
    var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.undefined
  }
  object APIVersions {
    
    inline def apply(): APIVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: APIVersions] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: latest | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.awsSdk2Types.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders because Inheritance from two classes. Inlined dynamodb, rdsdataservice, s3, ses, ssm */ @js.native
  trait GlobalConfigInstance
    extends Config
       with APIVersions {
    
    var dynamodb: js.UndefOr[ClientConfiguration] = js.native
    
    var rdsdataservice: js.UndefOr[typings.awsSdk2Types.clientsRdsdataserviceMod.ClientConfiguration] = js.native
    
    var s3: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ClientConfiguration] = js.native
    
    var ses: js.UndefOr[typings.awsSdk2Types.clientsSesMod.ClientConfiguration] = js.native
    
    var ssm: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.ClientConfiguration] = js.native
  }
}
