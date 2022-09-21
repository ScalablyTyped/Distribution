package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  /**
    * The name of the scope. The following scopes are possible:    Organization - Specifies that the recommendation preference applies at the organization level, for all member accounts of an organization.    AccountId - Specifies that the recommendation preference applies at the account level, for all resources of a given resource type in an account.    ResourceArn - Specifies that the recommendation preference applies at the individual resource level.  
    */
  var name: js.UndefOr[ScopeName] = js.undefined
  
  /**
    * The value of the scope. If you specified the name of the scope as:    Organization - The value must be ALL_ACCOUNTS.    AccountId - The value must be a 12-digit Amazon Web Services account ID.    ResourceArn - The value must be the Amazon Resource Name (ARN) of an EC2 instance or an Auto Scaling group.   Only EC2 instance and Auto Scaling group ARNs are currently supported.
    */
  var value: js.UndefOr[ScopeValue] = js.undefined
}
object Scope {
  
  inline def apply(): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scope]
  }
  
  extension [Self <: Scope](x: Self) {
    
    inline def setName(value: ScopeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: ScopeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
