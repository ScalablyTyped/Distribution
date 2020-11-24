package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizerConfig extends js.Object {
  
  /**
    * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
    */
  var allowAuthorizerOverride: js.UndefOr[AllowAuthorizerOverride] = js.native
  
  /**
    * The name of the authorization service for a domain configuration.
    */
  var defaultAuthorizerName: js.UndefOr[AuthorizerName] = js.native
}
object AuthorizerConfig {
  
  @scala.inline
  def apply(): AuthorizerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerConfig]
  }
  
  @scala.inline
  implicit class AuthorizerConfigOps[Self <: AuthorizerConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowAuthorizerOverride(value: AllowAuthorizerOverride): Self = this.set("allowAuthorizerOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAuthorizerOverride: Self = this.set("allowAuthorizerOverride", js.undefined)
    
    @scala.inline
    def setDefaultAuthorizerName(value: AuthorizerName): Self = this.set("defaultAuthorizerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAuthorizerName: Self = this.set("defaultAuthorizerName", js.undefined)
  }
}
