package typings.conventionalDashChangelogDashWriter

import typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Raw[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  var raw: T
}

object Anon_Raw {
  @scala.inline
  def apply[T /* <: Commit[String | Double | js.Symbol] */](raw: T): Anon_Raw[T] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Raw[T]]
  }
}

