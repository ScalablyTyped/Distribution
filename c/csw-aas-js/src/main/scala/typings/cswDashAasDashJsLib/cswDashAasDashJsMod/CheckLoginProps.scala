package typings
package cswDashAasDashJsLib.cswDashAasDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckLoginProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var error: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object CheckLoginProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode = null, error: reactLib.reactMod.ReactNode = null): CheckLoginProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckLoginProps]
  }
}

