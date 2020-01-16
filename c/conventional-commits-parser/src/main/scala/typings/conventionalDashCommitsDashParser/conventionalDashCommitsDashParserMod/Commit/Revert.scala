package typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Commit

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revert
  extends /* field */ StringDictionary[js.UndefOr[Field]] {
  var hash: js.UndefOr[Field] = js.undefined
  var header: js.UndefOr[Field] = js.undefined
}

object Revert {
  @scala.inline
  def apply(
    StringDictionary: /* field */ StringDictionary[js.UndefOr[Field]] = null,
    hash: Field = null,
    header: Field = null
  ): Revert = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revert]
  }
}

