package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "Router")
@js.native
class Router ()
  extends backboneLib.backboneMod.BackboneNs.Router {
  def this(options: backboneLib.backboneMod.BackboneNs.RouterOptions) = this()
}

/* static members */
@JSImport("backbone", "Router")
@js.native
object Router extends js.Object {
  /**
    * Do not use, prefer TypeScript's extend functionality.
    **/
  def extend(properties: js.Any): js.Any = js.native
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
}

