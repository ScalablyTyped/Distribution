package typings.cesium.anon

import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessToken extends StObject {
  
  var accessToken: String = js.native
  
  var server: String | Resource = js.native
}
object AccessToken {
  
  @scala.inline
  def apply(accessToken: String, server: String | Resource): AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
  
  @scala.inline
  implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String | Resource): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
