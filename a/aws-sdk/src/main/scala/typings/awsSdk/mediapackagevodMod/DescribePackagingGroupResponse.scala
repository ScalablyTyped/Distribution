package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackagingGroupResponse extends js.Object {
  /**
    * The ARN of the PackagingGroup.
    */
  var Arn: js.UndefOr[string] = js.native
  var Authorization: js.UndefOr[typings.awsSdk.mediapackagevodMod.Authorization] = js.native
  /**
    * The fully qualified domain name for Assets in the PackagingGroup.
    */
  var DomainName: js.UndefOr[string] = js.native
  /**
    * The ID of the PackagingGroup.
    */
  var Id: js.UndefOr[string] = js.native
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.native
}

object DescribePackagingGroupResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    Authorization: Authorization = null,
    DomainName: string = null,
    Id: string = null,
    Tags: Tags = null
  ): DescribePackagingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Authorization != null) __obj.updateDynamic("Authorization")(Authorization.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagingGroupResponse]
  }
}

