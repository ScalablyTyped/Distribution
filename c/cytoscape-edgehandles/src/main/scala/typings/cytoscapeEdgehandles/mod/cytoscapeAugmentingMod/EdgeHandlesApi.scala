package typings.cytoscapeEdgehandles.mod.cytoscapeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeHandlesApi extends js.Object {
  
   // turn off draw mode
  def destroy(): Unit = js.native
  
   // remove the handle node from the graph
  def disable(): Unit = js.native
  
   // turn on draw mode (the entire node body acts like the handle)
  def disableDrawMode(): Unit = js.native
  
   // disables edgehandles behaviour
  def enable(): Unit = js.native
  
   // enables edgehandles behaviour
  def enableDrawMode(): Unit = js.native
  
   // manually completes or cancels the gesture
  def hide(): Unit = js.native
  
  def start(sourceNode: String): Unit = js.native
  
   // manually start the gesture (as if the handle were already held)
  def stop(): Unit = js.native
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
  
  @scala.inline
  implicit class EdgeHandlesApiOps[Self <: EdgeHandlesApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableDrawMode(value: () => Unit): Self = this.set("disableDrawMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableDrawMode(value: () => Unit): Self = this.set("enableDrawMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: String => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
