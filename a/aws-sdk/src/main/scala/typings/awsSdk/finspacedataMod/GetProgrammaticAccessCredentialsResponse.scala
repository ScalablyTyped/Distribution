package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProgrammaticAccessCredentialsResponse extends StObject {
  
  /**
    * Returns the programmatic credentials.
    */
  var credentials: js.UndefOr[Credentials] = js.undefined
  
  /**
    * Returns the duration in which the credentials will remain valid.
    */
  var durationInMinutes: js.UndefOr[SessionDuration] = js.undefined
}
object GetProgrammaticAccessCredentialsResponse {
  
  inline def apply(): GetProgrammaticAccessCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProgrammaticAccessCredentialsResponse]
  }
  
  extension [Self <: GetProgrammaticAccessCredentialsResponse](x: Self) {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setDurationInMinutes(value: SessionDuration): Self = StObject.set(x, "durationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDurationInMinutesUndefined: Self = StObject.set(x, "durationInMinutes", js.undefined)
  }
}
