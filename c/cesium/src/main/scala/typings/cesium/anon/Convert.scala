package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Convert extends StObject {
  
  var convert: js.UndefOr[Boolean] = js.native
  
  var destination: js.UndefOr[Cartesian3 | typings.cesium.mod.Rectangle] = js.native
  
  var endTransform: js.UndefOr[Matrix4] = js.native
  
  var orientation: js.UndefOr[Direction | Heading] = js.native
}
object Convert {
  
  @scala.inline
  def apply(): Convert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Convert]
  }
  
  @scala.inline
  implicit class ConvertMutableBuilder[Self <: Convert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setDestination(value: Cartesian3 | typings.cesium.mod.Rectangle): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setEndTransform(value: Matrix4): Self = StObject.set(x, "endTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTransformUndefined: Self = StObject.set(x, "endTransform", js.undefined)
    
    @scala.inline
    def setOrientation(value: Direction | Heading): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
