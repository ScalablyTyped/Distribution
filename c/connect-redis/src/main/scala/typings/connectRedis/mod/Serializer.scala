package typings.connectRedis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serializer extends js.Object {
  
  var parse: js.Function = js.native
  
  var stringify: js.Function = js.native
}
object Serializer {
  
  @scala.inline
  def apply(parse: js.Function, stringify: js.Function): Serializer = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serializer]
  }
  
  @scala.inline
  implicit class SerializerOps[Self <: Serializer] (val x: Self) extends AnyVal {
    
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
    def setParse(value: js.Function): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringify(value: js.Function): Self = this.set("stringify", value.asInstanceOf[js.Any])
  }
}
