package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeAsyncResponse extends StObject {
  
  /**
    * The status code.
    */
  var Status: js.UndefOr[HttpStatus] = js.native
}
object InvokeAsyncResponse {
  
  @scala.inline
  def apply(): InvokeAsyncResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeAsyncResponse]
  }
  
  @scala.inline
  implicit class InvokeAsyncResponseMutableBuilder[Self <: InvokeAsyncResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: HttpStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
