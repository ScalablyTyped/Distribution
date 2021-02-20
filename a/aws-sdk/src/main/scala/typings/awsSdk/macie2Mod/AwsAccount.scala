package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsAccount extends StObject {
  
  /**
    * The unique identifier for the AWS account.
    */
  var accountId: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the entity that performed the action.
    */
  var principalId: js.UndefOr[string] = js.native
}
object AwsAccount {
  
  @scala.inline
  def apply(): AwsAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAccount]
  }
  
  @scala.inline
  implicit class AwsAccountMutableBuilder[Self <: AwsAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: string): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
  }
}
