package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportAssetFromSignedUrlJobErrorDetails extends js.Object {
  var AssetName: typings.awsSdk.dataexchangeMod.AssetName = js.native
}

object ImportAssetFromSignedUrlJobErrorDetails {
  @scala.inline
  def apply(AssetName: AssetName): ImportAssetFromSignedUrlJobErrorDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlJobErrorDetails]
  }
  @scala.inline
  implicit class ImportAssetFromSignedUrlJobErrorDetailsOps[Self <: ImportAssetFromSignedUrlJobErrorDetails] (val x: Self) extends AnyVal {
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
    def setAssetName(value: AssetName): Self = this.set("AssetName", value.asInstanceOf[js.Any])
  }
  
}

