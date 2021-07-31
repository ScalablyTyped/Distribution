package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenValidityUnitsType extends StObject {
  
  /**
    *  A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to hours.
    */
  var AccessToken: js.UndefOr[TimeUnitsType] = js.undefined
  
  /**
    * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to hours.
    */
  var IdToken: js.UndefOr[TimeUnitsType] = js.undefined
  
  /**
    * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to days.
    */
  var RefreshToken: js.UndefOr[TimeUnitsType] = js.undefined
}
object TokenValidityUnitsType {
  
  @scala.inline
  def apply(): TokenValidityUnitsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenValidityUnitsType]
  }
  
  @scala.inline
  implicit class TokenValidityUnitsTypeMutableBuilder[Self <: TokenValidityUnitsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TimeUnitsType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    @scala.inline
    def setIdToken(value: TimeUnitsType): Self = StObject.set(x, "IdToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "IdToken", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: TimeUnitsType): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "RefreshToken", js.undefined)
  }
}
