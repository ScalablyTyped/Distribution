package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreSubscribeToShardEventStreamMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreSubscribeToShardEventMod._SubscribeToShardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SubscribeToShardEventStream extends js.Object {
  /**
    * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
    */
  var SubscribeToShardEvent: _SubscribeToShardEvent
}

object _SubscribeToShardEventStream {
  @scala.inline
  def apply(SubscribeToShardEvent: _SubscribeToShardEvent): _SubscribeToShardEventStream = {
    val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent)
  
    __obj.asInstanceOf[_SubscribeToShardEventStream]
  }
}

