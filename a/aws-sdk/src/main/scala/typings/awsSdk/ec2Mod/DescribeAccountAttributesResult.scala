package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesResult extends js.Object {
  /**
    * Information about the account attributes.
    */
  var AccountAttributes: js.UndefOr[AccountAttributeList] = js.native
}

object DescribeAccountAttributesResult {
  @scala.inline
  def apply(AccountAttributes: AccountAttributeList = null): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (AccountAttributes != null) __obj.updateDynamic("AccountAttributes")(AccountAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
}

