package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsFilterMod._AnalyticsFilter
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreStorageClassAnalysisMod._StorageClassAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AnalyticsConfiguration extends js.Object {
  /**
    * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
    */
  var Filter: js.UndefOr[_AnalyticsFilter] = js.undefined
  /**
    * <p>The identifier used to represent an analytics configuration.</p>
    */
  var Id: String
  /**
    * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
    */
  var StorageClassAnalysis: _StorageClassAnalysis
}

object _AnalyticsConfiguration {
  @scala.inline
  def apply(Id: String, StorageClassAnalysis: _StorageClassAnalysis, Filter: _AnalyticsFilter = null): _AnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnalyticsConfiguration]
  }
}

