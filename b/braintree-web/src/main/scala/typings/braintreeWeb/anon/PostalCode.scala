package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostalCode extends StObject {
  
  var postalCode: js.UndefOr[String] = js.native
}
object PostalCode {
  
  @scala.inline
  def apply(): PostalCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCode]
  }
  
  @scala.inline
  implicit class PostalCodeMutableBuilder[Self <: PostalCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
  }
}
