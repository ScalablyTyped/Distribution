package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalCityOptions extends StObject {
  
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}
object LocalCityOptions {
  
  inline def apply(): LocalCityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalCityOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalCityOptions] (val x: Self) extends AnyVal {
    
    inline def setRenderOptions(value: RenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
