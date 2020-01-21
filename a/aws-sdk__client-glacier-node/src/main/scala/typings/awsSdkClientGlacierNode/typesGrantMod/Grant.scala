package typings.awsSdkClientGlacierNode.typesGrantMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.FULL_CONTROL
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.READ
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.READ_ACP
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.WRITE
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.WRITE_ACP
import typings.awsSdkClientGlacierNode.typesGranteeMod.Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grant extends js.Object {
  /**
    * <p>The grantee.</p>
    */
  var Grantee: js.UndefOr[typings.awsSdkClientGlacierNode.typesGranteeMod.Grantee] = js.undefined
  /**
    * <p>Specifies the permission given to the grantee. </p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String] = js.undefined
}

object Grant {
  @scala.inline
  def apply(
    Grantee: Grantee = null,
    Permission: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String = null
  ): Grant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grant]
  }
}

