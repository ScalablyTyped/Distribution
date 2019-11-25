package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These are normal browser events that you can bind to via Cytoscape.js.
  * You can bind these events to the core and to collections.
  * http://js.cytoscape.org/#events/user-input-device-events
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.mousedown
  - typings.cytoscape.cytoscapeStrings.mouseup
  - typings.cytoscape.cytoscapeStrings.click
  - typings.cytoscape.cytoscapeStrings.mouseover
  - typings.cytoscape.cytoscapeStrings.mouseout
  - typings.cytoscape.cytoscapeStrings.mousemove
  - typings.cytoscape.cytoscapeStrings.touchstart
  - typings.cytoscape.cytoscapeStrings.touchmove
  - typings.cytoscape.cytoscapeStrings.touchend
*/
trait UserInputDeviceEventName extends js.Object

object UserInputDeviceEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typings.cytoscape.cytoscapeStrings.click = this.cast("click")
  @scala.inline
  def mousedown: typings.cytoscape.cytoscapeStrings.mousedown = this.cast("mousedown")
  @scala.inline
  def mousemove: typings.cytoscape.cytoscapeStrings.mousemove = this.cast("mousemove")
  @scala.inline
  def mouseout: typings.cytoscape.cytoscapeStrings.mouseout = this.cast("mouseout")
  @scala.inline
  def mouseover: typings.cytoscape.cytoscapeStrings.mouseover = this.cast("mouseover")
  @scala.inline
  def mouseup: typings.cytoscape.cytoscapeStrings.mouseup = this.cast("mouseup")
  @scala.inline
  def touchend: typings.cytoscape.cytoscapeStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchmove: typings.cytoscape.cytoscapeStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typings.cytoscape.cytoscapeStrings.touchstart = this.cast("touchstart")
}

