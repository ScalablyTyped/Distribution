package typings.cloudeventsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base64Parser extends js.Object {
  
  var decorator: js.Any = js.native
  
  def parse(payload: js.Any): js.Any = js.native
}
object Base64Parser {
  
  @scala.inline
  def apply(decorator: js.Any, parse: js.Any => js.Any): Base64Parser = {
    val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Base64Parser]
  }
  
  @scala.inline
  implicit class Base64ParserOps[Self <: Base64Parser] (val x: Self) extends AnyVal {
    
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
    def setDecorator(value: js.Any): Self = this.set("decorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: js.Any => js.Any): Self = this.set("parse", js.Any.fromFunction1(value))
  }
}
