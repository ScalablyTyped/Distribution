package typings.awsSdk.clientsSupportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountAliasResult extends StObject {
  
  /**
    * An alias or short name for an Amazon Web Services account.
    */
  var accountAlias: js.UndefOr[awsAccountAlias] = js.undefined
}
object GetAccountAliasResult {
  
  inline def apply(): GetAccountAliasResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountAliasResult]
  }
  
  extension [Self <: GetAccountAliasResult](x: Self) {
    
    inline def setAccountAlias(value: awsAccountAlias): Self = StObject.set(x, "accountAlias", value.asInstanceOf[js.Any])
    
    inline def setAccountAliasUndefined: Self = StObject.set(x, "accountAlias", js.undefined)
  }
}
