package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceMatch extends js.Object {
  
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
  implicit class FaceMatchOps[Self <: FaceMatch] (val x: Self) extends AnyVal {
    
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
    def setFace(value: Face): Self = this.set("Face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFace: Self = this.set("Face", js.undefined)
    
    @scala.inline
    def setSimilarity(value: Percent): Self = this.set("Similarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimilarity: Self = this.set("Similarity", js.undefined)
  }
}
