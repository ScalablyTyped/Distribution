package typings.carbonComponents.componentsMod

import typings.carbonComponents.contentSwitcherMod.default
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "ContentSwitcher")
@js.native
class ContentSwitcher protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
object ContentSwitcher {
  
  @JSImport("carbon-components/globals/js/components", "ContentSwitcher")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "ContentSwitcher.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
