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
    NumberValue: Int | Double = null,
    StringValue: String = null
  ): AnnotationValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BooleanValue)) __obj.updateDynamic("BooleanValue")(BooleanValue.asInstanceOf[js.Any])
    if (NumberValue != null) __obj.updateDynamic("NumberValue")(NumberValue.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationValue]
  }
}

