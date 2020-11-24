package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Face extends js.Object {
  
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree).
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * Identifier that you assign to all the faces in the input image.
    */
  var ExternalImageId: js.UndefOr[typings.awsSdk.rekognitionMod.ExternalImageId] = js.native
  
  /**
    * Unique identifier that Amazon Rekognition assigns to the face.
    */
  var FaceId: js.UndefOr[typings.awsSdk.rekognitionMod.FaceId] = js.native
  
  /**
    * Unique identifier that Amazon Rekognition assigns to the input image.
    */
  var ImageId: js.UndefOr[typings.awsSdk.rekognitionMod.ImageId] = js.native
}
object Face {
  
  @scala.inline
  def apply(): Face = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Face]
  }
  
  @scala.inline
  implicit class FaceOps[Self <: Face] (val x: Self) extends AnyVal {
    
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
    def setExternalImageId(value: ExternalImageId): Self = this.set("ExternalImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalImageId: Self = this.set("ExternalImageId", js.undefined)
    
    @scala.inline
    def setFaceId(value: FaceId): Self = this.set("FaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceId: Self = this.set("FaceId", js.undefined)
    
    @scala.inline
    def setImageId(value: ImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
  }
}
