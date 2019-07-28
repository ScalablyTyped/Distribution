package typings.ckeditor.CKEDITORNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.domNs.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui")
@js.native
class ui protected () extends event {
  def this(editor: editor) = this()
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

