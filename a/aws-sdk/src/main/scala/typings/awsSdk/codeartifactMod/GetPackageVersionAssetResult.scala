package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GetPackageVersionAssetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionAssetResult]
  }
  
  @scala.inline
  implicit class GetPackageVersionAssetResultOps[Self <: GetPackageVersionAssetResult] (val x: Self) extends AnyVal {
    
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
    def setAsset(value: Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    
    @scala.inline
    def setAssetName(value: AssetName): Self = this.set("assetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetName: Self = this.set("assetName", js.undefined)
    
    @scala.inline
    def setPackageVersion(value: PackageVersion): Self = this.set("packageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageVersion: Self = this.set("packageVersion", js.undefined)
    
    @scala.inline
    def setPackageVersionRevision(value: PackageVersionRevision): Self = this.set("packageVersionRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageVersionRevision: Self = this.set("packageVersionRevision", js.undefined)
  }
}
