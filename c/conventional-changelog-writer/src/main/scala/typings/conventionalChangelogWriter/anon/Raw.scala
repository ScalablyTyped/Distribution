package typings.conventionalChangelogWriter.anon

import typings.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Raw[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  var raw: T
}

object Raw {
  @scala.inline
  def apply[T](raw: T): Raw[T] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw[T]]
  }
}

