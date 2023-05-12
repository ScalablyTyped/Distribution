package typings.cypress.Cypress

import typings.cypress.cypressStrings.AsteriskAsteriskSlashAsteriskDotcyDotts
import typings.cypress.cypressStrings.alpha
import typings.cypress.cypressStrings.angular
import typings.cypress.cypressStrings.beta
import typings.cypress.cypressStrings.community
import typings.cypress.cypressStrings.full
import typings.cypress.cypressStrings.library
import typings.cypress.cypressStrings.react
import typings.cypress.cypressStrings.svelte
import typings.cypress.cypressStrings.template
import typings.cypress.cypressStrings.vite
import typings.cypress.cypressStrings.vue
import typings.cypress.cypressStrings.webpack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cypress.Cypress.Omit<cypress.Cypress.ResolvedComponentFrameworkDefinition, 'dependencies'> & {dependencies (bundler : 'webpack' | 'vite'): std.Array<cypress.Cypress.CypressComponentDependency>} */
trait ComponentFrameworkDefinition extends StObject {
  
  var category: library | template
  
  var codeGenFramework: js.UndefOr[react | vue | svelte | angular] = js.undefined
  
  var componentIndexHtml: js.UndefOr[js.Function0[String]] = js.undefined
  
  var configFramework: String
  
  def dependencies(bundler: webpack | vite): js.Array[CypressComponentDependency]
  
  var detectors: js.Array[CypressComponentDependency]
  
  var glob: js.UndefOr[String] = js.undefined
  
  def mountModule(projectPath: String): js.Promise[String]
  @JSName("mountModule")
  var mountModule_Original: js.Function1[/* projectPath */ String, js.Promise[String]]
  
  var name: String
  
  var specPattern: js.UndefOr[AsteriskAsteriskSlashAsteriskDotcyDotts] = js.undefined
  
  var supportStatus: alpha | beta | full | community
  
  var supportedBundlers: js.Array[webpack | vite]
  
  var `type`: String
}
object ComponentFrameworkDefinition {
  
  inline def apply(
    category: library | template,
    configFramework: String,
    dependencies: webpack | vite => js.Array[CypressComponentDependency],
    detectors: js.Array[CypressComponentDependency],
    mountModule: /* projectPath */ String => js.Promise[String],
    name: String,
    supportStatus: alpha | beta | full | community,
    supportedBundlers: js.Array[webpack | vite],
    `type`: String
  ): ComponentFrameworkDefinition = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], configFramework = configFramework.asInstanceOf[js.Any], dependencies = js.Any.fromFunction1(dependencies), detectors = detectors.asInstanceOf[js.Any], mountModule = js.Any.fromFunction1(mountModule), name = name.asInstanceOf[js.Any], supportStatus = supportStatus.asInstanceOf[js.Any], supportedBundlers = supportedBundlers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentFrameworkDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentFrameworkDefinition] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: library | template): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCodeGenFramework(value: react | vue | svelte | angular): Self = StObject.set(x, "codeGenFramework", value.asInstanceOf[js.Any])
    
    inline def setCodeGenFrameworkUndefined: Self = StObject.set(x, "codeGenFramework", js.undefined)
    
    inline def setComponentIndexHtml(value: () => String): Self = StObject.set(x, "componentIndexHtml", js.Any.fromFunction0(value))
    
    inline def setComponentIndexHtmlUndefined: Self = StObject.set(x, "componentIndexHtml", js.undefined)
    
    inline def setConfigFramework(value: String): Self = StObject.set(x, "configFramework", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: webpack | vite => js.Array[CypressComponentDependency]): Self = StObject.set(x, "dependencies", js.Any.fromFunction1(value))
    
    inline def setDetectors(value: js.Array[CypressComponentDependency]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: CypressComponentDependency*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    
    inline def setMountModule(value: /* projectPath */ String => js.Promise[String]): Self = StObject.set(x, "mountModule", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSpecPattern(value: AsteriskAsteriskSlashAsteriskDotcyDotts): Self = StObject.set(x, "specPattern", value.asInstanceOf[js.Any])
    
    inline def setSpecPatternUndefined: Self = StObject.set(x, "specPattern", js.undefined)
    
    inline def setSupportStatus(value: alpha | beta | full | community): Self = StObject.set(x, "supportStatus", value.asInstanceOf[js.Any])
    
    inline def setSupportedBundlers(value: js.Array[webpack | vite]): Self = StObject.set(x, "supportedBundlers", value.asInstanceOf[js.Any])
    
    inline def setSupportedBundlersVarargs(value: (webpack | vite)*): Self = StObject.set(x, "supportedBundlers", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
