package typings.cesium.anon

import typings.cesium.mod.TextureMagnificationFilter
import typings.cesium.mod.TextureMinificationFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fabric extends StObject {
  
  var fabric: Any
  
  var magnificationFilter: js.UndefOr[TextureMagnificationFilter] = js.undefined
  
  var minificationFilter: js.UndefOr[TextureMinificationFilter] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var translucent: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.undefined
}
object Fabric {
  
  inline def apply(fabric: Any): Fabric = {
    val __obj = js.Dynamic.literal(fabric = fabric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fabric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fabric] (val x: Self) extends AnyVal {
    
    inline def setFabric(value: Any): Self = StObject.set(x, "fabric", value.asInstanceOf[js.Any])
    
    inline def setMagnificationFilter(value: TextureMagnificationFilter): Self = StObject.set(x, "magnificationFilter", value.asInstanceOf[js.Any])
    
    inline def setMagnificationFilterUndefined: Self = StObject.set(x, "magnificationFilter", js.undefined)
    
    inline def setMinificationFilter(value: TextureMinificationFilter): Self = StObject.set(x, "minificationFilter", value.asInstanceOf[js.Any])
    
    inline def setMinificationFilterUndefined: Self = StObject.set(x, "minificationFilter", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTranslucent(value: Boolean | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "translucent", js.Any.fromFunction1(value))
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
