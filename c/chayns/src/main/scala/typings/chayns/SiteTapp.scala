package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enviroment Variables
  * Site
  * interfaces
  */
trait SiteTapp extends js.Object {
  var customUrl: String
  var id: Double
  var internalName: String
  var isExclusiveView: Boolean
  var isKioskMode: Boolean
  var isSubTapp: Boolean
  var showName: String
  var sortId: Double
  var userGroupIds: js.Array[Double]
}

object SiteTapp {
  @scala.inline
  def apply(
    customUrl: String,
    id: Double,
    internalName: String,
    isExclusiveView: Boolean,
    isKioskMode: Boolean,
    isSubTapp: Boolean,
    showName: String,
    sortId: Double,
    userGroupIds: js.Array[Double]
  ): SiteTapp = {
    val __obj = js.Dynamic.literal(customUrl = customUrl, id = id, internalName = internalName, isExclusiveView = isExclusiveView, isKioskMode = isKioskMode, isSubTapp = isSubTapp, showName = showName, sortId = sortId, userGroupIds = userGroupIds)
  
    __obj.asInstanceOf[SiteTapp]
  }
}

