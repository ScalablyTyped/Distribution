package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enviroment Variables
  * Site
  * interfaces
  */
trait SiteTapp extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: SiteTapp](x: Self) {
    
    inline def setCustomUrl(value: String): Self = StObject.set(x, "customUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInternalName(value: String): Self = StObject.set(x, "internalName", value.asInstanceOf[js.Any])
    
    inline def setIsExclusiveView(value: Boolean): Self = StObject.set(x, "isExclusiveView", value.asInstanceOf[js.Any])
    
    inline def setIsKioskMode(value: Boolean): Self = StObject.set(x, "isKioskMode", value.asInstanceOf[js.Any])
    
    inline def setIsSubTapp(value: Boolean): Self = StObject.set(x, "isSubTapp", value.asInstanceOf[js.Any])
    
    inline def setShowName(value: String): Self = StObject.set(x, "showName", value.asInstanceOf[js.Any])
    
    inline def setSortId(value: Double): Self = StObject.set(x, "sortId", value.asInstanceOf[js.Any])
    
    inline def setUserGroupIds(value: js.Array[Double]): Self = StObject.set(x, "userGroupIds", value.asInstanceOf[js.Any])
    
    inline def setUserGroupIdsVarargs(value: Double*): Self = StObject.set(x, "userGroupIds", js.Array(value :_*))
  }
}
