package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComparedFace extends StObject {
  
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.undefined
  
  /**
    * Level of confidence that what the bounding box contains is a face.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * An array of facial landmarks.
    */
  var Landmarks: js.UndefOr[typings.awsSdk.rekognitionMod.Landmarks] = js.undefined
  
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw.
    */
  var Pose: js.UndefOr[typings.awsSdk.rekognitionMod.Pose] = js.undefined
  
  /**
    * Identifies face image brightness and sharpness. 
    */
  var Quality: js.UndefOr[ImageQuality] = js.undefined
}
object ComparedFace {
  
  inline def apply(): ComparedFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparedFace]
  }
  
  extension [Self <: ComparedFace](x: Self) {
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setLandmarks(value: Landmarks): Self = StObject.set(x, "Landmarks", value.asInstanceOf[js.Any])
    
    inline def setLandmarksUndefined: Self = StObject.set(x, "Landmarks", js.undefined)
    
    inline def setLandmarksVarargs(value: Landmark*): Self = StObject.set(x, "Landmarks", js.Array(value :_*))
    
    inline def setPose(value: Pose): Self = StObject.set(x, "Pose", value.asInstanceOf[js.Any])
    
    inline def setPoseUndefined: Self = StObject.set(x, "Pose", js.undefined)
    
    inline def setQuality(value: ImageQuality): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "Quality", js.undefined)
  }
}
