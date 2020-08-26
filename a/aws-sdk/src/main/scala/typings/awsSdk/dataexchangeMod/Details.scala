package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Details extends js.Object {
  var ImportAssetFromSignedUrlJobErrorDetails: js.UndefOr[typings.awsSdk.dataexchangeMod.ImportAssetFromSignedUrlJobErrorDetails] = js.native
  var ImportAssetsFromS3JobErrorDetails: js.UndefOr[ListOfAssetSourceEntry] = js.native
}

object Details {
  @scala.inline
  def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
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
    def setImportAssetFromSignedUrlJobErrorDetails(value: ImportAssetFromSignedUrlJobErrorDetails): Self = this.set("ImportAssetFromSignedUrlJobErrorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportAssetFromSignedUrlJobErrorDetails: Self = this.set("ImportAssetFromSignedUrlJobErrorDetails", js.undefined)
    @scala.inline
    def setImportAssetsFromS3JobErrorDetailsVarargs(value: AssetSourceEntry*): Self = this.set("ImportAssetsFromS3JobErrorDetails", js.Array(value :_*))
    @scala.inline
    def setImportAssetsFromS3JobErrorDetails(value: ListOfAssetSourceEntry): Self = this.set("ImportAssetsFromS3JobErrorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportAssetsFromS3JobErrorDetails: Self = this.set("ImportAssetsFromS3JobErrorDetails", js.undefined)
  }
  
}

