package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationAggregator extends js.Object {
  /**
    * Provides a list of source accounts and regions to be aggregated.
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the aggregator.
    */
  var ConfigurationAggregatorArn: js.UndefOr[typings.awsSdk.configserviceMod.ConfigurationAggregatorArn] = js.native
  /**
    * The name of the aggregator.
    */
  var ConfigurationAggregatorName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigurationAggregatorName] = js.native
  /**
    * AWS service that created the configuration aggregator.
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * The time stamp when the configuration aggregator was created.
    */
  var CreationTime: js.UndefOr[Date] = js.native
  /**
    * The time of the last update.
    */
  var LastUpdatedTime: js.UndefOr[Date] = js.native
  /**
    * Provides an organization and list of regions to be aggregated.
    */
  var OrganizationAggregationSource: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationAggregationSource] = js.native
}

object ConfigurationAggregator {
  @scala.inline
  def apply(): ConfigurationAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationAggregator]
  }
  @scala.inline
  implicit class ConfigurationAggregatorOps[Self <: ConfigurationAggregator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountAggregationSourcesVarargs(value: AccountAggregationSource*): Self = this.set("AccountAggregationSources", js.Array(value :_*))
    @scala.inline
    def setAccountAggregationSources(value: AccountAggregationSourceList): Self = this.set("AccountAggregationSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountAggregationSources: Self = this.set("AccountAggregationSources", js.undefined)
    @scala.inline
    def setConfigurationAggregatorArn(value: ConfigurationAggregatorArn): Self = this.set("ConfigurationAggregatorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationAggregatorArn: Self = this.set("ConfigurationAggregatorArn", js.undefined)
    @scala.inline
    def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = this.set("ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationAggregatorName: Self = this.set("ConfigurationAggregatorName", js.undefined)
    @scala.inline
    def setCreatedBy(value: StringWithCharLimit256): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setCreationTime(value: Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    @scala.inline
    def setOrganizationAggregationSource(value: OrganizationAggregationSource): Self = this.set("OrganizationAggregationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationAggregationSource: Self = this.set("OrganizationAggregationSource", js.undefined)
  }
  
}

