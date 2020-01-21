package typings.cswAasJs.checkLoginMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckLoginProps extends js.Object {
  var children: ReactNode
  var error: ReactNode
}

object CheckLoginProps {
  @scala.inline
  def apply(children: ReactNode = null, error: ReactNode = null): CheckLoginProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckLoginProps]
  }
}

