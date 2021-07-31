package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonDetail extends StObject {
  
  /**
    * Bounding box around the detected person.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.undefined
  
  /**
    * Face details for the detected person.
    */
  var Face: js.UndefOr[FaceDetail] = js.undefined
  
  /**
    * Identifier for the person detected person within a video. Use to keep track of the person throughout the video. The identifier is not stored by Amazon Rekognition.
    */
  var Index: js.UndefOr[PersonIndex] = js.undefined
}
object PersonDetail {
  
  @scala.inline
  def apply(): PersonDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonDetail]
  }
  
  @scala.inline
  implicit class PersonDetailMutableBuilder[Self <: PersonDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    @scala.inline
    def setFace(value: FaceDetail): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    @scala.inline
    def setIndex(value: PersonIndex): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
  }
}
