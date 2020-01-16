package typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Commit

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
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
}

