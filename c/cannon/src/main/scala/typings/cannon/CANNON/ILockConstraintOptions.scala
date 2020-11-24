package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILockConstraintOptions extends js.Object {
  
  var maxForce: js.UndefOr[Double] = js.native
}
object ILockConstraintOptions {
  
  @scala.inline
  def apply(): ILockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILockConstraintOptions]
  }
  
  @scala.inline
  implicit class ILockConstraintOptionsOps[Self <: ILockConstraintOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxForce(value: Double): Self = this.set("maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxForce: Self = this.set("maxForce", js.undefined)
  }
}
