package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceRecord extends StObject {
  
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned. 
    */
  var Face: js.UndefOr[typings.awsSdk.rekognitionMod.Face] = js.native
  
  /**
    * Structure containing attributes of the face that the algorithm detected.
    */
  var FaceDetail: js.UndefOr[typings.awsSdk.rekognitionMod.FaceDetail] = js.native
}
object FaceRecord {
  
  @scala.inline
  def apply(): FaceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceRecord]
  }
  
  @scala.inline
  implicit class FaceRecordMutableBuilder[Self <: FaceRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFace(value: Face): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceDetail(value: FaceDetail): Self = StObject.set(x, "FaceDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceDetailUndefined: Self = StObject.set(x, "FaceDetail", js.undefined)
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
  }
}
