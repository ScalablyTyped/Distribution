package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserGroupsRequest extends js.Object {
  /**
    * The AWS account ID that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The maximum number of results to return from this request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.quicksightMod.MaxResults] = js.native
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The Amazon QuickSight user name that you want to list group memberships for.
    */
  var UserName: UserName_ = js.native
}

object ListUserGroupsRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace, UserName: UserName_): ListUserGroupsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserGroupsRequest]
  }
  @scala.inline
  implicit class ListUserGroupsRequestOps[Self <: ListUserGroupsRequest] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: UserName_): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

