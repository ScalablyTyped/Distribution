package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOwnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Owner extends js.Object {
  /**
    * _DisplayName shape
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * _ID shape
    */
  var ID: js.UndefOr[String] = js.undefined
}

object _Owner {
  @scala.inline
  def apply(DisplayName: String = null, ID: String = null): _Owner = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    __obj.asInstanceOf[_Owner]
  }
}

