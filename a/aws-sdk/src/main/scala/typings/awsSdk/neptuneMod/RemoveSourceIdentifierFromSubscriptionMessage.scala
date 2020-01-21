package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveSourceIdentifierFromSubscriptionMessage extends js.Object {
  /**
    *  The source identifier to be removed from the subscription, such as the DB instance identifier for a DB instance or the name of a security group.
    */
  var SourceIdentifier: String = js.native
  /**
    * The name of the event notification subscription you want to remove a source identifier from.
    */
  var SubscriptionName: String = js.native
}

object RemoveSourceIdentifierFromSubscriptionMessage {
  @scala.inline
  def apply(SourceIdentifier: String, SubscriptionName: String): RemoveSourceIdentifierFromSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SourceIdentifier = SourceIdentifier.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionMessage]
  }
}

