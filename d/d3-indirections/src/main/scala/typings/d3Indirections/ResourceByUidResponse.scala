package typings.d3Indirections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a GET resource by UID request.
  */
@js.native
trait ResourceByUidResponse[T /* <: ResourceType */] extends ResponseBase {
  
  @JSName("result")
  var result_ResourceByUidResponse: Resource[T] = js.native
}
object ResourceByUidResponse {
  
  @scala.inline
  def apply[T /* <: ResourceType */](result: Resource[T]): ResourceByUidResponse[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceByUidResponse[T]]
  }
  
  @scala.inline
  implicit class ResourceByUidResponseOps[Self <: ResourceByUidResponse[_], T /* <: ResourceType */] (val x: Self with ResourceByUidResponse[T]) extends AnyVal {
    
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
    def setResult(value: Resource[T]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
