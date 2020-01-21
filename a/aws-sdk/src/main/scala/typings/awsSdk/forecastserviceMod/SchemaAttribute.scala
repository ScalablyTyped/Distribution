package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAttribute extends js.Object {
  /**
    * The name of the dataset field.
    */
  var AttributeName: js.UndefOr[Name] = js.native
  /**
    * The data type of the field.
    */
  var AttributeType: js.UndefOr[typings.awsSdk.forecastserviceMod.AttributeType] = js.native
}

object SchemaAttribute {
  @scala.inline
  def apply(AttributeName: Name = null, AttributeType: AttributeType = null): SchemaAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttribute]
  }
}

