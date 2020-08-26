package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact extends js.Object {
  var Description: js.UndefOr[typings.awsSdk.importexportMod.Description] = js.native
  var URL: js.UndefOr[typings.awsSdk.importexportMod.URL] = js.native
}

object Artifact {
  @scala.inline
  def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  @scala.inline
  implicit class ArtifactOps[Self <: Artifact] (val x: Self) extends AnyVal {
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
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setURL(value: URL): Self = this.set("URL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteURL: Self = this.set("URL", js.undefined)
  }
  
}

