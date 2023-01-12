package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardDocument extends StObject {
  
  var profile: IConnectionProfile
  
  var serverInfo: ServerInfo
}
object DashboardDocument {
  
  inline def apply(profile: IConnectionProfile, serverInfo: ServerInfo): DashboardDocument = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashboardDocument] (val x: Self) extends AnyVal {
    
    inline def setProfile(value: IConnectionProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setServerInfo(value: ServerInfo): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
  }
}
