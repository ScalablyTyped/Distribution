package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityDescription extends StObject {
  
  /**
    * Date on which the identity was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.native
  
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * The provider names.
    */
  var Logins: js.UndefOr[LoginsList] = js.native
}
object IdentityDescription {
  
  @scala.inline
  def apply(): IdentityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityDescription]
  }
  
  @scala.inline
  implicit class IdentityDescriptionMutableBuilder[Self <: IdentityDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLogins(value: LoginsList): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
    
    @scala.inline
    def setLoginsVarargs(value: IdentityProviderName*): Self = StObject.set(x, "Logins", js.Array(value :_*))
  }
}
