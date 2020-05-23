package typings.cathoQuantum.modalMod

import typings.cathoQuantum.anon.SpacingObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticProps extends js.Object {
  var theme: js.UndefOr[SpacingObject] = js.undefined
}

object StaticProps {
  @scala.inline
  def apply(theme: SpacingObject = null): StaticProps = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticProps]
  }
}

