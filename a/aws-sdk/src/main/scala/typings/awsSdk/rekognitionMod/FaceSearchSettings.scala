package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceSearchSettings extends js.Object {
  /**
    * The ID of a collection that contains faces that you want to search for.
    */
  var CollectionId: js.UndefOr[typings.awsSdk.rekognitionMod.CollectionId] = js.native
  /**
    * Minimum face match confidence score that must be met to return a result for a recognized face. Default is 80. 0 is the lowest confidence. 100 is the highest confidence.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.native
}

object FaceSearchSettings {
  @scala.inline
  def apply(): FaceSearchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceSearchSettings]
  }
  @scala.inline
  implicit class FaceSearchSettingsOps[Self <: FaceSearchSettings] (val x: Self) extends AnyVal {
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
    def setCollectionId(value: CollectionId): Self = this.set("CollectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionId: Self = this.set("CollectionId", js.undefined)
    @scala.inline
    def setFaceMatchThreshold(value: Percent): Self = this.set("FaceMatchThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceMatchThreshold: Self = this.set("FaceMatchThreshold", js.undefined)
  }
  
}

