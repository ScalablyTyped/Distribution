package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettings extends StObject {
  
  /**
    * The "account name" you provided for the Amazon QuickSight subscription in your Amazon Web Services account. You create this name when you sign up for Amazon QuickSight. It is unique in all of Amazon Web Services and it appears only when users sign in.
    */
  var AccountName: js.UndefOr[String] = js.undefined
  
  /**
    * The default Amazon QuickSight namespace for your Amazon Web Services account. 
    */
  var DefaultNamespace: js.UndefOr[Namespace] = js.undefined
  
  /**
    * The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
    */
  var Edition: js.UndefOr[typings.awsSdk.quicksightMod.Edition] = js.undefined
  
  /**
    * The main notification email for your Amazon QuickSight subscription.
    */
  var NotificationEmail: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For more information about turning on public sharing, see UpdatePublicSharingSettings.
    */
  var PublicSharingEnabled: js.UndefOr[Boolean] = js.undefined
}
object AccountSettings {
  
  inline def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  extension [Self <: AccountSettings](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "AccountName", js.undefined)
    
    inline def setDefaultNamespace(value: Namespace): Self = StObject.set(x, "DefaultNamespace", value.asInstanceOf[js.Any])
    
    inline def setDefaultNamespaceUndefined: Self = StObject.set(x, "DefaultNamespace", js.undefined)
    
    inline def setEdition(value: Edition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    inline def setNotificationEmail(value: String): Self = StObject.set(x, "NotificationEmail", value.asInstanceOf[js.Any])
    
    inline def setNotificationEmailUndefined: Self = StObject.set(x, "NotificationEmail", js.undefined)
    
    inline def setPublicSharingEnabled(value: Boolean): Self = StObject.set(x, "PublicSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setPublicSharingEnabledUndefined: Self = StObject.set(x, "PublicSharingEnabled", js.undefined)
  }
}
