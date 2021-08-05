package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUserInfoMod {
  
  type UnmarshalledUserInfo = UserInfo
  
  trait UserInfo extends StObject {
    
    /**
      * <p>The date when the specified commit was commited, in timestamp format with GMT offset.</p>
      */
    var date: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The email address associated with the user who made the commit, if any.</p>
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the user who made the specified commit.</p>
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object UserInfo {
    
    inline def apply(): UserInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserInfo]
    }
    
    extension [Self <: UserInfo](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
