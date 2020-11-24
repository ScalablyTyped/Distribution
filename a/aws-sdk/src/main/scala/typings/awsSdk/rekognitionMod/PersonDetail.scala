package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonDetail extends js.Object {
  
  /**
    * Bounding box around the detected person.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  
  /**
    * Face details for the detected person.
    */
  var Face: js.UndefOr[FaceDetail] = js.native
  
  /**
    * Identifier for the person detected person within a video. Use to keep track of the person throughout the video. The identifier is not stored by Amazon Rekognition.
    */
  var Index: js.UndefOr[PersonIndex] = js.native
}
object PersonDetail {
  
  @scala.inline
  def apply(): PersonDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonDetail]
  }
  
  @scala.inline
  implicit class PersonDetailOps[Self <: PersonDetail] (val x: Self) extends AnyVal {
    
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
    def setFace(value: FaceDetail): Self = this.set("Face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFace: Self = this.set("Face", js.undefined)
    
    @scala.inline
    def setIndex(value: PersonIndex): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("Index", js.undefined)
  }
}
