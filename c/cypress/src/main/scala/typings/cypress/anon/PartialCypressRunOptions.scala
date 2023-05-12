package typings.cypress.anon

import typings.cypress.Cypress.ConfigOptions
import typings.cypress.Cypress.TestingType
import typings.cypress.cypressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.CypressCommandLine.CypressRunOptions> */
trait PartialCypressRunOptions extends StObject {
  
  var autoCancelAfterFailures: js.UndefOr[Double | `false`] = js.undefined
  
  var browser: js.UndefOr[String] = js.undefined
  
  var ciBuildId: js.UndefOr[String] = js.undefined
  
  var config: js.UndefOr[ConfigOptions[Any]] = js.undefined
  
  var configFile: js.UndefOr[String] = js.undefined
  
  var env: js.UndefOr[js.Object] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var headed: js.UndefOr[Boolean] = js.undefined
  
  var headless: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var noExit: js.UndefOr[Boolean] = js.undefined
  
  var parallel: js.UndefOr[Boolean] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var project: js.UndefOr[String] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var record: js.UndefOr[Boolean] = js.undefined
  
  var reporter: js.UndefOr[String] = js.undefined
  
  var reporterOptions: js.UndefOr[Any] = js.undefined
  
  var spec: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
  
  var testingType: js.UndefOr[TestingType] = js.undefined
}
object PartialCypressRunOptions {
  
  inline def apply(): PartialCypressRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCypressRunOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCypressRunOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoCancelAfterFailures(value: Double | `false`): Self = StObject.set(x, "autoCancelAfterFailures", value.asInstanceOf[js.Any])
    
    inline def setAutoCancelAfterFailuresUndefined: Self = StObject.set(x, "autoCancelAfterFailures", js.undefined)
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setCiBuildId(value: String): Self = StObject.set(x, "ciBuildId", value.asInstanceOf[js.Any])
    
    inline def setCiBuildIdUndefined: Self = StObject.set(x, "ciBuildId", js.undefined)
    
    inline def setConfig(value: ConfigOptions[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHeaded(value: Boolean): Self = StObject.set(x, "headed", value.asInstanceOf[js.Any])
    
    inline def setHeadedUndefined: Self = StObject.set(x, "headed", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNoExit(value: Boolean): Self = StObject.set(x, "noExit", value.asInstanceOf[js.Any])
    
    inline def setNoExitUndefined: Self = StObject.set(x, "noExit", js.undefined)
    
    inline def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setRecord(value: Boolean): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterOptions(value: Any): Self = StObject.set(x, "reporterOptions", value.asInstanceOf[js.Any])
    
    inline def setReporterOptionsUndefined: Self = StObject.set(x, "reporterOptions", js.undefined)
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTestingType(value: TestingType): Self = StObject.set(x, "testingType", value.asInstanceOf[js.Any])
    
    inline def setTestingTypeUndefined: Self = StObject.set(x, "testingType", js.undefined)
  }
}
