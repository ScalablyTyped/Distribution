package typings.awsSdkClientS3Node.typesMetricsConfigurationMod

import typings.awsSdkClientS3Node.typesMetricsFilterMod.UnmarshalledMetricsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledMetricsConfiguration extends MetricsConfiguration {
  /**
    * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledMetricsConfiguration: js.UndefOr[UnmarshalledMetricsFilter] = js.undefined
}

object UnmarshalledMetricsConfiguration {
  @scala.inline
  def apply(Id: String, Filter: UnmarshalledMetricsFilter = null): UnmarshalledMetricsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMetricsConfiguration]
  }
}

