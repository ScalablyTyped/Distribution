package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndetectedSignature extends StObject {
  
  /**
    * The page where a signature was expected but not found.
    */
  var Page: js.UndefOr[UInteger] = js.undefined
}
object UndetectedSignature {
  
  inline def apply(): UndetectedSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndetectedSignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UndetectedSignature] (val x: Self) extends AnyVal {
    
    inline def setPage(value: UInteger): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
  }
}
