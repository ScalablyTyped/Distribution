package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedPrincipal extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the principal.
    */
  var Principal: js.UndefOr[String] = js.native
  /**
    * The type of principal.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.ec2Mod.PrincipalType] = js.native
}

object AllowedPrincipal {
  @scala.inline
  def apply(Principal: String = null, PrincipalType: PrincipalType = null): AllowedPrincipal = {
    val __obj = js.Dynamic.literal()
    if (Principal != null) __obj.updateDynamic("Principal")(Principal.asInstanceOf[js.Any])
    if (PrincipalType != null) __obj.updateDynamic("PrincipalType")(PrincipalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedPrincipal]
  }
}

