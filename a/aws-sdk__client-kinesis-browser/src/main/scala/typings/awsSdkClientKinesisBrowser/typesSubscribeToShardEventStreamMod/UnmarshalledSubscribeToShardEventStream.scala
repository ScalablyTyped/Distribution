package typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventStreamMod

import typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.UnmarshalledSubscribeToShardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSubscribeToShardEventStream extends SubscribeToShardEventStream {
  /**
    * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
    */
  @JSName("SubscribeToShardEvent")
  var SubscribeToShardEvent_UnmarshalledSubscribeToShardEventStream: UnmarshalledSubscribeToShardEvent
}

object UnmarshalledSubscribeToShardEventStream {
  @scala.inline
  def apply(SubscribeToShardEvent: UnmarshalledSubscribeToShardEvent): UnmarshalledSubscribeToShardEventStream = {
    val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSubscribeToShardEventStream]
  }
}

