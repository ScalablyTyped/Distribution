package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BSphereRadiusFactor extends js.Object {
  
  var bSphereRadiusFactor: js.UndefOr[Double] = js.native
  
  var boundingSphereOnly: js.UndefOr[Boolean] = js.native
  
  var enableDepthSort: js.UndefOr[Boolean] = js.native
  
  var enableMultiMaterial: js.UndefOr[Boolean] = js.native
  
  var expandable: js.UndefOr[Boolean] = js.native
  
  var isPickable: js.UndefOr[Boolean] = js.native
  
  var particleIntersection: js.UndefOr[Boolean] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var useModelMaterial: js.UndefOr[Boolean] = js.native
}
object BSphereRadiusFactor {
  
  @scala.inline
  def apply(): BSphereRadiusFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BSphereRadiusFactor]
  }
  
  @scala.inline
  implicit class BSphereRadiusFactorOps[Self <: BSphereRadiusFactor] (val x: Self) extends AnyVal {
    
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
    def setBSphereRadiusFactor(value: Double): Self = this.set("bSphereRadiusFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBSphereRadiusFactor: Self = this.set("bSphereRadiusFactor", js.undefined)
    
    @scala.inline
    def setBoundingSphereOnly(value: Boolean): Self = this.set("boundingSphereOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingSphereOnly: Self = this.set("boundingSphereOnly", js.undefined)
    
    @scala.inline
    def setEnableDepthSort(value: Boolean): Self = this.set("enableDepthSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDepthSort: Self = this.set("enableDepthSort", js.undefined)
    
    @scala.inline
    def setEnableMultiMaterial(value: Boolean): Self = this.set("enableMultiMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMultiMaterial: Self = this.set("enableMultiMaterial", js.undefined)
    
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    
    @scala.inline
    def setIsPickable(value: Boolean): Self = this.set("isPickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPickable: Self = this.set("isPickable", js.undefined)
    
    @scala.inline
    def setParticleIntersection(value: Boolean): Self = this.set("particleIntersection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticleIntersection: Self = this.set("particleIntersection", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
    
    @scala.inline
    def setUseModelMaterial(value: Boolean): Self = this.set("useModelMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseModelMaterial: Self = this.set("useModelMaterial", js.undefined)
  }
}
