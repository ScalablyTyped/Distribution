package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectFacesResponse extends StObject {
  
  /**
    * Details of each face found in the image. 
    */
  var FaceDetails: js.UndefOr[FaceDetailList] = js.native
  
  /**
    * The value of OrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var OrientationCorrection: js.UndefOr[typings.awsSdk.rekognitionMod.OrientationCorrection] = js.native
}
object DetectFacesResponse {
  
  @scala.inline
  def apply(): DetectFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectFacesResponse]
  }
  
  @scala.inline
  implicit class DetectFacesResponseMutableBuilder[Self <: DetectFacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaceDetails(value: FaceDetailList): Self = StObject.set(x, "FaceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceDetailsUndefined: Self = StObject.set(x, "FaceDetails", js.undefined)
    
    @scala.inline
    def setFaceDetailsVarargs(value: FaceDetail*): Self = StObject.set(x, "FaceDetails", js.Array(value :_*))
    
    @scala.inline
    def setOrientationCorrection(value: OrientationCorrection): Self = StObject.set(x, "OrientationCorrection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationCorrectionUndefined: Self = StObject.set(x, "OrientationCorrection", js.undefined)
  }
}
