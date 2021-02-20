package typings.babylonjs.anon

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranscodedPixels extends StObject {
  
  var height: Double = js.native
  
  var transcodedPixels: ArrayBufferView = js.native
  
  var width: Double = js.native
}
object TranscodedPixels {
  
  @scala.inline
  def apply(height: Double, transcodedPixels: ArrayBufferView, width: Double): TranscodedPixels = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transcodedPixels = transcodedPixels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodedPixels]
  }
  
  @scala.inline
  implicit class TranscodedPixelsMutableBuilder[Self <: TranscodedPixels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodedPixels(value: ArrayBufferView): Self = StObject.set(x, "transcodedPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
