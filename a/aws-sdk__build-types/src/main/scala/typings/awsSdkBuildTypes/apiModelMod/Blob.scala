package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blob
  extends ShapeDef
     with Shape {
  var streaming: js.UndefOr[scala.Boolean] = js.native
  @JSName("type")
  val type_Blob: blob = js.native
}

object Blob {
  @scala.inline
  def apply(`type`: blob): Blob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blob]
  }
  @scala.inline
  implicit class BlobOps[Self <: Blob] (val x: Self) extends AnyVal {
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
    def setType(value: blob): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreaming(value: scala.Boolean): Self = this.set("streaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
  }
  
}

