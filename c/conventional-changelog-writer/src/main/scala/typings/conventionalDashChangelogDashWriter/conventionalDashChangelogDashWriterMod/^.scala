package typings.conventionalDashChangelogDashWriter.conventionalDashChangelogDashWriterMod

import typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Commit
import typings.node.streamMod.Transform
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("conventional-changelog-writer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns a transform stream.
    *
    * @param context Variables that will be interpolated to the template. This
    *                object contains, but not limits to the following fields.
    * @param options
    */
  // tslint:disable-next-line no-unnecessary-generics
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](): Transform = js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](context: Partial[TContext]): Transform = js.native
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](context: Partial[TContext], options: Options[TCommit, TContext]): Transform = js.native
}

