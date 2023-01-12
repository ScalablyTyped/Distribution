package typings.braintree.anon

import typings.braintree.braintreeStrings.full_information
import typings.braintree.braintreeStrings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullInformation extends StObject {
  
  var FullInformation: full_information
  
  var Token: token
}
object FullInformation {
  
  inline def apply(): FullInformation = {
    val __obj = js.Dynamic.literal(FullInformation = "full_information", Token = "token")
    __obj.asInstanceOf[FullInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullInformation] (val x: Self) extends AnyVal {
    
    inline def setFullInformation(value: full_information): Self = StObject.set(x, "FullInformation", value.asInstanceOf[js.Any])
    
    inline def setToken(value: token): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
  }
}
