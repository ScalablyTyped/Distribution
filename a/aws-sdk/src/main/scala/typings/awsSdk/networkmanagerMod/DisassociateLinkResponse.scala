package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateLinkResponse extends StObject {
  
  /**
    * Information about the link association.
    */
  var LinkAssociation: js.UndefOr[typings.awsSdk.networkmanagerMod.LinkAssociation] = js.undefined
}
object DisassociateLinkResponse {
  
  inline def apply(): DisassociateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateLinkResponse]
  }
  
  extension [Self <: DisassociateLinkResponse](x: Self) {
    
    inline def setLinkAssociation(value: LinkAssociation): Self = StObject.set(x, "LinkAssociation", value.asInstanceOf[js.Any])
    
    inline def setLinkAssociationUndefined: Self = StObject.set(x, "LinkAssociation", js.undefined)
  }
}
