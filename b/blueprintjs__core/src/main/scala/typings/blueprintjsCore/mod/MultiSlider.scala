package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.LabelPrecision
import typings.blueprintjsCore.handlePropsMod.IHandleProps
import typings.blueprintjsCore.multiSliderMod.IMultiSliderProps
import typings.blueprintjsCore.multiSliderMod.ISliderBaseProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "MultiSlider")
@js.native
class MultiSlider ()
  extends typings.blueprintjsCore.componentsMod.MultiSlider
/* static members */
@JSImport("@blueprintjs/core", "MultiSlider")
@js.native
object MultiSlider extends js.Object {
  
  var Handle: FunctionComponent[IHandleProps] = js.native
  
  var defaultProps: IMultiSliderProps = js.native
  
  var defaultSliderProps: ISliderBaseProps = js.native
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(props: IMultiSliderProps): LabelPrecision = js.native
  
  var getLabelPrecision: js.Any = js.native
}
