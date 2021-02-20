package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkImageInfo extends StObject {
  
  var alphaType: AlphaType = js.native
  
  var colorSpace: ColorSpace = js.native
  
  var colorType: ColorType = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object SkImageInfo {
  
  @scala.inline
  def apply(alphaType: AlphaType, colorSpace: ColorSpace, colorType: ColorType, height: Double, width: Double): SkImageInfo = {
    val __obj = js.Dynamic.literal(alphaType = alphaType.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkImageInfo]
  }
  
  @scala.inline
  implicit class SkImageInfoMutableBuilder[Self <: SkImageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaType(value: AlphaType): Self = StObject.set(x, "alphaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpace(value: ColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(value: ColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
