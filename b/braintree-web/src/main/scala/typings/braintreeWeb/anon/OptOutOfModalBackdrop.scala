package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptOutOfModalBackdrop extends StObject {
  
  var optOutOfModalBackdrop: Boolean = js.native
}
object OptOutOfModalBackdrop {
  
  @scala.inline
  def apply(optOutOfModalBackdrop: Boolean): OptOutOfModalBackdrop = {
    val __obj = js.Dynamic.literal(optOutOfModalBackdrop = optOutOfModalBackdrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptOutOfModalBackdrop]
  }
  
  @scala.inline
  implicit class OptOutOfModalBackdropMutableBuilder[Self <: OptOutOfModalBackdrop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptOutOfModalBackdrop(value: Boolean): Self = StObject.set(x, "optOutOfModalBackdrop", value.asInstanceOf[js.Any])
  }
}
