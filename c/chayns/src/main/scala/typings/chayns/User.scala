package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var FacebookID: String
  
  var FirstName: String
  
  var LastName: String
  
  var PersonID: String
  
  var UserFullName: String
  
  var UserID: Double
}
object User {
  
  inline def apply(
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
  
  extension [Self <: User](x: Self) {
    
    inline def setFacebookID(value: String): Self = StObject.set(x, "FacebookID", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setPersonID(value: String): Self = StObject.set(x, "PersonID", value.asInstanceOf[js.Any])
    
    inline def setUserFullName(value: String): Self = StObject.set(x, "UserFullName", value.asInstanceOf[js.Any])
    
    inline def setUserID(value: Double): Self = StObject.set(x, "UserID", value.asInstanceOf[js.Any])
  }
}
