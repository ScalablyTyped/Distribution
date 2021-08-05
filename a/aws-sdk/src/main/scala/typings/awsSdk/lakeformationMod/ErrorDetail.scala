package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetail extends StObject {
  
  /**
    * The code associated with this error.
    */
  var ErrorCode: js.UndefOr[NameString] = js.undefined
  
  /**
    * A message describing the error.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
}
object ErrorDetail {
  
  inline def apply(): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetail]
  }
  
  extension [Self <: ErrorDetail](x: Self) {
    
    inline def setErrorCode(value: NameString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: DescriptionString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
