package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetXssMatchSetRequest extends StObject {
  
  /**
    * The XssMatchSetId of the XssMatchSet that you want to get. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId
}
object GetXssMatchSetRequest {
  
  inline def apply(XssMatchSetId: ResourceId): GetXssMatchSetRequest = {
    val __obj = js.Dynamic.literal(XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetXssMatchSetRequest]
  }
  
  extension [Self <: GetXssMatchSetRequest](x: Self) {
    
    inline def setXssMatchSetId(value: ResourceId): Self = StObject.set(x, "XssMatchSetId", value.asInstanceOf[js.Any])
  }
}
