package typings.cypressCodeCoverage

import typings.cypress.Cypress.PluginConfigOptions
import typings.cypress.Cypress.PluginEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskMod {
  
  @JSImport("@cypress/code-coverage/task", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(on: PluginEvents, config: PluginConfigOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(on.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
