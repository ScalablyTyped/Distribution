package typings.conventionalCommitsParser.mod.Commit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  /**
    * @default
    * null
    */
  var action: Field = js.native
  var issue: String = js.native
  /**
    * @default
    * null
    */
  var owner: Field = js.native
  var prefix: String = js.native
  var raw: String = js.native
  /**
    * @default
    * null
    */
  var repository: Field = js.native
}

object Reference {
  @scala.inline
  def apply(issue: String, prefix: String, raw: String): Reference = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
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
    def setIssue(value: String): Self = this.set("issue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: Field): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionNull: Self = this.set("action", null)
    @scala.inline
    def setOwner(value: Field): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
    @scala.inline
    def setRepository(value: Field): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryNull: Self = this.set("repository", null)
  }
  
}

