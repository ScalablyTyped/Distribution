package typings.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricKeyDataPoints extends js.Object {
  
  /**
    * An array of timestamp-value pairs, representing measurements over a period of time.
    */
  var DataPoints: js.UndefOr[DataPointsList] = js.native
  
  /**
    * The dimension(s) to which the data points apply.
    */
  var Key: js.UndefOr[ResponseResourceMetricKey] = js.native
}
object MetricKeyDataPoints {
  
  @scala.inline
  def apply(): MetricKeyDataPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricKeyDataPoints]
  }
  
  @scala.inline
  implicit class MetricKeyDataPointsOps[Self <: MetricKeyDataPoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataPointsVarargs(value: DataPoint*): Self = this.set("DataPoints", js.Array(value :_*))
    
    @scala.inline
    def setDataPoints(value: DataPointsList): Self = this.set("DataPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPoints: Self = this.set("DataPoints", js.undefined)
    
    @scala.inline
    def setKey(value: ResponseResourceMetricKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
  }
}
