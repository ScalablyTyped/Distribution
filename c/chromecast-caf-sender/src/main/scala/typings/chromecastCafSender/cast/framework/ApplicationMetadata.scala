package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationMetadata extends js.Object {
  var applicationId: String
  var images: js.Array[Image]
  var name: String
  var namespaces: js.Array[String]
}

object ApplicationMetadata {
  @scala.inline
  def apply(applicationId: String, images: js.Array[Image], name: String, namespaces: js.Array[String]): ApplicationMetadata = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetadata]
  }
}

