package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttribute extends js.Object {
  /**
    * The name of the account attribute.
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * The values for the account attribute.
    */
  var AttributeValues: js.UndefOr[AccountAttributeValueList] = js.native
}

object AccountAttribute {
  @scala.inline
  def apply(AttributeName: String = null, AttributeValues: AccountAttributeValueList = null): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (AttributeValues != null) __obj.updateDynamic("AttributeValues")(AttributeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAttribute]
  }
}

