package typings.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseResourceMetricKey extends js.Object {
  /**
    * The valid dimensions for the metric.
    */
  var Dimensions: js.UndefOr[DimensionMap] = js.native
  /**
    * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
    */
  var Metric: String = js.native
}

object ResponseResourceMetricKey {
  @scala.inline
  def apply(Metric: String): ResponseResourceMetricKey = {
    val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseResourceMetricKey]
  }
  @scala.inline
  implicit class ResponseResourceMetricKeyOps[Self <: ResponseResourceMetricKey] (val x: Self) extends AnyVal {
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
    def setMetric(value: String): Self = this.set("Metric", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensions(value: DimensionMap): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
  }
  
}

