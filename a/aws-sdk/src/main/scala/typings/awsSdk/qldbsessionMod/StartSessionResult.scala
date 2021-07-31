package typings.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSessionResult extends StObject {
  
  /**
    * Session token of the started session. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var SessionToken: js.UndefOr[typings.awsSdk.qldbsessionMod.SessionToken] = js.undefined
}
object StartSessionResult {
  
  @scala.inline
  def apply(): StartSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSessionResult]
  }
  
  @scala.inline
  implicit class StartSessionResultMutableBuilder[Self <: StartSessionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionToken(value: SessionToken): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
  }
}
