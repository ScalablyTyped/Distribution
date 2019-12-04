package typings.baseui.headingMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadingLevelProps extends js.Object {
  var children: ReactNode
}

object HeadingLevelProps {
  @scala.inline
  def apply(children: ReactNode = null): HeadingLevelProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingLevelProps]
  }
}

