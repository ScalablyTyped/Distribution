package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.BACKWARD
import typings.carbonComponents.anon.SelectorNavKind
import typings.carbonComponents.headerNavMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "HeaderNav")
@js.native
class HeaderNav protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
/* static members */
@JSImport("carbon-components/globals/js/components", "HeaderNav")
@js.native
object HeaderNav extends js.Object {
  
  var NAVIGATE: BACKWARD = js.native
  
  var components: WeakMap[js.Object, _] = js.native
  
  def options: SelectorNavKind = js.native
}
