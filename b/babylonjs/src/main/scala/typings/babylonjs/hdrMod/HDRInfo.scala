package typings.babylonjs.hdrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HDRInfo extends js.Object {
  
  /**
    * The index of the beginning of the data in the binary file.
    */
  var dataPosition: Double = js.native
  
  /**
    * The height of the texture in pixels.
    */
  var height: Double = js.native
  
  /**
    * The width of the texture in pixels.
    */
  var width: Double = js.native
}
object HDRInfo {
  
  @scala.inline
  def apply(dataPosition: Double, height: Double, width: Double): HDRInfo = {
    val __obj = js.Dynamic.literal(dataPosition = dataPosition.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HDRInfo]
  }
  
  @scala.inline
  implicit class HDRInfoOps[Self <: HDRInfo] (val x: Self) extends AnyVal {
    
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
    def setDataPosition(value: Double): Self = this.set("dataPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
