package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateStatus extends StObject {
  
  var Result: Boolean
}
object CertificateStatus {
  
  inline def apply(Result: Boolean): CertificateStatus = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateStatus]
  }
  
  extension [Self <: CertificateStatus](x: Self) {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
