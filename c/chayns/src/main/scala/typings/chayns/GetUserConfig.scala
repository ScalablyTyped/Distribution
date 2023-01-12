package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic Functions
  * chayns
  * interfaces
  */
// chayns.getUser()
trait GetUserConfig extends StObject {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var fbId: js.UndefOr[String] = js.undefined
  
  var personId: js.UndefOr[String] = js.undefined
  
  var userId: js.UndefOr[Double] = js.undefined
}
object GetUserConfig {
  
  inline def apply(): GetUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserConfig] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setFbId(value: String): Self = StObject.set(x, "fbId", value.asInstanceOf[js.Any])
    
    inline def setFbIdUndefined: Self = StObject.set(x, "fbId", js.undefined)
    
    inline def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    
    inline def setPersonIdUndefined: Self = StObject.set(x, "personId", js.undefined)
    
    inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
