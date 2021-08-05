package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestEventPatternResponse extends StObject {
  
  /**
    * Indicates whether the event matches the event pattern.
    */
  var Result: js.UndefOr[Boolean] = js.undefined
}
object TestEventPatternResponse {
  
  inline def apply(): TestEventPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestEventPatternResponse]
  }
  
  extension [Self <: TestEventPatternResponse](x: Self) {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
