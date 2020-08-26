package typings.changelogParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Path to changelog file.
    */
  var filePath: String = js.native
  /**
    * Removes the markdown markup from the changelog entries by default.
    * You can change its value to false to keep the markdown.
    */
  var removeMarkdown: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(filePath: String, removeMarkdown: Boolean): Options = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], removeMarkdown = removeMarkdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveMarkdown(value: Boolean): Self = this.set("removeMarkdown", value.asInstanceOf[js.Any])
  }
  
}

