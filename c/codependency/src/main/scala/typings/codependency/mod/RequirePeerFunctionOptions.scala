package typings.codependency.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequirePeerFunctionOptions extends js.Object {
  
  var dontThrow: js.UndefOr[Boolean] = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
}
object RequirePeerFunctionOptions {
  
  @scala.inline
  def apply(): RequirePeerFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequirePeerFunctionOptions]
  }
  
  @scala.inline
  implicit class RequirePeerFunctionOptionsOps[Self <: RequirePeerFunctionOptions] (val x: Self) extends AnyVal {
    
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
    def setDontThrow(value: Boolean): Self = this.set("dontThrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontThrow: Self = this.set("dontThrow", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
}
