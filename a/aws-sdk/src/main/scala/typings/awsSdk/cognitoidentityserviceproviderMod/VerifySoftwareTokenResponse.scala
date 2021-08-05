package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifySoftwareTokenResponse extends StObject {
  
  /**
    * The session which should be passed both ways in challenge-response calls to the service.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
  
  /**
    * The status of the verify software token.
    */
  var Status: js.UndefOr[VerifySoftwareTokenResponseType] = js.undefined
}
object VerifySoftwareTokenResponse {
  
  inline def apply(): VerifySoftwareTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifySoftwareTokenResponse]
  }
  
  extension [Self <: VerifySoftwareTokenResponse](x: Self) {
    
    inline def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    inline def setStatus(value: VerifySoftwareTokenResponseType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
