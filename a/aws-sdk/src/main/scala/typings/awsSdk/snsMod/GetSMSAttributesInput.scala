package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSMSAttributesInput extends StObject {
  
  /**
    * A list of the individual attribute names, such as MonthlySpendLimit, for which you want values. For all attribute names, see SetSMSAttributes. If you don't use this parameter, Amazon SNS returns all SMS attributes.
    */
  var attributes: js.UndefOr[ListString] = js.native
}
object GetSMSAttributesInput {
  
  @scala.inline
  def apply(): GetSMSAttributesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSMSAttributesInput]
  }
  
  @scala.inline
  implicit class GetSMSAttributesInputMutableBuilder[Self <: GetSMSAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: ListString): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
  }
}
