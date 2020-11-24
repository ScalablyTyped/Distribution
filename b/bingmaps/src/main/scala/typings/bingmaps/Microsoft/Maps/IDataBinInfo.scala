package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataBinInfo extends js.Object {
  
  /* An array of all the pushpins that are in the data bin. */
  var containedPushpins: js.Array[Pushpin] = js.native
  
  /* A set of calculated metric values determined using the aggregationProperty value of all the pushpins contained in the data bin. */
  var metrics: IDataBinMetrics = js.native
}
object IDataBinInfo {
  
  @scala.inline
  def apply(containedPushpins: js.Array[Pushpin], metrics: IDataBinMetrics): IDataBinInfo = {
    val __obj = js.Dynamic.literal(containedPushpins = containedPushpins.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataBinInfo]
  }
  
  @scala.inline
  implicit class IDataBinInfoOps[Self <: IDataBinInfo] (val x: Self) extends AnyVal {
    
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
    def setContainedPushpinsVarargs(value: Pushpin*): Self = this.set("containedPushpins", js.Array(value :_*))
    
    @scala.inline
    def setContainedPushpins(value: js.Array[Pushpin]): Self = this.set("containedPushpins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: IDataBinMetrics): Self = this.set("metrics", value.asInstanceOf[js.Any])
  }
}
