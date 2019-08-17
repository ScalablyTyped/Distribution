package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreConsumerDescriptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ACTIVE
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.CREATING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.DELETING
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledConsumerDescription extends _ConsumerDescription {
  /**
    * <p/>
    */
  @JSName("ConsumerCreationTimestamp")
  var ConsumerCreationTimestamp__UnmarshalledConsumerDescription: Date
}

object _UnmarshalledConsumerDescription {
  @scala.inline
  def apply(
    ConsumerARN: String,
    ConsumerCreationTimestamp: Date,
    ConsumerName: String,
    ConsumerStatus: CREATING | DELETING | ACTIVE | String,
    StreamARN: String
  ): _UnmarshalledConsumerDescription = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN, ConsumerCreationTimestamp = ConsumerCreationTimestamp, ConsumerName = ConsumerName, ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN)
  
    __obj.asInstanceOf[_UnmarshalledConsumerDescription]
  }
}

