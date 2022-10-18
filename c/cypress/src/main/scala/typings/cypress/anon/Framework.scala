package typings.cypress.anon

import typings.cypress.Cypress.ConfigHandler
import typings.cypress.Cypress.DevServerConfigOptions
import typings.cypress.Cypress.Omit
import typings.cypress.Cypress.PickConfigOpt
import typings.cypress.cypressStrings.base_
import typings.cypress.cypressStrings.react
import typings.cypress.cypressStrings.root
import typings.cypress.cypressStrings.svelte
import typings.cypress.cypressStrings.vite
import typings.cypress.cypressStrings.viteConfig
import typings.cypress.cypressStrings.vue
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Framework
  extends StObject
     with DevServerConfigOptions {
  
  var bundler: vite
  
  var framework: react | vue | svelte
  
  var viteConfig: js.UndefOr[
    ConfigHandler[
      Omit[
        Exclude[PickConfigOpt[typings.cypress.cypressStrings.viteConfig], Unit], 
        base_ | root
      ]
    ]
  ] = js.undefined
}
object Framework {
  
  inline def apply(framework: react | vue | svelte): Framework = {
    val __obj = js.Dynamic.literal(bundler = "vite", framework = framework.asInstanceOf[js.Any])
    __obj.asInstanceOf[Framework]
  }
  
  extension [Self <: Framework](x: Self) {
    
    inline def setBundler(value: vite): Self = StObject.set(x, "bundler", value.asInstanceOf[js.Any])
    
    inline def setFramework(value: react | vue | svelte): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setViteConfig(value: ConfigHandler[Omit[Exclude[PickConfigOpt[viteConfig], Unit], base_ | root]]): Self = StObject.set(x, "viteConfig", value.asInstanceOf[js.Any])
    
    inline def setViteConfigFunction0(
      value: () => (Omit[Exclude[PickConfigOpt[viteConfig], Unit], base_ | root]) | (js.Promise[Omit[Exclude[PickConfigOpt[viteConfig], Unit], base_ | root]])
    ): Self = StObject.set(x, "viteConfig", js.Any.fromFunction0(value))
    
    inline def setViteConfigUndefined: Self = StObject.set(x, "viteConfig", js.undefined)
  }
}
