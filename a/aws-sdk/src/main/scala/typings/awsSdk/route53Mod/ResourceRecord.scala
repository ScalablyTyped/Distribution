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
  @scala.inline
  implicit class ResourceRecordOps[Self <: ResourceRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: RData): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

