package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.NumberDictionary
import typings.ckeditor.CKEDITOR.dom.domObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait keystrokeHandler extends StObject {
  
  def attach(domObject: domObject): Unit = js.native
  
  var blockedKeystrokes: NumberDictionary[String | Boolean] = js.native
  
  var keystrokes: NumberDictionary[String | Boolean] = js.native
}
object keystrokeHandler {
  
  @scala.inline
  def apply(
    attach: domObject => Unit,
    blockedKeystrokes: NumberDictionary[String | Boolean],
    keystrokes: NumberDictionary[String | Boolean]
  ): keystrokeHandler = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), blockedKeystrokes = blockedKeystrokes.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[keystrokeHandler]
  }
  
  @scala.inline
  implicit class keystrokeHandlerMutableBuilder[Self <: keystrokeHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttach(value: domObject => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlockedKeystrokes(value: NumberDictionary[String | Boolean]): Self = StObject.set(x, "blockedKeystrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystrokes(value: NumberDictionary[String | Boolean]): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
  }
}
