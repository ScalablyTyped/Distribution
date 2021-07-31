package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeCelebritiesResponse extends StObject {
  
  /**
    * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 64 celebrities in an image.
    */
  var CelebrityFaces: js.UndefOr[CelebrityList] = js.undefined
  
  /**
    * The orientation of the input image (counterclockwise direction). If your application displays the image, you can use this value to correct the orientation. The bounding box coordinates returned in CelebrityFaces and UnrecognizedFaces represent face locations before the image orientation is corrected.   If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value of OrientationCorrection is null. The CelebrityFaces and UnrecognizedFaces bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata.  
    */
  var OrientationCorrection: js.UndefOr[typings.awsSdk.rekognitionMod.OrientationCorrection] = js.undefined
  
  /**
    * Details about each unrecognized face in the image.
    */
  var UnrecognizedFaces: js.UndefOr[ComparedFaceList] = js.undefined
}
object RecognizeCelebritiesResponse {
  
  @scala.inline
  def apply(): RecognizeCelebritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognizeCelebritiesResponse]
  }
  
  @scala.inline
  implicit class RecognizeCelebritiesResponseMutableBuilder[Self <: RecognizeCelebritiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCelebrityFaces(value: CelebrityList): Self = StObject.set(x, "CelebrityFaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCelebrityFacesUndefined: Self = StObject.set(x, "CelebrityFaces", js.undefined)
    
    @scala.inline
    def setCelebrityFacesVarargs(value: Celebrity*): Self = StObject.set(x, "CelebrityFaces", js.Array(value :_*))
    
    @scala.inline
    def setOrientationCorrection(value: OrientationCorrection): Self = StObject.set(x, "OrientationCorrection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationCorrectionUndefined: Self = StObject.set(x, "OrientationCorrection", js.undefined)
    
    @scala.inline
    def setUnrecognizedFaces(value: ComparedFaceList): Self = StObject.set(x, "UnrecognizedFaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnrecognizedFacesUndefined: Self = StObject.set(x, "UnrecognizedFaces", js.undefined)
    
    @scala.inline
    def setUnrecognizedFacesVarargs(value: ComparedFace*): Self = StObject.set(x, "UnrecognizedFaces", js.Array(value :_*))
  }
}
