package typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventStreamMod

import typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.SubscribeToShardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeToShardEventStream extends js.Object {
  /**
    * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
    */
  var SubscribeToShardEvent: typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.SubscribeToShardEvent
}

object SubscribeToShardEventStream {
  @scala.inline
  def apply(SubscribeToShardEvent: SubscribeToShardEvent): SubscribeToShardEventStream = {
    val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscribeToShardEventStream]
  }
}

