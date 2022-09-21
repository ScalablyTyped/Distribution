package typings.highlightJsY75vKsj1

import typings.highlightJsY75vKsj1.anon.Block
import typings.highlightJsY75vKsj1.anon.BlockLanguage
import typings.highlightJsY75vKsj1.anon.El
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HLJSPlugin extends StObject {
  
  @JSName("after:highlight")
  var afterColonhighlight: js.UndefOr[js.Function1[/* result */ HighlightResult, Unit]] = js.undefined
  
  // TODO: Old API, remove with v12
  @JSName("after:highlightBlock")
  var afterColonhighlightBlock: js.UndefOr[js.Function1[/* data */ Block, Unit]] = js.undefined
  
  @JSName("after:highlightElement")
  var afterColonhighlightElement: js.UndefOr[js.Function1[/* data */ El, Unit]] = js.undefined
  
  @JSName("before:highlight")
  var beforeColonhighlight: js.UndefOr[js.Function1[/* context */ BeforeHighlightContext, Unit]] = js.undefined
  
  @JSName("before:highlightBlock")
  var beforeColonhighlightBlock: js.UndefOr[js.Function1[/* data */ BlockLanguage, Unit]] = js.undefined
  
  @JSName("before:highlightElement")
  var beforeColonhighlightElement: js.UndefOr[js.Function1[/* data */ typings.highlightJsY75vKsj1.anon.Language, Unit]] = js.undefined
}
object HLJSPlugin {
  
  inline def apply(): HLJSPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HLJSPlugin]
  }
  
  extension [Self <: HLJSPlugin](x: Self) {
    
    inline def setAfterColonhighlight(value: /* result */ HighlightResult => Unit): Self = StObject.set(x, "after:highlight", js.Any.fromFunction1(value))
    
    inline def setAfterColonhighlightBlock(value: /* data */ Block => Unit): Self = StObject.set(x, "after:highlightBlock", js.Any.fromFunction1(value))
    
    inline def setAfterColonhighlightBlockUndefined: Self = StObject.set(x, "after:highlightBlock", js.undefined)
    
    inline def setAfterColonhighlightElement(value: /* data */ El => Unit): Self = StObject.set(x, "after:highlightElement", js.Any.fromFunction1(value))
    
    inline def setAfterColonhighlightElementUndefined: Self = StObject.set(x, "after:highlightElement", js.undefined)
    
    inline def setAfterColonhighlightUndefined: Self = StObject.set(x, "after:highlight", js.undefined)
    
    inline def setBeforeColonhighlight(value: /* context */ BeforeHighlightContext => Unit): Self = StObject.set(x, "before:highlight", js.Any.fromFunction1(value))
    
    inline def setBeforeColonhighlightBlock(value: /* data */ BlockLanguage => Unit): Self = StObject.set(x, "before:highlightBlock", js.Any.fromFunction1(value))
    
    inline def setBeforeColonhighlightBlockUndefined: Self = StObject.set(x, "before:highlightBlock", js.undefined)
    
    inline def setBeforeColonhighlightElement(value: /* data */ typings.highlightJsY75vKsj1.anon.Language => Unit): Self = StObject.set(x, "before:highlightElement", js.Any.fromFunction1(value))
    
    inline def setBeforeColonhighlightElementUndefined: Self = StObject.set(x, "before:highlightElement", js.undefined)
    
    inline def setBeforeColonhighlightUndefined: Self = StObject.set(x, "before:highlight", js.undefined)
  }
}
