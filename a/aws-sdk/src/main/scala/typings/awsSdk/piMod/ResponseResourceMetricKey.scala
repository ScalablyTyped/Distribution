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
  def apply(Metric: String, Dimensions: DimensionMap = null): ResponseResourceMetricKey = {
    val __obj = js.Dynamic.literal(Metric = Metric.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseResourceMetricKey]
  }
}

