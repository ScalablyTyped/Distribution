package typings.baseui

import typings.baseui.baseuiStrings.div
import typings.baseui.sliderStatefulSliderContainerMod.default
import typings.baseui.sliderTypesMod.SliderProps
import typings.baseui.sliderTypesMod.StateReducer
import typings.baseui.sliderTypesMod.StatefulContainerProps
import typings.baseui.sliderTypesMod.StatefulSliderProps
import typings.baseui.sliderTypesMod.StyleProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("baseui/slider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Slider(
    hasOverridesDisabledMarksOnChangeOnFinalChangeMinMaxStepPersistentThumbValueToLabelProvidedValue: SliderProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Slider")(hasOverridesDisabledMarksOnChangeOnFinalChangeMinMaxStepPersistentThumbValueToLabelProvidedValue.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/slider", "StatefulContainer")
  @js.native
  open class StatefulContainer protected () extends default {
    def this(props: StatefulContainerProps) = this()
  }
  object StatefulContainer {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/slider", "StatefulContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/slider", "StatefulContainer.defaultProps.marks")
      @js.native
      def marks: Boolean = js.native
      inline def marks_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marks")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/slider", "StatefulContainer.defaultProps.max")
      @js.native
      def max: Double = js.native
      inline def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/slider", "StatefulContainer.defaultProps.min")
      @js.native
      def min: Double = js.native
      inline def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onFinalChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFinalChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/slider", "StatefulContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/slider", "StatefulContainer.defaultProps.step")
      @js.native
      def step: Double = js.native
      inline def step_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def StatefulSlider(props: StatefulSliderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulSlider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/slider", "StyledInnerThumb")
  @js.native
  val StyledInnerThumb: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/slider", "StyledInnerTrack")
  @js.native
  val StyledInnerTrack: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/slider", "StyledMark")
  @js.native
  val StyledMark: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/slider", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/slider", "StyledThumb")
  @js.native
  val StyledThumb: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/slider", "StyledThumbValue")
  @js.native
  val StyledThumbValue: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/slider", "StyledTick")
  @js.native
  val StyledTick: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/slider", "StyledTickBar")
  @js.native
  val StyledTickBar: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/slider", "StyledTrack")
  @js.native
  val StyledTrack: StyletronComponent[div, StyleProps] = js.native
  
  type SharedProps = StyleProps
}
