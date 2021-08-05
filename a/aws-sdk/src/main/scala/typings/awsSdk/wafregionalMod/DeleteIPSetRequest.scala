package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIPSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken
  
  /**
    * The IPSetId of the IPSet that you want to delete. IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId
}
object DeleteIPSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, IPSetId: ResourceId): DeleteIPSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], IPSetId = IPSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIPSetRequest]
  }
  
  extension [Self <: DeleteIPSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setIPSetId(value: ResourceId): Self = StObject.set(x, "IPSetId", value.asInstanceOf[js.Any])
  }
}
