package typings.clusterizeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callbacks extends js.Object {
  
  var clusterChanged: js.UndefOr[js.Function0[Unit]] = js.native
  
  var clusterWillChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var scrollingProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.native
}
object Callbacks {
  
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  
  @scala.inline
  implicit class CallbacksOps[Self <: Callbacks] (val x: Self) extends AnyVal {
    
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
    def setClusterChanged(value: () => Unit): Self = this.set("clusterChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClusterChanged: Self = this.set("clusterChanged", js.undefined)
    
    @scala.inline
    def setClusterWillChange(value: () => Unit): Self = this.set("clusterWillChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClusterWillChange: Self = this.set("clusterWillChange", js.undefined)
    
    @scala.inline
    def setScrollingProgress(value: /* progress */ Double => Unit): Self = this.set("scrollingProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollingProgress: Self = this.set("scrollingProgress", js.undefined)
  }
}
