package typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("conventional-commits-parser", "sync")
@js.native
object sync extends js.Object {
  /**
    * The sync version. Useful when parsing a single commit. Returns the result.
    *
    * @param commit  A single commit to be parsed.
    * @param options Same as the `options` of `conventionalCommitsParser`.
    */
  def apply(commit: String): Commit[String | Double | js.Symbol] = js.native
  def apply(commit: String, options: Options): Commit[String | Double | js.Symbol] = js.native
}

