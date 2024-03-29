package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearCompositionParameters extends StObject {
  
  /** ID of the context where the composition will be cleared */
  var contextID: Double
}
object ClearCompositionParameters {
  
  inline def apply(contextID: Double): ClearCompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearCompositionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearCompositionParameters] (val x: Self) extends AnyVal {
    
    inline def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
  }
}
