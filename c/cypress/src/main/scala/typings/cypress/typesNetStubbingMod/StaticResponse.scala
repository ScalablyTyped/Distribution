package typings.cypress.typesNetStubbingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticResponse
  extends StObject
     with GenericStaticResponse[String, String | js.Object | Boolean | js.typedarray.ArrayBuffer | Null] {
  
  /**
    * Milliseconds to delay before the response is sent.
    * @deprecated Use `delay` instead of `delayMs`.
    */
  var delayMs: js.UndefOr[Double] = js.undefined
}
object StaticResponse {
  
  inline def apply(): StaticResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticResponse] (val x: Self) extends AnyVal {
    
    inline def setDelayMs(value: Double): Self = StObject.set(x, "delayMs", value.asInstanceOf[js.Any])
    
    inline def setDelayMsUndefined: Self = StObject.set(x, "delayMs", js.undefined)
  }
}
