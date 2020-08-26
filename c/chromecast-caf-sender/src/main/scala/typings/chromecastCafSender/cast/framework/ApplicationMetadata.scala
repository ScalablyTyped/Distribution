package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationMetadata extends js.Object {
  var applicationId: String = js.native
  var images: js.Array[Image] = js.native
  var name: String = js.native
  var namespaces: js.Array[String] = js.native
}

object ApplicationMetadata {
  @scala.inline
  def apply(applicationId: String, images: js.Array[Image], name: String, namespaces: js.Array[String]): ApplicationMetadata = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetadata]
  }
  @scala.inline
  implicit class ApplicationMetadataOps[Self <: ApplicationMetadata] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: String): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespacesVarargs(value: String*): Self = this.set("namespaces", js.Array(value :_*))
    @scala.inline
    def setNamespaces(value: js.Array[String]): Self = this.set("namespaces", value.asInstanceOf[js.Any])
  }
  
}

