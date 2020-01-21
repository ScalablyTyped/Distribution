package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeSigning extends js.Object {
  /**
    * The ID of the AWSSignerJob which was created to sign the file.
    */
  var awsSignerJobId: js.UndefOr[SigningJobId] = js.native
  /**
    * A custom method for code signing a file.
    */
  var customCodeSigning: js.UndefOr[CustomCodeSigning] = js.native
  /**
    * Describes the code-signing job.
    */
  var startSigningJobParameter: js.UndefOr[StartSigningJobParameter] = js.native
}

object CodeSigning {
  @scala.inline
  def apply(
    awsSignerJobId: SigningJobId = null,
    customCodeSigning: CustomCodeSigning = null,
    startSigningJobParameter: StartSigningJobParameter = null
  ): CodeSigning = {
    val __obj = js.Dynamic.literal()
    if (awsSignerJobId != null) __obj.updateDynamic("awsSignerJobId")(awsSignerJobId.asInstanceOf[js.Any])
    if (customCodeSigning != null) __obj.updateDynamic("customCodeSigning")(customCodeSigning.asInstanceOf[js.Any])
    if (startSigningJobParameter != null) __obj.updateDynamic("startSigningJobParameter")(startSigningJobParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSigning]
  }
}

