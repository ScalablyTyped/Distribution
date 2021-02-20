package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComparedFace extends StObject {
  
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  
  /**
    * Level of confidence that what the bounding box contains is a face.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * An array of facial landmarks.
    */
  var Landmarks: js.UndefOr[typings.awsSdk.rekognitionMod.Landmarks] = js.native
  
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw.
    */
  var Pose: js.UndefOr[typings.awsSdk.rekognitionMod.Pose] = js.native
  
  /**
    * Identifies face image brightness and sharpness. 
    */
  var Quality: js.UndefOr[ImageQuality] = js.native
}
object ComparedFace {
  
  @scala.inline
  def apply(): ComparedFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparedFace]
  }
  
  @scala.inline
  implicit class ComparedFaceMutableBuilder[Self <: ComparedFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setLandmarks(value: Landmarks): Self = StObject.set(x, "Landmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandmarksUndefined: Self = StObject.set(x, "Landmarks", js.undefined)
    
    @scala.inline
    def setLandmarksVarargs(value: Landmark*): Self = StObject.set(x, "Landmarks", js.Array(value :_*))
    
    @scala.inline
    def setPose(value: Pose): Self = StObject.set(x, "Pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoseUndefined: Self = StObject.set(x, "Pose", js.undefined)
    
    @scala.inline
    def setQuality(value: ImageQuality): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "Quality", js.undefined)
  }
}
