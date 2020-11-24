package typings.cesium.anon

import typings.cesium.mod.TextureMagnificationFilter
import typings.cesium.mod.TextureMinificationFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fabric extends js.Object {
  
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
  implicit class FabricOps[Self <: Fabric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFabric(value: js.Any): Self = this.set("fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnificationFilter(value: TextureMagnificationFilter): Self = this.set("magnificationFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagnificationFilter: Self = this.set("magnificationFilter", js.undefined)
    
    @scala.inline
    def setMinificationFilter(value: TextureMinificationFilter): Self = this.set("minificationFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinificationFilter: Self = this.set("minificationFilter", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setTranslucentFunction1(value: /* material */ typings.cesium.mod.Material => Boolean): Self = this.set("translucent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTranslucent(value: Boolean | (js.Function1[/* material */ typings.cesium.mod.Material, Boolean])): Self = this.set("translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
  }
}
