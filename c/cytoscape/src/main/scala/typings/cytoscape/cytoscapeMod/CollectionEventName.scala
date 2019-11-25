package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These events are custom to Cytoscape.js. You can bind to these events for collections.
  * http://js.cytoscape.org/#events/collection-events
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.add
  - typings.cytoscape.cytoscapeStrings.remove
  - typings.cytoscape.cytoscapeStrings.select
  - typings.cytoscape.cytoscapeStrings.unselect
  - typings.cytoscape.cytoscapeStrings.lock
  - typings.cytoscape.cytoscapeStrings.unlock
  - typings.cytoscape.cytoscapeStrings.grabon
  - typings.cytoscape.cytoscapeStrings.grab
  - typings.cytoscape.cytoscapeStrings.drag
  - typings.cytoscape.cytoscapeStrings.free
  - typings.cytoscape.cytoscapeStrings.position
  - typings.cytoscape.cytoscapeStrings.data
  - typings.cytoscape.cytoscapeStrings.scratch
  - typings.cytoscape.cytoscapeStrings.style
*/
trait CollectionEventName extends js.Object

object CollectionEventName {
  @scala.inline
  def add: typings.cytoscape.cytoscapeStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typings.cytoscape.cytoscapeStrings.data = this.cast("data")
  @scala.inline
  def drag: typings.cytoscape.cytoscapeStrings.drag = this.cast("drag")
  @scala.inline
  def free: typings.cytoscape.cytoscapeStrings.free = this.cast("free")
  @scala.inline
  def grab: typings.cytoscape.cytoscapeStrings.grab = this.cast("grab")
  @scala.inline
  def grabon: typings.cytoscape.cytoscapeStrings.grabon = this.cast("grabon")
  @scala.inline
  def lock: typings.cytoscape.cytoscapeStrings.lock = this.cast("lock")
  @scala.inline
  def position: typings.cytoscape.cytoscapeStrings.position = this.cast("position")
  @scala.inline
  def remove: typings.cytoscape.cytoscapeStrings.remove = this.cast("remove")
  @scala.inline
  def scratch: typings.cytoscape.cytoscapeStrings.scratch = this.cast("scratch")
  @scala.inline
  def select: typings.cytoscape.cytoscapeStrings.select = this.cast("select")
  @scala.inline
  def style: typings.cytoscape.cytoscapeStrings.style = this.cast("style")
  @scala.inline
  def unlock: typings.cytoscape.cytoscapeStrings.unlock = this.cast("unlock")
  @scala.inline
  def unselect: typings.cytoscape.cytoscapeStrings.unselect = this.cast("unselect")
}

