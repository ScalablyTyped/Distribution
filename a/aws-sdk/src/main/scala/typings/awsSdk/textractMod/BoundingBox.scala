package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingBox extends StObject {
  
  /**
    * The height of the bounding box as a ratio of the overall document page height.
    */
  var Height: js.UndefOr[Float] = js.native
  
  /**
    * The left coordinate of the bounding box as a ratio of overall document page width.
    */
  var Left: js.UndefOr[Float] = js.native
  
  /**
    * The top coordinate of the bounding box as a ratio of overall document page height.
    */
  var Top: js.UndefOr[Float] = js.native
  
  /**
    * The width of the bounding box as a ratio of the overall document page width.
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
  implicit class BoundingBoxMutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Float): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    @scala.inline
    def setLeft(value: Float): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "Left", js.undefined)
    
    @scala.inline
    def setTop(value: Float): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "Top", js.undefined)
    
    @scala.inline
    def setWidth(value: Float): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
