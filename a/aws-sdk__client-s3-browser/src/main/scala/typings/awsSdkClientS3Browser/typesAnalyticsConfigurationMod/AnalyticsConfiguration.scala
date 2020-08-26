package typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod

import typings.awsSdkClientS3Browser.typesAnalyticsFilterMod.AnalyticsFilter
import typings.awsSdkClientS3Browser.typesStorageClassAnalysisMod.StorageClassAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfiguration extends js.Object {
  /**
    * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
    */
  var Filter: js.UndefOr[AnalyticsFilter] = js.native
  /**
    * <p>The identifier used to represent an analytics configuration.</p>
    */
  var Id: String = js.native
  /**
    * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
    */
  var StorageClassAnalysis: typings.awsSdkClientS3Browser.typesStorageClassAnalysisMod.StorageClassAnalysis = js.native
}

object AnalyticsConfiguration {
  @scala.inline
  def apply(Id: String, StorageClassAnalysis: StorageClassAnalysis): AnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfiguration]
  }
  @scala.inline
  implicit class AnalyticsConfigurationOps[Self <: AnalyticsConfiguration] (val x: Self) extends AnyVal {
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
    def setStorageClassAnalysis(value: StorageClassAnalysis): Self = this.set("StorageClassAnalysis", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: AnalyticsFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
  }
  
}

