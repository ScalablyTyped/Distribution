package typings.cssTree.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxParseError extends Error {
  
  var input: String = js.native
  
  var offset: Double = js.native
  
  var rawMessage: String = js.native
}
object SyntaxParseError {
  
  @scala.inline
  def apply(input: String, message: String, name: String, offset: Double, rawMessage: String): SyntaxParseError = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseError]
  }
  
  @scala.inline
  implicit class SyntaxParseErrorOps[Self <: SyntaxParseError] (val x: Self) extends AnyVal {
    
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
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawMessage(value: String): Self = this.set("rawMessage", value.asInstanceOf[js.Any])
  }
}
