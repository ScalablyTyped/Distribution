package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeletionProtectionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication set you're updating.
    */
  var arn: Arn
  
  /**
    * A token ensuring that the operation is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * Details if deletion protection is enabled or disabled in your account.
    */
  var deletionProtected: Boolean
}
object UpdateDeletionProtectionInput {
  
  inline def apply(arn: Arn, deletionProtected: Boolean): UpdateDeletionProtectionInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], deletionProtected = deletionProtected.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeletionProtectionInput]
  }
  
  extension [Self <: UpdateDeletionProtectionInput](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDeletionProtected(value: Boolean): Self = StObject.set(x, "deletionProtected", value.asInstanceOf[js.Any])
  }
}
