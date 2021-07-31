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
    *  The format of the package with the requested readme file. Valid format types are:     npm     pypi     maven   
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
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
  
  @scala.inline
  def apply(): GetPackageVersionReadmeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionReadmeResult]
  }
  
  @scala.inline
  implicit class GetPackageVersionReadmeResultMutableBuilder[Self <: GetPackageVersionReadmeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
    
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
