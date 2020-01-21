package typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod

import typings.awsSdkClientS3Browser.typesAnalyticsFilterMod.UnmarshalledAnalyticsFilter
import typings.awsSdkClientS3Browser.typesStorageClassAnalysisMod.UnmarshalledStorageClassAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAnalyticsConfiguration extends AnalyticsConfiguration {
  /**
    * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledAnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsFilter] = js.undefined
  /**
    * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
    */
  @JSName("StorageClassAnalysis")
  var StorageClassAnalysis_UnmarshalledAnalyticsConfiguration: UnmarshalledStorageClassAnalysis
}

object UnmarshalledAnalyticsConfiguration {
  @scala.inline
  def apply(
    Id: String,
    StorageClassAnalysis: UnmarshalledStorageClassAnalysis,
    Filter: UnmarshalledAnalyticsFilter = null
  ): UnmarshalledAnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAnalyticsConfiguration]
  }
}

