package typings.cesium.anon

import typings.cesium.mod.TextureMagnificationFilter
import typings.cesium.mod.TextureMinificationFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fabric extends StObject {
  
  var fabric: js.Any = js.native
  
  var magnificationFilter: js.UndefOr[TextureMagnificationFilter] = js.native
  
  var minificationFilter: js.UndefOr[TextureMinificationFilter] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var translucent: js.UndefOr[Boolean | (js.Function1[/* material */ typings.cesium.mod.Material, Boolean])] = js.native
}
object Fabric {
  
  @scala.inline
  def apply(fabric: js.Any): Fabric = {
    val __obj = js.Dynamic.literal(fabric = fabric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fabric]
  }
  
  @scala.inline
  implicit class FabricMutableBuilder[Self <: Fabric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFabric(value: js.Any): Self = StObject.set(x, "fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnificationFilter(value: TextureMagnificationFilter): Self = StObject.set(x, "magnificationFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnificationFilterUndefined: Self = StObject.set(x, "magnificationFilter", js.undefined)
    
    @scala.inline
    def setMinificationFilter(value: TextureMinificationFilter): Self = StObject.set(x, "minificationFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinificationFilterUndefined: Self = StObject.set(x, "minificationFilter", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean | (js.Function1[/* material */ typings.cesium.mod.Material, Boolean])): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentFunction1(value: /* material */ typings.cesium.mod.Material => Boolean): Self = StObject.set(x, "translucent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
