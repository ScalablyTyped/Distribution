package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CypressComponentDependency extends StObject {
  
  /**
    * Package name on npm.
    * @example react-scripts
    */
  @JSName("package")
  var _package: String
  
  /**
    * Description shown in UI. It is recommended to use the same one the package uses on npm.
    * @example  'Create React apps with no build configuration'
    */
  var description: String
  
  /**
    * Code to run when installing. Version is optional.
    *
    * Should be <package_name>@<version>.
    *
    * @example `react`
    * @example `react@18`
    * @example `react-scripts`
    */
  var installer: String
  
  /**
    * Minimum version supported. Should conform to Semantic Versioning as used in `package.json`.
    * @see https://docs.npmjs.com/cli/v9/configuring-npm/package-json#dependencies
    * @example '^=4.0.0 || ^=5.0.0'
    * @example '^2.0.0'
    */
  var minVersion: String
  
  /**
    * Name to display in the user interface.
    * @example "React Scripts"
    */
  var name: String
  
  /**
    * Unique idenitifer.
    * @example 'reactscripts'
    */
  var `type`: String
}
object CypressComponentDependency {
  
  inline def apply(
    _package: String,
    description: String,
    installer: String,
    minVersion: String,
    name: String,
    `type`: String
  ): CypressComponentDependency = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], installer = installer.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressComponentDependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CypressComponentDependency] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setInstaller(value: String): Self = StObject.set(x, "installer", value.asInstanceOf[js.Any])
    
    inline def setMinVersion(value: String): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
