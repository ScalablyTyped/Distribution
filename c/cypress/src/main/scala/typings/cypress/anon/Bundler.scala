package typings.cypress.anon

import typings.cypress.Cypress.ConfigHandler
import typings.cypress.Cypress.DevServerConfigOptions
import typings.cypress.Cypress.PickConfigOpt
import typings.cypress.cypressStrings.`create-react-app`
import typings.cypress.cypressStrings.`vue-cli`
import typings.cypress.cypressStrings.next
import typings.cypress.cypressStrings.nuxt
import typings.cypress.cypressStrings.react
import typings.cypress.cypressStrings.svelte
import typings.cypress.cypressStrings.vue
import typings.cypress.cypressStrings.webpack
import typings.cypress.cypressStrings.webpackConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundler
  extends StObject
     with DevServerConfigOptions {
  
  var bundler: webpack
  
  var framework: react | vue | `vue-cli` | nuxt | `create-react-app` | next | svelte
  
  var webpackConfig: js.UndefOr[ConfigHandler[PickConfigOpt[typings.cypress.cypressStrings.webpackConfig]]] = js.undefined
}
object Bundler {
  
  inline def apply(framework: react | vue | `vue-cli` | nuxt | `create-react-app` | next | svelte): Bundler = {
    val __obj = js.Dynamic.literal(bundler = "webpack", framework = framework.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundler]
  }
  
  extension [Self <: Bundler](x: Self) {
    
    inline def setBundler(value: webpack): Self = StObject.set(x, "bundler", value.asInstanceOf[js.Any])
    
    inline def setFramework(value: react | vue | `vue-cli` | nuxt | `create-react-app` | next | svelte): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setWebpackConfig(value: ConfigHandler[PickConfigOpt[webpackConfig]]): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
    
    inline def setWebpackConfigFunction0(value: () => PickConfigOpt[webpackConfig] | js.Promise[PickConfigOpt[webpackConfig]]): Self = StObject.set(x, "webpackConfig", js.Any.fromFunction0(value))
    
    inline def setWebpackConfigUndefined: Self = StObject.set(x, "webpackConfig", js.undefined)
  }
}
