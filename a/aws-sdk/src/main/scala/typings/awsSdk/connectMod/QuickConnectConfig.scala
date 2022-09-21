package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickConnectConfig extends StObject {
  
  /**
    * The phone configuration. This is required only if QuickConnectType is PHONE_NUMBER.
    */
  var PhoneConfig: js.UndefOr[PhoneNumberQuickConnectConfig] = js.undefined
  
  /**
    * The queue configuration. This is required only if QuickConnectType is QUEUE.
    */
  var QueueConfig: js.UndefOr[QueueQuickConnectConfig] = js.undefined
  
  /**
    * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE). 
    */
  var QuickConnectType: typings.awsSdk.connectMod.QuickConnectType
  
  /**
    * The user configuration. This is required only if QuickConnectType is USER.
    */
  var UserConfig: js.UndefOr[UserQuickConnectConfig] = js.undefined
}
object QuickConnectConfig {
  
  inline def apply(QuickConnectType: QuickConnectType): QuickConnectConfig = {
    val __obj = js.Dynamic.literal(QuickConnectType = QuickConnectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickConnectConfig]
  }
  
  extension [Self <: QuickConnectConfig](x: Self) {
    
    inline def setPhoneConfig(value: PhoneNumberQuickConnectConfig): Self = StObject.set(x, "PhoneConfig", value.asInstanceOf[js.Any])
    
    inline def setPhoneConfigUndefined: Self = StObject.set(x, "PhoneConfig", js.undefined)
    
    inline def setQueueConfig(value: QueueQuickConnectConfig): Self = StObject.set(x, "QueueConfig", value.asInstanceOf[js.Any])
    
    inline def setQueueConfigUndefined: Self = StObject.set(x, "QueueConfig", js.undefined)
    
    inline def setQuickConnectType(value: QuickConnectType): Self = StObject.set(x, "QuickConnectType", value.asInstanceOf[js.Any])
    
    inline def setUserConfig(value: UserQuickConnectConfig): Self = StObject.set(x, "UserConfig", value.asInstanceOf[js.Any])
    
    inline def setUserConfigUndefined: Self = StObject.set(x, "UserConfig", js.undefined)
  }
}
