package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHsmConfigurationMessage extends js.Object {
  /**
    * The identifier of the Amazon Redshift HSM configuration to be deleted.
    */
  var HsmConfigurationIdentifier: String = js.native
}

object DeleteHsmConfigurationMessage {
  @scala.inline
  def apply(HsmConfigurationIdentifier: String): DeleteHsmConfigurationMessage = {
    val __obj = js.Dynamic.literal(HsmConfigurationIdentifier = HsmConfigurationIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHsmConfigurationMessage]
  }
}

