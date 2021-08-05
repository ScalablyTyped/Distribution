package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePresignedPortalUrlRequest extends StObject {
  
  /**
    * The ID of the portal to access.
    */
  var portalId: ID
  
  /**
    * The duration (in seconds) for which the session at the URL is valid. Default: 900 seconds (15 minutes)
    */
  var sessionDurationSeconds: js.UndefOr[SessionDurationSeconds] = js.undefined
}
object CreatePresignedPortalUrlRequest {
  
  inline def apply(portalId: ID): CreatePresignedPortalUrlRequest = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedPortalUrlRequest]
  }
  
  extension [Self <: CreatePresignedPortalUrlRequest](x: Self) {
    
    inline def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
    
    inline def setSessionDurationSeconds(value: SessionDurationSeconds): Self = StObject.set(x, "sessionDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setSessionDurationSecondsUndefined: Self = StObject.set(x, "sessionDurationSeconds", js.undefined)
  }
}
