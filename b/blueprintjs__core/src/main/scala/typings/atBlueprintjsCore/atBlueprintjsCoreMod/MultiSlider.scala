package typings.atBlueprintjsCore.atBlueprintjsCoreMod

import typings.atBlueprintjsCore.Anon_LabelPrecision
import typings.atBlueprintjsCore.libEsmComponentsSliderHandlePropsMod.IHandleProps
import typings.atBlueprintjsCore.libEsmComponentsSliderMultiSliderMod.IMultiSliderProps
import typings.atBlueprintjsCore.libEsmComponentsSliderMultiSliderMod.ISliderBaseProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "MultiSlider")
@js.native
class MultiSlider ()
  extends typings.atBlueprintjsCore.libEsmComponentsMod.MultiSlider

/* static members */
@JSImport("@blueprintjs/core", "MultiSlider")
@js.native
object MultiSlider extends js.Object {
  var Handle: FunctionComponent[IHandleProps] = js.native
  var defaultProps: IMultiSliderProps = js.native
  var defaultSliderProps: ISliderBaseProps = js.native
  var displayName: String = js.native
  var getLabelPrecision: js.Any = js.native
  def getDerivedStateFromProps(props: IMultiSliderProps): Anon_LabelPrecision = js.native
}

