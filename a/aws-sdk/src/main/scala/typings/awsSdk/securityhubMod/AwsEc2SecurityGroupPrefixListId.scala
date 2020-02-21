package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupPrefixListId extends js.Object {
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2SecurityGroupPrefixListId {
  @scala.inline
  def apply(PrefixListId: NonEmptyString = null): AwsEc2SecurityGroupPrefixListId = {
    val __obj = js.Dynamic.literal()
    if (PrefixListId != null) __obj.updateDynamic("PrefixListId")(PrefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2SecurityGroupPrefixListId]
  }
}

