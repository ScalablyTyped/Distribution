package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleSetMetadata extends js.Object {
  /**
    * The date and time the receipt rule set was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the receipt rule set. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var Name: js.UndefOr[ReceiptRuleSetName] = js.native
}

object ReceiptRuleSetMetadata {
  @scala.inline
  def apply(CreatedTimestamp: Timestamp = null, Name: ReceiptRuleSetName = null): ReceiptRuleSetMetadata = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleSetMetadata]
  }
}

