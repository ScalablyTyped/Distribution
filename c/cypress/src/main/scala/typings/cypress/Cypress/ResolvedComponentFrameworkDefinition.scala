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

trait ResolvedComponentFrameworkDefinition extends StObject {
  
  /**
    * Library (React, Vue) or template (aka "meta framework") (CRA, Next.js, Angular)
    */
  var category: library | template
  
  /**
    * This is used interally by Cypress for the "Create From Component" feature.
    */
  var codeGenFramework: js.UndefOr[react | vue | svelte | angular] = js.undefined
  
  /**
    * Function returning string for used for the component-index.html file.
    * Cypress provides a default if one isn't specified for third party integrations.
    */
  var componentIndexHtml: js.UndefOr[js.Function0[String]] = js.undefined
  
  /**
    * Used as the flag for `getPreset` for meta framworks, such as finding the webpack config for CRA, Angular, etc.
    * It is also the name of the string added to `cypress.config`
    *
    * @example
    *   export default {
    *     component: {
    *       devServer: {
    *         framework: 'create-react-app' // can be 'next', 'create-react-app', etc etc.
    *       }
    *     }
    *   }
    */
  var configFramework: String
  
  /**
    * Array of required dependencies. This could be the bundler and JavaScript library.
    */
  def dependencies(bundler: webpack | vite, projectPath: String): js.Promise[js.Array[DependencyToInstall]]
  
  /**
    * Used to attempt to automatically select the correct framework/bundler from the dropdown.
    *
    * @example
    *   const SOLID_DETECTOR: Dependency = {
    *     type: 'solid',
    *     name: 'Solid.js',
    *     package: 'solid-js',
    *     installer: 'solid-js',
    *     description: 'Solid is a declarative JavaScript library for creating user interfaces',
    *     minVersion: '^1.0.0',
    *   }
    */
  var detectors: js.Array[CypressComponentDependency]
  
  /**
    * This is used interally by Cypress for the "Create From Component" feature.
    * @example '*.{js,jsx,tsx}'
    */
  var glob: js.UndefOr[String] = js.undefined
  
  /**
    * This is the path to get mount, eg `import { mount } from <mount_module>,
    * @example: `cypress-ct-solidjs/src/mount`
    */
  def mountModule(projectPath: String): js.Promise[String]
  
  /**
    * Name displayed in Launchpad when doing initial setup.
    * @example 'Solid.js'
    * @example 'Create React App'
    */
  var name: String
  
  /**
    * Used for the Create From Comopnent feature.
    * This is currently not supported for third party frameworks.
    */
  var specPattern: js.UndefOr[AsteriskAsteriskSlashAsteriskDotcyDotts] = js.undefined
  
  /**
    * Support status. Internally alpha | beta | full.
    * Community integrations are "community".
    */
  var supportStatus: alpha | beta | full | community
  
  /**
    * Supported bundlers.
    */
  var supportedBundlers: js.Array[webpack | vite]
  
  /**
    * A semantic, unique identifier.
    * Must begin with `cypress-ct-` or `@org/cypress-ct-` for third party implementations.
    * @example 'reactscripts'
    * @example 'nextjs'
    * @example 'cypress-ct-solid-js'
    */
  var `type`: String
}
object ResolvedComponentFrameworkDefinition {
  
  inline def apply(
    category: library | template,
    configFramework: String,
    dependencies: (webpack | vite, String) => js.Promise[js.Array[DependencyToInstall]],
    detectors: js.Array[CypressComponentDependency],
    mountModule: String => js.Promise[String],
    name: String,
    supportStatus: alpha | beta | full | community,
    supportedBundlers: js.Array[webpack | vite],
    `type`: String
  ): ResolvedComponentFrameworkDefinition = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], configFramework = configFramework.asInstanceOf[js.Any], dependencies = js.Any.fromFunction2(dependencies), detectors = detectors.asInstanceOf[js.Any], mountModule = js.Any.fromFunction1(mountModule), name = name.asInstanceOf[js.Any], supportStatus = supportStatus.asInstanceOf[js.Any], supportedBundlers = supportedBundlers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedComponentFrameworkDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedComponentFrameworkDefinition] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: library | template): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCodeGenFramework(value: react | vue | svelte | angular): Self = StObject.set(x, "codeGenFramework", value.asInstanceOf[js.Any])
    
    inline def setCodeGenFrameworkUndefined: Self = StObject.set(x, "codeGenFramework", js.undefined)
    
    inline def setComponentIndexHtml(value: () => String): Self = StObject.set(x, "componentIndexHtml", js.Any.fromFunction0(value))
    
    inline def setComponentIndexHtmlUndefined: Self = StObject.set(x, "componentIndexHtml", js.undefined)
    
    inline def setConfigFramework(value: String): Self = StObject.set(x, "configFramework", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: (webpack | vite, String) => js.Promise[js.Array[DependencyToInstall]]): Self = StObject.set(x, "dependencies", js.Any.fromFunction2(value))
    
    inline def setDetectors(value: js.Array[CypressComponentDependency]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    inline def setDetectorsVarargs(value: CypressComponentDependency*): Self = StObject.set(x, "detectors", js.Array(value*))
    
    inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    
    inline def setMountModule(value: String => js.Promise[String]): Self = StObject.set(x, "mountModule", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSpecPattern(value: AsteriskAsteriskSlashAsteriskDotcyDotts): Self = StObject.set(x, "specPattern", value.asInstanceOf[js.Any])
    
    inline def setSpecPatternUndefined: Self = StObject.set(x, "specPattern", js.undefined)
    
    inline def setSupportStatus(value: alpha | beta | full | community): Self = StObject.set(x, "supportStatus", value.asInstanceOf[js.Any])
    
    inline def setSupportedBundlers(value: js.Array[webpack | vite]): Self = StObject.set(x, "supportedBundlers", value.asInstanceOf[js.Any])
    
    inline def setSupportedBundlersVarargs(value: (webpack | vite)*): Self = StObject.set(x, "supportedBundlers", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
