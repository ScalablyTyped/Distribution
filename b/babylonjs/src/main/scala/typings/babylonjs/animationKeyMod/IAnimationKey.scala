package typings.babylonjs.animationKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationKey extends js.Object {
  /**
    * Frame of the key frame
    */
  var frame: Double
  /**
    * The input tangent for the cubic hermite spline
    */
  var inTangent: js.UndefOr[js.Any] = js.undefined
  /**
    * The animation interpolation type
    */
  var interpolation: js.UndefOr[AnimationKeyInterpolation] = js.undefined
  /**
    * The output tangent for the cubic hermite spline
    */
  var outTangent: js.UndefOr[js.Any] = js.undefined
  /**
    * Value at the specifies key frame
    */
  var value: js.Any
}

object IAnimationKey {
  @scala.inline
  def apply(
    frame: Double,
    value: js.Any,
    inTangent: js.Any = null,
    interpolation: AnimationKeyInterpolation = null,
    outTangent: js.Any = null
  ): IAnimationKey = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (inTangent != null) __obj.updateDynamic("inTangent")(inTangent.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (outTangent != null) __obj.updateDynamic("outTangent")(outTangent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationKey]
  }
}

