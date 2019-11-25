package typings.catalog.catalogMod

import typings.catalog.catalogNumbers.`1`
import typings.catalog.catalogNumbers.`2`
import typings.catalog.catalogNumbers.`3`
import typings.catalog.catalogNumbers.`4`
import typings.catalog.catalogNumbers.`5`
import typings.catalog.catalogNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecimenProps extends js.Object {
  var rawBody: js.UndefOr[String] = js.undefined
  var rawOptions: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object SpecimenProps {
  @scala.inline
  def apply(rawBody: String = null, rawOptions: String = null, span: `1` | `2` | `3` | `4` | `5` | `6` = null): SpecimenProps = {
    val __obj = js.Dynamic.literal()
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody.asInstanceOf[js.Any])
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecimenProps]
  }
}

