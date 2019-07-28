package typings.ckeditor.CKEDITORNs.domNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.ckeditorStrings.ltr
import typings.ckeditor.ckeditorStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.elementPath")
@js.native
class elementPath protected () extends js.Object {
  def this(startNode: element) = this()
  def this(startNode: element, root: element) = this()
  val block: element = js.native
  val blockLimit: element = js.native
  val elements: js.Array[element] = js.native
  val lastElement: element = js.native
  val root: element = js.native
  def compare(otherPath: elementPath): Boolean = js.native
  def contains(query: String): element = js.native
  def contains(query: String, excludeRoot: Boolean): element = js.native
  def contains(query: String, excludeRoot: Boolean, fromTop: Boolean): element = js.native
  def contains(query: js.Array[String]): element = js.native
  def contains(query: js.Array[String], excludeRoot: Boolean): element = js.native
  def contains(query: js.Array[String], excludeRoot: Boolean, fromTop: Boolean): element = js.native
  def contains(query: js.Function1[/* element */ element, Boolean]): element = js.native
  def contains(query: js.Function1[/* element */ element, Boolean], excludeRoot: Boolean): element = js.native
  def contains(query: js.Function1[/* element */ element, Boolean], excludeRoot: Boolean, fromTop: Boolean): element = js.native
  def contains(query: StringDictionary[js.Any]): element = js.native
  def contains(query: StringDictionary[js.Any], excludeRoot: Boolean): element = js.native
  def contains(query: StringDictionary[js.Any], excludeRoot: Boolean, fromTop: Boolean): element = js.native
  def contains(query: element): element = js.native
  def contains(query: element, excludeRoot: Boolean): element = js.native
  def contains(query: element, excludeRoot: Boolean, fromTop: Boolean): element = js.native
  def direction(): ltr | rtl = js.native
  def isContextFor(tag: String): Boolean = js.native
}

