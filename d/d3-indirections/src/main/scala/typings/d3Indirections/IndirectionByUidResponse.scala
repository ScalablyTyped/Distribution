package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a GET indirection by UID request.
  */
@js.native
trait IndirectionByUidResponse extends ResponseBase {
  
  @JSName("result")
  var result_IndirectionByUidResponse: Indirection = js.native
}
object IndirectionByUidResponse {
  
  @scala.inline
  def apply(result: Indirection): IndirectionByUidResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndirectionByUidResponse]
  }
  
  @scala.inline
  implicit class IndirectionByUidResponseMutableBuilder[Self <: IndirectionByUidResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Indirection): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
