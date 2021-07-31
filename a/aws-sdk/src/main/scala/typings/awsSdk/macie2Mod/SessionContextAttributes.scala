package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionContextAttributes extends StObject {
  
  /**
    * The date and time, in UTC and ISO 8601 format, when the credentials were issued.
    */
  var creationDate: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
    */
  var mfaAuthenticated: js.UndefOr[boolean] = js.undefined
}
object SessionContextAttributes {
  
  @scala.inline
  def apply(): SessionContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionContextAttributes]
  }
  
  @scala.inline
  implicit class SessionContextAttributesMutableBuilder[Self <: SessionContextAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: timestampIso8601): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setMfaAuthenticated(value: boolean): Self = StObject.set(x, "mfaAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfaAuthenticatedUndefined: Self = StObject.set(x, "mfaAuthenticated", js.undefined)
  }
}
