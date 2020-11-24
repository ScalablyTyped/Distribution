package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<better-scroll.better-scroll.PullDownOption> */
@js.native
trait PartialPullDownOption extends js.Object {
  
  var stop: js.UndefOr[Double] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object PartialPullDownOption {
  
  @scala.inline
  def apply(): PartialPullDownOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPullDownOption]
  }
  
  @scala.inline
  implicit class PartialPullDownOptionOps[Self <: PartialPullDownOption] (val x: Self) extends AnyVal {
    
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
    def setStop(value: Double): Self = this.set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
