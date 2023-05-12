package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedSignature extends StObject {
  
  /**
    * The page a detected signature was found on.
    */
  var Page: js.UndefOr[UInteger] = js.undefined
}
object DetectedSignature {
  
  inline def apply(): DetectedSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedSignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectedSignature] (val x: Self) extends AnyVal {
    
    inline def setPage(value: UInteger): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
  }
}
