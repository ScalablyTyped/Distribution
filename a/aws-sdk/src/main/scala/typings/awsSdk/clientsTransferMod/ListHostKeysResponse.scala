package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHostKeysResponse extends StObject {
  
  /**
    * Returns an array, where each item contains the details of a host key.
    */
  var HostKeys: ListedHostKeys
  
  /**
    * Returns a token that you can use to call ListHostKeys again and receive additional results, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
  
  /**
    * Returns the server identifier that contains the listed host keys.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object ListHostKeysResponse {
  
  inline def apply(HostKeys: ListedHostKeys, ServerId: ServerId): ListHostKeysResponse = {
    val __obj = js.Dynamic.literal(HostKeys = HostKeys.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostKeysResponse]
  }
  
  extension [Self <: ListHostKeysResponse](x: Self) {
    
    inline def setHostKeys(value: ListedHostKeys): Self = StObject.set(x, "HostKeys", value.asInstanceOf[js.Any])
    
    inline def setHostKeysVarargs(value: ListedHostKey*): Self = StObject.set(x, "HostKeys", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
