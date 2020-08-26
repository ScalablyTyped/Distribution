package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageStatistics extends js.Object {
  /**
    * The usage statistic sum organized by account ID.
    */
  var SumByAccount: js.UndefOr[UsageAccountResultList] = js.native
  /**
    * The usage statistic sum organized by on data source.
    */
  var SumByDataSource: js.UndefOr[UsageDataSourceResultList] = js.native
  /**
    * The usage statistic sum organized by resource.
    */
  var SumByResource: js.UndefOr[UsageResourceResultList] = js.native
  /**
    * Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least expensive.
    */
  var TopResources: js.UndefOr[UsageResourceResultList] = js.native
}

object UsageStatistics {
  @scala.inline
  def apply(): UsageStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageStatistics]
  }
  @scala.inline
  implicit class UsageStatisticsOps[Self <: UsageStatistics] (val x: Self) extends AnyVal {
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
    def setSumByAccountVarargs(value: UsageAccountResult*): Self = this.set("SumByAccount", js.Array(value :_*))
    @scala.inline
    def setSumByAccount(value: UsageAccountResultList): Self = this.set("SumByAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumByAccount: Self = this.set("SumByAccount", js.undefined)
    @scala.inline
    def setSumByDataSourceVarargs(value: UsageDataSourceResult*): Self = this.set("SumByDataSource", js.Array(value :_*))
    @scala.inline
    def setSumByDataSource(value: UsageDataSourceResultList): Self = this.set("SumByDataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumByDataSource: Self = this.set("SumByDataSource", js.undefined)
    @scala.inline
    def setSumByResourceVarargs(value: UsageResourceResult*): Self = this.set("SumByResource", js.Array(value :_*))
    @scala.inline
    def setSumByResource(value: UsageResourceResultList): Self = this.set("SumByResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumByResource: Self = this.set("SumByResource", js.undefined)
    @scala.inline
    def setTopResourcesVarargs(value: UsageResourceResult*): Self = this.set("TopResources", js.Array(value :_*))
    @scala.inline
    def setTopResources(value: UsageResourceResultList): Self = this.set("TopResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopResources: Self = this.set("TopResources", js.undefined)
  }
  
}

