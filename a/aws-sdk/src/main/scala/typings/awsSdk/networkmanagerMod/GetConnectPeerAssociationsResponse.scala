package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectPeerAssociationsResponse extends StObject {
  
  /**
    * Displays a list of Connect peer associations.
    */
  var ConnectPeerAssociations: js.UndefOr[ConnectPeerAssociationList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.networkmanagerMod.NextToken] = js.undefined
}
object GetConnectPeerAssociationsResponse {
  
  inline def apply(): GetConnectPeerAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectPeerAssociationsResponse]
  }
  
  extension [Self <: GetConnectPeerAssociationsResponse](x: Self) {
    
    inline def setConnectPeerAssociations(value: ConnectPeerAssociationList): Self = StObject.set(x, "ConnectPeerAssociations", value.asInstanceOf[js.Any])
    
    inline def setConnectPeerAssociationsUndefined: Self = StObject.set(x, "ConnectPeerAssociations", js.undefined)
    
    inline def setConnectPeerAssociationsVarargs(value: ConnectPeerAssociation*): Self = StObject.set(x, "ConnectPeerAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
