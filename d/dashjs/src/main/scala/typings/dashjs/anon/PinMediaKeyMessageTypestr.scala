package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in std.MediaKeyMessageType ]: string} */
trait PinMediaKeyMessageTypestr extends StObject {
  
  var `individualization-request`: String
  
  var `license-release`: String
  
  var `license-renewal`: String
  
  var `license-request`: String
}
object PinMediaKeyMessageTypestr {
  
  inline def apply(
    `individualization-request`: String,
    `license-release`: String,
    `license-renewal`: String,
    `license-request`: String
  ): PinMediaKeyMessageTypestr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("individualization-request")(`individualization-request`.asInstanceOf[js.Any])
    __obj.updateDynamic("license-release")(`license-release`.asInstanceOf[js.Any])
    __obj.updateDynamic("license-renewal")(`license-renewal`.asInstanceOf[js.Any])
    __obj.updateDynamic("license-request")(`license-request`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinMediaKeyMessageTypestr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinMediaKeyMessageTypestr] (val x: Self) extends AnyVal {
    
    inline def `setIndividualization-request`(value: String): Self = StObject.set(x, "individualization-request", value.asInstanceOf[js.Any])
    
    inline def `setLicense-release`(value: String): Self = StObject.set(x, "license-release", value.asInstanceOf[js.Any])
    
    inline def `setLicense-renewal`(value: String): Self = StObject.set(x, "license-renewal", value.asInstanceOf[js.Any])
    
    inline def `setLicense-request`(value: String): Self = StObject.set(x, "license-request", value.asInstanceOf[js.Any])
  }
}
