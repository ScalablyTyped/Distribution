package typings.cypress.Cypress

import typings.cypress.cypressStrings.`create-react-app`
import typings.cypress.cypressStrings.`vue-cli`
import typings.cypress.cypressStrings.next
import typings.cypress.cypressStrings.nuxt
import typings.cypress.cypressStrings.react
import typings.cypress.cypressStrings.svelte
import typings.cypress.cypressStrings.vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cypress.anon.Bundler
  - typings.cypress.anon.Framework
  - typings.cypress.anon.Options
*/
trait DevServerConfigOptions extends StObject
object DevServerConfigOptions {
  
  inline def Bundler(framework: react | vue | `vue-cli` | nuxt | `create-react-app` | next | svelte): typings.cypress.anon.Bundler = {
    val __obj = js.Dynamic.literal(bundler = "webpack", framework = framework.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cypress.anon.Bundler]
  }
  
  inline def Framework(framework: react | vue | svelte): typings.cypress.anon.Framework = {
    val __obj = js.Dynamic.literal(bundler = "vite", framework = framework.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cypress.anon.Framework]
  }
  
  inline def Options(): typings.cypress.anon.Options = {
    val __obj = js.Dynamic.literal(bundler = "webpack", framework = "angular")
    __obj.asInstanceOf[typings.cypress.anon.Options]
  }
}
