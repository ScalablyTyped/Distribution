package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enviroment Variables
  * Site
  * interfaces
  */
@js.native
trait SiteTapp extends js.Object {
  
  var customUrl: String = js.native
  
  var id: Double = js.native
  
  var internalName: String = js.native
  
  var isExclusiveView: Boolean = js.native
  
  var isKioskMode: Boolean = js.native
  
  var isSubTapp: Boolean = js.native
  
  var showName: String = js.native
  
  var sortId: Double = js.native
  
  var userGroupIds: js.Array[Double] = js.native
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
  
  @scala.inline
  implicit class SiteTappOps[Self <: SiteTapp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomUrl(value: String): Self = this.set("customUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalName(value: String): Self = this.set("internalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExclusiveView(value: Boolean): Self = this.set("isExclusiveView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKioskMode(value: Boolean): Self = this.set("isKioskMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSubTapp(value: Boolean): Self = this.set("isSubTapp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowName(value: String): Self = this.set("showName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortId(value: Double): Self = this.set("sortId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupIdsVarargs(value: Double*): Self = this.set("userGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setUserGroupIds(value: js.Array[Double]): Self = this.set("userGroupIds", value.asInstanceOf[js.Any])
  }
}
