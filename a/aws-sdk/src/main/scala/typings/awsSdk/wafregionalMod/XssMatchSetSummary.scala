package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XssMatchSetSummary extends StObject {
  
  /**
    * The name of the XssMatchSet, if any, specified by Id.
    */
  var Name: ResourceName
  
  /**
    * A unique identifier for an XssMatchSet. You use XssMatchSetId to get information about a XssMatchSet (see GetXssMatchSet), update an XssMatchSet (see UpdateXssMatchSet), insert an XssMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete an XssMatchSet from AWS WAF (see DeleteXssMatchSet).  XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId
}
object XssMatchSetSummary {
  
  inline def apply(Name: ResourceName, XssMatchSetId: ResourceId): XssMatchSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetSummary]
  }
  
  extension [Self <: XssMatchSetSummary](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setXssMatchSetId(value: ResourceId): Self = StObject.set(x, "XssMatchSetId", value.asInstanceOf[js.Any])
  }
}
