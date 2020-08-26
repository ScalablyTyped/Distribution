package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteV2LoggingLevelRequest extends js.Object {
  /**
    * The name of the resource for which you are configuring logging.
    */
  var targetName: LogTargetName = js.native
  /**
    * The type of resource for which you are configuring logging. Must be THING_Group.
    */
  var targetType: LogTargetType = js.native
}

object DeleteV2LoggingLevelRequest {
  @scala.inline
  def apply(targetName: LogTargetName, targetType: LogTargetType): DeleteV2LoggingLevelRequest = {
    val __obj = js.Dynamic.literal(targetName = targetName.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteV2LoggingLevelRequest]
  }
  @scala.inline
  implicit class DeleteV2LoggingLevelRequestOps[Self <: DeleteV2LoggingLevelRequest] (val x: Self) extends AnyVal {
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
    def setTargetName(value: LogTargetName): Self = this.set("targetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetType(value: LogTargetType): Self = this.set("targetType", value.asInstanceOf[js.Any])
  }
  
}

