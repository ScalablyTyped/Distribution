package typings
package changelogDashParserLib.changelogDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Path to changelog file.
    */
  var filePath: java.lang.String
  /**
    * Removes the markdown markup from the changelog entries by default.
    * You can change its value to false to keep the markdown.
    */
  var removeMarkdown: scala.Boolean
}

object Options {
  @scala.inline
  def apply(filePath: java.lang.String, removeMarkdown: scala.Boolean): Options = {
    val __obj = js.Dynamic.literal(filePath = filePath, removeMarkdown = removeMarkdown)
  
    __obj.asInstanceOf[Options]
  }
}

