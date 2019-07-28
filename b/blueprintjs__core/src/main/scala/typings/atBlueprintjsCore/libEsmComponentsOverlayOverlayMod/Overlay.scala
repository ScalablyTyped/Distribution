package typings.atBlueprintjsCore.libEsmComponentsOverlayOverlayMod

import typings.react.reactMod.PureComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay")
@js.native
class Overlay ()
  extends PureComponent[IOverlayProps, IOverlayState, js.Any] {
  def this(props: IOverlayProps) = this()
  def this(props: IOverlayProps, context: js.Any) = this()
  var containerElement: HTMLElement = js.native
  var handleBackdropMouseDown: js.Any = js.native
  var handleDocumentClick: js.Any = js.native
  var handleDocumentFocus: js.Any = js.native
  var handleKeyDown: js.Any = js.native
  var maybeRenderChild: js.Any = js.native
  var refHandlers: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MOverlay(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MOverlay(prevProps: IOverlayProps): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MOverlay(nextProps: IOverlayProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MOverlay(): Unit = js.native
  /* private */ def maybeRenderBackdrop(): js.Any = js.native
  /* private */ def overlayWillClose(): js.Any = js.native
  /* private */ def overlayWillOpen(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay")
@js.native
object Overlay extends js.Object {
  var defaultProps: IOverlayProps = js.native
  var displayName: String = js.native
  var getLastOpened: js.Any = js.native
  var openStack: js.Any = js.native
}

