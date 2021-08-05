package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuiteResult extends StObject {
  
  /**
    * A collection of one or more tests.
    */
  var suite: js.UndefOr[Suite] = js.undefined
}
object GetSuiteResult {
  
  inline def apply(): GetSuiteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSuiteResult]
  }
  
  extension [Self <: GetSuiteResult](x: Self) {
    
    inline def setSuite(value: Suite): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
    
    inline def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
  }
}
