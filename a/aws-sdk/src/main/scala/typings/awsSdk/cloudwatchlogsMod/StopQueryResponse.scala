package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopQueryResponse extends StObject {
  
  /**
    * This is true if the query was stopped by the StopQuery operation.
    */
  var success: js.UndefOr[Success] = js.native
}
object StopQueryResponse {
  
  @scala.inline
  def apply(): StopQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopQueryResponse]
  }
  
  @scala.inline
  implicit class StopQueryResponseMutableBuilder[Self <: StopQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Success): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
