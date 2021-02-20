package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessKeyDetails extends StObject {
  
  /**
    * The access key ID of the user.
    */
  var AccessKeyId: js.UndefOr[String] = js.native
  
  /**
    * The principal ID of the user.
    */
  var PrincipalId: js.UndefOr[String] = js.native
  
  /**
    * The name of the user.
    */
  var UserName: js.UndefOr[String] = js.native
  
  /**
    * The type of the user.
    */
  var UserType: js.UndefOr[String] = js.native
}
object AccessKeyDetails {
  
  @scala.inline
  def apply(): AccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessKeyDetails]
  }
  
  @scala.inline
  implicit class AccessKeyDetailsMutableBuilder[Self <: AccessKeyDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: String): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    @scala.inline
    def setUserType(value: String): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
