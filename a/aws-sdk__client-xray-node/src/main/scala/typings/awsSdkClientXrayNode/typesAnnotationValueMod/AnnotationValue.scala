package typings.awsSdkClientXrayNode.typesAnnotationValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationValue extends js.Object {
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

object AnnotationValue {
  @scala.inline
  def apply(
    BooleanValue: js.UndefOr[Boolean] = js.undefined,
    NumberValue: js.UndefOr[Double] = js.undefined,
    StringValue: String = null
  ): AnnotationValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BooleanValue)) __obj.updateDynamic("BooleanValue")(BooleanValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberValue)) __obj.updateDynamic("NumberValue")(NumberValue.get.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationValue]
  }
}

