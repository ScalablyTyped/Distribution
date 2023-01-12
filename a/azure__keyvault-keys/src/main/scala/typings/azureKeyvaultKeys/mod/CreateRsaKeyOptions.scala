package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRsaKeyOptions
  extends StObject
     with CreateKeyOptions {
  
  /** The public exponent for a RSA key. */
  var publicExponent: js.UndefOr[Double] = js.undefined
}
object CreateRsaKeyOptions {
  
  inline def apply(): CreateRsaKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRsaKeyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRsaKeyOptions] (val x: Self) extends AnyVal {
    
    inline def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
  }
}
