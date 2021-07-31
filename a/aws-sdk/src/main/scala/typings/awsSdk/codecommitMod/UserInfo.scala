package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInfo extends StObject {
  
  /**
    * The date when the specified commit was commited, in timestamp format with GMT offset.
    */
  var date: js.UndefOr[Date] = js.undefined
  
  /**
    * The email address associated with the user who made the commit, if any.
    */
  var email: js.UndefOr[Email] = js.undefined
  
  /**
    * The name of the user who made the specified commit.
    */
  var name: js.UndefOr[Name] = js.undefined
}
object UserInfo {
  
  @scala.inline
  def apply(): UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInfo]
  }
  
  @scala.inline
  implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
