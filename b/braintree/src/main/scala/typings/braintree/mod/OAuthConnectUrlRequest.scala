package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthConnectUrlRequest extends StObject {
  
  var redirectUri: String
  
  var scope: String
  
  var state: js.UndefOr[String] = js.undefined
}
object OAuthConnectUrlRequest {
  
  @scala.inline
  def apply(redirectUri: String, scope: String): OAuthConnectUrlRequest = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthConnectUrlRequest]
  }
  
  @scala.inline
  implicit class OAuthConnectUrlRequestMutableBuilder[Self <: OAuthConnectUrlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
