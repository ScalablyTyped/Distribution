package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rectangle extends StObject {
  
  /**
    * Height of rectangle in pixels. Specify only even numbers.
    */
  var Height: js.UndefOr[integerMin2Max2147483647] = js.undefined
  
  /**
    * Width of rectangle in pixels. Specify only even numbers.
    */
  var Width: js.UndefOr[integerMin2Max2147483647] = js.undefined
  
  /**
    * The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even numbers.
    */
  var X: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even numbers.
    */
  var Y: js.UndefOr[integerMin0Max2147483647] = js.undefined
}
object Rectangle {
  
  @scala.inline
  def apply(): Rectangle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rectangle]
  }
  
  @scala.inline
  implicit class RectangleMutableBuilder[Self <: Rectangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: integerMin2Max2147483647): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    @scala.inline
    def setWidth(value: integerMin2Max2147483647): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
    
    @scala.inline
    def setX(value: integerMin0Max2147483647): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "X", js.undefined)
    
    @scala.inline
    def setY(value: integerMin0Max2147483647): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "Y", js.undefined)
  }
}
