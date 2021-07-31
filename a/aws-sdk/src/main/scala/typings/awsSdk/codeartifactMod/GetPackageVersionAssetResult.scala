package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPackageVersionAssetResult extends StObject {
  
  /**
    *  The binary file, or asset, that is downloaded.
    */
  var asset: js.UndefOr[Asset] = js.undefined
  
  /**
    *  The name of the asset that is downloaded. 
    */
  var assetName: js.UndefOr[AssetName] = js.undefined
  
  /**
    *  A string that contains the package version (for example, 3.5.2). 
    */
  var packageVersion: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    *  The name of the package version revision that contains the downloaded asset. 
    */
  var packageVersionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
}
object GetPackageVersionAssetResult {
  
  @scala.inline
  def apply(): GetPackageVersionAssetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionAssetResult]
  }
  
  @scala.inline
  implicit class GetPackageVersionAssetResultMutableBuilder[Self <: GetPackageVersionAssetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetName(value: AssetName): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetNameUndefined: Self = StObject.set(x, "assetName", js.undefined)
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    @scala.inline
    def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageVersionRevision(value: PackageVersionRevision): Self = StObject.set(x, "packageVersionRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageVersionRevisionUndefined: Self = StObject.set(x, "packageVersionRevision", js.undefined)
    
    @scala.inline
    def setPackageVersionUndefined: Self = StObject.set(x, "packageVersion", js.undefined)
  }
}
