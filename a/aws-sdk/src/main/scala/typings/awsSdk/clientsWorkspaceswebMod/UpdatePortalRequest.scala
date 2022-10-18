package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortalRequest extends StObject {
  
  /**
    * The name of the web portal. This is not visible to users who log into the web portal.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
}
object UpdatePortalRequest {
  
  inline def apply(portalArn: ARN): UpdatePortalRequest = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalRequest]
  }
  
  extension [Self <: UpdatePortalRequest](x: Self) {
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
