package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enviroment Variables
  * Site
  * interfaces
  */
trait SiteTapp extends js.Object {
  var customUrl: java.lang.String
  var id: scala.Double
  var internalName: java.lang.String
  var isExclusiveView: scala.Boolean
  var isKioskMode: scala.Boolean
  var isSubTapp: scala.Boolean
  var showName: java.lang.String
  var sortId: scala.Double
  var userGroupIds: js.Array[scala.Double]
}

object SiteTapp {
  @scala.inline
  def apply(
    customUrl: java.lang.String,
    id: scala.Double,
    internalName: java.lang.String,
    isExclusiveView: scala.Boolean,
    isKioskMode: scala.Boolean,
    isSubTapp: scala.Boolean,
    showName: java.lang.String,
    sortId: scala.Double,
    userGroupIds: js.Array[scala.Double]
  ): SiteTapp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customUrl")(customUrl)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("internalName")(internalName)
    __obj.updateDynamic("isExclusiveView")(isExclusiveView)
    __obj.updateDynamic("isKioskMode")(isKioskMode)
    __obj.updateDynamic("isSubTapp")(isSubTapp)
    __obj.updateDynamic("showName")(showName)
    __obj.updateDynamic("sortId")(sortId)
    __obj.updateDynamic("userGroupIds")(userGroupIds)
    __obj.asInstanceOf[SiteTapp]
  }
}

