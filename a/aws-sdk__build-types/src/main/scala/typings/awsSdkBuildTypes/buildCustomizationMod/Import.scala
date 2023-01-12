package typings.awsSdkBuildTypes.buildCustomizationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import extends StObject {
  
  /**
    * The name of the package to import (as would be used with `npm install`).
    */
  @JSName("package")
  var _package: String
  
  /**
    * The version constraint to require. This value should use standard semver
    * notation with the caveat that "or" operators (`||`) are not permitted.
    */
  var version: String
}
object Import {
  
  inline def apply(_package: String, version: String): Import = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Import] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
