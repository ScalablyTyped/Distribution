package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchIssueTypeParams extends js.Object {
  var color: js.UndefOr[IssueTypeColor] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object PatchIssueTypeParams {
  @scala.inline
  def apply(color: IssueTypeColor = null, name: String = null): PatchIssueTypeParams = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchIssueTypeParams]
  }
}

