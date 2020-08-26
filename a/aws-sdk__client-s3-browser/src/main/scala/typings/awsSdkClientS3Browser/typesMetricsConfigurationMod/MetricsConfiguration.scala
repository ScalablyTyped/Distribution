package typings.awsSdkClientS3Browser.typesMetricsConfigurationMod

import typings.awsSdkClientS3Browser.typesMetricsFilterMod.MetricsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsConfiguration extends js.Object {
  /**
    * <p>Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).</p>
    */
  var Filter: js.UndefOr[MetricsFilter] = js.native
  /**
    * <p>The ID used to identify the metrics configuration.</p>
    */
  var Id: String = js.native
}

object MetricsConfiguration {
  @scala.inline
  def apply(Id: String): MetricsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsConfiguration]
  }
  @scala.inline
  implicit class MetricsConfigurationOps[Self <: MetricsConfiguration] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: MetricsFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
  }
  
}

