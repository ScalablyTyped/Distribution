package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoverAttempts extends StObject {
  
  var recoverAttempts: js.UndefOr[MediaErrorDecode] = js.undefined
}
object RecoverAttempts {
  
  inline def apply(): RecoverAttempts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoverAttempts]
  }
  
  extension [Self <: RecoverAttempts](x: Self) {
    
    inline def setRecoverAttempts(value: MediaErrorDecode): Self = StObject.set(x, "recoverAttempts", value.asInstanceOf[js.Any])
    
    inline def setRecoverAttemptsUndefined: Self = StObject.set(x, "recoverAttempts", js.undefined)
  }
}
