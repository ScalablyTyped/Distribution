package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversion

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Item
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Range
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/conversion/modelconsumable
@JSImport("@ckeditor/ckeditor5-engine", "conversion.ModelConsumable")
@js.native
class ModelConsumable () extends js.Object {
  def add(item: Item, `type`: String): Unit = js.native
  def add(item: Range, `type`: String): Unit = js.native
  def add(item: Selection, `type`: String): Unit = js.native
  def consume(item: Item, `type`: String): Boolean = js.native
  def consume(item: Range, `type`: String): Boolean = js.native
  def consume(item: Selection, `type`: String): Boolean = js.native
  def revert(item: Item, `type`: String): Null | Boolean = js.native
  def revert(item: Range, `type`: String): Null | Boolean = js.native
  def revert(item: Selection, `type`: String): Null | Boolean = js.native
  def test(item: Item, `type`: String): Null | Boolean = js.native
  def test(item: Range, `type`: String): Null | Boolean = js.native
  def test(item: Selection, `type`: String): Null | Boolean = js.native
}

