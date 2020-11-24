package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
  
  var EventSubscription: js.UndefOr[typings.awsSdk.neptuneMod.EventSubscription] = js.native
}
object RemoveSourceIdentifierFromSubscriptionResult {
  
  @scala.inline
  def apply(): RemoveSourceIdentifierFromSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
  }
  
  @scala.inline
  implicit class RemoveSourceIdentifierFromSubscriptionResultOps[Self <: RemoveSourceIdentifierFromSubscriptionResult] (val x: Self) extends AnyVal {
    
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
    def setEventSubscription(value: EventSubscription): Self = this.set("EventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSubscription: Self = this.set("EventSubscription", js.undefined)
  }
}
