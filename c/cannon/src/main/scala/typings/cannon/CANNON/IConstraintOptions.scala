package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConstraintOptions extends js.Object {
  
  var collideConnected: js.UndefOr[Boolean] = js.native
  
  var wakeUpBodies: js.UndefOr[Boolean] = js.native
}
object IConstraintOptions {
  
  @scala.inline
  def apply(): IConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintOptions]
  }
  
  @scala.inline
  implicit class IConstraintOptionsOps[Self <: IConstraintOptions] (val x: Self) extends AnyVal {
    
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
    def setCollideConnected(value: Boolean): Self = this.set("collideConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollideConnected: Self = this.set("collideConnected", js.undefined)
    
    @scala.inline
    def setWakeUpBodies(value: Boolean): Self = this.set("wakeUpBodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWakeUpBodies: Self = this.set("wakeUpBodies", js.undefined)
  }
}
