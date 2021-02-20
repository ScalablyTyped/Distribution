package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveTrustedKeyGroups extends StObject {
  
  /**
    * This field is true if any of the key groups have public keys that CloudFront can use to verify the signatures of signed URLs and signed cookies. If not, this field is false.
    */
  var Enabled: Boolean = js.native
  
  /**
    * A list of key groups, including the identifiers of the public keys in each key group that CloudFront can use to verify the signatures of signed URLs and signed cookies.
    */
  var Items: js.UndefOr[KGKeyPairIdsList] = js.native
  
  /**
    * The number of key groups in the list.
    */
  var Quantity: integer = js.native
}
object ActiveTrustedKeyGroups {
  
  @scala.inline
  def apply(Enabled: Boolean, Quantity: integer): ActiveTrustedKeyGroups = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTrustedKeyGroups]
  }
  
  @scala.inline
  implicit class ActiveTrustedKeyGroupsMutableBuilder[Self <: ActiveTrustedKeyGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: KGKeyPairIdsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: KGKeyPairIds*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
