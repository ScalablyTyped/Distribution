package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * Additional details for a Config, if type is dataflow endpoint or antenna demod decode.
    */
  var configDetails: js.UndefOr[ConfigDetails] = js.native
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.native
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
  /**
    * Region of a dataflow destination.
    */
  var dataflowDestinationRegion: js.UndefOr[String] = js.native
}

object Destination {
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
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
    def setConfigDetails(value: ConfigDetails): Self = this.set("configDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigDetails: Self = this.set("configDetails", js.undefined)
    @scala.inline
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigId: Self = this.set("configId", js.undefined)
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = this.set("configType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigType: Self = this.set("configType", js.undefined)
    @scala.inline
    def setDataflowDestinationRegion(value: String): Self = this.set("dataflowDestinationRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataflowDestinationRegion: Self = this.set("dataflowDestinationRegion", js.undefined)
  }
  
}

