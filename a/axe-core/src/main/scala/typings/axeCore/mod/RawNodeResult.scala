package typings.axeCore.mod

import typings.axeCore.axeCoreStrings.failed
import typings.axeCore.axeCoreStrings.incomplete
import typings.axeCore.axeCoreStrings.passed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawNodeResult[T /* <: passed | failed | incomplete */] extends StObject {
  
  var all: js.Array[CheckResult]
  
  var any: js.Array[CheckResult]
  
  var impact: ImpactValue | Null
  
  var none: js.Array[CheckResult]
  
  var result: T
}
object RawNodeResult {
  
  inline def apply[T /* <: passed | failed | incomplete */](all: js.Array[CheckResult], any: js.Array[CheckResult], none: js.Array[CheckResult], result: T): RawNodeResult[T] = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], impact = null)
    __obj.asInstanceOf[RawNodeResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawNodeResult[?], T /* <: passed | failed | incomplete */] (val x: Self & RawNodeResult[T]) extends AnyVal {
    
    inline def setAll(value: js.Array[CheckResult]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllVarargs(value: CheckResult*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setAny(value: js.Array[CheckResult]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setAnyVarargs(value: CheckResult*): Self = StObject.set(x, "any", js.Array(value*))
    
    inline def setImpact(value: ImpactValue): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setImpactNull: Self = StObject.set(x, "impact", null)
    
    inline def setNone(value: js.Array[CheckResult]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneVarargs(value: CheckResult*): Self = StObject.set(x, "none", js.Array(value*))
    
    inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
