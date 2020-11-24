package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricWindow extends js.Object {
  
  /**
    * The tumbling time interval window.
    */
  var tumbling: js.UndefOr[TumblingWindow] = js.native
}
object MetricWindow {
  
  @scala.inline
  def apply(): MetricWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricWindow]
  }
  
  @scala.inline
  implicit class MetricWindowOps[Self <: MetricWindow] (val x: Self) extends AnyVal {
    
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
    def setTumbling(value: TumblingWindow): Self = this.set("tumbling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTumbling: Self = this.set("tumbling", js.undefined)
  }
}
