package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteServiceResponse extends StObject {
  
  /**
    * The full description of the deleted service.
    */
  var service: js.UndefOr[Service] = js.native
}
object DeleteServiceResponse {
  
  @scala.inline
  def apply(): DeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteServiceResponse]
  }
  
  @scala.inline
  implicit class DeleteServiceResponseMutableBuilder[Self <: DeleteServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
