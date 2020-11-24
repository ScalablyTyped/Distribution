package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveTrustedKeyGroups extends js.Object {
  
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
  implicit class ActiveTrustedKeyGroupsOps[Self <: ActiveTrustedKeyGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: KGKeyPairIds*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: KGKeyPairIdsList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
}
