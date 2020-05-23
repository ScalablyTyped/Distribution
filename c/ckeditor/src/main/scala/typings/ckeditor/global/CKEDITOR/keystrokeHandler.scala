package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.NumberDictionary
import typings.ckeditor.CKEDITOR.dom.domObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.keystrokeHandler")
@js.native
class keystrokeHandler protected ()
  extends typings.ckeditor.CKEDITOR.keystrokeHandler {
  def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
  /* CompleteClass */
  override var blockedKeystrokes: NumberDictionary[String | Boolean] = js.native
  /* CompleteClass */
  override var keystrokes: NumberDictionary[String | Boolean] = js.native
  /* CompleteClass */
  override def attach(domObject: domObject): Unit = js.native
}

