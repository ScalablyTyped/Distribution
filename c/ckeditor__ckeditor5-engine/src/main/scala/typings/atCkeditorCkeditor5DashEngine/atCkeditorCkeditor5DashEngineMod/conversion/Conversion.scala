package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversion

import typings.atCkeditorCkeditor5DashEngine.Anon_Add
import typings.atCkeditorCkeditor5DashEngine.Anon_Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/conversion/conversion
@JSImport("@ckeditor/ckeditor5-engine", "conversion.Conversion")
@js.native
class Conversion () extends js.Object {
  def attributeToAttribute(): Unit = js.native
  def attributeToAttribute(definition: Anon_Model): Unit = js.native
  def attributeToElement(definition: ConverterDefinition): Unit = js.native
  def elementToElement(definition: ConverterDefinition): Unit = js.native
  def `for`(groupName: String): Anon_Add = js.native
  def register(groupName: String, dispatchers: js.Array[DowncastDispatcher | UpcastDispatcher]): Unit = js.native
}

