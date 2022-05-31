package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISimplificationSettings extends StObject {
  
  /**
    * Gets or sets the distance when this optimized version should be used
    */
  var distance: Double
  
  /**
    * Gets an already optimized mesh
    */
  var optimizeMesh: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the expected quality
    */
  var quality: Double
}
object ISimplificationSettings {
  
  inline def apply(distance: Double, quality: Double): ISimplificationSettings = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplificationSettings]
  }
  
  extension [Self <: ISimplificationSettings](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setOptimizeMesh(value: Boolean): Self = StObject.set(x, "optimizeMesh", value.asInstanceOf[js.Any])
    
    inline def setOptimizeMeshUndefined: Self = StObject.set(x, "optimizeMesh", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
  }
}
