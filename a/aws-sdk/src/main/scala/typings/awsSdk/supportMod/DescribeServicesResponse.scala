package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeServicesResponse extends StObject {
  
  /**
    * A JSON-formatted list of AWS services.
    */
  var services: js.UndefOr[ServiceList] = js.native
}
object DescribeServicesResponse {
  
  @scala.inline
  def apply(): DescribeServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesResponse]
  }
  
  @scala.inline
  implicit class DescribeServicesResponseMutableBuilder[Self <: DescribeServicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServices(value: ServiceList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
