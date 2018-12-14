package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui")
@js.native
class ui protected () extends event {
  def this(editor: editor) = this()
  def add(
    name: java.lang.String,
    `type`: org.scalablytyped.runtime.StringDictionary[js.Any],
    definition: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def addButton(name: java.lang.String, definition: buttonDefinition): scala.Unit = js.native
  def addHandler(
    `type`: org.scalablytyped.runtime.StringDictionary[js.Any],
    handler: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def addRichCombo(name: java.lang.String, definition: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def addToolbarGroup(name: java.lang.String, previous: java.lang.String): scala.Unit = js.native
  def addToolbarGroup(name: java.lang.String, previous: java.lang.String, subgroupOf: java.lang.String): scala.Unit = js.native
  def addToolbarGroup(name: java.lang.String, previous: scala.Double): scala.Unit = js.native
  def addToolbarGroup(name: java.lang.String, previous: scala.Double, subgroupOf: java.lang.String): scala.Unit = js.native
  def create(name: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def get(name: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def space(name: java.lang.String): ckeditorLib.CKEDITORNs.domNs.element = js.native
  def spaceId(name: java.lang.String): java.lang.String = js.native
}

