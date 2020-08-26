package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAppsRequest extends js.Object {
  /**
    * A parameter to search for the domain ID.
    */
  var DomainIdEquals: js.UndefOr[DomainId] = js.native
  /**
    * Returns a list up to a specified limit.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The parameter by which to sort the results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[AppSortKey] = js.native
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A parameter to search by user profile name.
    */
  var UserProfileNameEquals: js.UndefOr[UserProfileName] = js.native
}

object ListAppsRequest {
  @scala.inline
  def apply(): ListAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsRequest]
  }
  @scala.inline
  implicit class ListAppsRequestOps[Self <: ListAppsRequest] (val x: Self) extends AnyVal {
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
    def setDomainIdEquals(value: DomainId): Self = this.set("DomainIdEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainIdEquals: Self = this.set("DomainIdEquals", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSortBy(value: AppSortKey): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
    @scala.inline
    def setUserProfileNameEquals(value: UserProfileName): Self = this.set("UserProfileNameEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileNameEquals: Self = this.set("UserProfileNameEquals", js.undefined)
  }
  
}

