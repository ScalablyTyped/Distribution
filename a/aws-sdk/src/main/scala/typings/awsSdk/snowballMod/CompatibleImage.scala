package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleImage extends js.Object {
  /**
    * The unique identifier for an individual Snowball Edge AMI.
    */
  var AmiId: js.UndefOr[String] = js.native
  /**
    * The optional name of a compatible image.
    */
  var Name: js.UndefOr[String] = js.native
}

object CompatibleImage {
  @scala.inline
  def apply(AmiId: String = null, Name: String = null): CompatibleImage = {
    val __obj = js.Dynamic.literal()
    if (AmiId != null) __obj.updateDynamic("AmiId")(AmiId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompatibleImage]
  }
}

