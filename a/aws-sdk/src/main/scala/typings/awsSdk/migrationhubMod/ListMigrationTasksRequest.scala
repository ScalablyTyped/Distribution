package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMigrationTasksRequest extends js.Object {
  /**
    * Value to specify how many results are returned per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.migrationhubMod.MaxResults] = js.native
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Filter migration tasks by discovered resource name.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.migrationhubMod.ResourceName] = js.native
}

object ListMigrationTasksRequest {
  @scala.inline
  def apply(): ListMigrationTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMigrationTasksRequest]
  }
  @scala.inline
  implicit class ListMigrationTasksRequestOps[Self <: ListMigrationTasksRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("ResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("ResourceName", js.undefined)
  }
  
}

