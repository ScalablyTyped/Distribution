package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.NumberDictionary
import typings.ckeditor.CKEDITOR.dom.domObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.keystrokeHandler")
@js.native
class keystrokeHandler protected ()
  extends StObject
     with typings.ckeditor.CKEDITOR.keystrokeHandler {
  def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
  
  /* CompleteClass */
  override def attach(domObject: domObject): Unit = js.native
  
  /* CompleteClass */
  var blockedKeystrokes: NumberDictionary[String | Boolean] = js.native
  
  /* CompleteClass */
  var keystrokes: NumberDictionary[String | Boolean] = js.native
}
