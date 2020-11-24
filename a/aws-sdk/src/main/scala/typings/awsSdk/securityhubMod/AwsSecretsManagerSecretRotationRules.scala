package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsSecretsManagerSecretRotationRules extends js.Object {
  
  /**
    * The number of days after the previous rotation to rotate the secret.
    */
  var AutomaticallyAfterDays: js.UndefOr[Integer] = js.native
}
object AwsSecretsManagerSecretRotationRules {
  
  @scala.inline
  def apply(): AwsSecretsManagerSecretRotationRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSecretsManagerSecretRotationRules]
  }
  
  @scala.inline
  implicit class AwsSecretsManagerSecretRotationRulesOps[Self <: AwsSecretsManagerSecretRotationRules] (val x: Self) extends AnyVal {
    
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
    def setAutomaticallyAfterDays(value: Integer): Self = this.set("AutomaticallyAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticallyAfterDays: Self = this.set("AutomaticallyAfterDays", js.undefined)
  }
}
