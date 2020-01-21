package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityProfileSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the security profile.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the security profile.
    */
  var Id: js.UndefOr[SecurityProfileId] = js.native
  /**
    * The name of the security profile.
    */
  var Name: js.UndefOr[SecurityProfileName] = js.native
}

object SecurityProfileSummary {
  @scala.inline
  def apply(Arn: ARN = null, Id: SecurityProfileId = null, Name: SecurityProfileName = null): SecurityProfileSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfileSummary]
  }
}

