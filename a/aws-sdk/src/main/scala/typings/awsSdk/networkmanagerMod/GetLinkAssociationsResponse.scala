package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLinkAssociationsResponse extends StObject {
  
  /**
    * The link associations.
    */
  var LinkAssociations: js.UndefOr[LinkAssociationList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetLinkAssociationsResponse {
  
  inline def apply(): GetLinkAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLinkAssociationsResponse]
  }
  
  extension [Self <: GetLinkAssociationsResponse](x: Self) {
    
    inline def setLinkAssociations(value: LinkAssociationList): Self = StObject.set(x, "LinkAssociations", value.asInstanceOf[js.Any])
    
    inline def setLinkAssociationsUndefined: Self = StObject.set(x, "LinkAssociations", js.undefined)
    
    inline def setLinkAssociationsVarargs(value: LinkAssociation*): Self = StObject.set(x, "LinkAssociations", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
