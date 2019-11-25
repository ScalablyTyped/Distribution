package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * There are also some higher level events that you can use
  * so you don’t have to bind to different events for
  * mouse-input devices and for touch devices.
  * http://js.cytoscape.org/#events/user-input-device-events
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.tapstart
  - typings.cytoscape.cytoscapeStrings.vmousedown
  - typings.cytoscape.cytoscapeStrings.tapdrag
  - typings.cytoscape.cytoscapeStrings.vmousemove
  - typings.cytoscape.cytoscapeStrings.tapdragover
  - typings.cytoscape.cytoscapeStrings.tapdragout
  - typings.cytoscape.cytoscapeStrings.tapend
  - typings.cytoscape.cytoscapeStrings.vmouseup
  - typings.cytoscape.cytoscapeStrings.tap
  - typings.cytoscape.cytoscapeStrings.vclick
  - typings.cytoscape.cytoscapeStrings.taphold
  - typings.cytoscape.cytoscapeStrings.cxttapstart
  - typings.cytoscape.cytoscapeStrings.cxttapend
  - typings.cytoscape.cytoscapeStrings.cxttap
  - typings.cytoscape.cytoscapeStrings.cxtdrag
  - typings.cytoscape.cytoscapeStrings.cxtdragover
  - typings.cytoscape.cytoscapeStrings.cxtdragout
  - typings.cytoscape.cytoscapeStrings.boxstart
  - typings.cytoscape.cytoscapeStrings.boxend
  - typings.cytoscape.cytoscapeStrings.boxselect
  - typings.cytoscape.cytoscapeStrings.box
*/
trait UserInputDeviceEventNameExt extends js.Object

object UserInputDeviceEventNameExt {
  @scala.inline
  def box: typings.cytoscape.cytoscapeStrings.box = this.cast("box")
  @scala.inline
  def boxend: typings.cytoscape.cytoscapeStrings.boxend = this.cast("boxend")
  @scala.inline
  def boxselect: typings.cytoscape.cytoscapeStrings.boxselect = this.cast("boxselect")
  @scala.inline
  def boxstart: typings.cytoscape.cytoscapeStrings.boxstart = this.cast("boxstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cxtdrag: typings.cytoscape.cytoscapeStrings.cxtdrag = this.cast("cxtdrag")
  @scala.inline
  def cxtdragout: typings.cytoscape.cytoscapeStrings.cxtdragout = this.cast("cxtdragout")
  @scala.inline
  def cxtdragover: typings.cytoscape.cytoscapeStrings.cxtdragover = this.cast("cxtdragover")
  @scala.inline
  def cxttap: typings.cytoscape.cytoscapeStrings.cxttap = this.cast("cxttap")
  @scala.inline
  def cxttapend: typings.cytoscape.cytoscapeStrings.cxttapend = this.cast("cxttapend")
  @scala.inline
  def cxttapstart: typings.cytoscape.cytoscapeStrings.cxttapstart = this.cast("cxttapstart")
  @scala.inline
  def tap: typings.cytoscape.cytoscapeStrings.tap = this.cast("tap")
  @scala.inline
  def tapdrag: typings.cytoscape.cytoscapeStrings.tapdrag = this.cast("tapdrag")
  @scala.inline
  def tapdragout: typings.cytoscape.cytoscapeStrings.tapdragout = this.cast("tapdragout")
  @scala.inline
  def tapdragover: typings.cytoscape.cytoscapeStrings.tapdragover = this.cast("tapdragover")
  @scala.inline
  def tapend: typings.cytoscape.cytoscapeStrings.tapend = this.cast("tapend")
  @scala.inline
  def taphold: typings.cytoscape.cytoscapeStrings.taphold = this.cast("taphold")
  @scala.inline
  def tapstart: typings.cytoscape.cytoscapeStrings.tapstart = this.cast("tapstart")
  @scala.inline
  def vclick: typings.cytoscape.cytoscapeStrings.vclick = this.cast("vclick")
  @scala.inline
  def vmousedown: typings.cytoscape.cytoscapeStrings.vmousedown = this.cast("vmousedown")
  @scala.inline
  def vmousemove: typings.cytoscape.cytoscapeStrings.vmousemove = this.cast("vmousemove")
  @scala.inline
  def vmouseup: typings.cytoscape.cytoscapeStrings.vmouseup = this.cast("vmouseup")
}

