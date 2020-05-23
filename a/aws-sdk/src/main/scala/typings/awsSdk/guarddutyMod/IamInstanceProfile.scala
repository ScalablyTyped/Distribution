package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IamInstanceProfile extends js.Object {
  /**
    * The profile ARN of the EC2 instance.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The profile ID of the EC2 instance.
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

