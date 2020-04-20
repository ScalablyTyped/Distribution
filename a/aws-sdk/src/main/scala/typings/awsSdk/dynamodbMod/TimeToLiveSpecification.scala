package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeToLiveSpecification extends js.Object {
  /**
    * The name of the TTL attribute used to store the expiration time for items in the table.
    */
  var AttributeName: TimeToLiveAttributeName = js.native
  /**
    * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
    */
  var Enabled: TimeToLiveEnabled = js.native
}

object TimeToLiveSpecification {
  @scala.inline
  def apply(AttributeName: TimeToLiveAttributeName, Enabled: TimeToLiveEnabled): TimeToLiveSpecification = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToLiveSpecification]
  }
}

