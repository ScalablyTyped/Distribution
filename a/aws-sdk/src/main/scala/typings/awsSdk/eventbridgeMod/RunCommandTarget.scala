package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunCommandTarget extends js.Object {
  /**
    * Can be either tag: tag-key or InstanceIds.
    */
  var Key: RunCommandTargetKey = js.native
  /**
    * If Key is tag: tag-key, Values is a list of tag values. If Key is InstanceIds, Values is a list of Amazon EC2 instance IDs.
    */
  var Values: RunCommandTargetValues = js.native
}

object RunCommandTarget {
  @scala.inline
  def apply(Key: RunCommandTargetKey, Values: RunCommandTargetValues): RunCommandTarget = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunCommandTarget]
  }
  @scala.inline
  implicit class RunCommandTargetOps[Self <: RunCommandTarget] (val x: Self) extends AnyVal {
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
    def setKey(value: RunCommandTargetKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: RunCommandTargetValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: RunCommandTargetValues): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

