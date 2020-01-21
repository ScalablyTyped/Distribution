package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftwareTokenMfaConfigType extends js.Object {
  /**
    * Specifies whether software token MFA is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
}

object SoftwareTokenMfaConfigType {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): SoftwareTokenMfaConfigType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareTokenMfaConfigType]
  }
}

