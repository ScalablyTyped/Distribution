package typings.d3kit.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "LayerOrganizer")
@js.native
class LayerOrganizer protected () extends js.Object {
  def this(container: Selection_[BaseType, _, BaseType, _]) = this()
  def this(container: Selection_[BaseType, _, BaseType, _], defaultTag: String) = this()
  def create(layerNames: String): (Selection_[BaseType, _, BaseType, _]) | (js.Array[Selection_[BaseType, _, BaseType, _]]) = js.native
  def create(layerNames: js.Array[LayerConfig | String]): (Selection_[BaseType, _, BaseType, _]) | (js.Array[Selection_[BaseType, _, BaseType, _]]) = js.native
  def create(layerNames: LayerConfig): (Selection_[BaseType, _, BaseType, _]) | (js.Array[Selection_[BaseType, _, BaseType, _]]) = js.native
  def get(name: String): Selection_[BaseType, _, BaseType, _] = js.native
  def has(name: String): Boolean = js.native
}

