package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingBox extends js.Object {
  
  /**
    * Height of the bounding box as a ratio of the overall image height.
    */
  var Height: js.UndefOr[Float] = js.native
  
  /**
    * Left coordinate of the bounding box as a ratio of overall image width.
    */
  var Left: js.UndefOr[Float] = js.native
  
  /**
    * Top coordinate of the bounding box as a ratio of overall image height.
    */
  var Top: js.UndefOr[Float] = js.native
  
  /**
    * Width of the bounding box as a ratio of the overall image width.
    */
  var Width: js.UndefOr[Float] = js.native
}
object BoundingBox {
  
  @scala.inline
  def apply(): BoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingBox]
  }
  
  @scala.inline
  implicit class BoundingBoxOps[Self <: BoundingBox] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Float): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("Height", js.undefined)
    
    @scala.inline
    def setLeft(value: Float): Self = this.set("Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("Left", js.undefined)
    
    @scala.inline
    def setTop(value: Float): Self = this.set("Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("Top", js.undefined)
    
    @scala.inline
    def setWidth(value: Float): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("Width", js.undefined)
  }
}
