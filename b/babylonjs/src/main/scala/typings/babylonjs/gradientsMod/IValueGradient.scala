package typings.babylonjs.gradientsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValueGradient extends js.Object {
  
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  var gradient: Double = js.native
}
object IValueGradient {
  
  @scala.inline
  def apply(gradient: Double): IValueGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueGradient]
  }
  
  @scala.inline
  implicit class IValueGradientOps[Self <: IValueGradient] (val x: Self) extends AnyVal {
    
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
    def setGradient(value: Double): Self = this.set("gradient", value.asInstanceOf[js.Any])
  }
}
