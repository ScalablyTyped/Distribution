package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.LabelPrecision
import typings.blueprintjsCore.handlePropsMod.IHandleProps
import typings.blueprintjsCore.multiSliderMod.IMultiSliderProps
import typings.blueprintjsCore.multiSliderMod.ISliderBaseProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider")
@js.native
class MultiSlider protected ()
  extends typings.blueprintjsCore.multiSliderMod.MultiSlider {
  def this(props: IMultiSliderProps) = this()
  def this(props: IMultiSliderProps, context: js.Any) = this()
}
/* static members */
object MultiSlider {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.Handle")
  @js.native
  def Handle: FunctionComponent[IHandleProps] = js.native
  inline def Handle_=(x: FunctionComponent[IHandleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Handle")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.defaultProps")
  @js.native
  def defaultProps: IMultiSliderProps = js.native
  inline def defaultProps_=(x: IMultiSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.defaultSliderProps")
  @js.native
  def defaultSliderProps: ISliderBaseProps = js.native
  inline def defaultSliderProps_=(x: ISliderBaseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSliderProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(props: IMultiSliderProps): LabelPrecision = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any]).asInstanceOf[LabelPrecision]
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.getLabelPrecision")
  @js.native
  def getLabelPrecision: js.Any = js.native
  inline def getLabelPrecision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLabelPrecision")(x.asInstanceOf[js.Any])
}
