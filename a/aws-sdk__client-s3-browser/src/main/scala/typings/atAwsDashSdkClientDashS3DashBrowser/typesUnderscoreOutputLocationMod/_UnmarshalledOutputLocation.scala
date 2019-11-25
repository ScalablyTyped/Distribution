package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOutputLocationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreS3LocationMod._UnmarshalledS3Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledOutputLocation extends _OutputLocation {
  /**
    * <p>Describes an S3 location that will receive the results of the restore request.</p>
    */
  @JSName("S3")
  var S3__UnmarshalledOutputLocation: js.UndefOr[_UnmarshalledS3Location] = js.undefined
}

object _UnmarshalledOutputLocation {
  @scala.inline
  def apply(S3: _UnmarshalledS3Location = null): _UnmarshalledOutputLocation = {
    val __obj = js.Dynamic.literal()
    if (S3 != null) __obj.updateDynamic("S3")(S3.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledOutputLocation]
  }
}

