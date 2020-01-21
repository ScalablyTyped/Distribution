package typings.ckeditorCkeditor5Engine.mod.conversion

import typings.ckeditorCkeditor5Engine.AnonAdd
import typings.ckeditorCkeditor5Engine.AnonModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/conversion/conversion
@JSImport("@ckeditor/ckeditor5-engine", "conversion.Conversion")
@js.native
class Conversion () extends js.Object {
  def attributeToAttribute(): Unit = js.native
  def attributeToAttribute(definition: AnonModel): Unit = js.native
  def attributeToElement(definition: ConverterDefinition): Unit = js.native
  def elementToElement(definition: ConverterDefinition): Unit = js.native
  def `for`(groupName: String): AnonAdd = js.native
  def register(groupName: String, dispatchers: js.Array[DowncastDispatcher | UpcastDispatcher]): Unit = js.native
}

