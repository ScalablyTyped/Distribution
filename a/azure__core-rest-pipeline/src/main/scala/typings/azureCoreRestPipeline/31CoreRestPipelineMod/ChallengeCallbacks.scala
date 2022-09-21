package typings.azureCoreRestPipeline.`31CoreRestPipelineMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeCallbacks extends StObject {
  
  /**
    * Allows for the authorization of the main request of this policy before it's sent.
    */
  var authorizeRequest: js.UndefOr[js.Function1[/* options */ AuthorizeRequestOptions, js.Promise[Unit]]] = js.undefined
  
  /**
    * Allows to handle authentication challenges and to re-authorize the request.
    * The response containing the challenge is `options.response`.
    * If this method returns true, the underlying request will be sent once again.
    * The request may be modified before being sent.
    */
  var authorizeRequestOnChallenge: js.UndefOr[
    js.Function1[/* options */ AuthorizeRequestOnChallengeOptions, js.Promise[Boolean]]
  ] = js.undefined
}
object ChallengeCallbacks {
  
  inline def apply(): ChallengeCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChallengeCallbacks]
  }
  
  extension [Self <: ChallengeCallbacks](x: Self) {
    
    inline def setAuthorizeRequest(value: /* options */ AuthorizeRequestOptions => js.Promise[Unit]): Self = StObject.set(x, "authorizeRequest", js.Any.fromFunction1(value))
    
    inline def setAuthorizeRequestOnChallenge(value: /* options */ AuthorizeRequestOnChallengeOptions => js.Promise[Boolean]): Self = StObject.set(x, "authorizeRequestOnChallenge", js.Any.fromFunction1(value))
    
    inline def setAuthorizeRequestOnChallengeUndefined: Self = StObject.set(x, "authorizeRequestOnChallenge", js.undefined)
    
    inline def setAuthorizeRequestUndefined: Self = StObject.set(x, "authorizeRequest", js.undefined)
  }
}
