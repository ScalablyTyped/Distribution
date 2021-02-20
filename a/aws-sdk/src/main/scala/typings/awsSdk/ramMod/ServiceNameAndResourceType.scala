package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNameAndResourceType extends StObject {
  
  /**
    * The shareable resource types.
    */
  var resourceType: js.UndefOr[String] = js.native
  
  /**
    * The name of the AWS services to which the resources belong.
    */
  var serviceName: js.UndefOr[String] = js.native
}
object ServiceNameAndResourceType {
  
  @scala.inline
  def apply(): ServiceNameAndResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceNameAndResourceType]
  }
  
  @scala.inline
  implicit class ServiceNameAndResourceTypeMutableBuilder[Self <: ServiceNameAndResourceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
