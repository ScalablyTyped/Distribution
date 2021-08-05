package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRepositoryFailureDetails extends StObject {
  
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}
object DataRepositoryFailureDetails {
  
  inline def apply(): DataRepositoryFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryFailureDetails]
  }
  
  extension [Self <: DataRepositoryFailureDetails](x: Self) {
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
