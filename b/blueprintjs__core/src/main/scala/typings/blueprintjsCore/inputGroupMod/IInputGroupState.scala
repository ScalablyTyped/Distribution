package typings.blueprintjsCore.inputGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputGroupState extends js.Object {
  
  var leftElementWidth: js.UndefOr[Double] = js.native
  
  var rightElementWidth: js.UndefOr[Double] = js.native
}
object IInputGroupState {
  
  @scala.inline
  def apply(): IInputGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputGroupState]
  }
  
  @scala.inline
  implicit class IInputGroupStateOps[Self <: IInputGroupState] (val x: Self) extends AnyVal {
    
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
    def setLeftElementWidth(value: Double): Self = this.set("leftElementWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftElementWidth: Self = this.set("leftElementWidth", js.undefined)
    
    @scala.inline
    def setRightElementWidth(value: Double): Self = this.set("rightElementWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElementWidth: Self = this.set("rightElementWidth", js.undefined)
  }
}
