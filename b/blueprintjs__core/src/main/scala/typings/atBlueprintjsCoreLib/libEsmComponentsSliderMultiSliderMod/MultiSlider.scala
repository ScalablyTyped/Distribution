package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
@js.native
class MultiSlider ()
  extends atBlueprintjsCoreLib.libEsmCommonAbstractPureComponentMod.AbstractPureComponent[IMultiSliderProps, ISliderState] {
  var addHandleRef: js.Any = js.native
  var canHandleTrackEvent: js.Any = js.native
  var getHandlerForIndex: js.Any = js.native
  var handleChange: js.Any = js.native
  var handleElements: js.Any = js.native
  var handleProps: js.Any = js.native
  var handleRelease: js.Any = js.native
  var maybeHandleTrackClick: js.Any = js.native
  var maybeHandleTrackTouch: js.Any = js.native
  @JSName("state")
  var state_MultiSlider: ISliderState = js.native
  var trackElement: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMultiSlider(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMultiSlider(): scala.Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MMultiSlider(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MMultiSlider(nextProps: IMultiSliderProps with IChildrenProps): scala.Unit = js.native
  /* private */ def findFirstLockedHandleIndex(startIndex: js.Any, endIndex: js.Any): js.Any = js.native
  /* private */ def formatLabel(value: js.Any): js.Any = js.native
  /* private */ def getLabelPrecision(hasLabelPrecisionStepSize: js.Any): js.Any = js.native
  /* private */ def getNewHandleValues(newValue: js.Any, oldIndex: js.Any): js.Any = js.native
  /* private */ def getOffsetRatio(value: js.Any): js.Any = js.native
  /* private */ def getTrackIntent(start: js.Any): js.Any = js.native
  /* private */ def getTrackIntent(start: js.Any, end: js.Any): js.Any = js.native
  /* private */ def nearestHandleForValue(handles: js.Any, getOffset: js.Any): js.Any = js.native
  /* private */ def renderHandles(): js.Any = js.native
  /* private */ def renderLabels(): js.Any = js.native
  /* private */ def renderTrackFill(index: js.Any, start: js.Any, end: js.Any): js.Any = js.native
  /* private */ def renderTracks(): js.Any = js.native
  /* private */ def updateTickSize(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/slider/multiSlider", "MultiSlider")
@js.native
object MultiSlider extends js.Object {
  var Handle: reactLib.reactMod.ReactNs.StatelessComponent[atBlueprintjsCoreLib.libEsmComponentsSliderHandlePropsMod.IHandleProps] = js.native
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod.IMultiSliderProps = js.native
  var defaultSliderProps: atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod.ISliderBaseProps = js.native
  var displayName: java.lang.String = js.native
}

