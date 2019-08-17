package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreAnnotationValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AnnotationValue extends js.Object {
  /**
    * <p>Value for a Boolean annotation.</p>
    */
  var BooleanValue: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>Value for a Number annotation.</p>
    */
  var NumberValue: js.UndefOr[Double] = js.undefined
  /**
    * <p>Value for a String annotation.</p>
    */
  var StringValue: js.UndefOr[String] = js.undefined
}

object _AnnotationValue {
  @scala.inline
  def apply(
    BooleanValue: js.UndefOr[Boolean] = js.undefined,
    NumberValue: Int | Double = null,
    StringValue: String = null
  ): _AnnotationValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BooleanValue)) __obj.updateDynamic("BooleanValue")(BooleanValue)
    if (NumberValue != null) __obj.updateDynamic("NumberValue")(NumberValue.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[_AnnotationValue]
  }
}

