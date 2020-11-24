package typings.constantinople.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionToConstantOptions extends js.Object {
  
  var constants: js.UndefOr[js.Any] = js.native
}
object ExpressionToConstantOptions {
  
  @scala.inline
  def apply(): ExpressionToConstantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressionToConstantOptions]
  }
  
  @scala.inline
  implicit class ExpressionToConstantOptionsOps[Self <: ExpressionToConstantOptions] (val x: Self) extends AnyVal {
    
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
    def setConstants(value: js.Any): Self = this.set("constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstants: Self = this.set("constants", js.undefined)
  }
}
