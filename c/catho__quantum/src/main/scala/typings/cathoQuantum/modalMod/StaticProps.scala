package typings.cathoQuantum.modalMod

import typings.cathoQuantum.AnonSpacingObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticProps extends js.Object {
  var theme: js.UndefOr[AnonSpacingObject] = js.undefined
}

object StaticProps {
  @scala.inline
  def apply(theme: AnonSpacingObject = null): StaticProps = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticProps]
  }
}

