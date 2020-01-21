package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSigningJobParameter extends js.Object {
  /**
    * The location to write the code-signed file.
    */
  var destination: js.UndefOr[Destination] = js.native
  /**
    * The code-signing profile name.
    */
  var signingProfileName: js.UndefOr[SigningProfileName] = js.native
  /**
    * Describes the code-signing profile.
    */
  var signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.native
}

object StartSigningJobParameter {
  @scala.inline
  def apply(
    destination: Destination = null,
    signingProfileName: SigningProfileName = null,
    signingProfileParameter: SigningProfileParameter = null
  ): StartSigningJobParameter = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (signingProfileName != null) __obj.updateDynamic("signingProfileName")(signingProfileName.asInstanceOf[js.Any])
    if (signingProfileParameter != null) __obj.updateDynamic("signingProfileParameter")(signingProfileParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSigningJobParameter]
  }
}

