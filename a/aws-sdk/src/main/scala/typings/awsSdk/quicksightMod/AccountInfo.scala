package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInfo extends StObject {
  
  /**
    * The account name that you provided for the Amazon QuickSight subscription in your Amazon Web Services account. You create this name when you sign up for Amazon QuickSight. It's unique over all of Amazon Web Services, and it appears only when users sign in.
    */
  var AccountName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of your account subscription.
    */
  var AccountSubscriptionStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The way that your Amazon QuickSight account is authenticated.
    */
  var AuthenticationType: js.UndefOr[String] = js.undefined
  
  /**
    * The edition of your Amazon QuickSight account.
    */
  var Edition: js.UndefOr[typings.awsSdk.quicksightMod.Edition] = js.undefined
  
  /**
    * The email address that will be used for Amazon QuickSight to send notifications regarding your Amazon Web Services account or Amazon QuickSight subscription.
    */
  var NotificationEmail: js.UndefOr[String] = js.undefined
}
object AccountInfo {
  
  inline def apply(): AccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountInfo]
  }
  
  extension [Self <: AccountInfo](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "AccountName", js.undefined)
    
    inline def setAccountSubscriptionStatus(value: String): Self = StObject.set(x, "AccountSubscriptionStatus", value.asInstanceOf[js.Any])
    
    inline def setAccountSubscriptionStatusUndefined: Self = StObject.set(x, "AccountSubscriptionStatus", js.undefined)
    
    inline def setAuthenticationType(value: String): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "AuthenticationType", js.undefined)
    
    inline def setEdition(value: Edition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    inline def setNotificationEmail(value: String): Self = StObject.set(x, "NotificationEmail", value.asInstanceOf[js.Any])
    
    inline def setNotificationEmailUndefined: Self = StObject.set(x, "NotificationEmail", js.undefined)
  }
}
