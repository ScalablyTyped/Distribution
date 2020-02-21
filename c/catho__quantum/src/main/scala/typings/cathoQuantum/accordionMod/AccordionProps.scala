package typings.cathoQuantum.accordionMod

import typings.cathoQuantum.AnonBaseFontSize
import typings.cathoQuantum.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var items: js.Array[AnonContent]
  var keepOnlyOneOpen: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[AnonBaseFontSize] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    items: js.Array[AnonContent],
    keepOnlyOneOpen: js.UndefOr[Boolean] = js.undefined,
    theme: AnonBaseFontSize = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOnlyOneOpen)) __obj.updateDynamic("keepOnlyOneOpen")(keepOnlyOneOpen.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps]
  }
}

