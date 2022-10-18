package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warning extends StObject {
  
  /**
    * The error code for the warning.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsTextractMod.ErrorCode] = js.undefined
  
  /**
    * A list of the pages that the warning applies to.
    */
  var Pages: js.UndefOr[typings.awsSdk.clientsTextractMod.Pages] = js.undefined
}
object Warning {
  
  inline def apply(): Warning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Warning]
  }
  
  extension [Self <: Warning](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setPages(value: Pages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
    
    inline def setPagesVarargs(value: UInteger*): Self = StObject.set(x, "Pages", js.Array(value*))
  }
}
