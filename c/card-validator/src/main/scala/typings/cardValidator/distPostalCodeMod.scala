package typings.cardValidator

import typings.cardValidator.distTypesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPostalCodeMod {
  
  @JSImport("card-validator/dist/postal-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def postalCode(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def postalCode(value: String, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
  inline def postalCode(value: Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def postalCode(value: Any, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
  
  trait PostalCodeOptions extends StObject {
    
    var minLength: js.UndefOr[Double] = js.undefined
  }
  object PostalCodeOptions {
    
    inline def apply(): PostalCodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostalCodeOptions]
    }
    
    extension [Self <: PostalCodeOptions](x: Self) {
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    }
  }
}
