package typings.blueprintjsCore.multiSliderMod

import typings.blueprintjsCore.anon.LabelPrecision
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.handlePropsMod.IHandleProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
@js.native
class MultiSlider ()
  extends AbstractPureComponent2[IMultiSliderProps, ISliderState, js.Object] {
  var addHandleRef: js.Any = js.native
  var canHandleTrackEvent: js.Any = js.native
  var findFirstLockedHandleIndex: js.Any = js.native
  var formatLabel: js.Any = js.native
  var getHandlerForIndex: js.Any = js.native
  var getNewHandleValues: js.Any = js.native
  var getOffsetRatio: js.Any = js.native
  var getTrackIntent: js.Any = js.native
  var handleChange: js.Any = js.native
  var handleElements: js.Any = js.native
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
  def componentDidUpdate_MMultiSlider(prevProps: IMultiSliderProps, prevState: ISliderState): Unit = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MMultiSlider(prevProps: IMultiSliderProps): Null = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
@js.native
object MultiSlider extends js.Object {
  var Handle: FunctionComponent[IHandleProps] = js.native
  var defaultProps: IMultiSliderProps = js.native
  var defaultSliderProps: ISliderBaseProps = js.native
  var displayName: String = js.native
  var getLabelPrecision: js.Any = js.native
  def getDerivedStateFromProps(props: IMultiSliderProps): LabelPrecision = js.native
}

