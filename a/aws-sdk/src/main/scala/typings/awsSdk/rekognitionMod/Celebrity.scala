package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Celebrity extends js.Object {
  /**
    * Provides information about the celebrity's face, such as its location on the image.
    */
  var Face: js.UndefOr[ComparedFace] = js.native
  /**
    * A unique identifier for the celebrity. 
    */
  var Id: js.UndefOr[RekognitionUniqueId] = js.native
  /**
    * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
    */
  var MatchConfidence: js.UndefOr[Percent] = js.native
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of URLs pointing to additional information about the celebrity. If there is no additional information about the celebrity, this list is empty.
    */
  var Urls: js.UndefOr[typings.awsSdk.rekognitionMod.Urls] = js.native
}

object Celebrity {
  @scala.inline
  def apply(): Celebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Celebrity]
  }
  @scala.inline
  implicit class CelebrityOps[Self <: Celebrity] (val x: Self) extends AnyVal {
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
    def setFace(value: ComparedFace): Self = this.set("Face", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFace: Self = this.set("Face", js.undefined)
    @scala.inline
    def setId(value: RekognitionUniqueId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setMatchConfidence(value: Percent): Self = this.set("MatchConfidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchConfidence: Self = this.set("MatchConfidence", js.undefined)
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

