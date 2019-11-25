package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchTags extends js.Object {
  /**
    * Highlight both matching tags.
    */
  var bothTags: js.UndefOr[Boolean] = js.undefined
}

object MatchTags {
  @scala.inline
  def apply(bothTags: js.UndefOr[Boolean] = js.undefined): MatchTags = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bothTags)) __obj.updateDynamic("bothTags")(bothTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchTags]
  }
}

