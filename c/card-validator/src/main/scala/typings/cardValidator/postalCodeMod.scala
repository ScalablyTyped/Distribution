package typings.cardValidator

import typings.cardValidator.typesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postalCodeMod {
  
  @JSImport("card-validator/dist/postal-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def postalCode(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  @scala.inline
  def postalCode(value: String, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
  @scala.inline
  def postalCode(value: js.Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  @scala.inline
  def postalCode(value: js.Any, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
  
  trait PostalCodeOptions extends StObject {
    
    var minLength: js.UndefOr[Double] = js.undefined
  }
  object PostalCodeOptions {
    
    @scala.inline
    def apply(): PostalCodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostalCodeOptions]
    }
    
    @scala.inline
    implicit class PostalCodeOptionsMutableBuilder[Self <: PostalCodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    }
  }
}
