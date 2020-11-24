package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaFunctionAssociations extends js.Object {
  
  /**
    *  Optional: A complex type that contains LambdaFunctionAssociation items for this cache behavior. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[LambdaFunctionAssociationList] = js.native
  
  /**
    * The number of Lambda function associations for this cache behavior.
    */
  var Quantity: integer = js.native
}
object LambdaFunctionAssociations {
  
  @scala.inline
  def apply(Quantity: integer): LambdaFunctionAssociations = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionAssociations]
  }
  
  @scala.inline
  implicit class LambdaFunctionAssociationsOps[Self <: LambdaFunctionAssociations] (val x: Self) extends AnyVal {
    
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
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: LambdaFunctionAssociation*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: LambdaFunctionAssociationList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
}
