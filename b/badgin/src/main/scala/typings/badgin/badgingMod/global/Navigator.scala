package typings.badgin.badgingMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends js.Object {
  
  var clearExperimentalAppBadge: js.UndefOr[js.Function0[Unit]] = js.native
  
  var setExperimentalAppBadge: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
}
object Navigator {
  
  @scala.inline
  def apply(): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    
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
    def setClearExperimentalAppBadge(value: () => Unit): Self = this.set("clearExperimentalAppBadge", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClearExperimentalAppBadge: Self = this.set("clearExperimentalAppBadge", js.undefined)
    
    @scala.inline
    def setSetExperimentalAppBadge(value: /* value */ js.UndefOr[Double] => Unit): Self = this.set("setExperimentalAppBadge", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetExperimentalAppBadge: Self = this.set("setExperimentalAppBadge", js.undefined)
  }
}
