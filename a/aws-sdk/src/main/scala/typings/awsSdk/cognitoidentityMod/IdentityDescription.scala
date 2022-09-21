package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityDescription extends StObject {
  
  /**
    * Date on which the identity was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.undefined
  
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The provider names.
    */
  var Logins: js.UndefOr[LoginsList] = js.undefined
}
object IdentityDescription {
  
  inline def apply(): IdentityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityDescription]
  }
  
  extension [Self <: IdentityDescription](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setLogins(value: LoginsList): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    inline def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
    
    inline def setLoginsVarargs(value: IdentityProviderName*): Self = StObject.set(x, "Logins", js.Array(value*))
  }
}
