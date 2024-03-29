package typings.chartJs.distTypesIndexMod

import typings.chartJs.anon.OptionsRadialLinearScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialScaleTypeRegistry extends StObject {
  
  var radialLinear: OptionsRadialLinearScaleOptions
}
object RadialScaleTypeRegistry {
  
  inline def apply(radialLinear: OptionsRadialLinearScaleOptions): RadialScaleTypeRegistry = {
    val __obj = js.Dynamic.literal(radialLinear = radialLinear.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialScaleTypeRegistry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadialScaleTypeRegistry] (val x: Self) extends AnyVal {
    
    inline def setRadialLinear(value: OptionsRadialLinearScaleOptions): Self = StObject.set(x, "radialLinear", value.asInstanceOf[js.Any])
  }
}
