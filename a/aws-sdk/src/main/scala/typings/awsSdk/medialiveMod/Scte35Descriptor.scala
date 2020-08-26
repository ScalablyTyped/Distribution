package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35Descriptor extends js.Object {
  /**
    * SCTE-35 Descriptor Settings.
    */
  var Scte35DescriptorSettings: typings.awsSdk.medialiveMod.Scte35DescriptorSettings = js.native
}

object Scte35Descriptor {
  @scala.inline
  def apply(Scte35DescriptorSettings: Scte35DescriptorSettings): Scte35Descriptor = {
    val __obj = js.Dynamic.literal(Scte35DescriptorSettings = Scte35DescriptorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35Descriptor]
  }
  @scala.inline
  implicit class Scte35DescriptorOps[Self <: Scte35Descriptor] (val x: Self) extends AnyVal {
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
    def setScte35DescriptorSettings(value: Scte35DescriptorSettings): Self = this.set("Scte35DescriptorSettings", value.asInstanceOf[js.Any])
  }
  
}

