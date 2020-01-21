package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(Quantity: integer, Items: LambdaFunctionAssociationList = null): LambdaFunctionAssociations = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionAssociations]
  }
}

