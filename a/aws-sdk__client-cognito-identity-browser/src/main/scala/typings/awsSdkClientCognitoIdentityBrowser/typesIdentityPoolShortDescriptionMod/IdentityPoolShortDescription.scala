package typings.awsSdkClientCognitoIdentityBrowser.typesIdentityPoolShortDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolShortDescription extends js.Object {
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: js.UndefOr[String] = js.undefined
}

object IdentityPoolShortDescription {
  @scala.inline
  def apply(IdentityPoolId: String = null, IdentityPoolName: String = null): IdentityPoolShortDescription = {
    val __obj = js.Dynamic.literal()
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (IdentityPoolName != null) __obj.updateDynamic("IdentityPoolName")(IdentityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolShortDescription]
  }
}

