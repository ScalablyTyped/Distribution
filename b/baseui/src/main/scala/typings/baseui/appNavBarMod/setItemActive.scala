package typings.baseui.appNavBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/app-nav-bar", "setItemActive")
@js.native
object setItemActive extends js.Object {
  
  def apply(items: js.Array[NavItemT], item: NavItemT): js.Array[NavItemT] = js.native
  def apply(
    items: js.Array[NavItemT],
    item: NavItemT,
    getUniqueueIdentifier: js.Function1[/* currentItem */ NavItemT, String | Double]
  ): js.Array[NavItemT] = js.native
}
