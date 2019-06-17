package typings
package baseuiLib.modalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/modal", "Modal")
@js.native
class Modal ()
  extends reactLib.reactMod.Component[ModalProps, ModalState, js.Any] {
  def addDomEvents(): scala.Unit = js.native
  def animateOutComplete(): scala.Unit = js.native
  def autoFocus(): scala.Unit = js.native
  def captureLastFocus(): scala.Unit = js.native
  def clearTimers(): scala.Unit = js.native
  def didClose(): scala.Unit = js.native
  def didOpen(): scala.Unit = js.native
  def disableMountNodeScroll(): scala.Unit = js.native
  def getChildren(): reactLib.reactMod.ReactNode = js.native
  def getMountNode(): stdLib.HTMLElement = js.native
  def getRef(component: java.lang.String): reactLib.reactMod.Ref[_] = js.native
  def getSharedProps(): SharedStylePropsArg with baseuiLib.Anon_Children = js.native
  def onBackdropClick(): scala.Unit = js.native
  def onCloseClick(): scala.Unit = js.native
  def onDocumentKeyPress(event: stdLib.KeyboardEvent): scala.Unit = js.native
  def removeDomEvents(): scala.Unit = js.native
  def renderModal(): reactLib.reactMod.ReactNode = js.native
  def resentMountNodeScroll(): scala.Unit = js.native
  def restoreLastFocus(): scala.Unit = js.native
  @JSName("triggerClose")
  def triggerClose_backdrop(source: baseuiLib.baseuiLibStrings.backdrop): scala.Unit = js.native
  @JSName("triggerClose")
  def triggerClose_closeButton(source: baseuiLib.baseuiLibStrings.closeButton): scala.Unit = js.native
  @JSName("triggerClose")
  def triggerClose_escape(source: baseuiLib.baseuiLibStrings.escape): scala.Unit = js.native
}

