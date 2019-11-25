package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreSubscribeToShardEventStreamMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreSubscribeToShardEventMod._UnmarshalledSubscribeToShardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSubscribeToShardEventStream extends _SubscribeToShardEventStream {
  /**
    * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
    */
  @JSName("SubscribeToShardEvent")
  var SubscribeToShardEvent__UnmarshalledSubscribeToShardEventStream: _UnmarshalledSubscribeToShardEvent
}

object _UnmarshalledSubscribeToShardEventStream {
  @scala.inline
  def apply(SubscribeToShardEvent: _UnmarshalledSubscribeToShardEvent): _UnmarshalledSubscribeToShardEventStream = {
    val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledSubscribeToShardEventStream]
  }
}

