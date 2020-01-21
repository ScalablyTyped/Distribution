package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolShortDescription extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityPoolId] = js.native
  /**
    * A string that you provide.
    */
  var IdentityPoolName: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityPoolName] = js.native
}

object IdentityPoolShortDescription {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId = null, IdentityPoolName: IdentityPoolName = null): IdentityPoolShortDescription = {
    val __obj = js.Dynamic.literal()
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (IdentityPoolName != null) __obj.updateDynamic("IdentityPoolName")(IdentityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolShortDescription]
  }
}

