package typings.awsSdk.supportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountAliasRequest extends StObject {
  
  /**
    * An alias or short name for an Amazon Web Services account.
    */
  var accountAlias: awsAccountAlias
}
object PutAccountAliasRequest {
  
  inline def apply(accountAlias: awsAccountAlias): PutAccountAliasRequest = {
    val __obj = js.Dynamic.literal(accountAlias = accountAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountAliasRequest]
  }
  
  extension [Self <: PutAccountAliasRequest](x: Self) {
    
    inline def setAccountAlias(value: awsAccountAlias): Self = StObject.set(x, "accountAlias", value.asInstanceOf[js.Any])
  }
}
