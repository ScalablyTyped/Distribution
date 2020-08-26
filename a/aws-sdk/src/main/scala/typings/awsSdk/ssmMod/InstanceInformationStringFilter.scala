package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceInformationStringFilter extends js.Object {
  /**
    * The filter key name to describe your instances. For example: "InstanceIds"|"AgentVersion"|"PingStatus"|"PlatformTypes"|"ActivationIds"|"IamRole"|"ResourceType"|"AssociationStatus"|"Tag Key"
    */
  var Key: InstanceInformationStringFilterKey = js.native
  /**
    * The filter values.
    */
  var Values: InstanceInformationFilterValueSet = js.native
}

object InstanceInformationStringFilter {
  @scala.inline
  def apply(Key: InstanceInformationStringFilterKey, Values: InstanceInformationFilterValueSet): InstanceInformationStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformationStringFilter]
  }
  @scala.inline
  implicit class InstanceInformationStringFilterOps[Self <: InstanceInformationStringFilter] (val x: Self) extends AnyVal {
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
    def setKey(value: InstanceInformationStringFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: InstanceInformationFilterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: InstanceInformationFilterValueSet): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

