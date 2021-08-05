package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNameAndResourceType extends StObject {
  
  /**
    * The shareable resource types.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the AWS services to which the resources belong.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object ServiceNameAndResourceType {
  
  inline def apply(): ServiceNameAndResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceNameAndResourceType]
  }
  
  extension [Self <: ServiceNameAndResourceType](x: Self) {
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
