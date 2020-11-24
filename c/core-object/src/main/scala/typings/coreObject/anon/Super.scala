package typings.coreObject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Super[Base] extends js.Object {
  
  var _super: typings.coreObject.utilsMod.Super[Base] = js.native
}
object Super {
  
  @scala.inline
  def apply[Base](_super: typings.coreObject.utilsMod.Super[Base]): Super[Base] = {
    val __obj = js.Dynamic.literal(_super = _super.asInstanceOf[js.Any])
    __obj.asInstanceOf[Super[Base]]
  }
  
  @scala.inline
  implicit class SuperOps[Self <: Super[_], Base] (val x: Self with Super[Base]) extends AnyVal {
    
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
    def set_super(value: typings.coreObject.utilsMod.Super[Base]): Self = this.set("_super", value.asInstanceOf[js.Any])
  }
}
