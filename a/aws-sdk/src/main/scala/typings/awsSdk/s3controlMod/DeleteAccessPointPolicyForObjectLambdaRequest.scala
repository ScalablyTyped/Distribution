package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessPointPolicyForObjectLambdaRequest extends StObject {
  
  /**
    * The account ID for the account that owns the specified Object Lambda Access Point.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The name of the Object Lambda Access Point you want to delete the policy for.
    */
  var Name: ObjectLambdaAccessPointName
}
object DeleteAccessPointPolicyForObjectLambdaRequest {
  
  inline def apply(AccountId: AccountId, Name: ObjectLambdaAccessPointName): DeleteAccessPointPolicyForObjectLambdaRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPointPolicyForObjectLambdaRequest]
  }
  
  extension [Self <: DeleteAccessPointPolicyForObjectLambdaRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ObjectLambdaAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
