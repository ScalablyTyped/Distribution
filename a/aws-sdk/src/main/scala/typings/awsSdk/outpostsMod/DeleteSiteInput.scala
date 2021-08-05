package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSiteInput extends StObject {
  
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
