package typings.deepEqualInAnyOrder.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deep extends js.Object {
  
  var equalInAnyOrder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ js.Any = js.native
}
object Deep {
  
  @scala.inline
  def apply(
    equalInAnyOrder: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ js.Any
  ): Deep = {
    val __obj = js.Dynamic.literal(equalInAnyOrder = equalInAnyOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deep]
  }
  
  @scala.inline
  implicit class DeepOps[Self <: Deep] (val x: Self) extends AnyVal {
    
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
    def setEqualInAnyOrder(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Equal */ js.Any
    ): Self = this.set("equalInAnyOrder", value.asInstanceOf[js.Any])
  }
}
