package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Principal extends js.Object {
  /**
    * The ARN of the principal (IAM user, role, or group).
    */
  var PrincipalARN: js.UndefOr[typings.awsSdk.servicecatalogMod.PrincipalARN] = js.native
  /**
    * The principal type. The supported value is IAM.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.servicecatalogMod.PrincipalType] = js.native
}

object Principal {
  @scala.inline
  def apply(PrincipalARN: PrincipalARN = null, PrincipalType: PrincipalType = null): Principal = {
    val __obj = js.Dynamic.literal()
    if (PrincipalARN != null) __obj.updateDynamic("PrincipalARN")(PrincipalARN.asInstanceOf[js.Any])
    if (PrincipalType != null) __obj.updateDynamic("PrincipalType")(PrincipalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Principal]
  }
}

