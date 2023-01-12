package typings.computeScrollIntoView

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compute-scroll-into-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: Element, options: Options): js.Array[CustomScrollAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[CustomScrollAction]]
  
  trait CustomScrollAction extends StObject {
    
    var el: Element
    
    var left: Double
    
    var top: Double
  }
  object CustomScrollAction {
    
    inline def apply(el: Element, left: Double, top: Double): CustomScrollAction = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomScrollAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomScrollAction] (val x: Self) extends AnyVal {
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomScrollBoundary = Element | CustomScrollBoundaryCallback | Null
  
  type CustomScrollBoundaryCallback = js.Function1[/* parent */ Element, Boolean]
  
  trait Options extends StObject {
    
    var block: js.UndefOr[ScrollLogicalPosition] = js.undefined
    
    var boundary: js.UndefOr[CustomScrollBoundary] = js.undefined
    
    var `inline`: js.UndefOr[ScrollLogicalPosition] = js.undefined
    
    var scrollMode: js.UndefOr[ScrollMode] = js.undefined
    
    var skipOverflowHiddenElements: js.UndefOr[SkipOverflowHiddenElements] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: ScrollLogicalPosition): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setBoundary(value: CustomScrollBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryFunction1(value: /* parent */ Element => Boolean): Self = StObject.set(x, "boundary", js.Any.fromFunction1(value))
      
      inline def setBoundaryNull: Self = StObject.set(x, "boundary", null)
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setInline(value: ScrollLogicalPosition): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      inline def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      inline def setSkipOverflowHiddenElements(value: SkipOverflowHiddenElements): Self = StObject.set(x, "skipOverflowHiddenElements", value.asInstanceOf[js.Any])
      
      inline def setSkipOverflowHiddenElementsUndefined: Self = StObject.set(x, "skipOverflowHiddenElements", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.computeScrollIntoView.computeScrollIntoViewStrings.start
    - typings.computeScrollIntoView.computeScrollIntoViewStrings.center
    - typings.computeScrollIntoView.computeScrollIntoViewStrings.end
    - typings.computeScrollIntoView.computeScrollIntoViewStrings.nearest
  */
  trait ScrollLogicalPosition extends StObject
  object ScrollLogicalPosition {
    
    inline def center: typings.computeScrollIntoView.computeScrollIntoViewStrings.center = "center".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.center]
    
    inline def end: typings.computeScrollIntoView.computeScrollIntoViewStrings.end = "end".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.end]
    
    inline def nearest: typings.computeScrollIntoView.computeScrollIntoViewStrings.nearest = "nearest".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.nearest]
    
    inline def start: typings.computeScrollIntoView.computeScrollIntoViewStrings.start = "start".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.computeScrollIntoView.computeScrollIntoViewStrings.always
    - typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`
  */
  trait ScrollMode extends StObject
  object ScrollMode {
    
    inline def always: typings.computeScrollIntoView.computeScrollIntoViewStrings.always = "always".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.always]
    
    inline def `if-needed`: typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed` = "if-needed".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`]
  }
  
  type SkipOverflowHiddenElements = Boolean
}
