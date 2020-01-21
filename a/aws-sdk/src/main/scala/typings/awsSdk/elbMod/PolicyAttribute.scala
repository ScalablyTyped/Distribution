package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typings.awsSdk.elbMod.AttributeName] = js.native
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[typings.awsSdk.elbMod.AttributeValue] = js.native
}

object PolicyAttribute {
  @scala.inline
  def apply(AttributeName: AttributeName = null, AttributeValue: AttributeValue = null): PolicyAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttribute]
  }
}

