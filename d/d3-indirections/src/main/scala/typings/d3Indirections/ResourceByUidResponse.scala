package typings.d3Indirections

import org.scalablytyped.runtime.StObject
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
  implicit class ResourceByUidResponseMutableBuilder[Self <: ResourceByUidResponse[_], T /* <: ResourceType */] (val x: Self with ResourceByUidResponse[T]) extends AnyVal {
    
    @scala.inline
    def setResult(value: Resource[T]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
