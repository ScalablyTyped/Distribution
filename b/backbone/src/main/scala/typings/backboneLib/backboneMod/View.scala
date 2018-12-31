package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "View")
@js.native
class View[TModel /* <: backboneLib.backboneMod.BackboneNs.Model */] ()
  extends backboneLib.backboneMod.BackboneNs.View[TModel] {
  def this(options: backboneLib.backboneMod.BackboneNs.ViewOptions[TModel]) = this()
}

@JSImport("backbone", "View")
@js.native
object View extends js.Object {
  /**
    * Do not use, prefer TypeScript's extend functionality.
    **/
  def extend(properties: js.Any): js.Any = js.native
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
}

