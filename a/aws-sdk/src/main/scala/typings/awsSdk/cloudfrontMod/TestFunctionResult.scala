package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestFunctionResult extends StObject {
  
  /**
    * An object that represents the result of running the function with the provided event object.
    */
  var TestResult: js.UndefOr[typings.awsSdk.cloudfrontMod.TestResult] = js.undefined
}
object TestFunctionResult {
  
  inline def apply(): TestFunctionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestFunctionResult]
  }
  
  extension [Self <: TestFunctionResult](x: Self) {
    
    inline def setTestResult(value: TestResult): Self = StObject.set(x, "TestResult", value.asInstanceOf[js.Any])
    
    inline def setTestResultUndefined: Self = StObject.set(x, "TestResult", js.undefined)
  }
}
