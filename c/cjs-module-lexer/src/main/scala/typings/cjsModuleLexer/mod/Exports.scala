package typings.cjsModuleLexer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exports extends js.Object {
  
  var exports: js.Array[String] = js.native
  
  var reexports: js.Array[String] = js.native
}
object Exports {
  
  @scala.inline
  def apply(exports: js.Array[String], reexports: js.Array[String]): Exports = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], reexports = reexports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exports]
  }
  
  @scala.inline
  implicit class ExportsOps[Self <: Exports] (val x: Self) extends AnyVal {
    
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
    def setExportsVarargs(value: String*): Self = this.set("exports", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: js.Array[String]): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReexportsVarargs(value: String*): Self = this.set("reexports", js.Array(value :_*))
    
    @scala.inline
    def setReexports(value: js.Array[String]): Self = this.set("reexports", value.asInstanceOf[js.Any])
  }
}
