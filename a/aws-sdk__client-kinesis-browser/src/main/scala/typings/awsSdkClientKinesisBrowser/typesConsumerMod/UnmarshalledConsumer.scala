package typings.awsSdkClientKinesisBrowser.typesConsumerMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledConsumer extends Consumer {
  /**
    * <p/>
    */
  @JSName("ConsumerCreationTimestamp")
  var ConsumerCreationTimestamp_UnmarshalledConsumer: Date
}

object UnmarshalledConsumer {
  @scala.inline
  def apply(
    ConsumerARN: String,
    ConsumerCreationTimestamp: Date,
    ConsumerName: String,
    ConsumerStatus: CREATING | DELETING | ACTIVE | String
  ): UnmarshalledConsumer = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledConsumer]
  }
}

