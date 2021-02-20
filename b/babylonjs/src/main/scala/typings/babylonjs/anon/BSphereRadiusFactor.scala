package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BSphereRadiusFactor extends StObject {
  
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
  implicit class BSphereRadiusFactorMutableBuilder[Self <: BSphereRadiusFactor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSphereRadiusFactor(value: Double): Self = StObject.set(x, "bSphereRadiusFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSphereRadiusFactorUndefined: Self = StObject.set(x, "bSphereRadiusFactor", js.undefined)
    
    @scala.inline
    def setBoundingSphereOnly(value: Boolean): Self = StObject.set(x, "boundingSphereOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingSphereOnlyUndefined: Self = StObject.set(x, "boundingSphereOnly", js.undefined)
    
    @scala.inline
    def setEnableDepthSort(value: Boolean): Self = StObject.set(x, "enableDepthSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDepthSortUndefined: Self = StObject.set(x, "enableDepthSort", js.undefined)
    
    @scala.inline
    def setEnableMultiMaterial(value: Boolean): Self = StObject.set(x, "enableMultiMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMultiMaterialUndefined: Self = StObject.set(x, "enableMultiMaterial", js.undefined)
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    @scala.inline
    def setIsPickable(value: Boolean): Self = StObject.set(x, "isPickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPickableUndefined: Self = StObject.set(x, "isPickable", js.undefined)
    
    @scala.inline
    def setParticleIntersection(value: Boolean): Self = StObject.set(x, "particleIntersection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticleIntersectionUndefined: Self = StObject.set(x, "particleIntersection", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    @scala.inline
    def setUseModelMaterial(value: Boolean): Self = StObject.set(x, "useModelMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseModelMaterialUndefined: Self = StObject.set(x, "useModelMaterial", js.undefined)
  }
}
