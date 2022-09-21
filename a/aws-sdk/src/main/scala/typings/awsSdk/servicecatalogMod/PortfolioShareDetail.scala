package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortfolioShareDetail extends StObject {
  
  /**
    * Indicates whether the shared portfolio is imported by the recipient account. If the recipient is in an organization node, the share is automatically imported, and the field is always set to true.
    */
  var Accepted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the recipient entity that received the portfolio share. The recipient entities can be one of the following:  1. An external account. 2. An organziation member account. 3. An organzational unit (OU). 4. The organization itself. (This shares with every account in the organization).
    */
  var PrincipalId: js.UndefOr[Id] = js.undefined
  
  /**
    * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
    */
  var ShareTagOptions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of the portfolio share.
    */
  var Type: js.UndefOr[DescribePortfolioShareType] = js.undefined
}
object PortfolioShareDetail {
  
  inline def apply(): PortfolioShareDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortfolioShareDetail]
  }
  
  extension [Self <: PortfolioShareDetail](x: Self) {
    
    inline def setAccepted(value: Boolean): Self = StObject.set(x, "Accepted", value.asInstanceOf[js.Any])
    
    inline def setAcceptedUndefined: Self = StObject.set(x, "Accepted", js.undefined)
    
    inline def setPrincipalId(value: Id): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setShareTagOptions(value: Boolean): Self = StObject.set(x, "ShareTagOptions", value.asInstanceOf[js.Any])
    
    inline def setShareTagOptionsUndefined: Self = StObject.set(x, "ShareTagOptions", js.undefined)
    
    inline def setType(value: DescribePortfolioShareType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
