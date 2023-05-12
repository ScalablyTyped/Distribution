package typings.cypress.Cypress

import typings.cypress.cypressStrings.vite
import typings.cypress.cypressStrings.webpack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Certain properties are not supported for third party frameworks right now,
  * such as ones related to the "Create From" feature. This is a subset of
  * properties that are exposed for public usage.
  */
/* Inlined std.Pick<cypress.Cypress.ComponentFrameworkDefinition, 'type' | 'name' | 'supportedBundlers' | 'detectors' | 'dependencies'> & {  type :string,   icon :string | undefined} */
trait ThirdPartyComponentFrameworkDefinition extends StObject {
  
  def dependencies(bundler: webpack | vite): js.Array[CypressComponentDependency]
  @JSName("dependencies")
  var dependencies_Original: js.Function1[/* bundler */ webpack | vite, js.Array[CypressComponentDependency]]
  
  var detectors: js.Array[CypressComponentDependency]
  
  /**
    * Raw SVG icon that will be displayed in the Project Setup Wizard. Used for third parties that
    * want to render a custom icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var supportedBundlers: js.Array[webpack | vite]
  
  /**
    * @example `cypress-ct-${string} for third parties. Any string is valid internally.
    */
  var `type`: String
}
object ThirdPartyComponentFrameworkDefinition {
  
  inline def apply(
    dependencies: /* bundler */ webpack | vite => js.Array[CypressComponentDependency],
    detectors: js.Array[CypressComponentDependency],
    name: String,
    supportedBundlers: js.Array[webpack | vite],
    `type`: String
  ): ThirdPartyComponentFrameworkDefinition = {
    val __obj = js.Dynamic.literal(dependencies = js.Any.fromFunction1(dependencies), detectors = detectors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedBundlers = supportedBundlers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyComponentFrameworkDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThirdPartyComponentFrameworkDefinition] (val x: Self) extends AnyVal {
    
    inline def setDependencies(value: /* bundler */ webpack | vite => js.Array[CypressComponentDependency]): Self = StObject.set(x, "dependencies", js.Any.fromFunction1(value))
    
    inline def setDetectors(value: js.Array[CypressComponentDependency]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: CypressComponentDependency*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSupportedBundlers(value: js.Array[webpack | vite]): Self = StObject.set(x, "supportedBundlers", value.asInstanceOf[js.Any])
    
    inline def setSupportedBundlersVarargs(value: (webpack | vite)*): Self = StObject.set(x, "supportedBundlers", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
