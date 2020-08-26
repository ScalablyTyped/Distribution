package typings.awsSdkClientS3Browser.typesMetricsConfigurationMod

import typings.awsSdkClientS3Browser.typesMetricsFilterMod.UnmarshalledMetricsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMetricsConfiguration extends MetricsConfiguration {
  /**
    * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledMetricsConfiguration: js.UndefOr[UnmarshalledMetricsFilter] = js.native
}

object UnmarshalledMetricsConfiguration {
  @scala.inline
  def apply(Id: String): UnmarshalledMetricsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMetricsConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledMetricsConfigurationOps[Self <: UnmarshalledMetricsConfiguration] (val x: Self) extends AnyVal {
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
    def setFilter(value: UnmarshalledMetricsFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
  }
  
}

