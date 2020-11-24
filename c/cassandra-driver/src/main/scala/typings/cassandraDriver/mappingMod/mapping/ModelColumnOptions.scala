package typings.cassandraDriver.mappingMod.mapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelColumnOptions extends js.Object {
  
  var fromModel: js.UndefOr[js.Function1[/* modelValue */ js.Any, _]] = js.native
  
  var name: String = js.native
  
  var toModel: js.UndefOr[js.Function1[/* columnValue */ js.Any, _]] = js.native
}
object ModelColumnOptions {
  
  @scala.inline
  def apply(name: String): ModelColumnOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelColumnOptions]
  }
  
  @scala.inline
  implicit class ModelColumnOptionsOps[Self <: ModelColumnOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromModel(value: /* modelValue */ js.Any => _): Self = this.set("fromModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFromModel: Self = this.set("fromModel", js.undefined)
    
    @scala.inline
    def setToModel(value: /* columnValue */ js.Any => _): Self = this.set("toModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToModel: Self = this.set("toModel", js.undefined)
  }
}
