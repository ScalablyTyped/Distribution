package typings.conventionalCommitsParser.mod

import typings.conventionalCommitsParser.mod.Commit.Field
import typings.conventionalCommitsParser.mod.Commit.Note
import typings.conventionalCommitsParser.mod.Commit.Reference
import typings.conventionalCommitsParser.mod.Commit.Revert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitBase extends js.Object {
  /**
    * @default
    * null
    */
  var body: Field = js.native
  /**
    * @default
    * null
    */
  var footer: Field = js.native
  /**
    * @default
    * null
    */
  var header: Field = js.native
  /**
    * @default
    * []
    */
  var mentions: js.Array[String] = js.native
  /**
    * @default
    * null
    */
  var merge: Field = js.native
  /**
    * @default
    * []
    */
  var notes: js.Array[Note] = js.native
  /**
    * @default
    * []
    */
  var references: js.Array[Reference] = js.native
  /**
    * @default
    * null
    */
  var revert: Revert | Null = js.native
  var scope: js.UndefOr[Field] = js.native
  var subject: js.UndefOr[Field] = js.native
  var `type`: js.UndefOr[Field] = js.native
}

object CommitBase {
  @scala.inline
  def apply(mentions: js.Array[String], notes: js.Array[Note], references: js.Array[Reference]): CommitBase = {
    val __obj = js.Dynamic.literal(mentions = mentions.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitBase]
  }
  @scala.inline
  implicit class CommitBaseOps[Self <: CommitBase] (val x: Self) extends AnyVal {
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
    def setMentionsVarargs(value: String*): Self = this.set("mentions", js.Array(value :_*))
    @scala.inline
    def setMentions(value: js.Array[String]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotesVarargs(value: Note*): Self = this.set("notes", js.Array(value :_*))
    @scala.inline
    def setNotes(value: js.Array[Note]): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencesVarargs(value: Reference*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[Reference]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: Field): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setFooter(value: Field): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterNull: Self = this.set("footer", null)
    @scala.inline
    def setHeader(value: Field): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    @scala.inline
    def setMerge(value: Field): Self = this.set("merge", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeNull: Self = this.set("merge", null)
    @scala.inline
    def setRevert(value: Revert): Self = this.set("revert", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevertNull: Self = this.set("revert", null)
    @scala.inline
    def setScope(value: Field): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScopeNull: Self = this.set("scope", null)
    @scala.inline
    def setSubject(value: Field): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setSubjectNull: Self = this.set("subject", null)
    @scala.inline
    def setType(value: Field): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

