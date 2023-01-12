package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.setHeight()
trait SetHeightConfig extends StObject {
  
  var full: js.UndefOr[Boolean] = js.undefined
  
  var fullViewport: js.UndefOr[Boolean] = js.undefined
  
  var growOnly: js.UndefOr[Boolean] = js.undefined
  
  var height: Double
}
object SetHeightConfig {
  
  inline def apply(height: Double): SetHeightConfig = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetHeightConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetHeightConfig] (val x: Self) extends AnyVal {
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setFullViewport(value: Boolean): Self = StObject.set(x, "fullViewport", value.asInstanceOf[js.Any])
    
    inline def setFullViewportUndefined: Self = StObject.set(x, "fullViewport", js.undefined)
    
    inline def setGrowOnly(value: Boolean): Self = StObject.set(x, "growOnly", value.asInstanceOf[js.Any])
    
    inline def setGrowOnlyUndefined: Self = StObject.set(x, "growOnly", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
