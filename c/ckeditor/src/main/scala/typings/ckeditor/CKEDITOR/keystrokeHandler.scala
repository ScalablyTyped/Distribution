package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.NumberDictionary
import typings.ckeditor.CKEDITOR.dom.domObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait keystrokeHandler extends js.Object {
  
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
  implicit class keystrokeHandlerOps[Self <: keystrokeHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttach(value: domObject => Unit): Self = this.set("attach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlockedKeystrokes(value: NumberDictionary[String | Boolean]): Self = this.set("blockedKeystrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystrokes(value: NumberDictionary[String | Boolean]): Self = this.set("keystrokes", value.asInstanceOf[js.Any])
  }
}
