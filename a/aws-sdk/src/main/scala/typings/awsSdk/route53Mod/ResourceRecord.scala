package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRecord extends js.Object {
  /**
    * The current or new DNS record value, not to exceed 4,000 characters. In the case of a DELETE action, if the current value does not match the actual value, an error is returned. For descriptions about how to format Value for different record types, see Supported DNS Resource Record Types in the Amazon Route 53 Developer Guide. You can specify more than one value for all record types except CNAME and SOA.   If you're creating an alias resource record set, omit Value. 
    */
  var Value: RData = js.native
}

object ResourceRecord {
  @scala.inline
  def apply(Value: RData): ResourceRecord = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceRecord]
  }
}

