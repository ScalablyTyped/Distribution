package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Landmark extends js.Object {
  
  /**
    * Type of landmark.
    */
  var Type: js.UndefOr[LandmarkType] = js.native
  
  /**
    * The x-coordinate of the landmark expressed as a ratio of the width of the image. The x-coordinate is measured from the left-side of the image. For example, if the image is 700 pixels wide and the x-coordinate of the landmark is at 350 pixels, this value is 0.5. 
    */
  var X: js.UndefOr[Float] = js.native
  
  /**
    * The y-coordinate of the landmark expressed as a ratio of the height of the image. The y-coordinate is measured from the top of the image. For example, if the image height is 200 pixels and the y-coordinate of the landmark is at 50 pixels, this value is 0.25.
    */
  var Y: js.UndefOr[Float] = js.native
}
object Landmark {
  
  @scala.inline
  def apply(): Landmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Landmark]
  }
  
  @scala.inline
  implicit class LandmarkOps[Self <: Landmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: LandmarkType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setX(value: Float): Self = this.set("X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("X", js.undefined)
    
    @scala.inline
    def setY(value: Float): Self = this.set("Y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("Y", js.undefined)
  }
}
