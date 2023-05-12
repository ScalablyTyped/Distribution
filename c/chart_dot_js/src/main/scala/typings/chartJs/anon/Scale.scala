package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.CoreScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var scale: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]
}
object Scale {
  
  inline def apply(scale: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    inline def setScale(value: typings.chartJs.distTypesIndexMod.Scale[CoreScaleOptions]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
