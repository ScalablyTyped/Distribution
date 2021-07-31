package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageSummary extends StObject {
  
  /**
    *  The name of the package. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.undefined
  
  /**
    *  The format of the package. Valid values are:     npm     pypi     maven   
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
}
object PackageSummary {
  
  @scala.inline
  def apply(): PackageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageSummary]
  }
  
  @scala.inline
  implicit class PackageSummaryMutableBuilder[Self <: PackageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
