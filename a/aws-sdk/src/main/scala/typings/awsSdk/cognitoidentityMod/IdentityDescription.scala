package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityDescription extends js.Object {
  /**
    * Date on which the identity was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.native
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The provider names.
    */
  var Logins: js.UndefOr[LoginsList] = js.native
}

object IdentityDescription {
  @scala.inline
  def apply(
    CreationDate: DateType = null,
    IdentityId: IdentityId = null,
    LastModifiedDate: DateType = null,
    Logins: LoginsList = null
  ): IdentityDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Logins != null) __obj.updateDynamic("Logins")(Logins.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityDescription]
  }
}

