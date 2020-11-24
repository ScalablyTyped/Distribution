package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSettings extends js.Object {
  
  /**
    * The "account name" you provided for the QuickSight subscription in your AWS account. You create this name when you sign up for QuickSight. It is unique in all of AWS and it appears only in the console when users sign in.
    */
  var AccountName: js.UndefOr[String] = js.native
  
  /**
    * The default QuickSight namespace for your AWS account. 
    */
  var DefaultNamespace: js.UndefOr[Namespace] = js.native
  
  /**
    * The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
    */
  var Edition: js.UndefOr[typings.awsSdk.quicksightMod.Edition] = js.native
  
  /**
    * The main notification email for your QuickSight subscription.
    */
  var NotificationEmail: js.UndefOr[String] = js.native
}
object AccountSettings {
  
  @scala.inline
  def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  @scala.inline
  implicit class AccountSettingsOps[Self <: AccountSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountName(value: String): Self = this.set("AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountName: Self = this.set("AccountName", js.undefined)
    
    @scala.inline
    def setDefaultNamespace(value: Namespace): Self = this.set("DefaultNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultNamespace: Self = this.set("DefaultNamespace", js.undefined)
    
    @scala.inline
    def setEdition(value: Edition): Self = this.set("Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdition: Self = this.set("Edition", js.undefined)
    
    @scala.inline
    def setNotificationEmail(value: String): Self = this.set("NotificationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationEmail: Self = this.set("NotificationEmail", js.undefined)
  }
}
