package typings.baseui.drawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerState extends js.Object {
  var isVisible: Boolean
  var mounted: Boolean
}

object DrawerState {
  @scala.inline
  def apply(isVisible: Boolean, mounted: Boolean): DrawerState = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DrawerState]
  }
}

