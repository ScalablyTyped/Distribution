package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateOptions
  extends StObject
     with RegistrationOptions {
  
  var inverse: js.UndefOr[js.Function2[/* total */ Any, /* dropped */ Any, Any]] = js.undefined
  
  var result: js.UndefOr[js.Function1[/* total */ Any, Any]] = js.undefined
  
  var start: js.UndefOr[Any] = js.undefined
  
  def step(total: Any, next: Any): Any
}
object AggregateOptions {
  
  inline def apply(step: (Any, Any) => Any): AggregateOptions = {
    val __obj = js.Dynamic.literal(step = js.Any.fromFunction2(step))
    __obj.asInstanceOf[AggregateOptions]
  }
  
  extension [Self <: AggregateOptions](x: Self) {
    
    inline def setInverse(value: (/* total */ Any, /* dropped */ Any) => Any): Self = StObject.set(x, "inverse", js.Any.fromFunction2(value))
    
    inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
    
    inline def setResult(value: /* total */ Any => Any): Self = StObject.set(x, "result", js.Any.fromFunction1(value))
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStep(value: (Any, Any) => Any): Self = StObject.set(x, "step", js.Any.fromFunction2(value))
  }
}
