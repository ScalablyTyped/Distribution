package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTypeOutput extends js.Object {
  /**
    * The identifier for this registration request. Use this registration token when calling  DescribeTypeRegistration , which returns information about the status and IDs of the type registration. 
    */
  var RegistrationToken: js.UndefOr[typings.awsSdk.cloudformationMod.RegistrationToken] = js.native
}

object RegisterTypeOutput {
  @scala.inline
  def apply(RegistrationToken: RegistrationToken = null): RegisterTypeOutput = {
    val __obj = js.Dynamic.literal()
    if (RegistrationToken != null) __obj.updateDynamic("RegistrationToken")(RegistrationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTypeOutput]
  }
}

