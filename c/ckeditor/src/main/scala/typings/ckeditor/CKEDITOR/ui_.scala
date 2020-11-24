package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ui_ extends event {
  
  def add(name: String, `type`: StringDictionary[js.Any], definition: StringDictionary[js.Any]): Unit = js.native
  
  def addButton(name: String, definition: buttonDefinition): Unit = js.native
  
  def addHandler(`type`: StringDictionary[js.Any], handler: StringDictionary[js.Any]): Unit = js.native
  
  def addRichCombo(name: String, definition: StringDictionary[js.Any]): Unit = js.native
  
  def addToolbarGroup(name: String, previous: String): Unit = js.native
  def addToolbarGroup(name: String, previous: String, subgroupOf: String): Unit = js.native
  def addToolbarGroup(name: String, previous: Double): Unit = js.native
  def addToolbarGroup(name: String, previous: Double, subgroupOf: String): Unit = js.native
  
  def create(name: String): StringDictionary[js.Any] = js.native
  
  def get(name: String): StringDictionary[js.Any] = js.native
  
  def space(name: String): element = js.native
  
  def spaceId(name: String): String = js.native
}
