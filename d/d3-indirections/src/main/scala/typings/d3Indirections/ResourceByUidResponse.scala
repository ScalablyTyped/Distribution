package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a GET resource by UID request.
  */
trait ResourceByUidResponse[T /* <: ResourceType */]
  extends StObject
     with ResponseBase {
  
  @JSName("result")
  var result_ResourceByUidResponse: Resource[T]
}
object ResourceByUidResponse {
  
  inline def apply[T /* <: ResourceType */](result: Resource[T]): ResourceByUidResponse[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceByUidResponse[T]]
  }
  
  extension [Self <: ResourceByUidResponse[?], T /* <: ResourceType */](x: Self & ResourceByUidResponse[T]) {
    
    inline def setResult(value: Resource[T]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
