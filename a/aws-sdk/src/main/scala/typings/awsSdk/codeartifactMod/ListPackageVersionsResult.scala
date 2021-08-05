package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackageVersionsResult extends StObject {
  
  /**
    *  The name of the package. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.undefined
  
  /**
    *  The default package version to display. This depends on the package format:     For Maven and PyPI packages, it's the most recently published package version.     For npm packages, it's the version referenced by the latest tag. If the latest tag is not set, it's the most recently published package version.   
    */
  var defaultDisplayVersion: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    *  A format of the package. Valid package format values are:     npm     pypi     maven   
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The returned list of  PackageVersionSummary  objects. 
    */
  var versions: js.UndefOr[PackageVersionSummaryList] = js.undefined
}
object ListPackageVersionsResult {
  
  inline def apply(): ListPackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackageVersionsResult]
  }
  
  extension [Self <: ListPackageVersionsResult](x: Self) {
    
    inline def setDefaultDisplayVersion(value: PackageVersion): Self = StObject.set(x, "defaultDisplayVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultDisplayVersionUndefined: Self = StObject.set(x, "defaultDisplayVersion", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVersions(value: PackageVersionSummaryList): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: PackageVersionSummary*): Self = StObject.set(x, "versions", js.Array(value :_*))
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
