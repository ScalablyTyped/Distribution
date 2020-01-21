package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IamInstanceProfile extends js.Object {
  /**
    * AWS EC2 instance profile ARN.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * AWS EC2 instance profile ID.
    */
  var Id: js.UndefOr[String] = js.native
}

object IamInstanceProfile {
  @scala.inline
  def apply(Arn: String = null, Id: String = null): IamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamInstanceProfile]
  }
}

