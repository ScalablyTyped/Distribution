package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These events are custom to Cytoscape.js, and they occur on the core.
  * http://js.cytoscape.org/#events/graph-events
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.layoutstart
  - typings.cytoscape.cytoscapeStrings.layoutready
  - typings.cytoscape.cytoscapeStrings.layoutstop
  - typings.cytoscape.cytoscapeStrings.ready
  - typings.cytoscape.cytoscapeStrings.destroy
  - typings.cytoscape.cytoscapeStrings.render
  - typings.cytoscape.cytoscapeStrings.pan
  - typings.cytoscape.cytoscapeStrings.zoom
  - typings.cytoscape.cytoscapeStrings.resize
*/
trait GraphEventName extends js.Object

object GraphEventName {
  @scala.inline
  def destroy: typings.cytoscape.cytoscapeStrings.destroy = "destroy".asInstanceOf[typings.cytoscape.cytoscapeStrings.destroy]
  @scala.inline
  def layoutready: typings.cytoscape.cytoscapeStrings.layoutready = "layoutready".asInstanceOf[typings.cytoscape.cytoscapeStrings.layoutready]
  @scala.inline
  def layoutstart: typings.cytoscape.cytoscapeStrings.layoutstart = "layoutstart".asInstanceOf[typings.cytoscape.cytoscapeStrings.layoutstart]
  @scala.inline
  def layoutstop: typings.cytoscape.cytoscapeStrings.layoutstop = "layoutstop".asInstanceOf[typings.cytoscape.cytoscapeStrings.layoutstop]
  @scala.inline
  def pan: typings.cytoscape.cytoscapeStrings.pan = "pan".asInstanceOf[typings.cytoscape.cytoscapeStrings.pan]
  @scala.inline
  def ready: typings.cytoscape.cytoscapeStrings.ready = "ready".asInstanceOf[typings.cytoscape.cytoscapeStrings.ready]
  @scala.inline
  def render: typings.cytoscape.cytoscapeStrings.render = "render".asInstanceOf[typings.cytoscape.cytoscapeStrings.render]
  @scala.inline
  def resize: typings.cytoscape.cytoscapeStrings.resize = "resize".asInstanceOf[typings.cytoscape.cytoscapeStrings.resize]
  @scala.inline
  def zoom: typings.cytoscape.cytoscapeStrings.zoom = "zoom".asInstanceOf[typings.cytoscape.cytoscapeStrings.zoom]
}

