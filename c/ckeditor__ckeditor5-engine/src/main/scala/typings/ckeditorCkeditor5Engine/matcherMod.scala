package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Attribute
import typings.ckeditorCkeditor5Engine.anon.AttributesClassesName
import typings.ckeditorCkeditor5Engine.anon.ElementMatch
import typings.ckeditorCkeditor5Engine.anon.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/matcher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Matcher {
    def this(pattern: MatcherPattern*) = this()
    
    /* CompleteClass */
    override def add(pattern: MatcherPattern*): Unit = js.native
    
    /* CompleteClass */
    override def getElementName(): String | Null = js.native
    
    /* CompleteClass */
    override def `match`(element: typings.ckeditorCkeditor5Engine.viewElementMod.default*): Match | Null = js.native
    
    /* CompleteClass */
    override def matchAll(element: typings.ckeditorCkeditor5Engine.viewElementMod.default*): js.Array[ElementMatch] | Null = js.native
  }
  
  trait Matcher extends StObject {
    
    def add(pattern: MatcherPattern*): Unit
    
    def getElementName(): String | Null
    
    def `match`(element: typings.ckeditorCkeditor5Engine.viewElementMod.default*): Match | Null
    
    def matchAll(element: typings.ckeditorCkeditor5Engine.viewElementMod.default*): js.Array[ElementMatch] | Null
  }
  object Matcher {
    
    inline def apply(
      add: /* repeated */ MatcherPattern => Unit,
      getElementName: () => String | Null,
      `match`: /* repeated */ typings.ckeditorCkeditor5Engine.viewElementMod.default => Match | Null,
      matchAll: /* repeated */ typings.ckeditorCkeditor5Engine.viewElementMod.default => js.Array[ElementMatch] | Null
    ): Matcher = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getElementName = js.Any.fromFunction0(getElementName), matchAll = js.Any.fromFunction1(matchAll))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Matcher]
    }
    
    extension [Self <: Matcher](x: Self) {
      
      inline def setAdd(value: /* repeated */ MatcherPattern => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setGetElementName(value: () => String | Null): Self = StObject.set(x, "getElementName", js.Any.fromFunction0(value))
      
      inline def setMatch(value: /* repeated */ typings.ckeditorCkeditor5Engine.viewElementMod.default => Match | Null): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setMatchAll(
        value: /* repeated */ typings.ckeditorCkeditor5Engine.viewElementMod.default => js.Array[ElementMatch] | Null
      ): Self = StObject.set(x, "matchAll", js.Any.fromFunction1(value))
    }
  }
  
  type MatcherPattern = (js.Function1[
    /* element */ typings.ckeditorCkeditor5Engine.viewElementMod.default, 
    Unit | Null | Attribute
  ]) | String | js.RegExp | AttributesClassesName
}
