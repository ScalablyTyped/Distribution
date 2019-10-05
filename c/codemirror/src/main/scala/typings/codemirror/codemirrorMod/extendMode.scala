package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "extendMode")
@js.native
object extendMode extends js.Object {
  /** Sometimes, it is useful to add or override mode object properties from external code.
    The CodeMirror.extendMode function can be used to add properties to mode objects produced for a specific mode.
    Its first argument is the name of the mode, its second an object that specifies the properties that should be added.
    This is mostly useful to add utilities that can later be looked up through getMode. */
  def apply(name: String, properties: Mode[_]): Unit = js.native
}

