package typings.ckeditor.CKEDITORNs

import org.scalablytyped.runtime.NumberDictionary
import typings.ckeditor.CKEDITORNs.domNs.domObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.keystrokeHandler")
@js.native
class keystrokeHandler protected () extends js.Object {
  def this(editor: editor) = this()
  var blockedKeystrokes: NumberDictionary[String | Boolean] = js.native
  var keystrokes: NumberDictionary[String | Boolean] = js.native
  def attach(domObject: domObject): Unit = js.native
}

