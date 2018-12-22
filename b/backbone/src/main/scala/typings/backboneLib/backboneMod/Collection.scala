package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "Collection")
@js.native
class Collection[TModel /* <: backboneLib.backboneMod.BackboneNs.Model */] ()
  extends backboneLib.backboneMod.BackboneNs.Collection[TModel] {
  def this(models: js.Array[js.Object | TModel]) = this()
  def this(models: js.Array[js.Object | TModel], options: js.Any) = this()
}

@JSImport("backbone", "Collection")
@js.native
object Collection extends js.Object {
  /**
          * Do not use, prefer TypeScript's extend functionality.
          **/
  def extend(properties: js.Any): js.Any = js.native
  /**
          * Do not use, prefer TypeScript's extend functionality.
          **/
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
}

