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
    val __obj = js.Dynamic.literal(customUrl = customUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internalName = internalName.asInstanceOf[js.Any], isExclusiveView = isExclusiveView.asInstanceOf[js.Any], isKioskMode = isKioskMode.asInstanceOf[js.Any], isSubTapp = isSubTapp.asInstanceOf[js.Any], showName = showName.asInstanceOf[js.Any], sortId = sortId.asInstanceOf[js.Any], userGroupIds = userGroupIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SiteTapp]
  }
}

