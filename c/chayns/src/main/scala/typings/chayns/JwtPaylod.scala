package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Utility Functions
  * Miscellaneous
  * chayns.utils
  * interfaces
  */
// chayns.utils.getJwtPayload()
trait JwtPaylod extends StObject {
  
  var FacebookUserID: String
  
  var FirstName: String
  
  var LastName: String
  
  var LocationID: Double
  
  var LoginType: Double
  
  var PersonID: String
  
  var TobitUserID: Double
  
  var isAdmin: Boolean
}
object JwtPaylod {
  
  @scala.inline
  def apply(
    FacebookUserID: String,
    FirstName: String,
    LastName: String,
    LocationID: Double,
    LoginType: Double,
    PersonID: String,
    TobitUserID: Double,
    isAdmin: Boolean
  ): JwtPaylod = {
    val __obj = js.Dynamic.literal(FacebookUserID = FacebookUserID.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], LocationID = LocationID.asInstanceOf[js.Any], LoginType = LoginType.asInstanceOf[js.Any], PersonID = PersonID.asInstanceOf[js.Any], TobitUserID = TobitUserID.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtPaylod]
  }
  
  @scala.inline
  implicit class JwtPaylodMutableBuilder[Self <: JwtPaylod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacebookUserID(value: String): Self = StObject.set(x, "FacebookUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdmin(value: Boolean): Self = StObject.set(x, "isAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationID(value: Double): Self = StObject.set(x, "LocationID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginType(value: Double): Self = StObject.set(x, "LoginType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonID(value: String): Self = StObject.set(x, "PersonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTobitUserID(value: Double): Self = StObject.set(x, "TobitUserID", value.asInstanceOf[js.Any])
  }
}
