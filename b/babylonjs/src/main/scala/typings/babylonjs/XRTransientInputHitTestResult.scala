package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRTransientInputHitTestResult extends StObject {
  
  val inputSource: XRInputSource
  
  val results: js.Array[XRHitTestResult]
}
object XRTransientInputHitTestResult {
  
  inline def apply(inputSource: XRInputSource, results: js.Array[XRHitTestResult]): XRTransientInputHitTestResult = {
    val __obj = js.Dynamic.literal(inputSource = inputSource.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRTransientInputHitTestResult]
  }
  
  extension [Self <: XRTransientInputHitTestResult](x: Self) {
    
    inline def setInputSource(value: XRInputSource): Self = StObject.set(x, "inputSource", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[XRHitTestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: XRHitTestResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
