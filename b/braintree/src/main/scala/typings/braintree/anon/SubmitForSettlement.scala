package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitForSettlement extends StObject {
  
  var submitForSettlement: Boolean = js.native
}
object SubmitForSettlement {
  
  @scala.inline
  def apply(submitForSettlement: Boolean): SubmitForSettlement = {
    val __obj = js.Dynamic.literal(submitForSettlement = submitForSettlement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitForSettlement]
  }
  
  @scala.inline
  implicit class SubmitForSettlementMutableBuilder[Self <: SubmitForSettlement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubmitForSettlement(value: Boolean): Self = StObject.set(x, "submitForSettlement", value.asInstanceOf[js.Any])
  }
}
