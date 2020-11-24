package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComparedFace extends js.Object {
  
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
  implicit class ComparedFaceOps[Self <: ComparedFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = this.set("BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBox: Self = this.set("BoundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Percent): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    
    @scala.inline
    def setLandmarksVarargs(value: Landmark*): Self = this.set("Landmarks", js.Array(value :_*))
    
    @scala.inline
    def setLandmarks(value: Landmarks): Self = this.set("Landmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandmarks: Self = this.set("Landmarks", js.undefined)
    
    @scala.inline
    def setPose(value: Pose): Self = this.set("Pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePose: Self = this.set("Pose", js.undefined)
    
    @scala.inline
    def setQuality(value: ImageQuality): Self = this.set("Quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("Quality", js.undefined)
  }
}
