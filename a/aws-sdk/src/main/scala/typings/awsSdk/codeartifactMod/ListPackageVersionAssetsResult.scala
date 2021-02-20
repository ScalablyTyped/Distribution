package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPackageVersionAssetsResult extends StObject {
  
  /**
    *  The name of the package that contains the returned package version assets. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.native
  
  /**
    *  The returned list of  AssetSummary  objects. 
    */
  var assets: js.UndefOr[AssetSummaryList] = js.native
  
  /**
    *  The format of the package that contains the returned package version assets. 
    */
  var format: js.UndefOr[PackageFormat] = js.native
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  The version of the package associated with the returned assets. 
    */
  var version: js.UndefOr[PackageVersion] = js.native
  
  /**
    *  The current revision associated with the package version. 
    */
  var versionRevision: js.UndefOr[PackageVersionRevision] = js.native
}
object ListPackageVersionAssetsResult {
  
  @scala.inline
  def apply(): ListPackageVersionAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackageVersionAssetsResult]
  }
  
  @scala.inline
  implicit class ListPackageVersionAssetsResultMutableBuilder[Self <: ListPackageVersionAssetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: AssetSummaryList): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    @scala.inline
    def setAssetsVarargs(value: AssetSummary*): Self = StObject.set(x, "assets", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionRevision(value: PackageVersionRevision): Self = StObject.set(x, "versionRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionRevisionUndefined: Self = StObject.set(x, "versionRevision", js.undefined)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
