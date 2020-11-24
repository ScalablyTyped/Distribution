package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInspectable extends js.Object {
  
  /**
    * Gets the label to display
    */
  var label: String = js.native
  
  /**
    * Gets the maximum value of the property when using in "slider" mode
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Gets the minimum value of the property when using in "slider" mode
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Gets the name of the property to edit
    */
  var propertyName: String = js.native
  
  /**
    * Gets the setp to use when using in "slider" mode
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * Gets the type of the editor to use
    */
  var `type`: InspectableType = js.native
}
object IInspectable {
  
  @scala.inline
  def apply(label: String, propertyName: String, `type`: InspectableType): IInspectable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectable]
  }
  
  @scala.inline
  implicit class IInspectableOps[Self <: IInspectable] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InspectableType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
