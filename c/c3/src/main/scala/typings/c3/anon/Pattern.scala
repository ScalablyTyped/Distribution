package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  /**
    * Set custom color pattern. Order matches the order of the data.
    */
  var pattern: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * **Experimental.**
    */
  var threshold: js.UndefOr[Max] = js.undefined
}
object Pattern {
  
  inline def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  extension [Self <: Pattern](x: Self) {
    
    inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
    
    inline def setThreshold(value: Max): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
