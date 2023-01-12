package typings.cypress.anon

import typings.cypress.Cypress.ConfigOptions
import typings.cypress.Cypress.TestingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.CypressCommandLine.CypressOpenOptions> */
trait PartialCypressOpenOptions extends StObject {
  
  var browser: js.UndefOr[String] = js.undefined
  
  var config: js.UndefOr[ConfigOptions[Any]] = js.undefined
  
  var configFile: js.UndefOr[String] = js.undefined
  
  var detached: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[js.Object] = js.undefined
  
  var global: js.UndefOr[Boolean] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var project: js.UndefOr[String] = js.undefined
  
  var testingType: js.UndefOr[TestingType] = js.undefined
}
object PartialCypressOpenOptions {
  
  inline def apply(): PartialCypressOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCypressOpenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCypressOpenOptions] (val x: Self) extends AnyVal {
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setConfig(value: ConfigOptions[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setTestingType(value: TestingType): Self = StObject.set(x, "testingType", value.asInstanceOf[js.Any])
    
    inline def setTestingTypeUndefined: Self = StObject.set(x, "testingType", js.undefined)
  }
}
