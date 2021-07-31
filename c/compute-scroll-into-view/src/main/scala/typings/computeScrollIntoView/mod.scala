package typings.computeScrollIntoView

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compute-scroll-into-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(target: Element, options: Options): js.Array[CustomScrollAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[CustomScrollAction]]
  
  trait CustomScrollAction extends StObject {
    
    var el: Element
    
    var left: Double
    
    var top: Double
  }
  object CustomScrollAction {
    
    @scala.inline
    def apply(el: Element, left: Double, top: Double): CustomScrollAction = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomScrollAction]
    }
    
    @scala.inline
    implicit class CustomScrollActionMutableBuilder[Self <: CustomScrollAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: ScrollLogicalPosition): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setBoundary(value: CustomScrollBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryFunction1(value: /* parent */ Element => Boolean): Self = StObject.set(x, "boundary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoundaryNull: Self = StObject.set(x, "boundary", null)
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setInline(value: ScrollLogicalPosition): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      @scala.inline
      def setSkipOverflowHiddenElements(value: SkipOverflowHiddenElements): Self = StObject.set(x, "skipOverflowHiddenElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipOverflowHiddenElementsUndefined: Self = StObject.set(x, "skipOverflowHiddenElements", js.undefined)
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
    
    @scala.inline
    def center: typings.computeScrollIntoView.computeScrollIntoViewStrings.center = "center".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.center]
    
    @scala.inline
    def end: typings.computeScrollIntoView.computeScrollIntoViewStrings.end = "end".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.end]
    
    @scala.inline
    def nearest: typings.computeScrollIntoView.computeScrollIntoViewStrings.nearest = "nearest".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.nearest]
    
    @scala.inline
    def start: typings.computeScrollIntoView.computeScrollIntoViewStrings.start = "start".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.computeScrollIntoView.computeScrollIntoViewStrings.always
    - typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`
  */
  trait ScrollMode extends StObject
  object ScrollMode {
    
    @scala.inline
    def always: typings.computeScrollIntoView.computeScrollIntoViewStrings.always = "always".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.always]
    
    @scala.inline
    def `if-needed`: typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed` = "if-needed".asInstanceOf[typings.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`]
  }
  
  type SkipOverflowHiddenElements = Boolean
}
