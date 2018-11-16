package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines an interface which represents an animation key frame
     */

trait IAnimationKey extends js.Object {
  /**
           * Frame of the key frame
           */
  var frame: scala.Double
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

