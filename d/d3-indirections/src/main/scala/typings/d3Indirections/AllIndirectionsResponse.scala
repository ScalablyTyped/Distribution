package typings.d3Indirections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a GET all indirections request.
  */
@js.native
trait AllIndirectionsResponse extends ResponseBase {
  
  @JSName("result")
  var result_AllIndirectionsResponse: js.Array[Indirection] = js.native
}
object AllIndirectionsResponse {
  
  @scala.inline
  def apply(result: js.Array[Indirection]): AllIndirectionsResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllIndirectionsResponse]
  }
  
  @scala.inline
  implicit class AllIndirectionsResponseOps[Self <: AllIndirectionsResponse] (val x: Self) extends AnyVal {
    
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
    def setResultVarargs(value: Indirection*): Self = this.set("result", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[Indirection]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
