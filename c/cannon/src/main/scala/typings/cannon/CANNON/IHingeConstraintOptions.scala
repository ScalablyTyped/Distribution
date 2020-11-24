package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHingeConstraintOptions extends js.Object {
  
  var axisA: js.UndefOr[Vec3] = js.native
  
  var axisB: js.UndefOr[Vec3] = js.native
  
  var maxForce: js.UndefOr[Double] = js.native
  
  var pivotA: js.UndefOr[Vec3] = js.native
  
  var pivotB: js.UndefOr[Vec3] = js.native
}
object IHingeConstraintOptions {
  
  @scala.inline
  def apply(): IHingeConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHingeConstraintOptions]
  }
  
  @scala.inline
  implicit class IHingeConstraintOptionsOps[Self <: IHingeConstraintOptions] (val x: Self) extends AnyVal {
    
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
    def setAxisA(value: Vec3): Self = this.set("axisA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisA: Self = this.set("axisA", js.undefined)
    
    @scala.inline
    def setAxisB(value: Vec3): Self = this.set("axisB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisB: Self = this.set("axisB", js.undefined)
    
    @scala.inline
    def setMaxForce(value: Double): Self = this.set("maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxForce: Self = this.set("maxForce", js.undefined)
    
    @scala.inline
    def setPivotA(value: Vec3): Self = this.set("pivotA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotA: Self = this.set("pivotA", js.undefined)
    
    @scala.inline
    def setPivotB(value: Vec3): Self = this.set("pivotB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotB: Self = this.set("pivotB", js.undefined)
  }
}
