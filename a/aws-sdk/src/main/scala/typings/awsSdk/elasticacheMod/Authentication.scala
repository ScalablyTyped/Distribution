package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authentication extends StObject {
  
  /**
    * The number of passwords belonging to the user. The maximum is two.
    */
  var PasswordCount: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Indicates whether the user requires a password to authenticate.
    */
  var Type: js.UndefOr[AuthenticationType] = js.undefined
}
object Authentication {
  
  @scala.inline
  def apply(): Authentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authentication]
  }
  
  @scala.inline
  implicit class AuthenticationMutableBuilder[Self <: Authentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasswordCount(value: IntegerOptional): Self = StObject.set(x, "PasswordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordCountUndefined: Self = StObject.set(x, "PasswordCount", js.undefined)
    
    @scala.inline
    def setType(value: AuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
