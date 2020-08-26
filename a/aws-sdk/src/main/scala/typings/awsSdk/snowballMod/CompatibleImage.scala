package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleImage extends js.Object {
  /**
    * The unique identifier for an individual Snowball Edge AMI.
    */
  var AmiId: js.UndefOr[String] = js.native
  /**
    * The optional name of a compatible image.
    */
  var Name: js.UndefOr[String] = js.native
}

object CompatibleImage {
  @scala.inline
  def apply(): CompatibleImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleImage]
  }
  @scala.inline
  implicit class CompatibleImageOps[Self <: CompatibleImage] (val x: Self) extends AnyVal {
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
    def setAmiId(value: String): Self = this.set("AmiId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmiId: Self = this.set("AmiId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

