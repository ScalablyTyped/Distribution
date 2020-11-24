package typings.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bools extends js.Object {
  
  var bools: js.Any = js.native
  
  var desc: String = js.native
  
  var header: DataSize = js.native
  
  var name: String = js.native
  
  var names: js.Array[String] = js.native
  
  var numbers: js.Any = js.native
  
  var strings: js.Any = js.native
}
object Bools {
  
  @scala.inline
  def apply(
    bools: js.Any,
    desc: String,
    header: DataSize,
    name: String,
    names: js.Array[String],
    numbers: js.Any,
    strings: js.Any
  ): Bools = {
    val __obj = js.Dynamic.literal(bools = bools.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bools]
  }
  
  @scala.inline
  implicit class BoolsOps[Self <: Bools] (val x: Self) extends AnyVal {
    
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
    def setBools(value: js.Any): Self = this.set("bools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: DataSize): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumbers(value: js.Any): Self = this.set("numbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrings(value: js.Any): Self = this.set("strings", value.asInstanceOf[js.Any])
  }
}
