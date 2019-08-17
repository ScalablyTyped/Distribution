package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreMetricsConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreMetricsFilterMod._UnmarshalledMetricsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMetricsConfiguration extends _MetricsConfiguration {
  /**
    * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
    */
  @JSName("Filter")
  var Filter__UnmarshalledMetricsConfiguration: js.UndefOr[_UnmarshalledMetricsFilter] = js.undefined
}

object _UnmarshalledMetricsConfiguration {
  @scala.inline
  def apply(Id: String, Filter: _UnmarshalledMetricsFilter = null): _UnmarshalledMetricsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    __obj.asInstanceOf[_UnmarshalledMetricsConfiguration]
  }
}

