package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * User-defined criteria for sending commands that target instances that meet the criteria.
    */
  var Key: js.UndefOr[TargetKey] = js.native
  /**
    * User-defined criteria that maps to Key. For example, if you specified tag:ServerRole, you could specify value:WebServer to run a command on instances that include EC2 tags of ServerRole,WebServer. 
    */
  var Values: js.UndefOr[TargetValues] = js.native
}

object Target {
  @scala.inline
  def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
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
    def setKey(value: TargetKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setValuesVarargs(value: TargetValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: TargetValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

