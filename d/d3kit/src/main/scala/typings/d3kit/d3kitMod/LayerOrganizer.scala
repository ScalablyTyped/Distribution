package typings.d3kit.d3kitMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "LayerOrganizer")
@js.native
class LayerOrganizer protected () extends js.Object {
  def this(container: Selection[BaseType, _, BaseType, _]) = this()
  def this(container: Selection[BaseType, _, BaseType, _], defaultTag: String) = this()
  def create(layerNames: String): (Selection[BaseType, _, BaseType, _]) | (js.Array[Selection[BaseType, _, BaseType, _]]) = js.native
  def create(layerNames: js.Array[LayerConfig | String]): (Selection[BaseType, _, BaseType, _]) | (js.Array[Selection[BaseType, _, BaseType, _]]) = js.native
  def create(layerNames: LayerConfig): (Selection[BaseType, _, BaseType, _]) | (js.Array[Selection[BaseType, _, BaseType, _]]) = js.native
  def get(name: String): Selection[BaseType, _, BaseType, _] = js.native
  def has(name: String): Boolean = js.native
}

