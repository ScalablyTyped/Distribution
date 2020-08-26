package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostHeaderConditionConfig extends js.Object {
  /**
    * One or more host names. The maximum size of each name is 128 characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If you specify multiple strings, the condition is satisfied if one of the strings matches the host name.
    */
  var Values: js.UndefOr[ListOfString] = js.native
}

object HostHeaderConditionConfig {
  @scala.inline
  def apply(): HostHeaderConditionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostHeaderConditionConfig]
  }
  @scala.inline
  implicit class HostHeaderConditionConfigOps[Self <: HostHeaderConditionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValuesVarargs(value: StringValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: ListOfString): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

