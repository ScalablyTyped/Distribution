package typings.awsSdkClientCognitoIdentityBrowser.typesInvalidIdentityPoolConfigurationExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidIdentityPoolConfigurationExceptionDetails extends js.Object {
  /**
    * <p>The message returned for an <code>InvalidIdentityPoolConfigurationException</code> </p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object InvalidIdentityPoolConfigurationExceptionDetails {
  @scala.inline
  def apply(message: String = null): InvalidIdentityPoolConfigurationExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidIdentityPoolConfigurationExceptionDetails]
  }
}

