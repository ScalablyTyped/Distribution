package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardDocument extends StObject {
  
  var profile: IConnectionProfile = js.native
  
  var serverInfo: ServerInfo = js.native
}
object DashboardDocument {
  
  @scala.inline
  def apply(profile: IConnectionProfile, serverInfo: ServerInfo): DashboardDocument = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardDocument]
  }
  
  @scala.inline
  implicit class DashboardDocumentMutableBuilder[Self <: DashboardDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfile(value: IConnectionProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerInfo(value: ServerInfo): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
  }
}
