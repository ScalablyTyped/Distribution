package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogSubscription extends StObject {
  
  /**
    * Identifier (ID) of the directory that you want to associate with the log subscription.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  
  /**
    * The name of the log group.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.directoryserviceMod.LogGroupName] = js.native
  
  /**
    * The date and time that the log subscription was created.
    */
  var SubscriptionCreatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.SubscriptionCreatedDateTime] = js.native
}
object LogSubscription {
  
  @scala.inline
  def apply(): LogSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSubscription]
  }
  
  @scala.inline
  implicit class LogSubscriptionMutableBuilder[Self <: LogSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    @scala.inline
    def setSubscriptionCreatedDateTime(value: SubscriptionCreatedDateTime): Self = StObject.set(x, "SubscriptionCreatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionCreatedDateTimeUndefined: Self = StObject.set(x, "SubscriptionCreatedDateTime", js.undefined)
  }
}
