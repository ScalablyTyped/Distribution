package typings.cathoQuantum.accordionMod

import typings.cathoQuantum.anon.BaseFontSize
import typings.cathoQuantum.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var items: js.Array[Content]
  var keepOnlyOneOpen: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[BaseFontSize] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    items: js.Array[Content],
    keepOnlyOneOpen: js.UndefOr[Boolean] = js.undefined,
    theme: BaseFontSize = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOnlyOneOpen)) __obj.updateDynamic("keepOnlyOneOpen")(keepOnlyOneOpen.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps]
  }
}

