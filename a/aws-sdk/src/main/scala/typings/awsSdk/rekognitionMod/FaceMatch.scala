package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceMatch extends StObject {
  
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the source image, and external image ID that you assigned.
    */
  var Face: js.UndefOr[typings.awsSdk.rekognitionMod.Face] = js.native
  
  /**
    * Confidence in the match of this face with the input face.
    */
  var Similarity: js.UndefOr[Percent] = js.native
}
object FaceMatch {
  
  @scala.inline
  def apply(): FaceMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceMatch]
  }
  
  @scala.inline
  implicit class FaceMatchMutableBuilder[Self <: FaceMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFace(value: Face): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    @scala.inline
    def setSimilarity(value: Percent): Self = StObject.set(x, "Similarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimilarityUndefined: Self = StObject.set(x, "Similarity", js.undefined)
  }
}
