package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  var FacebookID: String = js.native
  
  var FirstName: String = js.native
  
  var LastName: String = js.native
  
  var PersonID: String = js.native
  
  var UserFullName: String = js.native
  
  var UserID: Double = js.native
}
object User {
  
  @scala.inline
  def apply(
    FacebookID: String,
    FirstName: String,
    LastName: String,
    PersonID: String,
    UserFullName: String,
    UserID: Double
  ): User = {
    val __obj = js.Dynamic.literal(FacebookID = FacebookID.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], PersonID = PersonID.asInstanceOf[js.Any], UserFullName = UserFullName.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacebookID(value: String): Self = StObject.set(x, "FacebookID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonID(value: String): Self = StObject.set(x, "PersonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFullName(value: String): Self = StObject.set(x, "UserFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: Double): Self = StObject.set(x, "UserID", value.asInstanceOf[js.Any])
  }
}
