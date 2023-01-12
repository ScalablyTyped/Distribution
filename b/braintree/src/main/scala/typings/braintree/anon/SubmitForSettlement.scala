package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitForSettlement extends StObject {
  
  var submitForSettlement: Boolean
}
object SubmitForSettlement {
  
  inline def apply(submitForSettlement: Boolean): SubmitForSettlement = {
    val __obj = js.Dynamic.literal(submitForSettlement = submitForSettlement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitForSettlement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubmitForSettlement] (val x: Self) extends AnyVal {
    
    inline def setSubmitForSettlement(value: Boolean): Self = StObject.set(x, "submitForSettlement", value.asInstanceOf[js.Any])
  }
}
