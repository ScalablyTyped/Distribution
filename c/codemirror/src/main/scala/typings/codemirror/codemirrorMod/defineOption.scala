package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "defineOption")
@js.native
object defineOption extends js.Object {
  /** Similarly, defineOption can be used to define new options for CodeMirror.
    The updateFunc will be called with the editor instance and the new value when an editor is initialized,
    and whenever the option is modified through setOption. */
  def apply(name: String, default_ : js.Any, updateFunc: js.Function): Unit = js.native
}

