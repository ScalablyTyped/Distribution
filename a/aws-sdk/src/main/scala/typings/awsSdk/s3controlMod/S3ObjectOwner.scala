package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ObjectOwner extends js.Object {
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ID: js.UndefOr[NonEmptyMaxLength1024String] = js.native
}

object S3ObjectOwner {
  @scala.inline
  def apply(DisplayName: NonEmptyMaxLength1024String = null, ID: NonEmptyMaxLength1024String = null): S3ObjectOwner = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectOwner]
  }
}

