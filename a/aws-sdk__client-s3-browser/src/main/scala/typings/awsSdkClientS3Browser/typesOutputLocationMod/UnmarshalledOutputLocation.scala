package typings.awsSdkClientS3Browser.typesOutputLocationMod

import typings.awsSdkClientS3Browser.typesS3LocationMod.UnmarshalledS3Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledOutputLocation extends OutputLocation {
  /**
    * <p>Describes an S3 location that will receive the results of the restore request.</p>
    */
  @JSName("S3")
  var S3_UnmarshalledOutputLocation: js.UndefOr[UnmarshalledS3Location] = js.undefined
}

object UnmarshalledOutputLocation {
  @scala.inline
  def apply(S3: UnmarshalledS3Location = null): UnmarshalledOutputLocation = {
    val __obj = js.Dynamic.literal()
    if (S3 != null) __obj.updateDynamic("S3")(S3.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledOutputLocation]
  }
}

