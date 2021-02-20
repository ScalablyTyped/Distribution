package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsSecretsManagerSecretRotationRules extends StObject {
  
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
  implicit class AwsSecretsManagerSecretRotationRulesMutableBuilder[Self <: AwsSecretsManagerSecretRotationRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticallyAfterDays(value: Integer): Self = StObject.set(x, "AutomaticallyAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticallyAfterDaysUndefined: Self = StObject.set(x, "AutomaticallyAfterDays", js.undefined)
  }
}
