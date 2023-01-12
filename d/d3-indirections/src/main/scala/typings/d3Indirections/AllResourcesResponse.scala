package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a GET all resource of type request.
  */
trait AllResourcesResponse[T /* <: ResourceType */]
  extends StObject
     with ResponseBase {
  
  @JSName("result")
  var result_AllResourcesResponse: js.Array[Resource[T]]
}
object AllResourcesResponse {
  
  inline def apply[T /* <: ResourceType */](result: js.Array[Resource[T]]): AllResourcesResponse[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllResourcesResponse[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllResourcesResponse[?], T /* <: ResourceType */] (val x: Self & AllResourcesResponse[T]) extends AnyVal {
    
    inline def setResult(value: js.Array[Resource[T]]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: Resource[T]*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
