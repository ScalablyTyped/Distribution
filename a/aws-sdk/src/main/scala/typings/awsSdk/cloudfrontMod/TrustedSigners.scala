package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedSigners extends StObject {
  
  /**
    * This field is true if any of the AWS accounts have public keys that CloudFront can use to verify the signatures of signed URLs and signed cookies. If not, this field is false.
    */
  var Enabled: Boolean
  
  /**
    * A list of AWS account identifiers.
    */
  var Items: js.UndefOr[AwsAccountNumberList] = js.undefined
  
  /**
    * The number of AWS accounts in the list.
    */
  var Quantity: integer
}
object TrustedSigners {
  
  @scala.inline
  def apply(Enabled: Boolean, Quantity: integer): TrustedSigners = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedSigners]
  }
  
  @scala.inline
  implicit class TrustedSignersMutableBuilder[Self <: TrustedSigners] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: AwsAccountNumberList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
