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
  def apply(
    ImportAssetFromSignedUrlJobErrorDetails: ImportAssetFromSignedUrlJobErrorDetails = null,
    ImportAssetsFromS3JobErrorDetails: ListOfAssetSourceEntry = null
  ): Details = {
    val __obj = js.Dynamic.literal()
    if (ImportAssetFromSignedUrlJobErrorDetails != null) __obj.updateDynamic("ImportAssetFromSignedUrlJobErrorDetails")(ImportAssetFromSignedUrlJobErrorDetails.asInstanceOf[js.Any])
    if (ImportAssetsFromS3JobErrorDetails != null) __obj.updateDynamic("ImportAssetsFromS3JobErrorDetails")(ImportAssetsFromS3JobErrorDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

