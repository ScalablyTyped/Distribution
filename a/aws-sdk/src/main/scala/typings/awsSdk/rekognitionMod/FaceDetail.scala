package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceDetail extends js.Object {
  
  /**
    * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the highest estimated age.
    */
  var AgeRange: js.UndefOr[typings.awsSdk.rekognitionMod.AgeRange] = js.native
  
  /**
    * Indicates whether or not the face has a beard, and the confidence level in the determination.
    */
  var Beard: js.UndefOr[typings.awsSdk.rekognitionMod.Beard] = js.native
  
  /**
    * Bounding box of the face. Default attribute.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default attribute.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * The emotions that appear to be expressed on the face, and the confidence level in the determination. The API is only making a determination of the physical appearance of a person's face. It is not a determination of the person’s internal emotional state and should not be used in such a way. For example, a person pretending to have a sad face might not be sad emotionally.
    */
  var Emotions: js.UndefOr[typings.awsSdk.rekognitionMod.Emotions] = js.native
  
  /**
    * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
    */
  var Eyeglasses: js.UndefOr[typings.awsSdk.rekognitionMod.Eyeglasses] = js.native
  
  /**
    * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
    */
  var EyesOpen: js.UndefOr[EyeOpen] = js.native
  
  /**
    * The predicted gender of a detected face. 
    */
  var Gender: js.UndefOr[typings.awsSdk.rekognitionMod.Gender] = js.native
  
  /**
    * Indicates the location of landmarks on the face. Default attribute.
    */
  var Landmarks: js.UndefOr[typings.awsSdk.rekognitionMod.Landmarks] = js.native
  
  /**
    * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
    */
  var MouthOpen: js.UndefOr[typings.awsSdk.rekognitionMod.MouthOpen] = js.native
  
  /**
    * Indicates whether or not the face has a mustache, and the confidence level in the determination.
    */
  var Mustache: js.UndefOr[typings.awsSdk.rekognitionMod.Mustache] = js.native
  
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
    */
  var Pose: js.UndefOr[typings.awsSdk.rekognitionMod.Pose] = js.native
  
  /**
    * Identifies image brightness and sharpness. Default attribute.
    */
  var Quality: js.UndefOr[ImageQuality] = js.native
  
  /**
    * Indicates whether or not the face is smiling, and the confidence level in the determination.
    */
  var Smile: js.UndefOr[typings.awsSdk.rekognitionMod.Smile] = js.native
  
  /**
    * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
    */
  var Sunglasses: js.UndefOr[typings.awsSdk.rekognitionMod.Sunglasses] = js.native
}
object FaceDetail {
  
  @scala.inline
  def apply(): FaceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetail]
  }
  
  @scala.inline
  implicit class FaceDetailOps[Self <: FaceDetail] (val x: Self) extends AnyVal {
    
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
    def setAgeRange(value: AgeRange): Self = this.set("AgeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeRange: Self = this.set("AgeRange", js.undefined)
    
    @scala.inline
    def setBeard(value: Beard): Self = this.set("Beard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeard: Self = this.set("Beard", js.undefined)
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = this.set("BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBox: Self = this.set("BoundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Percent): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    
    @scala.inline
    def setEmotionsVarargs(value: Emotion*): Self = this.set("Emotions", js.Array(value :_*))
    
    @scala.inline
    def setEmotions(value: Emotions): Self = this.set("Emotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmotions: Self = this.set("Emotions", js.undefined)
    
    @scala.inline
    def setEyeglasses(value: Eyeglasses): Self = this.set("Eyeglasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEyeglasses: Self = this.set("Eyeglasses", js.undefined)
    
    @scala.inline
    def setEyesOpen(value: EyeOpen): Self = this.set("EyesOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEyesOpen: Self = this.set("EyesOpen", js.undefined)
    
    @scala.inline
    def setGender(value: Gender): Self = this.set("Gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("Gender", js.undefined)
    
    @scala.inline
    def setLandmarksVarargs(value: Landmark*): Self = this.set("Landmarks", js.Array(value :_*))
    
    @scala.inline
    def setLandmarks(value: Landmarks): Self = this.set("Landmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandmarks: Self = this.set("Landmarks", js.undefined)
    
    @scala.inline
    def setMouthOpen(value: MouthOpen): Self = this.set("MouthOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouthOpen: Self = this.set("MouthOpen", js.undefined)
    
    @scala.inline
    def setMustache(value: Mustache): Self = this.set("Mustache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMustache: Self = this.set("Mustache", js.undefined)
    
    @scala.inline
    def setPose(value: Pose): Self = this.set("Pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePose: Self = this.set("Pose", js.undefined)
    
    @scala.inline
    def setQuality(value: ImageQuality): Self = this.set("Quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("Quality", js.undefined)
    
    @scala.inline
    def setSmile(value: Smile): Self = this.set("Smile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmile: Self = this.set("Smile", js.undefined)
    
    @scala.inline
    def setSunglasses(value: Sunglasses): Self = this.set("Sunglasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSunglasses: Self = this.set("Sunglasses", js.undefined)
  }
}
