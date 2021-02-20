package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUserInfoMod {
  
  type UnmarshalledUserInfo = UserInfo
  
  @js.native
  trait UserInfo extends StObject {
    
    /**
      * <p>The date when the specified commit was commited, in timestamp format with GMT offset.</p>
      */
    var date: js.UndefOr[String] = js.native
    
    /**
      * <p>The email address associated with the user who made the commit, if any.</p>
      */
    var email: js.UndefOr[String] = js.native
    
    /**
      * <p>The name of the user who made the specified commit.</p>
      */
    var name: js.UndefOr[String] = js.native
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
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
