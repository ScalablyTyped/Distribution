package typings.blueprintjsCore.handleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHandleState extends js.Object {
  
  /** whether slider handle is currently being dragged */
  var isMoving: js.UndefOr[Boolean] = js.native
}
object IHandleState {
  
  @scala.inline
  def apply(): IHandleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHandleState]
  }
  
  @scala.inline
  implicit class IHandleStateOps[Self <: IHandleState] (val x: Self) extends AnyVal {
    
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
    def setIsMoving(value: Boolean): Self = this.set("isMoving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMoving: Self = this.set("isMoving", js.undefined)
  }
}
