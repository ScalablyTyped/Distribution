package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BSphereRadiusFactor extends StObject {
  
  var bSphereRadiusFactor: js.UndefOr[Double] = js.undefined
  
  var boundingSphereOnly: js.UndefOr[Boolean] = js.undefined
  
  var enableDepthSort: js.UndefOr[Boolean] = js.undefined
  
  var enableMultiMaterial: js.UndefOr[Boolean] = js.undefined
  
  var expandable: js.UndefOr[Boolean] = js.undefined
  
  var isPickable: js.UndefOr[Boolean] = js.undefined
  
  var particleIntersection: js.UndefOr[Boolean] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
  
  var useModelMaterial: js.UndefOr[Boolean] = js.undefined
}
object BSphereRadiusFactor {
  
  inline def apply(): BSphereRadiusFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BSphereRadiusFactor]
  }
  
  extension [Self <: BSphereRadiusFactor](x: Self) {
    
    inline def setBSphereRadiusFactor(value: Double): Self = StObject.set(x, "bSphereRadiusFactor", value.asInstanceOf[js.Any])
    
    inline def setBSphereRadiusFactorUndefined: Self = StObject.set(x, "bSphereRadiusFactor", js.undefined)
    
    inline def setBoundingSphereOnly(value: Boolean): Self = StObject.set(x, "boundingSphereOnly", value.asInstanceOf[js.Any])
    
    inline def setBoundingSphereOnlyUndefined: Self = StObject.set(x, "boundingSphereOnly", js.undefined)
    
    inline def setEnableDepthSort(value: Boolean): Self = StObject.set(x, "enableDepthSort", value.asInstanceOf[js.Any])
    
    inline def setEnableDepthSortUndefined: Self = StObject.set(x, "enableDepthSort", js.undefined)
    
    inline def setEnableMultiMaterial(value: Boolean): Self = StObject.set(x, "enableMultiMaterial", value.asInstanceOf[js.Any])
    
    inline def setEnableMultiMaterialUndefined: Self = StObject.set(x, "enableMultiMaterial", js.undefined)
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    inline def setIsPickable(value: Boolean): Self = StObject.set(x, "isPickable", value.asInstanceOf[js.Any])
    
    inline def setIsPickableUndefined: Self = StObject.set(x, "isPickable", js.undefined)
    
    inline def setParticleIntersection(value: Boolean): Self = StObject.set(x, "particleIntersection", value.asInstanceOf[js.Any])
    
    inline def setParticleIntersectionUndefined: Self = StObject.set(x, "particleIntersection", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    inline def setUseModelMaterial(value: Boolean): Self = StObject.set(x, "useModelMaterial", value.asInstanceOf[js.Any])
    
    inline def setUseModelMaterialUndefined: Self = StObject.set(x, "useModelMaterial", js.undefined)
  }
}
