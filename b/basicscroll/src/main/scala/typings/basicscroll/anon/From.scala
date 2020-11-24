package typings.basicscroll.anon

import typings.basicscroll.mod.AnimatedType
import typings.basicscroll.mod.KnownTimings
import typings.basicscroll.mod.TimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From extends js.Object {
  
  /**
    * Start and end values.
    * @default null
    */
  var from: js.UndefOr[AnimatedType] = js.native
  
  /**
    * Animation timing.
    * @default 'linear'
    */
  var timing: js.UndefOr[KnownTimings | TimingFunction] = js.native
  
  /**
    * Start and end values.
    * @default null
    */
  var to: js.UndefOr[AnimatedType] = js.native
}
object From {
  
  @scala.inline
  def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: AnimatedType): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setFromNull: Self = this.set("from", null)
    
    @scala.inline
    def setTimingFunction1(value: /* t */ Double => Double): Self = this.set("timing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTiming(value: KnownTimings | TimingFunction): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
    
    @scala.inline
    def setTo(value: AnimatedType): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setToNull: Self = this.set("to", null)
  }
}
