package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentData extends StObject {
  
  var testEngine: TestEngine
  
  var testEnvironment: TestEnvironment
  
  var testRunner: TestRunner
  
  var timestamp: String
  
  var url: String
}
object EnvironmentData {
  
  inline def apply(
    testEngine: TestEngine,
    testEnvironment: TestEnvironment,
    testRunner: TestRunner,
    timestamp: String,
    url: String
  ): EnvironmentData = {
    val __obj = js.Dynamic.literal(testEngine = testEngine.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentData]
  }
  
  extension [Self <: EnvironmentData](x: Self) {
    
    inline def setTestEngine(value: TestEngine): Self = StObject.set(x, "testEngine", value.asInstanceOf[js.Any])
    
    inline def setTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
    
    inline def setTestRunner(value: TestRunner): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
