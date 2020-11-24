package typings.d3Indirections

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
  implicit class IndirectionByUidResponseOps[Self <: IndirectionByUidResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResult(value: Indirection): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
