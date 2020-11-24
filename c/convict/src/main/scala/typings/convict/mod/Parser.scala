package typings.convict.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends js.Object {
  
  var extension: String | js.Array[String] = js.native
  
  def parse(content: String): js.Any = js.native
}
object Parser {
  
  @scala.inline
  def apply(extension: String | js.Array[String], parse: String => js.Any): Parser = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Parser]
  }
  
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    
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
    def setExtensionVarargs(value: String*): Self = this.set("extension", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: String | js.Array[String]): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: String => js.Any): Self = this.set("parse", js.Any.fromFunction1(value))
  }
}
