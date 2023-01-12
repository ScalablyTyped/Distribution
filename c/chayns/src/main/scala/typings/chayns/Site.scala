package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.findSite()
trait Site extends StObject {
  
  var appstoreName: String
  
  var facebookId: String
  
  var locationId: Double
  
  var siteId: String
}
object Site {
  
  inline def apply(appstoreName: String, facebookId: String, locationId: Double, siteId: String): Site = {
    val __obj = js.Dynamic.literal(appstoreName = appstoreName.asInstanceOf[js.Any], facebookId = facebookId.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any], siteId = siteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
    inline def setAppstoreName(value: String): Self = StObject.set(x, "appstoreName", value.asInstanceOf[js.Any])
    
    inline def setFacebookId(value: String): Self = StObject.set(x, "facebookId", value.asInstanceOf[js.Any])
    
    inline def setLocationId(value: Double): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
  }
}
