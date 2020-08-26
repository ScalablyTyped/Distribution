package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleMasterConfiguration extends js.Object {
  /**
    * The period of time a signaling channel retains underlivered messages before they are discarded.
    */
  var MessageTtlSeconds: js.UndefOr[typings.awsSdk.kinesisvideoMod.MessageTtlSeconds] = js.native
}

object SingleMasterConfiguration {
  @scala.inline
  def apply(): SingleMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMasterConfiguration]
  }
  @scala.inline
  implicit class SingleMasterConfigurationOps[Self <: SingleMasterConfiguration] (val x: Self) extends AnyVal {
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
    def setMessageTtlSeconds(value: MessageTtlSeconds): Self = this.set("MessageTtlSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageTtlSeconds: Self = this.set("MessageTtlSeconds", js.undefined)
  }
  
}

