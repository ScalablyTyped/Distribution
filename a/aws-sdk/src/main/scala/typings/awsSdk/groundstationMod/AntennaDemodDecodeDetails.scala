package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntennaDemodDecodeDetails extends js.Object {
  /**
    * Name of an antenna demod decode output node used in a contact.
    */
  var outputNode: js.UndefOr[String] = js.native
}

object AntennaDemodDecodeDetails {
  @scala.inline
  def apply(): AntennaDemodDecodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntennaDemodDecodeDetails]
  }
  @scala.inline
  implicit class AntennaDemodDecodeDetailsOps[Self <: AntennaDemodDecodeDetails] (val x: Self) extends AnyVal {
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
    def setOutputNode(value: String): Self = this.set("outputNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputNode: Self = this.set("outputNode", js.undefined)
  }
  
}

