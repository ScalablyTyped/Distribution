package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionContextAttributes extends StObject {
  
  /**
    * The date and time, in UTC and ISO 8601 format, when the credentials were issued.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
    */
  var mfaAuthenticated: js.UndefOr[boolean] = js.undefined
}
object SessionContextAttributes {
  
  inline def apply(): SessionContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionContextAttributes]
  }
  
  extension [Self <: SessionContextAttributes](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setMfaAuthenticated(value: boolean): Self = StObject.set(x, "mfaAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setMfaAuthenticatedUndefined: Self = StObject.set(x, "mfaAuthenticated", js.undefined)
  }
}
