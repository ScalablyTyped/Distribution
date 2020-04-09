package typings.carbonIconHelpers.mod

import typings.carbonIconHelpers.carbonIconHelpersStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  var attrs: js.UndefOr[IconAttributes | js.Object] = js.undefined
  var content: js.UndefOr[IconContent | js.Array[js.Any]] = js.undefined
  var elem: js.UndefOr[String | svg] = js.undefined
}

object Descriptor {
  @scala.inline
  def apply(
    attrs: IconAttributes | js.Object = null,
    content: IconContent | js.Array[js.Any] = null,
    elem: String | svg = null
  ): Descriptor = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (elem != null) __obj.updateDynamic("elem")(elem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptor]
  }
}

