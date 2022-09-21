package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.NumberDictionary
import typings.ckeditor4.CKEDITOR.dom.domObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait keystrokeHandler extends StObject {
  
  def attach(domObject: domObject): Unit
  
  var blockedKeystrokes: NumberDictionary[String | Boolean]
  
  var keystrokes: NumberDictionary[String | Boolean]
}
object keystrokeHandler {
  
  inline def apply(
    attach: domObject => Unit,
    blockedKeystrokes: NumberDictionary[String | Boolean],
    keystrokes: NumberDictionary[String | Boolean]
  ): keystrokeHandler = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), blockedKeystrokes = blockedKeystrokes.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[keystrokeHandler]
  }
  
  extension [Self <: keystrokeHandler](x: Self) {
    
    inline def setAttach(value: domObject => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    inline def setBlockedKeystrokes(value: NumberDictionary[String | Boolean]): Self = StObject.set(x, "blockedKeystrokes", value.asInstanceOf[js.Any])
    
    inline def setKeystrokes(value: NumberDictionary[String | Boolean]): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
  }
}
