package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InstallPackageOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallPackageOptionsWithProject
  extends StObject
     with InstallPackageOptions {
  
  var projectName: String
  
  var projectRootPath: Path
}
object InstallPackageOptionsWithProject {
  
  inline def apply(fileName: Path, packageName: String, projectName: String, projectRootPath: Path): InstallPackageOptionsWithProject = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallPackageOptionsWithProject]
  }
  
  extension [Self <: InstallPackageOptionsWithProject](x: Self) {
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectRootPath(value: Path): Self = StObject.set(x, "projectRootPath", value.asInstanceOf[js.Any])
  }
}
