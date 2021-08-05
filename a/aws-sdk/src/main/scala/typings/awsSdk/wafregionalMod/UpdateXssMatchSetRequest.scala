package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateXssMatchSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken
  
  /**
    * An array of XssMatchSetUpdate objects that you want to insert into or delete from an XssMatchSet. For more information, see the applicable data types:    XssMatchSetUpdate: Contains Action and XssMatchTuple     XssMatchTuple: Contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var Updates: XssMatchSetUpdates
  
  /**
    * The XssMatchSetId of the XssMatchSet that you want to update. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId
}
object UpdateXssMatchSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, Updates: XssMatchSetUpdates, XssMatchSetId: ResourceId): UpdateXssMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any], XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateXssMatchSetRequest]
  }
  
  extension [Self <: UpdateXssMatchSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: XssMatchSetUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: XssMatchSetUpdate*): Self = StObject.set(x, "Updates", js.Array(value :_*))
    
    inline def setXssMatchSetId(value: ResourceId): Self = StObject.set(x, "XssMatchSetId", value.asInstanceOf[js.Any])
  }
}
