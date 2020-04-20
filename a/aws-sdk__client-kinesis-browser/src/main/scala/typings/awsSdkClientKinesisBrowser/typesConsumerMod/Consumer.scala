package typings.awsSdkClientKinesisBrowser.typesConsumerMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer extends js.Object {
  /**
    * <p>When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call <a>SubscribeToShard</a>.</p> <p>If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.</p>
    */
  var ConsumerARN: String
  /**
    * <p/>
    */
  var ConsumerCreationTimestamp: Date | String | Double
  /**
    * <p>The name of the consumer is something you choose when you register the consumer.</p>
    */
  var ConsumerName: String
  /**
    * <p>A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.</p>
    */
  var ConsumerStatus: CREATING | DELETING | ACTIVE | String
}

object Consumer {
  @scala.inline
  def apply(
    ConsumerARN: String,
    ConsumerCreationTimestamp: Date | String | Double,
    ConsumerName: String,
    ConsumerStatus: CREATING | DELETING | ACTIVE | String
  ): Consumer = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumer]
  }
}

