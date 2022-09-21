package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNameAndResourceType extends StObject {
  
  /**
    * Specifies the scope of visibility of resources of this type:    REGIONAL – The resource can be accessed only by using requests that target the Amazon Web Services Region in which the resource exists.    GLOBAL – The resource can be accessed from any Amazon Web Services Region.  
    */
  var resourceRegionScope: js.UndefOr[ResourceRegionScope] = js.undefined
  
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon Web Services service to which resources of this type belong.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object ServiceNameAndResourceType {
  
  inline def apply(): ServiceNameAndResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceNameAndResourceType]
  }
  
  extension [Self <: ServiceNameAndResourceType](x: Self) {
    
    inline def setResourceRegionScope(value: ResourceRegionScope): Self = StObject.set(x, "resourceRegionScope", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionScopeUndefined: Self = StObject.set(x, "resourceRegionScope", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
