package typings.cfb.anon

import typings.cfb.mod.CFBBlob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Header extends js.Object {
  
  var header: CFBBlob = js.native
  
  var sectors: js.Array[CFBBlob] = js.native
}
object Header {
  
  @scala.inline
  def apply(header: CFBBlob, sectors: js.Array[CFBBlob]): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], sectors = sectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    
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
    def setHeaderVarargs(value: Double*): Self = this.set("header", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: CFBBlob): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectorsVarargs(value: CFBBlob*): Self = this.set("sectors", js.Array(value :_*))
    
    @scala.inline
    def setSectors(value: js.Array[CFBBlob]): Self = this.set("sectors", value.asInstanceOf[js.Any])
  }
}
