package typings.ckeditorCkeditor5Engine.mod.conversion

import typings.ckeditorCkeditor5Engine.anon.Add
import typings.ckeditorCkeditor5Engine.anon.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/conversion/conversion
@JSImport("@ckeditor/ckeditor5-engine", "conversion.Conversion")
@js.native
class Conversion () extends js.Object {
  
  def attributeToAttribute(): Unit = js.native
  def attributeToAttribute(definition: Model): Unit = js.native
  
  def attributeToElement(definition: ConverterDefinition): Unit = js.native
  
  def elementToElement(definition: ConverterDefinition): Unit = js.native
  
  def `for`(groupName: String): Add = js.native
  
  def register(groupName: String, dispatchers: js.Array[DowncastDispatcher | UpcastDispatcher]): Unit = js.native
}
