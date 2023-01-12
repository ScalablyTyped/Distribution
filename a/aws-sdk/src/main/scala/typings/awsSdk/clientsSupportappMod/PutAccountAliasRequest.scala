package typings.awsSdk.clientsSupportappMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAccountAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountAlias(value: awsAccountAlias): Self = StObject.set(x, "accountAlias", value.asInstanceOf[js.Any])
  }
}
