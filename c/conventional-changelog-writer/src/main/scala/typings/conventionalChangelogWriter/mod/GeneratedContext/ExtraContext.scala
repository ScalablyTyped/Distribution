package typings.conventionalChangelogWriter.mod.GeneratedContext

import typings.conventionalChangelogWriter.mod.CommitGroup
import typings.conventionalChangelogWriter.mod.NoteGroup
import typings.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraContext[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  
  /**
    * @default
    * []
    */
  var commitGroups: js.Array[CommitGroup[T]] = js.native
  
  /**
    * @default
    * []
    */
  var noteGroups: js.Array[NoteGroup] = js.native
}
object ExtraContext {
  
  @scala.inline
  def apply[T /* <: Commit[String | Double | js.Symbol] */](commitGroups: js.Array[CommitGroup[T]], noteGroups: js.Array[NoteGroup]): ExtraContext[T] = {
    val __obj = js.Dynamic.literal(commitGroups = commitGroups.asInstanceOf[js.Any], noteGroups = noteGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraContext[T]]
  }
  
  @scala.inline
  implicit class ExtraContextOps[Self <: ExtraContext[_], T /* <: Commit[String | Double | js.Symbol] */] (val x: Self with ExtraContext[T]) extends AnyVal {
    
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
    def setCommitGroupsVarargs(value: CommitGroup[T]*): Self = this.set("commitGroups", js.Array(value :_*))
    
    @scala.inline
    def setCommitGroups(value: js.Array[CommitGroup[T]]): Self = this.set("commitGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteGroupsVarargs(value: NoteGroup*): Self = this.set("noteGroups", js.Array(value :_*))
    
    @scala.inline
    def setNoteGroups(value: js.Array[NoteGroup]): Self = this.set("noteGroups", value.asInstanceOf[js.Any])
  }
}
