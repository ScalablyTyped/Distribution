package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreConsumerMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ACTIVE
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.CREATING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.DELETING
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledConsumer extends _Consumer {
  /**
    * <p/>
    */
  @JSName("ConsumerCreationTimestamp")
  var ConsumerCreationTimestamp__UnmarshalledConsumer: Date
}

object _UnmarshalledConsumer {
  @scala.inline
  def apply(
    ConsumerARN: String,
    ConsumerCreationTimestamp: Date,
    ConsumerName: String,
    ConsumerStatus: CREATING | DELETING | ACTIVE | String
  ): _UnmarshalledConsumer = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN, ConsumerCreationTimestamp = ConsumerCreationTimestamp, ConsumerName = ConsumerName, ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledConsumer]
  }
}

