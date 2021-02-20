package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enviroment Variables
  * Site
  * interfaces
  */
@js.native
trait SiteTapp extends StObject {
  
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
  implicit class SiteTappMutableBuilder[Self <: SiteTapp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomUrl(value: String): Self = StObject.set(x, "customUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalName(value: String): Self = StObject.set(x, "internalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExclusiveView(value: Boolean): Self = StObject.set(x, "isExclusiveView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKioskMode(value: Boolean): Self = StObject.set(x, "isKioskMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSubTapp(value: Boolean): Self = StObject.set(x, "isSubTapp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowName(value: String): Self = StObject.set(x, "showName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortId(value: Double): Self = StObject.set(x, "sortId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupIds(value: js.Array[Double]): Self = StObject.set(x, "userGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupIdsVarargs(value: Double*): Self = StObject.set(x, "userGroupIds", js.Array(value :_*))
  }
}
