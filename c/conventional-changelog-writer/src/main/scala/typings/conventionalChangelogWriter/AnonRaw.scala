package typings.conventionalChangelogWriter

import typings.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRaw[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  var raw: T
}

object AnonRaw {
  @scala.inline
  def apply[T /* <: Commit[String | Double | js.Symbol] */](raw: T): AnonRaw[T] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRaw[T]]
  }
}

