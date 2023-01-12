package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcViewElementMod.default
import typings.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Match extends StObject {
  
  var element: default
  
  var `match`: Attribute
  
  var pattern: MatcherPattern
}
object Match {
  
  inline def apply(element: default, `match`: Attribute, pattern: MatcherPattern): Match = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
    
    inline def setElement(value: default): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: Attribute): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: MatcherPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternFunction1(value: /* element */ default => scala.Unit | Null | Attribute): Self = StObject.set(x, "pattern", js.Any.fromFunction1(value))
  }
}
