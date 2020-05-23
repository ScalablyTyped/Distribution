package typings.cytoscapeEdgehandles.mod.cytoscapeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeHandlesApi extends js.Object {
   // turn off draw mode
  def destroy(): Unit
   // remove the handle node from the graph
  def disable(): Unit
   // turn on draw mode (the entire node body acts like the handle)
  def disableDrawMode(): Unit
   // disables edgehandles behaviour
  def enable(): Unit
   // enables edgehandles behaviour
  def enableDrawMode(): Unit
   // manually completes or cancels the gesture
  def hide(): Unit
  def start(sourceNode: String): Unit
   // manually start the gesture (as if the handle were already held)
  def stop(): Unit
}

object EdgeHandlesApi {
  @scala.inline
  def apply(
    destroy: () => Unit,
    disable: () => Unit,
    disableDrawMode: () => Unit,
    enable: () => Unit,
    enableDrawMode: () => Unit,
    hide: () => Unit,
    start: String => Unit,
    stop: () => Unit
  ): EdgeHandlesApi = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), disableDrawMode = js.Any.fromFunction0(disableDrawMode), enable = js.Any.fromFunction0(enable), enableDrawMode = js.Any.fromFunction0(enableDrawMode), hide = js.Any.fromFunction0(hide), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[EdgeHandlesApi]
  }
}

