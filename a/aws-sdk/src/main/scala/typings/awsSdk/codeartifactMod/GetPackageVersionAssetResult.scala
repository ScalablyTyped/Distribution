package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPackageVersionAssetResult extends js.Object {
  /**
    *  The binary file, or asset, that is downloaded.
    */
  var asset: js.UndefOr[Asset] = js.native
  /**
    *  The name of the asset that is downloaded. 
    */
  var assetName: js.UndefOr[AssetName] = js.native
  /**
    *  A string that contains the package version (for example, 3.5.2). 
    */
  var packageVersion: js.UndefOr[PackageVersion] = js.native
  /**
    *  The name of the package version revision that contains the downloaded asset. 
    */
  var packageVersionRevision: js.UndefOr[PackageVersionRevision] = js.native
}

object GetPackageVersionAssetResult {
  @scala.inline
  def apply(
    asset: Asset = null,
    assetName: AssetName = null,
    packageVersion: PackageVersion = null,
    packageVersionRevision: PackageVersionRevision = null
  ): GetPackageVersionAssetResult = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (assetName != null) __obj.updateDynamic("assetName")(assetName.asInstanceOf[js.Any])
    if (packageVersion != null) __obj.updateDynamic("packageVersion")(packageVersion.asInstanceOf[js.Any])
    if (packageVersionRevision != null) __obj.updateDynamic("packageVersionRevision")(packageVersionRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPackageVersionAssetResult]
  }
}

