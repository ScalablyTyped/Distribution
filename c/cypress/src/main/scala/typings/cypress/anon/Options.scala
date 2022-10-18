package typings.cypress.anon

import typings.cypress.Cypress.ConfigHandler
import typings.cypress.Cypress.DevServerConfigOptions
import typings.cypress.Cypress.PickConfigOpt
import typings.cypress.cypressStrings.angular
import typings.cypress.cypressStrings.webpack
import typings.cypress.cypressStrings.webpackConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with DevServerConfigOptions {
  
  var bundler: webpack
  
  var framework: angular
  
  var options: js.UndefOr[ProjectConfig] = js.undefined
  
  var webpackConfig: js.UndefOr[ConfigHandler[PickConfigOpt[typings.cypress.cypressStrings.webpackConfig]]] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(bundler = "webpack", framework = "angular")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setBundler(value: webpack): Self = StObject.set(x, "bundler", value.asInstanceOf[js.Any])
    
    inline def setFramework(value: angular): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ProjectConfig): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setWebpackConfig(value: ConfigHandler[PickConfigOpt[webpackConfig]]): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
    
    inline def setWebpackConfigFunction0(value: () => PickConfigOpt[webpackConfig] | js.Promise[PickConfigOpt[webpackConfig]]): Self = StObject.set(x, "webpackConfig", js.Any.fromFunction0(value))
    
    inline def setWebpackConfigUndefined: Self = StObject.set(x, "webpackConfig", js.undefined)
  }
}
