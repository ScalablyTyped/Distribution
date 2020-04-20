package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeliveryStreamsOutput extends js.Object {
  /**
    * The names of the delivery streams.
    */
  var DeliveryStreamNames: DeliveryStreamNameList = js.native
  /**
    * Indicates whether there are more delivery streams available to list.
    */
  var HasMoreDeliveryStreams: BooleanObject = js.native
}

object ListDeliveryStreamsOutput {
  @scala.inline
  def apply(DeliveryStreamNames: DeliveryStreamNameList, HasMoreDeliveryStreams: BooleanObject): ListDeliveryStreamsOutput = {
    val __obj = js.Dynamic.literal(DeliveryStreamNames = DeliveryStreamNames.asInstanceOf[js.Any], HasMoreDeliveryStreams = HasMoreDeliveryStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeliveryStreamsOutput]
  }
}

