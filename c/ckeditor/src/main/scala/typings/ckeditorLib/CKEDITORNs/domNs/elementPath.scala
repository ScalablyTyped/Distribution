package typings
package ckeditorLib.CKEDITORNs.domNs

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
  def compare(otherPath: elementPath): scala.Boolean = js.native
  def contains(query: ScalablyTyped.runtime.StringDictionary[js.Any]): element = js.native
  def contains(query: ScalablyTyped.runtime.StringDictionary[js.Any], excludeRoot: scala.Boolean): element = js.native
  def contains(
    query: ScalablyTyped.runtime.StringDictionary[js.Any],
    excludeRoot: scala.Boolean,
    fromTop: scala.Boolean
  ): element = js.native
  def contains(query: element): element = js.native
  def contains(query: element, excludeRoot: scala.Boolean): element = js.native
  def contains(query: element, excludeRoot: scala.Boolean, fromTop: scala.Boolean): element = js.native
  def contains(query: java.lang.String): element = js.native
  def contains(query: java.lang.String, excludeRoot: scala.Boolean): element = js.native
  def contains(query: java.lang.String, excludeRoot: scala.Boolean, fromTop: scala.Boolean): element = js.native
  def contains(query: js.Array[java.lang.String]): element = js.native
  def contains(query: js.Array[java.lang.String], excludeRoot: scala.Boolean): element = js.native
  def contains(query: js.Array[java.lang.String], excludeRoot: scala.Boolean, fromTop: scala.Boolean): element = js.native
  def contains(query: js.Function1[/* element */ element, scala.Boolean]): element = js.native
  def contains(query: js.Function1[/* element */ element, scala.Boolean], excludeRoot: scala.Boolean): element = js.native
  def contains(
    query: js.Function1[/* element */ element, scala.Boolean],
    excludeRoot: scala.Boolean,
    fromTop: scala.Boolean
  ): element = js.native
  def direction(): ckeditorLib.ckeditorLibStrings.ltr | ckeditorLib.ckeditorLibStrings.rtl = js.native
  def isContextFor(tag: java.lang.String): scala.Boolean = js.native
}

