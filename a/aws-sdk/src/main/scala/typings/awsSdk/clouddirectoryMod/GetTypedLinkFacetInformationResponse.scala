package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTypedLinkFacetInformationResponse extends StObject {
  
  /**
    * The order of identity attributes for the facet, from most significant to least significant. The ability to filter typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls. For more information about identity attributes, see Typed Links.
    */
  var IdentityAttributeOrder: js.UndefOr[AttributeNameList] = js.undefined
}
object GetTypedLinkFacetInformationResponse {
  
  inline def apply(): GetTypedLinkFacetInformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTypedLinkFacetInformationResponse]
  }
  
  extension [Self <: GetTypedLinkFacetInformationResponse](x: Self) {
    
    inline def setIdentityAttributeOrder(value: AttributeNameList): Self = StObject.set(x, "IdentityAttributeOrder", value.asInstanceOf[js.Any])
    
    inline def setIdentityAttributeOrderUndefined: Self = StObject.set(x, "IdentityAttributeOrder", js.undefined)
    
    inline def setIdentityAttributeOrderVarargs(value: AttributeName*): Self = StObject.set(x, "IdentityAttributeOrder", js.Array(value*))
  }
}
