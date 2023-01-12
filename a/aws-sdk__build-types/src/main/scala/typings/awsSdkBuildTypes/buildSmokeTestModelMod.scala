package typings.awsSdkBuildTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSmokeTestModelMod {
  
  trait SmokeTestCase extends StObject {
    
    /**
      * Whether the test should expect an error-level (4xx or 5xx) HTTP status code.
      * If false, the status code is expected to be between 200 and 299, inclusive.
      */
    var errorExpectedFromService: Boolean
    
    /**
      * A hash of arguments to pass to the operation under test.
      */
    var input: js.Object
    
    /**
      * The operation under test.
      * This name must appear as an operation in the model of the service version under test.
      */
    var operationName: String
  }
  object SmokeTestCase {
    
    inline def apply(errorExpectedFromService: Boolean, input: js.Object, operationName: String): SmokeTestCase = {
      val __obj = js.Dynamic.literal(errorExpectedFromService = errorExpectedFromService.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmokeTestCase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SmokeTestCase] (val x: Self) extends AnyVal {
      
      inline def setErrorExpectedFromService(value: Boolean): Self = StObject.set(x, "errorExpectedFromService", value.asInstanceOf[js.Any])
      
      inline def setInput(value: js.Object): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmokeTestModel extends StObject {
    
    /**
      * The region to use should no alternative be supplied via the test runner's execution environment.
      */
    var defaultRegion: String
    
    var testCases: js.Array[SmokeTestCase]
    
    /**
      * The version of smoke test document.
      */
    var version: Double
  }
  object SmokeTestModel {
    
    inline def apply(defaultRegion: String, testCases: js.Array[SmokeTestCase], version: Double): SmokeTestModel = {
      val __obj = js.Dynamic.literal(defaultRegion = defaultRegion.asInstanceOf[js.Any], testCases = testCases.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmokeTestModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SmokeTestModel] (val x: Self) extends AnyVal {
      
      inline def setDefaultRegion(value: String): Self = StObject.set(x, "defaultRegion", value.asInstanceOf[js.Any])
      
      inline def setTestCases(value: js.Array[SmokeTestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
      
      inline def setTestCasesVarargs(value: SmokeTestCase*): Self = StObject.set(x, "testCases", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
