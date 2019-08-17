package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreOutputLocationMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreS3LocationMod._S3Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _OutputLocation extends js.Object {
  /**
    * <p>Describes an S3 location that will receive the results of the job request.</p>
    */
  var S3: js.UndefOr[_S3Location] = js.undefined
}

object _OutputLocation {
  @scala.inline
  def apply(S3: _S3Location = null): _OutputLocation = {
    val __obj = js.Dynamic.literal()
    if (S3 != null) __obj.updateDynamic("S3")(S3)
    __obj.asInstanceOf[_OutputLocation]
  }
}

