package typings.carbonComponents.componentsMod

import typings.carbonComponents.anon.PasswordIsVisible
import typings.carbonComponents.textInputMod.default
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components/globals/js/components", "TextInput")
@js.native
class TextInput protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components/globals/js/components", "TextInput")
@js.native
object TextInput extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  def options: PasswordIsVisible = js.native
}

