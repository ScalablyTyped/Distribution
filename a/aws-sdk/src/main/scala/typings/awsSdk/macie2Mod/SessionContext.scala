package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionContext extends StObject {
  
  /**
    * The date and time when the credentials were issued, and whether the credentials were authenticated with a multi-factor authentication (MFA) device.
    */
  var attributes: js.UndefOr[SessionContextAttributes] = js.native
  
  /**
    * The source and type of credentials that were issued to the entity.
    */
  var sessionIssuer: js.UndefOr[SessionIssuer] = js.native
}
object SessionContext {
  
  @scala.inline
  def apply(): SessionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionContext]
  }
  
  @scala.inline
  implicit class SessionContextMutableBuilder[Self <: SessionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: SessionContextAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setSessionIssuer(value: SessionIssuer): Self = StObject.set(x, "sessionIssuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIssuerUndefined: Self = StObject.set(x, "sessionIssuer", js.undefined)
  }
}
