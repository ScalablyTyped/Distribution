package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenValidityUnitsType extends js.Object {
  
  /**
    *  A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to hours.
    */
  var AccessToken: js.UndefOr[TimeUnitsType] = js.native
  
  /**
    * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to hours.
    */
  var IdToken: js.UndefOr[TimeUnitsType] = js.native
  
  /**
    * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to days.
    */
  var RefreshToken: js.UndefOr[TimeUnitsType] = js.native
}
object TokenValidityUnitsType {
  
  @scala.inline
  def apply(): TokenValidityUnitsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenValidityUnitsType]
  }
  
  @scala.inline
  implicit class TokenValidityUnitsTypeOps[Self <: TokenValidityUnitsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessToken(value: TimeUnitsType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("AccessToken", js.undefined)
    
    @scala.inline
    def setIdToken(value: TimeUnitsType): Self = this.set("IdToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("IdToken", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: TimeUnitsType): Self = this.set("RefreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("RefreshToken", js.undefined)
  }
}
