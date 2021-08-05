package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a GET all indirections request.
  */
trait AllIndirectionsResponse
  extends StObject
     with ResponseBase {
  
  @JSName("result")
  var result_AllIndirectionsResponse: js.Array[Indirection]
}
object AllIndirectionsResponse {
  
  inline def apply(result: js.Array[Indirection]): AllIndirectionsResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllIndirectionsResponse]
  }
  
  extension [Self <: AllIndirectionsResponse](x: Self) {
    
    inline def setResult(value: js.Array[Indirection]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: Indirection*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
