package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreIdentityPoolShortDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IdentityPoolShortDescription extends js.Object {
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: js.UndefOr[String] = js.undefined
}

object _IdentityPoolShortDescription {
  @scala.inline
  def apply(IdentityPoolId: String = null, IdentityPoolName: String = null): _IdentityPoolShortDescription = {
    val __obj = js.Dynamic.literal()
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId)
    if (IdentityPoolName != null) __obj.updateDynamic("IdentityPoolName")(IdentityPoolName)
    __obj.asInstanceOf[_IdentityPoolShortDescription]
  }
}

