package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityDkimEnabledRequest extends js.Object {
  /**
    * Sets whether DKIM signing is enabled for an identity. Set to true to enable DKIM signing for this identity; false to disable it. 
    */
  var DkimEnabled: Enabled = js.native
  /**
    * The identity for which DKIM signing should be enabled or disabled.
    */
  var Identity: typings.awsSdk.sesMod.Identity = js.native
}

object SetIdentityDkimEnabledRequest {
  @scala.inline
  def apply(DkimEnabled: Enabled, Identity: Identity): SetIdentityDkimEnabledRequest = {
    val __obj = js.Dynamic.literal(DkimEnabled = DkimEnabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetIdentityDkimEnabledRequest]
  }
}

