package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesResponse extends js.Object {
  /**
    *  The attributes that are currently set for the account. 
    */
  var Attributes: js.UndefOr[AccountAttributes] = js.native
}

object DescribeAccountAttributesResponse {
  @scala.inline
  def apply(Attributes: AccountAttributes = null): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
}

