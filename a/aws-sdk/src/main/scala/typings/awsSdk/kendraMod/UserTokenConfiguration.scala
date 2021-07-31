package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserTokenConfiguration extends StObject {
  
  /**
    * Information about the JSON token type configuration.
    */
  var JsonTokenTypeConfiguration: js.UndefOr[typings.awsSdk.kendraMod.JsonTokenTypeConfiguration] = js.undefined
  
  /**
    * Information about the JWT token type configuration.
    */
  var JwtTokenTypeConfiguration: js.UndefOr[typings.awsSdk.kendraMod.JwtTokenTypeConfiguration] = js.undefined
}
object UserTokenConfiguration {
  
  @scala.inline
  def apply(): UserTokenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTokenConfiguration]
  }
  
  @scala.inline
  implicit class UserTokenConfigurationMutableBuilder[Self <: UserTokenConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonTokenTypeConfiguration(value: JsonTokenTypeConfiguration): Self = StObject.set(x, "JsonTokenTypeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonTokenTypeConfigurationUndefined: Self = StObject.set(x, "JsonTokenTypeConfiguration", js.undefined)
    
    @scala.inline
    def setJwtTokenTypeConfiguration(value: JwtTokenTypeConfiguration): Self = StObject.set(x, "JwtTokenTypeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwtTokenTypeConfigurationUndefined: Self = StObject.set(x, "JwtTokenTypeConfiguration", js.undefined)
  }
}
