package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceDetail extends StObject {
  
  /**
    * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the highest estimated age.
    */
  var AgeRange: js.UndefOr[typings.awsSdk.rekognitionMod.AgeRange] = js.undefined
  
  /**
    * Indicates whether or not the face has a beard, and the confidence level in the determination.
    */
  var Beard: js.UndefOr[typings.awsSdk.rekognitionMod.Beard] = js.undefined
  
  /**
    * Bounding box of the face. Default attribute.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.undefined
  
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default attribute.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The emotions that appear to be expressed on the face, and the confidence level in the determination. The API is only making a determination of the physical appearance of a person's face. It is not a determination of the person’s internal emotional state and should not be used in such a way. For example, a person pretending to have a sad face might not be sad emotionally.
    */
  var Emotions: js.UndefOr[typings.awsSdk.rekognitionMod.Emotions] = js.undefined
  
  /**
    * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
    */
  var Eyeglasses: js.UndefOr[typings.awsSdk.rekognitionMod.Eyeglasses] = js.undefined
  
  /**
    * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
    */
  var EyesOpen: js.UndefOr[EyeOpen] = js.undefined
  
  /**
    * The predicted gender of a detected face. 
    */
  var Gender: js.UndefOr[typings.awsSdk.rekognitionMod.Gender] = js.undefined
  
  /**
    * Indicates the location of landmarks on the face. Default attribute.
    */
  var Landmarks: js.UndefOr[typings.awsSdk.rekognitionMod.Landmarks] = js.undefined
  
  /**
    * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
    */
  var MouthOpen: js.UndefOr[typings.awsSdk.rekognitionMod.MouthOpen] = js.undefined
  
  /**
    * Indicates whether or not the face has a mustache, and the confidence level in the determination.
    */
  var Mustache: js.UndefOr[typings.awsSdk.rekognitionMod.Mustache] = js.undefined
  
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
    */
  var Pose: js.UndefOr[typings.awsSdk.rekognitionMod.Pose] = js.undefined
  
  /**
    * Identifies image brightness and sharpness. Default attribute.
    */
  var Quality: js.UndefOr[ImageQuality] = js.undefined
  
  /**
    * Indicates whether or not the face is smiling, and the confidence level in the determination.
    */
  var Smile: js.UndefOr[typings.awsSdk.rekognitionMod.Smile] = js.undefined
  
  /**
    * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
    */
  var Sunglasses: js.UndefOr[typings.awsSdk.rekognitionMod.Sunglasses] = js.undefined
}
object FaceDetail {
  
  inline def apply(): FaceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetail]
  }
  
  extension [Self <: FaceDetail](x: Self) {
    
    inline def setAgeRange(value: AgeRange): Self = StObject.set(x, "AgeRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "AgeRange", js.undefined)
    
    inline def setBeard(value: Beard): Self = StObject.set(x, "Beard", value.asInstanceOf[js.Any])
    
    inline def setBeardUndefined: Self = StObject.set(x, "Beard", js.undefined)
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setEmotions(value: Emotions): Self = StObject.set(x, "Emotions", value.asInstanceOf[js.Any])
    
    inline def setEmotionsUndefined: Self = StObject.set(x, "Emotions", js.undefined)
    
    inline def setEmotionsVarargs(value: Emotion*): Self = StObject.set(x, "Emotions", js.Array(value*))
    
    inline def setEyeglasses(value: Eyeglasses): Self = StObject.set(x, "Eyeglasses", value.asInstanceOf[js.Any])
    
    inline def setEyeglassesUndefined: Self = StObject.set(x, "Eyeglasses", js.undefined)
    
    inline def setEyesOpen(value: EyeOpen): Self = StObject.set(x, "EyesOpen", value.asInstanceOf[js.Any])
    
    inline def setEyesOpenUndefined: Self = StObject.set(x, "EyesOpen", js.undefined)
    
    inline def setGender(value: Gender): Self = StObject.set(x, "Gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "Gender", js.undefined)
    
    inline def setLandmarks(value: Landmarks): Self = StObject.set(x, "Landmarks", value.asInstanceOf[js.Any])
    
    inline def setLandmarksUndefined: Self = StObject.set(x, "Landmarks", js.undefined)
    
    inline def setLandmarksVarargs(value: Landmark*): Self = StObject.set(x, "Landmarks", js.Array(value*))
    
    inline def setMouthOpen(value: MouthOpen): Self = StObject.set(x, "MouthOpen", value.asInstanceOf[js.Any])
    
    inline def setMouthOpenUndefined: Self = StObject.set(x, "MouthOpen", js.undefined)
    
    inline def setMustache(value: Mustache): Self = StObject.set(x, "Mustache", value.asInstanceOf[js.Any])
    
    inline def setMustacheUndefined: Self = StObject.set(x, "Mustache", js.undefined)
    
    inline def setPose(value: Pose): Self = StObject.set(x, "Pose", value.asInstanceOf[js.Any])
    
    inline def setPoseUndefined: Self = StObject.set(x, "Pose", js.undefined)
    
    inline def setQuality(value: ImageQuality): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "Quality", js.undefined)
    
    inline def setSmile(value: Smile): Self = StObject.set(x, "Smile", value.asInstanceOf[js.Any])
    
    inline def setSmileUndefined: Self = StObject.set(x, "Smile", js.undefined)
    
    inline def setSunglasses(value: Sunglasses): Self = StObject.set(x, "Sunglasses", value.asInstanceOf[js.Any])
    
    inline def setSunglassesUndefined: Self = StObject.set(x, "Sunglasses", js.undefined)
  }
}
