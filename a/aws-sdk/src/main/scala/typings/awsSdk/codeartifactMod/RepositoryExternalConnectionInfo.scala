package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryExternalConnectionInfo extends StObject {
  
  /**
    *  The name of the external connection associated with a repository. 
    */
  var externalConnectionName: js.UndefOr[ExternalConnectionName] = js.undefined
  
  /**
    *  The package format associated with a repository's external connection. The valid package formats are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.   
    */
  var packageFormat: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    *  The status of the external connection of a repository. There is one valid value, Available. 
    */
  var status: js.UndefOr[ExternalConnectionStatus] = js.undefined
}
object RepositoryExternalConnectionInfo {
  
  @scala.inline
  def apply(): RepositoryExternalConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryExternalConnectionInfo]
  }
  
  @scala.inline
  implicit class RepositoryExternalConnectionInfoMutableBuilder[Self <: RepositoryExternalConnectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalConnectionName(value: ExternalConnectionName): Self = StObject.set(x, "externalConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalConnectionNameUndefined: Self = StObject.set(x, "externalConnectionName", js.undefined)
    
    @scala.inline
    def setPackageFormat(value: PackageFormat): Self = StObject.set(x, "packageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageFormatUndefined: Self = StObject.set(x, "packageFormat", js.undefined)
    
    @scala.inline
    def setStatus(value: ExternalConnectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
