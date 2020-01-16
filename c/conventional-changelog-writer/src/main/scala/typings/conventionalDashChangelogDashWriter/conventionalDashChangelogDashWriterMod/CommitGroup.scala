package typings.conventionalDashChangelogDashWriter.conventionalDashChangelogDashWriterMod

import typings.conventionalDashChangelogDashWriter.conventionalDashChangelogDashWriterBooleans.`false`
import typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitGroup[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  var commits: js.Array[TransformedCommit[T]]
  var title: String | `false`
}

object CommitGroup {
  @scala.inline
  def apply[T /* <: Commit[String | Double | js.Symbol] */](commits: js.Array[TransformedCommit[T]], title: String | `false`): CommitGroup[T] = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommitGroup[T]]
  }
}

