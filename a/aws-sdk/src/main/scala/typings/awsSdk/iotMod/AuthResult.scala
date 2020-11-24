package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthResult extends js.Object {
  
  /**
    * The policies and statements that allowed the specified action.
    */
  var allowed: js.UndefOr[Allowed] = js.native
  
  /**
    * The final authorization decision of this scenario. Multiple statements are taken into account when determining the authorization decision. An explicit deny statement can override multiple allow statements.
    */
  var authDecision: js.UndefOr[AuthDecision] = js.native
  
  /**
    * Authorization information.
    */
  var authInfo: js.UndefOr[AuthInfo] = js.native
  
  /**
    * The policies and statements that denied the specified action.
    */
  var denied: js.UndefOr[Denied] = js.native
  
  /**
    * Contains any missing context values found while evaluating policy.
    */
  var missingContextValues: js.UndefOr[MissingContextValues] = js.native
}
object AuthResult {
  
  @scala.inline
  def apply(): AuthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthResult]
  }
  
  @scala.inline
  implicit class AuthResultOps[Self <: AuthResult] (val x: Self) extends AnyVal {
    
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
    def setAllowed(value: Allowed): Self = this.set("allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed: Self = this.set("allowed", js.undefined)
    
    @scala.inline
    def setAuthDecision(value: AuthDecision): Self = this.set("authDecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthDecision: Self = this.set("authDecision", js.undefined)
    
    @scala.inline
    def setAuthInfo(value: AuthInfo): Self = this.set("authInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthInfo: Self = this.set("authInfo", js.undefined)
    
    @scala.inline
    def setDenied(value: Denied): Self = this.set("denied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDenied: Self = this.set("denied", js.undefined)
    
    @scala.inline
    def setMissingContextValuesVarargs(value: MissingContextValue*): Self = this.set("missingContextValues", js.Array(value :_*))
    
    @scala.inline
    def setMissingContextValues(value: MissingContextValues): Self = this.set("missingContextValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingContextValues: Self = this.set("missingContextValues", js.undefined)
  }
}
