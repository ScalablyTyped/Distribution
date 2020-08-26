package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CelebrityDetail extends js.Object {
  /**
    * Bounding box around the body of a celebrity.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity. 
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * Face details for the recognized celebrity.
    */
  var Face: js.UndefOr[FaceDetail] = js.native
  /**
    * The unique identifier for the celebrity. 
    */
  var Id: js.UndefOr[RekognitionUniqueId] = js.native
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of URLs pointing to additional celebrity information. 
    */
  var Urls: js.UndefOr[typings.awsSdk.rekognitionMod.Urls] = js.native
}

object CelebrityDetail {
  @scala.inline
  def apply(): CelebrityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CelebrityDetail]
  }
  @scala.inline
  implicit class CelebrityDetailOps[Self <: CelebrityDetail] (val x: Self) extends AnyVal {
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
    def setFace(value: FaceDetail): Self = this.set("Face", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFace: Self = this.set("Face", js.undefined)
    @scala.inline
    def setId(value: RekognitionUniqueId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: Url*): Self = this.set("Urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: Urls): Self = this.set("Urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("Urls", js.undefined)
  }
  
}

