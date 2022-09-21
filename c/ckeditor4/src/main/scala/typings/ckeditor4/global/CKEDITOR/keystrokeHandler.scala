package typings.ckeditor4.global.CKEDITOR

import org.scalablytyped.runtime.NumberDictionary
import typings.ckeditor4.CKEDITOR.dom.domObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.keystrokeHandler")
@js.native
open class keystrokeHandler protected ()
  extends StObject
     with typings.ckeditor4.CKEDITOR.keystrokeHandler {
  def this(editor: typings.ckeditor4.CKEDITOR.editor) = this()
  
  /* CompleteClass */
  override def attach(domObject: domObject): Unit = js.native
  
  /* CompleteClass */
  var blockedKeystrokes: NumberDictionary[String | Boolean] = js.native
  
  /* CompleteClass */
  var keystrokes: NumberDictionary[String | Boolean] = js.native
}
