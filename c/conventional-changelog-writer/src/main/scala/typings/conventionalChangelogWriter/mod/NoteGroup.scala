package typings.conventionalChangelogWriter.mod

import typings.conventionalChangelogWriter.conventionalChangelogWriterBooleans.`false`
import typings.conventionalCommitsParser.mod.Commit.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoteGroup extends js.Object {
  var commits: js.Array[Note]
  var title: String | `false`
}

object NoteGroup {
  @scala.inline
  def apply(commits: js.Array[Note], title: String | `false`): NoteGroup = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteGroup]
  }
}

