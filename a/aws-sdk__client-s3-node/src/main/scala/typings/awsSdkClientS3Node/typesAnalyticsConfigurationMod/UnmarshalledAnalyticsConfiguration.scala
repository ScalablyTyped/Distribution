package typings.awsSdkClientS3Node.typesAnalyticsConfigurationMod

import typings.awsSdkClientS3Node.typesAnalyticsFilterMod.UnmarshalledAnalyticsFilter
import typings.awsSdkClientS3Node.typesStorageClassAnalysisMod.UnmarshalledStorageClassAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAnalyticsConfiguration extends AnalyticsConfiguration {
  /**
    * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledAnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsFilter] = js.native
  /**
    * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
    */
  @JSName("StorageClassAnalysis")
  var StorageClassAnalysis_UnmarshalledAnalyticsConfiguration: UnmarshalledStorageClassAnalysis = js.native
}

object UnmarshalledAnalyticsConfiguration {
  @scala.inline
  def apply(Id: String, StorageClassAnalysis: UnmarshalledStorageClassAnalysis): UnmarshalledAnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAnalyticsConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledAnalyticsConfigurationOps[Self <: UnmarshalledAnalyticsConfiguration] (val x: Self) extends AnyVal {
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
    def setStorageClassAnalysis(value: UnmarshalledStorageClassAnalysis): Self = this.set("StorageClassAnalysis", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: UnmarshalledAnalyticsFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
  }
  
}

