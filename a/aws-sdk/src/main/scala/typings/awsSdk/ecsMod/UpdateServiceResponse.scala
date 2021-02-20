package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServiceResponse extends StObject {
  
  /**
    * The full description of your service following the update call.
    */
  var service: js.UndefOr[Service] = js.native
}
object UpdateServiceResponse {
  
  @scala.inline
  def apply(): UpdateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceResponse]
  }
  
  @scala.inline
  implicit class UpdateServiceResponseMutableBuilder[Self <: UpdateServiceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
