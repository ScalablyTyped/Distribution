package typings.awsSdkClientGlacierNode.typesVaultNotificationConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledVaultNotificationConfig extends VaultNotificationConfig {
  
  /**
    * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
    */
  @JSName("Events")
  var Events_UnmarshalledVaultNotificationConfig: js.UndefOr[js.Array[String]] = js.native
}
object UnmarshalledVaultNotificationConfig {
  
  @scala.inline
  def apply(): UnmarshalledVaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledVaultNotificationConfig]
  }
  
  @scala.inline
  implicit class UnmarshalledVaultNotificationConfigOps[Self <: UnmarshalledVaultNotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("Events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
  }
}
