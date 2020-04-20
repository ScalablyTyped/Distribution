package typings.conventionalCommitsParser.mod.Commit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Note extends js.Object {
  var text: String
  var title: String
}

object Note {
  @scala.inline
  def apply(text: String, title: String): Note = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
}

