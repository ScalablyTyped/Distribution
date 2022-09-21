package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSiteInput extends StObject {
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the site.   In requests, Amazon Web Services Outposts accepts the Amazon Resource Name (ARN) or an ID for Outposts and sites throughout the Outposts Query API. To address backwards compatibility, the parameter names OutpostID or SiteID remain in use. Despite the parameter name, you can make the request with an ARN. 
    */
  var SiteId: typings.awsSdk.outpostsMod.SiteId
}
object DeleteSiteInput {
  
  inline def apply(SiteId: SiteId): DeleteSiteInput = {
    val __obj = js.Dynamic.literal(SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSiteInput]
  }
  
  extension [Self <: DeleteSiteInput](x: Self) {
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
