package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationAggregatorRequest extends js.Object {
  /**
    * A list of AccountAggregationSource object. 
    */
  var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.native
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * An OrganizationAggregationSource object.
    */
  var OrganizationAggregationSource: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationAggregationSource] = js.native
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.native
}

object PutConfigurationAggregatorRequest {
  @scala.inline
  def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): PutConfigurationAggregatorRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationAggregatorRequest]
  }
  @scala.inline
  implicit class PutConfigurationAggregatorRequestOps[Self <: PutConfigurationAggregatorRequest] (val x: Self) extends AnyVal {
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
    def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = this.set("ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountAggregationSourcesVarargs(value: AccountAggregationSource*): Self = this.set("AccountAggregationSources", js.Array(value :_*))
    @scala.inline
    def setAccountAggregationSources(value: AccountAggregationSourceList): Self = this.set("AccountAggregationSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountAggregationSources: Self = this.set("AccountAggregationSources", js.undefined)
    @scala.inline
    def setOrganizationAggregationSource(value: OrganizationAggregationSource): Self = this.set("OrganizationAggregationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationAggregationSource: Self = this.set("OrganizationAggregationSource", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagsList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

