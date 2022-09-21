package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.LabelPrecision
import typings.blueprintjsCore.handlePropsMod.IHandleProps
import typings.blueprintjsCore.multiSliderMod.ISliderBaseProps
import typings.blueprintjsCore.multiSliderMod.MultiSliderProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider")
@js.native
open class MultiSlider protected ()
  extends typings.blueprintjsCore.multiSliderMod.MultiSlider {
  def this(props: MultiSliderProps) = this()
  def this(props: MultiSliderProps, context: Any) = this()
}
/* static members */
object MultiSlider {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.Handle")
  @js.native
  def Handle: FC[IHandleProps] = js.native
  inline def Handle_=(x: FC[IHandleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Handle")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.defaultProps")
  @js.native
  def defaultProps: MultiSliderProps = js.native
  inline def defaultProps_=(x: MultiSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.defaultSliderProps")
  @js.native
  def defaultSliderProps: ISliderBaseProps = js.native
  inline def defaultSliderProps_=(x: ISliderBaseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSliderProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(props: MultiSliderProps): LabelPrecision = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any]).asInstanceOf[LabelPrecision]
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider.getLabelPrecision")
  @js.native
  def getLabelPrecision: Any = js.native
  inline def getLabelPrecision_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLabelPrecision")(x.asInstanceOf[js.Any])
}
