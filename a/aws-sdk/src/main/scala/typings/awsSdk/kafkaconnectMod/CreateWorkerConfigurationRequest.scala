package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkerConfigurationRequest extends StObject {
  
  /**
    * A summary description of the worker configuration.
    */
  var description: js.UndefOr[stringMax1024] = js.undefined
  
  /**
    * The name of the worker configuration.
    */
  var name: stringMin1Max128
  
  /**
    * Base64 encoded contents of connect-distributed.properties file.
    */
  var propertiesFileContent: SyntheticCreateWorkerConfigurationRequestString
}
object CreateWorkerConfigurationRequest {
  
  inline def apply(name: stringMin1Max128, propertiesFileContent: SyntheticCreateWorkerConfigurationRequestString): CreateWorkerConfigurationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], propertiesFileContent = propertiesFileContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkerConfigurationRequest]
  }
  
  extension [Self <: CreateWorkerConfigurationRequest](x: Self) {
    
    inline def setDescription(value: stringMax1024): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: stringMin1Max128): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPropertiesFileContent(value: SyntheticCreateWorkerConfigurationRequestString): Self = StObject.set(x, "propertiesFileContent", value.asInstanceOf[js.Any])
  }
}
