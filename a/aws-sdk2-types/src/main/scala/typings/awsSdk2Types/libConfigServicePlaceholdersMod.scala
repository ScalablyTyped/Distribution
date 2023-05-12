package typings.awsSdk2Types

import typings.awsSdk2Types.clientsDynamodbMod.ClientConfiguration
import typings.awsSdk2Types.clientsDynamodbMod.apiVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigServicePlaceholdersMod {
  
  /* note: abstract class */ @JSImport("aws-sdk2-types/lib/config_service_placeholders", "ConfigurationServicePlaceholders")
  @js.native
  open class ConfigurationServicePlaceholders () extends StObject {
    
    var dynamodb: js.UndefOr[ClientConfiguration] = js.native
    
    var rdsdataservice: js.UndefOr[typings.awsSdk2Types.clientsRdsdataserviceMod.ClientConfiguration] = js.native
    
    var s3: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ClientConfiguration] = js.native
    
    var ses: js.UndefOr[typings.awsSdk2Types.clientsSesMod.ClientConfiguration] = js.native
    
    var ssm: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.ClientConfiguration] = js.native
  }
  
  trait ConfigurationServiceApiVersions extends StObject {
    
    var dynamodb: js.UndefOr[apiVersion] = js.undefined
    
    var rdsdataservice: js.UndefOr[typings.awsSdk2Types.clientsRdsdataserviceMod.apiVersion] = js.undefined
    
    var s3: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.apiVersion] = js.undefined
    
    var ses: js.UndefOr[typings.awsSdk2Types.clientsSesMod.apiVersion] = js.undefined
    
    var ssm: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.apiVersion] = js.undefined
  }
  object ConfigurationServiceApiVersions {
    
    inline def apply(): ConfigurationServiceApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationServiceApiVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigurationServiceApiVersions] (val x: Self) extends AnyVal {
      
      inline def setDynamodb(value: apiVersion): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
      
      inline def setRdsdataservice(value: typings.awsSdk2Types.clientsRdsdataserviceMod.apiVersion): Self = StObject.set(x, "rdsdataservice", value.asInstanceOf[js.Any])
      
      inline def setRdsdataserviceUndefined: Self = StObject.set(x, "rdsdataservice", js.undefined)
      
      inline def setS3(value: typings.awsSdk2Types.clientsS3Mod.apiVersion): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
      
      inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
      
      inline def setSes(value: typings.awsSdk2Types.clientsSesMod.apiVersion): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
      
      inline def setSesUndefined: Self = StObject.set(x, "ses", js.undefined)
      
      inline def setSsm(value: typings.awsSdk2Types.clientsSsmMod.apiVersion): Self = StObject.set(x, "ssm", value.asInstanceOf[js.Any])
      
      inline def setSsmUndefined: Self = StObject.set(x, "ssm", js.undefined)
    }
  }
}
