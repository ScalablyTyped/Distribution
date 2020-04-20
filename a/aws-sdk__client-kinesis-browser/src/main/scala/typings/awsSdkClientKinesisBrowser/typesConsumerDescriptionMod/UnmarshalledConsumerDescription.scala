package typings.awsSdkClientKinesisBrowser.typesConsumerDescriptionMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledConsumerDescription extends ConsumerDescription {
  /**
    * <p/>
    */
  @JSName("ConsumerCreationTimestamp")
  var ConsumerCreationTimestamp_UnmarshalledConsumerDescription: Date
}

object UnmarshalledConsumerDescription {
  @scala.inline
  def apply(
    ConsumerARN: String,
    ConsumerCreationTimestamp: Date,
    ConsumerName: String,
    ConsumerStatus: CREATING | DELETING | ACTIVE | String,
    StreamARN: String
  ): UnmarshalledConsumerDescription = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledConsumerDescription]
  }
}

