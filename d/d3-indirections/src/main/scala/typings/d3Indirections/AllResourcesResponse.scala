package typings.d3Indirections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a GET all resource of type request.
  */
@js.native
trait AllResourcesResponse[T /* <: ResourceType */] extends ResponseBase {
  
  @JSName("result")
  var result_AllResourcesResponse: js.Array[Resource[T]] = js.native
}
object AllResourcesResponse {
  
  @scala.inline
  def apply[T /* <: ResourceType */](result: js.Array[Resource[T]]): AllResourcesResponse[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllResourcesResponse[T]]
  }
  
  @scala.inline
  implicit class AllResourcesResponseOps[Self <: AllResourcesResponse[_], T /* <: ResourceType */] (val x: Self with AllResourcesResponse[T]) extends AnyVal {
    
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
    def setResultVarargs(value: Resource[T]*): Self = this.set("result", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[Resource[T]]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
