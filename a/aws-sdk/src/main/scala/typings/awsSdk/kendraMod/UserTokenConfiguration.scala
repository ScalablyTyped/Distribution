package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserTokenConfiguration extends js.Object {
  
  /**
    * Information about the JSON token type configuration.
    */
  var JsonTokenTypeConfiguration: js.UndefOr[typings.awsSdk.kendraMod.JsonTokenTypeConfiguration] = js.native
  
  /**
    * Information about the JWT token type configuration.
    */
  var JwtTokenTypeConfiguration: js.UndefOr[typings.awsSdk.kendraMod.JwtTokenTypeConfiguration] = js.native
}
object UserTokenConfiguration {
  
  @scala.inline
  def apply(): UserTokenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTokenConfiguration]
  }
  
  @scala.inline
  implicit class UserTokenConfigurationOps[Self <: UserTokenConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJsonTokenTypeConfiguration(value: JsonTokenTypeConfiguration): Self = this.set("JsonTokenTypeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonTokenTypeConfiguration: Self = this.set("JsonTokenTypeConfiguration", js.undefined)
    
    @scala.inline
    def setJwtTokenTypeConfiguration(value: JwtTokenTypeConfiguration): Self = this.set("JwtTokenTypeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtTokenTypeConfiguration: Self = this.set("JwtTokenTypeConfiguration", js.undefined)
  }
}
