package typings.baseui

import typings.baseui.popoverMod.PopoverProps
import typings.baseui.popoverMod.StatefulPopoverProps
import typings.react.mod.FC
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("baseui/helper", "ACCESSIBILITY_TYPE")
  @js.native
  val ACCESSIBILITY_TYPE: typings.baseui.popoverMod.ACCESSIBILITY_TYPE = js.native
  
  @JSImport("baseui/helper", "PLACEMENT")
  @js.native
  val PLACEMENT: typings.baseui.popoverMod.PLACEMENT = js.native
  
  @JSImport("baseui/helper", "StyledArrow")
  @js.native
  val StyledArrow: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/helper", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/helper", "TRIGGER_TYPE")
  @js.native
  val TRIGGER_TYPE: typings.baseui.popoverMod.TRIGGER_TYPE = js.native
  
  @JSImport("baseui/helper", "Unstable_Helper")
  @js.native
  val UnstableHelper: FC[PropsT] = js.native
  
  @JSImport("baseui/helper", "Unstable_HelperSteps")
  @js.native
  val UnstableHelperSteps: FC[HelperStepsPropsT] = js.native
  
  @JSImport("baseui/helper", "Unstable_StatefulHelper")
  @js.native
  val UnstableStatefulHelper: FC[StatefulPropsT] = js.native
  
  trait HelperStepsPropsT extends StObject {
    
    var index: Double
    
    var length: Double
    
    def onFinish(): js.Any
    
    def onNext(): js.Any
    
    def onPrev(): js.Any
  }
  object HelperStepsPropsT {
    
    inline def apply(index: Double, length: Double, onFinish: () => js.Any, onNext: () => js.Any, onPrev: () => js.Any): HelperStepsPropsT = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onFinish = js.Any.fromFunction0(onFinish), onNext = js.Any.fromFunction0(onNext), onPrev = js.Any.fromFunction0(onPrev))
      __obj.asInstanceOf[HelperStepsPropsT]
    }
    
    extension [Self <: HelperStepsPropsT](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOnFinish(value: () => js.Any): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      inline def setOnNext(value: () => js.Any): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
      
      inline def setOnPrev(value: () => js.Any): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
    }
  }
  
  type PropsT = PopoverProps
  
  type StatefulPropsT = StatefulPopoverProps
}
