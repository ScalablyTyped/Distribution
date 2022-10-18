package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.cypress/types/sinon.SinonFakeTimersConfig> */
trait PartialSinonFakeTimersCon extends StObject {
  
  var now: js.UndefOr[Double | js.Date] = js.undefined
  
  var shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined
  
  var toFake: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialSinonFakeTimersCon {
  
  inline def apply(): PartialSinonFakeTimersCon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonFakeTimersCon]
  }
  
  extension [Self <: PartialSinonFakeTimersCon](x: Self) {
    
    inline def setNow(value: Double | js.Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
    
    inline def setShouldAdvanceTime(value: Boolean): Self = StObject.set(x, "shouldAdvanceTime", value.asInstanceOf[js.Any])
    
    inline def setShouldAdvanceTimeUndefined: Self = StObject.set(x, "shouldAdvanceTime", js.undefined)
    
    inline def setToFake(value: js.Array[String]): Self = StObject.set(x, "toFake", value.asInstanceOf[js.Any])
    
    inline def setToFakeUndefined: Self = StObject.set(x, "toFake", js.undefined)
    
    inline def setToFakeVarargs(value: String*): Self = StObject.set(x, "toFake", js.Array(value*))
  }
}
