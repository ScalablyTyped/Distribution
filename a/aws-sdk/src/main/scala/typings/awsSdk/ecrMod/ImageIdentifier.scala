package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageIdentifier extends js.Object {
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  /**
    * The tag used for the image.
    */
  var imageTag: js.UndefOr[ImageTag] = js.native
}

object ImageIdentifier {
  @scala.inline
  def apply(): ImageIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageIdentifier]
  }
  @scala.inline
  implicit class ImageIdentifierOps[Self <: ImageIdentifier] (val x: Self) extends AnyVal {
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
    def setImageDigest(value: ImageDigest): Self = this.set("imageDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDigest: Self = this.set("imageDigest", js.undefined)
    @scala.inline
    def setImageTag(value: ImageTag): Self = this.set("imageTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageTag: Self = this.set("imageTag", js.undefined)
  }
  
}

