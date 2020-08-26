package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundTruthManifest extends js.Object {
  var S3Object: js.UndefOr[typings.awsSdk.rekognitionMod.S3Object] = js.native
}

object GroundTruthManifest {
  @scala.inline
  def apply(): GroundTruthManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundTruthManifest]
  }
  @scala.inline
  implicit class GroundTruthManifestOps[Self <: GroundTruthManifest] (val x: Self) extends AnyVal {
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
    def setS3Object(value: S3Object): Self = this.set("S3Object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Object: Self = this.set("S3Object", js.undefined)
  }
  
}

