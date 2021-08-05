package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentServiceWarning extends StObject {
  
  /**
    * The description for a warning returned by the document service.
    */
  var message: js.UndefOr[String] = js.undefined
}
object DocumentServiceWarning {
  
  inline def apply(): DocumentServiceWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentServiceWarning]
  }
  
  extension [Self <: DocumentServiceWarning](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
