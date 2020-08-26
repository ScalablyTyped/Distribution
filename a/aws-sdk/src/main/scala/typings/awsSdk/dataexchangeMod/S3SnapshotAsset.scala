package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SnapshotAsset extends js.Object {
  /**
    * The size of the S3 object that is the object.
    */
  var Size: doubleMin0 = js.native
}

object S3SnapshotAsset {
  @scala.inline
  def apply(Size: doubleMin0): S3SnapshotAsset = {
    val __obj = js.Dynamic.literal(Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SnapshotAsset]
  }
  @scala.inline
  implicit class S3SnapshotAssetOps[Self <: S3SnapshotAsset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSize(value: doubleMin0): Self = this.set("Size", value.asInstanceOf[js.Any])
  }
  
}

