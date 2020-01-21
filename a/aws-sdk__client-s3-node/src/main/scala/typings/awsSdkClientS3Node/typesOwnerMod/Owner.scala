package typings.awsSdkClientS3Node.typesOwnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Owner extends js.Object {
  /**
    * _DisplayName shape
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * _ID shape
    */
  var ID: js.UndefOr[String] = js.undefined
}

object Owner {
  @scala.inline
  def apply(DisplayName: String = null, ID: String = null): Owner = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
}

