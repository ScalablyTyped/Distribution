package typings.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewInfo extends js.Object {
  val config: js.Array[PreviewConfig] = js.native
  val content: js.Array[String] = js.native
  val tags: js.Array[String] = js.native
}

object PreviewInfo {
  @scala.inline
  def apply(config: js.Array[PreviewConfig], content: js.Array[String], tags: js.Array[String]): PreviewInfo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewInfo]
  }
  @scala.inline
  implicit class PreviewInfoOps[Self <: PreviewInfo] (val x: Self) extends AnyVal {
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
    def setConfigVarargs(value: PreviewConfig*): Self = this.set("config", js.Array(value :_*))
    @scala.inline
    def setConfig(value: js.Array[PreviewConfig]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentVarargs(value: String*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

