package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityDescription extends StObject {
  
  /**
    * <p>Date on which the identity was created.</p>
    */
  var CreationDate: js.UndefOr[Date] = js.native
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>Date on which the identity was last modified.</p>
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * <p>The provider names.</p>
    */
  var Logins: js.UndefOr[js.Array[String]] = js.native
}
object IdentityDescription {
  
  @scala.inline
  def apply(): IdentityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityDescription]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "IdentityDescription.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: IdentityDescription): js.Any = js.native
  
  @scala.inline
  implicit class IdentityDescriptionMutableBuilder[Self <: IdentityDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLogins(value: js.Array[String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
    
    @scala.inline
    def setLoginsVarargs(value: String*): Self = StObject.set(x, "Logins", js.Array(value :_*))
  }
}
