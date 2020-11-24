package typings.blueprintjsCore.overlayMod

import typings.blueprintjsCore.anon.HasEverOpened
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay")
@js.native
class Overlay ()
  extends AbstractPureComponent2[IOverlayProps, IOverlayState, js.Object] {
  
  @JSName("componentDidMount")
  def componentDidMount_MOverlay(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MOverlay(prevProps: IOverlayProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MOverlay(): Unit = js.native
  
  var containerElement: HTMLElement | Null = js.native
  
  var handleBackdropMouseDown: js.Any = js.native
  
  var handleDocumentClick: js.Any = js.native
  
  var handleDocumentFocus: js.Any = js.native
  
  var handleKeyDown: js.Any = js.native
  
  var handleTransitionAddEnd: js.Any = js.native
  
  var maybeRenderBackdrop: js.Any = js.native
  
  var maybeRenderChild: js.Any = js.native
  
  var overlayWillClose: js.Any = js.native
  
  var overlayWillOpen: js.Any = js.native
  
  var refHandlers: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/overlay/overlay", "Overlay")
@js.native
object Overlay extends js.Object {
  
  var defaultProps: IOverlayProps = js.native
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(hasIsOpen: IOverlayProps): HasEverOpened | Null = js.native
  
  var getLastOpened: js.Any = js.native
  
  var openStack: js.Any = js.native
}
