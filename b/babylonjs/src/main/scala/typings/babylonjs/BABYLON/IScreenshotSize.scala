package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScreenshotSize extends js.Object {
  
  /**
    * number in pixels for canvas height
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * multiplier allowing render at a higher or lower resolution
    * If value is defined then height and width will be ignored and taken from camera
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * number in pixels for canvas width
    */
  var width: js.UndefOr[Double] = js.native
}
object IScreenshotSize {
  
  @scala.inline
  def apply(): IScreenshotSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScreenshotSize]
  }
  
  @scala.inline
  implicit class IScreenshotSizeOps[Self <: IScreenshotSize] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
