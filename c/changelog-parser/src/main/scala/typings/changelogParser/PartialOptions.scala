package typings.changelogParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<changelog-parser.changelog-parser.Options> */
trait PartialOptions extends js.Object {
  var filePath: js.UndefOr[String] = js.undefined
  var removeMarkdown: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(filePath: String = null, removeMarkdown: js.UndefOr[Boolean] = js.undefined): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (!js.isUndefined(removeMarkdown)) __obj.updateDynamic("removeMarkdown")(removeMarkdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

