package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminCreateUserConfigType extends StObject {
  
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var AllowAdminCreateUserOnly: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The message template to be used for the welcome message to new users. See also Customizing User Invitation Messages.
    */
  var InviteMessageTemplate: js.UndefOr[MessageTemplateType] = js.undefined
  
  /**
    * The user account expiration limit, in days, after which the account is no longer usable. To reset the account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter. The default value for this parameter is 7.   If you set a value for TemporaryPasswordValidityDays in PasswordPolicy, that value will be used and UnusedAccountValidityDays will be deprecated for that user pool.  
    */
  var UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType] = js.undefined
}
object AdminCreateUserConfigType {
  
  inline def apply(): AdminCreateUserConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminCreateUserConfigType]
  }
  
  extension [Self <: AdminCreateUserConfigType](x: Self) {
    
    inline def setAllowAdminCreateUserOnly(value: BooleanType): Self = StObject.set(x, "AllowAdminCreateUserOnly", value.asInstanceOf[js.Any])
    
    inline def setAllowAdminCreateUserOnlyUndefined: Self = StObject.set(x, "AllowAdminCreateUserOnly", js.undefined)
    
    inline def setInviteMessageTemplate(value: MessageTemplateType): Self = StObject.set(x, "InviteMessageTemplate", value.asInstanceOf[js.Any])
    
    inline def setInviteMessageTemplateUndefined: Self = StObject.set(x, "InviteMessageTemplate", js.undefined)
    
    inline def setUnusedAccountValidityDays(value: AdminCreateUserUnusedAccountValidityDaysType): Self = StObject.set(x, "UnusedAccountValidityDays", value.asInstanceOf[js.Any])
    
    inline def setUnusedAccountValidityDaysUndefined: Self = StObject.set(x, "UnusedAccountValidityDays", js.undefined)
  }
}
