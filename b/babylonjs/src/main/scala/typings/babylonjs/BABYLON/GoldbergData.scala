package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoldbergData extends StObject {
  
  /**
    * Defines the number of adjacent faces per goldberg faces
    */
  var adjacentFaces: js.Array[js.Array[Double]]
  
  /**
    * The list of Goldberg faces centers
    */
  var faceCenters: js.Array[Vector3]
  
  /**
    * The list of Goldberg faces colors
    */
  var faceColors: js.Array[Color4]
  
  /**
    * The list of Goldberg faces Y axis
    */
  var faceXaxis: js.Array[Vector3]
  
  /**
    * The list of Goldberg faces X axis
    */
  var faceYaxis: js.Array[Vector3]
  
  /**
    * The list of Goldberg faces Z axis
    */
  var faceZaxis: js.Array[Vector3]
  
  /**
    * Defines the total number of goldberg faces
    */
  var nbFaces: Double
  
  /**
    * Defines the number of goldberg faces at the pole
    */
  var nbFacesAtPole: Double
  
  /**
    * Defines the number of shared faces
    */
  var nbSharedFaces: Double
  
  /**
    * Defines the number of unshared faces
    */
  var nbUnsharedFaces: Double
}
object GoldbergData {
  
  inline def apply(
    adjacentFaces: js.Array[js.Array[Double]],
    faceCenters: js.Array[Vector3],
    faceColors: js.Array[Color4],
    faceXaxis: js.Array[Vector3],
    faceYaxis: js.Array[Vector3],
    faceZaxis: js.Array[Vector3],
    nbFaces: Double,
    nbFacesAtPole: Double,
    nbSharedFaces: Double,
    nbUnsharedFaces: Double
  ): GoldbergData = {
    val __obj = js.Dynamic.literal(adjacentFaces = adjacentFaces.asInstanceOf[js.Any], faceCenters = faceCenters.asInstanceOf[js.Any], faceColors = faceColors.asInstanceOf[js.Any], faceXaxis = faceXaxis.asInstanceOf[js.Any], faceYaxis = faceYaxis.asInstanceOf[js.Any], faceZaxis = faceZaxis.asInstanceOf[js.Any], nbFaces = nbFaces.asInstanceOf[js.Any], nbFacesAtPole = nbFacesAtPole.asInstanceOf[js.Any], nbSharedFaces = nbSharedFaces.asInstanceOf[js.Any], nbUnsharedFaces = nbUnsharedFaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoldbergData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoldbergData] (val x: Self) extends AnyVal {
    
    inline def setAdjacentFaces(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "adjacentFaces", value.asInstanceOf[js.Any])
    
    inline def setAdjacentFacesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "adjacentFaces", js.Array(value*))
    
    inline def setFaceCenters(value: js.Array[Vector3]): Self = StObject.set(x, "faceCenters", value.asInstanceOf[js.Any])
    
    inline def setFaceCentersVarargs(value: Vector3*): Self = StObject.set(x, "faceCenters", js.Array(value*))
    
    inline def setFaceColors(value: js.Array[Color4]): Self = StObject.set(x, "faceColors", value.asInstanceOf[js.Any])
    
    inline def setFaceColorsVarargs(value: Color4*): Self = StObject.set(x, "faceColors", js.Array(value*))
    
    inline def setFaceXaxis(value: js.Array[Vector3]): Self = StObject.set(x, "faceXaxis", value.asInstanceOf[js.Any])
    
    inline def setFaceXaxisVarargs(value: Vector3*): Self = StObject.set(x, "faceXaxis", js.Array(value*))
    
    inline def setFaceYaxis(value: js.Array[Vector3]): Self = StObject.set(x, "faceYaxis", value.asInstanceOf[js.Any])
    
    inline def setFaceYaxisVarargs(value: Vector3*): Self = StObject.set(x, "faceYaxis", js.Array(value*))
    
    inline def setFaceZaxis(value: js.Array[Vector3]): Self = StObject.set(x, "faceZaxis", value.asInstanceOf[js.Any])
    
    inline def setFaceZaxisVarargs(value: Vector3*): Self = StObject.set(x, "faceZaxis", js.Array(value*))
    
    inline def setNbFaces(value: Double): Self = StObject.set(x, "nbFaces", value.asInstanceOf[js.Any])
    
    inline def setNbFacesAtPole(value: Double): Self = StObject.set(x, "nbFacesAtPole", value.asInstanceOf[js.Any])
    
    inline def setNbSharedFaces(value: Double): Self = StObject.set(x, "nbSharedFaces", value.asInstanceOf[js.Any])
    
    inline def setNbUnsharedFaces(value: Double): Self = StObject.set(x, "nbUnsharedFaces", value.asInstanceOf[js.Any])
  }
}
