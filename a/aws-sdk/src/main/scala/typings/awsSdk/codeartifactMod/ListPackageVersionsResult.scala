package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPackageVersionsResult extends StObject {
  
  /**
    *  The name of the package. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.native
  
  /**
    *  The default package version to display. This depends on the package format:     For Maven and PyPI packages, it's the most recently published package version.     For npm packages, it's the version referenced by the latest tag. If the latest tag is not set, it's the most recently published package version.   
    */
  var defaultDisplayVersion: js.UndefOr[PackageVersion] = js.native
  
  /**
    *  A format of the package. Valid package format values are:     npm     pypi     maven   
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
    *  The returned list of  PackageVersionSummary  objects. 
    */
  var versions: js.UndefOr[PackageVersionSummaryList] = js.native
}
object ListPackageVersionsResult {
  
  @scala.inline
  def apply(): ListPackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackageVersionsResult]
  }
  
  @scala.inline
  implicit class ListPackageVersionsResultMutableBuilder[Self <: ListPackageVersionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultDisplayVersion(value: PackageVersion): Self = StObject.set(x, "defaultDisplayVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDisplayVersionUndefined: Self = StObject.set(x, "defaultDisplayVersion", js.undefined)
    
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
    def setVersions(value: PackageVersionSummaryList): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: PackageVersionSummary*): Self = StObject.set(x, "versions", js.Array(value :_*))
    
    @scala.inline
    def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
