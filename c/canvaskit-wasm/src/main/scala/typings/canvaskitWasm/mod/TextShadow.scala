package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextShadow extends StObject {
  
  var blurRadius: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[InputColor] = js.native
  
  /**
    * 2d array for x and y offset. Defaults to [0, 0]
    */
  var offset: js.UndefOr[js.Array[Double]] = js.native
}
object TextShadow {
  
  @scala.inline
  def apply(): TextShadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadow]
  }
  
  @scala.inline
  implicit class TextShadowMutableBuilder[Self <: TextShadow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    @scala.inline
    def setColor(value: InputColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
  }
}
