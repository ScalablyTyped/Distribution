package typings.changelogParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Path to changelog file.
    */
  var filePath: String
  /**
    * Removes the markdown markup from the changelog entries by default.
    * You can change its value to false to keep the markdown.
    */
  var removeMarkdown: Boolean
}

object Options {
  @scala.inline
  def apply(filePath: String, removeMarkdown: Boolean): Options = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], removeMarkdown = removeMarkdown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

