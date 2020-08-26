package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogTarget extends js.Object {
  /**
    * The target name.
    */
  var targetName: js.UndefOr[LogTargetName] = js.native
  /**
    * The target type.
    */
  var targetType: LogTargetType = js.native
}

object LogTarget {
  @scala.inline
  def apply(targetType: LogTargetType): LogTarget = {
    val __obj = js.Dynamic.literal(targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogTarget]
  }
  @scala.inline
  implicit class LogTargetOps[Self <: LogTarget] (val x: Self) extends AnyVal {
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
    def setTargetType(value: LogTargetType): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetName(value: LogTargetName): Self = this.set("targetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetName: Self = this.set("targetName", js.undefined)
  }
  
}

