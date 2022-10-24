package typings.baseui

import typings.baseui.anon.`256`
import typings.baseui.sliderTypesMod.ChangeAction
import typings.baseui.sliderTypesMod.Params
import typings.baseui.sliderTypesMod.State
import typings.baseui.sliderTypesMod.StateReducer
import typings.baseui.sliderTypesMod.StatefulContainerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderStatefulSliderContainerMod {
  
  @JSImport("baseui/slider/stateful-slider-container", JSImport.Default)
  @js.native
  open class default protected () extends StatefulSliderContainer {
    def this(props: StatefulContainerProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/slider/stateful-slider-container", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/slider/stateful-slider-container", "default.defaultProps.marks")
      @js.native
      def marks: Boolean = js.native
      inline def marks_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marks")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/slider/stateful-slider-container", "default.defaultProps.max")
      @js.native
      def max: Double = js.native
      inline def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/slider/stateful-slider-container", "default.defaultProps.min")
      @js.native
      def min: Double = js.native
      inline def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onFinalChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFinalChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/slider/stateful-slider-container", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/slider/stateful-slider-container", "default.defaultProps.step")
      @js.native
      def step: Double = js.native
      inline def step_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatefulSliderContainer extends Component[StatefulContainerProps, State, Any] {
    
    def internalSetState(`type`: ChangeAction, param1: Params): Unit = js.native
    
    def onChange(params: `256`): Any = js.native
    
    def onFinalChange(params: `256`): Any = js.native
  }
}
