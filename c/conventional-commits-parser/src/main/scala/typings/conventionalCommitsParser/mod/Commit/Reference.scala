package typings.conventionalCommitsParser.mod.Commit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  /**
    * @default
    * null
    */
  var action: Field
  var issue: String
  /**
    * @default
    * null
    */
  var owner: Field
  var prefix: String
  var raw: String
  /**
    * @default
    * null
    */
  var repository: Field
}

object Reference {
  @scala.inline
  def apply(
    issue: String,
    prefix: String,
    raw: String,
    action: Field = null,
    owner: Field = null,
    repository: Field = null
  ): Reference = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

