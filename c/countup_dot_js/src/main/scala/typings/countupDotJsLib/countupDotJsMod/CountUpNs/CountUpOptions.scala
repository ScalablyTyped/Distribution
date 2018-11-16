package typings
package countupDotJsLib.countupDotJsMod.CountUpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CountUpOptions extends js.Object {
  /**
           * Character to use as a decimal
           */
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional custom easing function, default is Robert Penner's easeOutExpo
           * @param t current time
           * @param b start value
           * @param c change in value
           * @param d duration
           * @return calculated value
           */
  var easingFn: js.UndefOr[
    js.Function4[
      /* t */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      /* d */ scala.Double, 
      scala.Double
    ]
  ] = js.undefined
  /**
           * Optional custom formatting function
           * @param num
           * @return
           */
  var formattingFn: js.UndefOr[js.Function1[/* num */ scala.Double, java.lang.String]] = js.undefined
  /**
           * Optionally pass an array of custom numerals for 0-9
           */
  var numerals: js.UndefOr[js.Array[_]] = js.undefined
  /**
           * Optional text before the result
           */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Character to use as a separator
           */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional text after the result
           */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Toggle easing
           */
  var useEasing: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * 1,000,000 vs 1000000
           */
  var useGrouping: js.UndefOr[scala.Boolean] = js.undefined
}

