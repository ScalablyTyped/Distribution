package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceDataSyncResult extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * A list of your current Resource Data Sync configurations and their statuses.
    */
  var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.native
}

object ListResourceDataSyncResult {
  @scala.inline
  def apply(): ListResourceDataSyncResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceDataSyncResult]
  }
  @scala.inline
  implicit class ListResourceDataSyncResultOps[Self <: ListResourceDataSyncResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResourceDataSyncItemsVarargs(value: ResourceDataSyncItem*): Self = this.set("ResourceDataSyncItems", js.Array(value :_*))
    @scala.inline
    def setResourceDataSyncItems(value: ResourceDataSyncItemList): Self = this.set("ResourceDataSyncItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceDataSyncItems: Self = this.set("ResourceDataSyncItems", js.undefined)
  }
  
}

