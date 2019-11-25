package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMetricsConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMetricsFilterMod._MetricsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MetricsConfiguration extends js.Object {
  /**
    * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
    */
  var Filter: js.UndefOr[_MetricsFilter] = js.undefined
  /**
    * <p>The ID used to identify the metrics configuration.</p>
    */
  var Id: String
}

object _MetricsConfiguration {
  @scala.inline
  def apply(Id: String, Filter: _MetricsFilter = null): _MetricsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MetricsConfiguration]
  }
}

