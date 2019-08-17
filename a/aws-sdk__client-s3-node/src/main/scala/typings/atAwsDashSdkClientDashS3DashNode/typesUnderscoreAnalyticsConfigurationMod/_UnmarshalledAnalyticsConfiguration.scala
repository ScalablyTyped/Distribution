package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsFilterMod._UnmarshalledAnalyticsFilter
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreStorageClassAnalysisMod._UnmarshalledStorageClassAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAnalyticsConfiguration extends _AnalyticsConfiguration {
  /**
    * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
    */
  @JSName("Filter")
  var Filter__UnmarshalledAnalyticsConfiguration: js.UndefOr[_UnmarshalledAnalyticsFilter] = js.undefined
  /**
    * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
    */
  @JSName("StorageClassAnalysis")
  var StorageClassAnalysis__UnmarshalledAnalyticsConfiguration: _UnmarshalledStorageClassAnalysis
}

object _UnmarshalledAnalyticsConfiguration {
  @scala.inline
  def apply(
    Id: String,
    StorageClassAnalysis: _UnmarshalledStorageClassAnalysis,
    Filter: _UnmarshalledAnalyticsFilter = null
  ): _UnmarshalledAnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id, StorageClassAnalysis = StorageClassAnalysis)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    __obj.asInstanceOf[_UnmarshalledAnalyticsConfiguration]
  }
}

