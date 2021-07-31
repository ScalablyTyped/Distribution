package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettings extends StObject {
  
  /**
    * The "account name" you provided for the QuickSight subscription in your AWS account. You create this name when you sign up for QuickSight. It is unique in all of AWS and it appears only in the console when users sign in.
    */
  var AccountName: js.UndefOr[String] = js.undefined
  
  /**
    * The default QuickSight namespace for your AWS account. 
    */
  var DefaultNamespace: js.UndefOr[Namespace] = js.undefined
  
  /**
    * The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
    */
  var Edition: js.UndefOr[typings.awsSdk.quicksightMod.Edition] = js.undefined
  
  /**
    * The main notification email for your QuickSight subscription.
    */
  var NotificationEmail: js.UndefOr[String] = js.undefined
}
object AccountSettings {
  
  @scala.inline
  def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  @scala.inline
  implicit class AccountSettingsMutableBuilder[Self <: AccountSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "AccountName", js.undefined)
    
    @scala.inline
    def setDefaultNamespace(value: Namespace): Self = StObject.set(x, "DefaultNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNamespaceUndefined: Self = StObject.set(x, "DefaultNamespace", js.undefined)
    
    @scala.inline
    def setEdition(value: Edition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    @scala.inline
    def setNotificationEmail(value: String): Self = StObject.set(x, "NotificationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEmailUndefined: Self = StObject.set(x, "NotificationEmail", js.undefined)
  }
}
