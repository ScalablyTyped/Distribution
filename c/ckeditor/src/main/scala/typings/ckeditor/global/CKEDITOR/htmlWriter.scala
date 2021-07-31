package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.htmlWriter")
@js.native
class htmlWriter ()
  extends StObject
     with typings.ckeditor.CKEDITOR.htmlWriter {
  
  /* CompleteClass */
  override def attribute(attName: String, attValue: String): Unit = js.native
  
  /* CompleteClass */
  override def closeTag(tagName: String): Unit = js.native
  
  /* CompleteClass */
  override def comment(comment: String): Unit = js.native
  
  /* CompleteClass */
  override def getHtml(reset: Boolean): String = js.native
  
  /* CompleteClass */
  override def indentation(): Unit = js.native
  
  /* CompleteClass */
  var indentationChars: String = js.native
  
  /* CompleteClass */
  override def lineBreak(): Unit = js.native
  
  /* CompleteClass */
  var lineBreakChars: String = js.native
  
  /* CompleteClass */
  override def openTag(tagName: String, attributes: StringDictionary[String]): Unit = js.native
  
  /* CompleteClass */
  override def openTagClose(tagName: String, isSelfClose: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  var selfClosingEnd: String = js.native
  
  /* CompleteClass */
  override def setRules(tagName: String, rules: StringDictionary[js.Any]): Unit = js.native
  
  /* CompleteClass */
  override def text(text: String): Unit = js.native
  
  /* CompleteClass */
  override def write(data: String): Unit = js.native
}
