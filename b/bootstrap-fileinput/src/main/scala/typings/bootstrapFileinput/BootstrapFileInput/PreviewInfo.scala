package typings.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewInfo extends js.Object {
  val config: js.Array[PreviewConfig]
  val content: js.Array[String]
  val tags: js.Array[String]
}

object PreviewInfo {
  @scala.inline
  def apply(config: js.Array[PreviewConfig], content: js.Array[String], tags: js.Array[String]): PreviewInfo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PreviewInfo]
  }
}

