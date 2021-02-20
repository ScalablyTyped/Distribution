package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern extends StObject {
  
  /**
    * Set custom color pattern. Order matches the order of the data.
    */
  var pattern: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * **Experimental.**
    */
  var threshold: js.UndefOr[Max] = js.native
}
object Pattern {
  
  @scala.inline
  def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value :_*))
    
    @scala.inline
    def setThreshold(value: Max): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
