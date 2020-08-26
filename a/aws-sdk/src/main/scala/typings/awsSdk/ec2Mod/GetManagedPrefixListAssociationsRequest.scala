package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManagedPrefixListAssociationsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[GetManagedPrefixListAssociationsMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId = js.native
}

object GetManagedPrefixListAssociationsRequest {
  @scala.inline
  def apply(PrefixListId: PrefixListResourceId): GetManagedPrefixListAssociationsRequest = {
    val __obj = js.Dynamic.literal(PrefixListId = PrefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedPrefixListAssociationsRequest]
  }
  @scala.inline
  implicit class GetManagedPrefixListAssociationsRequestOps[Self <: GetManagedPrefixListAssociationsRequest] (val x: Self) extends AnyVal {
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
    def setPrefixListId(value: PrefixListResourceId): Self = this.set("PrefixListId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setMaxResults(value: GetManagedPrefixListAssociationsMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

