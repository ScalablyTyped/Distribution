package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIPSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.clientsWafregionalMod.ChangeToken
  
  /**
    * The IPSetId of the IPSet that you want to update. IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId
  
  /**
    * An array of IPSetUpdate objects that you want to insert into or delete from an IPSet. For more information, see the applicable data types:    IPSetUpdate: Contains Action and IPSetDescriptor     IPSetDescriptor: Contains Type and Value    You can insert a maximum of 1000 addresses in a single request.
    */
  var Updates: IPSetUpdates
}
object UpdateIPSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, IPSetId: ResourceId, Updates: IPSetUpdates): UpdateIPSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], IPSetId = IPSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIPSetRequest]
  }
  
  extension [Self <: UpdateIPSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setIPSetId(value: ResourceId): Self = StObject.set(x, "IPSetId", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: IPSetUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: IPSetUpdate*): Self = StObject.set(x, "Updates", js.Array(value*))
  }
}
