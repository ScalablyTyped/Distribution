package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthSortedParticle extends StObject {
  
  /**
    * Particle index
    */
  var idx: Double
  
  /**
    * Index of the particle in the "indices" array
    */
  var ind: Double
  
  /**
    * Length of the particle shape in the "indices" array
    */
  var indicesLength: Double
  
  /**
    * Material index when used with MultiMaterials
    */
  var materialIndex: Double
  
  /**
    * Squared distance from the particle to the camera
    */
  var sqDistance: Double
}
object DepthSortedParticle {
  
  inline def apply(idx: Double, ind: Double, indicesLength: Double, materialIndex: Double, sqDistance: Double): DepthSortedParticle = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], ind = ind.asInstanceOf[js.Any], indicesLength = indicesLength.asInstanceOf[js.Any], materialIndex = materialIndex.asInstanceOf[js.Any], sqDistance = sqDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthSortedParticle]
  }
  
  extension [Self <: DepthSortedParticle](x: Self) {
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setInd(value: Double): Self = StObject.set(x, "ind", value.asInstanceOf[js.Any])
    
    inline def setIndicesLength(value: Double): Self = StObject.set(x, "indicesLength", value.asInstanceOf[js.Any])
    
    inline def setMaterialIndex(value: Double): Self = StObject.set(x, "materialIndex", value.asInstanceOf[js.Any])
    
    inline def setSqDistance(value: Double): Self = StObject.set(x, "sqDistance", value.asInstanceOf[js.Any])
  }
}
