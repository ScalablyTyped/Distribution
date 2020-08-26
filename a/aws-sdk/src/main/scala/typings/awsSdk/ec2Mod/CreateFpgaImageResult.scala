package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFpgaImageResult extends js.Object {
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.native
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.native
}

object CreateFpgaImageResult {
  @scala.inline
  def apply(): CreateFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFpgaImageResult]
  }
  @scala.inline
  implicit class CreateFpgaImageResultOps[Self <: CreateFpgaImageResult] (val x: Self) extends AnyVal {
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
    def setFpgaImageGlobalId(value: String): Self = this.set("FpgaImageGlobalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpgaImageGlobalId: Self = this.set("FpgaImageGlobalId", js.undefined)
    @scala.inline
    def setFpgaImageId(value: String): Self = this.set("FpgaImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpgaImageId: Self = this.set("FpgaImageId", js.undefined)
  }
  
}

