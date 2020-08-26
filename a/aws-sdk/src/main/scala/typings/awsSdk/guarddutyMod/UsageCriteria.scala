package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageCriteria extends js.Object {
  /**
    * The account IDs to aggregate usage statistics from.
    */
  var AccountIds: js.UndefOr[typings.awsSdk.guarddutyMod.AccountIds] = js.native
  /**
    * The data sources to aggregate usage statistics from.
    */
  var DataSources: DataSourceList = js.native
  /**
    * The resources to aggregate usage statistics from. Only accepts exact resource names.
    */
  var Resources: js.UndefOr[ResourceList] = js.native
}

object UsageCriteria {
  @scala.inline
  def apply(DataSources: DataSourceList): UsageCriteria = {
    val __obj = js.Dynamic.literal(DataSources = DataSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageCriteria]
  }
  @scala.inline
  implicit class UsageCriteriaOps[Self <: UsageCriteria] (val x: Self) extends AnyVal {
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
    def setDataSourcesVarargs(value: DataSource*): Self = this.set("DataSources", js.Array(value :_*))
    @scala.inline
    def setDataSources(value: DataSourceList): Self = this.set("DataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("AccountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: AccountIds): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountIds: Self = this.set("AccountIds", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("Resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: ResourceList): Self = this.set("Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
  }
  
}

