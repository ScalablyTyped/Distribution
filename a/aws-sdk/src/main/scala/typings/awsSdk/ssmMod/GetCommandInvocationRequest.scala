package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommandInvocationRequest extends js.Object {
  /**
    * (Required) The parent command ID of the invocation plugin.
    */
  var CommandId: typings.awsSdk.ssmMod.CommandId = js.native
  /**
    * (Required) The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId = js.native
  /**
    * (Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned. Plugin names are also referred to as step names in Systems Manager documents.
    */
  var PluginName: js.UndefOr[CommandPluginName] = js.native
}

object GetCommandInvocationRequest {
  @scala.inline
  def apply(CommandId: CommandId, InstanceId: InstanceId): GetCommandInvocationRequest = {
    val __obj = js.Dynamic.literal(CommandId = CommandId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommandInvocationRequest]
  }
  @scala.inline
  implicit class GetCommandInvocationRequestOps[Self <: GetCommandInvocationRequest] (val x: Self) extends AnyVal {
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
    def setCommandId(value: CommandId): Self = this.set("CommandId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginName(value: CommandPluginName): Self = this.set("PluginName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginName: Self = this.set("PluginName", js.undefined)
  }
  
}

