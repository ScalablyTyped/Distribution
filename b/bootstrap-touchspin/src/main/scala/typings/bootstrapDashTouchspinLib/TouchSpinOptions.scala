package typings
package bootstrapDashTouchspinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TouchSpinOptions. All options are optional
  */
trait TouchSpinOptions extends js.Object {
  /**
    * Boost at every nth step.
    */
  var boostat: js.UndefOr[scala.Double] = js.undefined
  /**
    * If enabled, the the spinner is continually becoming faster as holding the button.
    */
  var booster: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class(es) of down button.
    */
  var buttondown_class: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class(es) of up button.
    */
  var buttonup_class: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of decimal points.
    */
  var decimals: js.UndefOr[scala.Double] = js.undefined
  /**
    * How to force the value to be divisible by step value: 'none' | 'round' | 'floor' | 'ceil'
    */
  var forcestepdivisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Applied when no explicit value is set on the input with the value attribute.
    * Empty string means that the value remains empty on initialization.
    */
  var initval: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Maximum value.
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum step when boosted.
    */
  var maxboostedstep: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Minimum value.
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enables the mouse wheel to change the value of the input.
    */
  var mousewheel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text after the input.
    */
  var postfix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra class(es) for postfix.
    */
  var postfix_extraclass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text before the input.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra class(es) for prefix.
    */
  var prefix_extraclass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Incremental/decremental step on up/down change.
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * Refresh rate of the spinner in milliseconds.
    */
  var stepinterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Time in milliseconds before the spinner starts to spin.
    */
  var stepintervaldelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enables the traditional up/down buttons.
    */
  var verticalbuttons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class of the down button with vertical buttons mode enabled.
    */
  var verticaldownclass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class of the up button with vertical buttons mode enabled.
    */
  var verticalupclass: js.UndefOr[java.lang.String] = js.undefined
}

