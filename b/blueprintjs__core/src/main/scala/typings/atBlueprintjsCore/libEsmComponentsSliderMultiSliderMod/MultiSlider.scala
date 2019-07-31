package typings.atBlueprintjsCore.libEsmComponentsSliderMultiSliderMod

import typings.atBlueprintjsCore.libEsmCommonAbstractPureComponentMod.AbstractPureComponent
import typings.atBlueprintjsCore.libEsmComponentsSliderHandlePropsMod.IHandleProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
@js.native
class MultiSlider () extends AbstractPureComponent[IMultiSliderProps, ISliderState] {
  var addHandleRef: js.Any = js.native
  var canHandleTrackEvent: js.Any = js.native
  var findFirstLockedHandleIndex: js.Any = js.native
  var formatLabel: js.Any = js.native
  var getHandlerForIndex: js.Any = js.native
  var getLabelPrecision: js.Any = js.native
  var getNewHandleValues: js.Any = js.native
  var getOffsetRatio: js.Any = js.native
  var getTrackIntent: js.Any = js.native
  var handleChange: js.Any = js.native
  var handleElements: js.Any = js.native
  var handleProps: js.Any = js.native
  var handleRelease: js.Any = js.native
  var maybeHandleTrackClick: js.Any = js.native
  var maybeHandleTrackTouch: js.Any = js.native
  var nearestHandleForValue: js.Any = js.native
  var renderHandles: js.Any = js.native
  var renderLabels: js.Any = js.native
  var renderTrackFill: js.Any = js.native
  var renderTracks: js.Any = js.native
  var trackElement: js.Any = js.native
  var updateTickSize: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMultiSlider(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMultiSlider(): Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MMultiSlider(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MMultiSlider(nextProps: IMultiSliderProps with IChildrenProps): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
@js.native
object MultiSlider extends js.Object {
  var Handle: FunctionComponent[IHandleProps] = js.native
  var defaultProps: IMultiSliderProps = js.native
  var defaultSliderProps: ISliderBaseProps = js.native
  var displayName: String = js.native
}

