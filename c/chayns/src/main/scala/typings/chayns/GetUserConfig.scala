package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic Functions
  * chayns
  * interfaces
  */
// chayns.getUser()
@js.native
trait GetUserConfig extends StObject {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var fbId: js.UndefOr[String] = js.native
  
  var personId: js.UndefOr[String] = js.native
  
  var userId: js.UndefOr[Double] = js.native
}
object GetUserConfig {
  
  @scala.inline
  def apply(): GetUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserConfig]
  }
  
  @scala.inline
  implicit class GetUserConfigMutableBuilder[Self <: GetUserConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setFbId(value: String): Self = StObject.set(x, "fbId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFbIdUndefined: Self = StObject.set(x, "fbId", js.undefined)
    
    @scala.inline
    def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonIdUndefined: Self = StObject.set(x, "personId", js.undefined)
    
    @scala.inline
    def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
