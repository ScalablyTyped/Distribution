package typings.cypress.anon

import typings.cypress.Cypress.AngularDevServerProjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectConfig extends StObject {
  
  var projectConfig: AngularDevServerProjectConfig
}
object ProjectConfig {
  
  inline def apply(projectConfig: AngularDevServerProjectConfig): ProjectConfig = {
    val __obj = js.Dynamic.literal(projectConfig = projectConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfig]
  }
  
  extension [Self <: ProjectConfig](x: Self) {
    
    inline def setProjectConfig(value: AngularDevServerProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
  }
}
