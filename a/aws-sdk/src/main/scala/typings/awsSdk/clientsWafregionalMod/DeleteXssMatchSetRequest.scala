package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteXssMatchSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.clientsWafregionalMod.ChangeToken
  
  /**
    * The XssMatchSetId of the XssMatchSet that you want to delete. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId
}
object DeleteXssMatchSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, XssMatchSetId: ResourceId): DeleteXssMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteXssMatchSetRequest]
  }
  
  extension [Self <: DeleteXssMatchSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setXssMatchSetId(value: ResourceId): Self = StObject.set(x, "XssMatchSetId", value.asInstanceOf[js.Any])
  }
}
