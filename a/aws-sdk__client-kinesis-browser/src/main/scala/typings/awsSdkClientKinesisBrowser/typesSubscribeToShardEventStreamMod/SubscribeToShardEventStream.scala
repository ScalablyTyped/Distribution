package typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventStreamMod

import typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.SubscribeToShardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeToShardEventStream extends js.Object {
  
  /**
    * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
    */
  var SubscribeToShardEvent: typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.SubscribeToShardEvent = js.native
}
object SubscribeToShardEventStream {
  
  @scala.inline
  def apply(SubscribeToShardEvent: SubscribeToShardEvent): SubscribeToShardEventStream = {
    val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToShardEventStream]
  }
  
  @scala.inline
  implicit class SubscribeToShardEventStreamOps[Self <: SubscribeToShardEventStream] (val x: Self) extends AnyVal {
    
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
    def setSubscribeToShardEvent(value: SubscribeToShardEvent): Self = this.set("SubscribeToShardEvent", value.asInstanceOf[js.Any])
  }
}
