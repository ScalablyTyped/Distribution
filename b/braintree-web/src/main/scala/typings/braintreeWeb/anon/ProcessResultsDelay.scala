package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessResultsDelay extends StObject {
  
  var processResultsDelay: js.UndefOr[Double] = js.undefined
}
object ProcessResultsDelay {
  
  inline def apply(): ProcessResultsDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessResultsDelay]
  }
  
  extension [Self <: ProcessResultsDelay](x: Self) {
    
    inline def setProcessResultsDelay(value: Double): Self = StObject.set(x, "processResultsDelay", value.asInstanceOf[js.Any])
    
    inline def setProcessResultsDelayUndefined: Self = StObject.set(x, "processResultsDelay", js.undefined)
  }
}
