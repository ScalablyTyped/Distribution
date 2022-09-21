package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPackageVersionReadmeResult extends StObject {
  
  /**
    *  The name of the package that contains the returned readme file. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.undefined
  
  /**
    *  The format of the package with the requested readme file. 
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    * The namespace of the package version with the requested readme file. The package version component that specifies its namespace depends on its type. For example:    The namespace of a Maven package version is its groupId.     The namespace of an npm package version is its scope.     Python and NuGet package versions do not contain a corresponding component, package versions of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The text of the returned readme file. 
    */
  var readme: js.UndefOr[String] = js.undefined
  
  /**
    *  The version of the package with the requested readme file. 
    */
  var version: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    *  The current revision associated with the package version. 
    */
  var versionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
}
object GetPackageVersionReadmeResult {
  
  inline def apply(): GetPackageVersionReadmeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionReadmeResult]
  }
  
  extension [Self <: GetPackageVersionReadmeResult](x: Self) {
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
    
    inline def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionRevision(value: PackageVersionRevision): Self = StObject.set(x, "versionRevision", value.asInstanceOf[js.Any])
    
    inline def setVersionRevisionUndefined: Self = StObject.set(x, "versionRevision", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
