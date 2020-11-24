package typings.conventionalChangelogWriter.mod

import typings.conventionalChangelogWriter.conventionalChangelogWriterBooleans.`false`
import typings.conventionalCommitsParser.mod.Commit.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteGroup extends js.Object {
  
  var commits: js.Array[Note] = js.native
  
  var title: String | `false` = js.native
}
object NoteGroup {
  
  @scala.inline
  def apply(commits: js.Array[Note], title: String | `false`): NoteGroup = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteGroup]
  }
  
  @scala.inline
  implicit class NoteGroupOps[Self <: NoteGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitsVarargs(value: Note*): Self = this.set("commits", js.Array(value :_*))
    
    @scala.inline
    def setCommits(value: js.Array[Note]): Self = this.set("commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String | `false`): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
