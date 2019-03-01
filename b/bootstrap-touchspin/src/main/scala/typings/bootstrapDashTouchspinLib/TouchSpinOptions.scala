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

object TouchSpinOptions {
  @scala.inline
  def apply(
    boostat: scala.Int | scala.Double = null,
    booster: js.UndefOr[scala.Boolean] = js.undefined,
    buttondown_class: java.lang.String = null,
    buttonup_class: java.lang.String = null,
    decimals: scala.Int | scala.Double = null,
    forcestepdivisibility: java.lang.String = null,
    initval: scala.Double | java.lang.String = null,
    max: scala.Int | scala.Double = null,
    maxboostedstep: scala.Double | scala.Boolean = null,
    min: scala.Int | scala.Double = null,
    mousewheel: js.UndefOr[scala.Boolean] = js.undefined,
    postfix: java.lang.String = null,
    postfix_extraclass: java.lang.String = null,
    prefix: java.lang.String = null,
    prefix_extraclass: java.lang.String = null,
    step: scala.Int | scala.Double = null,
    stepinterval: scala.Int | scala.Double = null,
    stepintervaldelay: scala.Int | scala.Double = null,
    verticalbuttons: js.UndefOr[scala.Boolean] = js.undefined,
    verticaldownclass: java.lang.String = null,
    verticalupclass: java.lang.String = null
  ): TouchSpinOptions = {
    val __obj = js.Dynamic.literal()
    if (boostat != null) __obj.updateDynamic("boostat")(boostat.asInstanceOf[js.Any])
    if (!js.isUndefined(booster)) __obj.updateDynamic("booster")(booster)
    if (buttondown_class != null) __obj.updateDynamic("buttondown_class")(buttondown_class)
    if (buttonup_class != null) __obj.updateDynamic("buttonup_class")(buttonup_class)
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (forcestepdivisibility != null) __obj.updateDynamic("forcestepdivisibility")(forcestepdivisibility)
    if (initval != null) __obj.updateDynamic("initval")(initval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxboostedstep != null) __obj.updateDynamic("maxboostedstep")(maxboostedstep.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(mousewheel)) __obj.updateDynamic("mousewheel")(mousewheel)
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (postfix_extraclass != null) __obj.updateDynamic("postfix_extraclass")(postfix_extraclass)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (prefix_extraclass != null) __obj.updateDynamic("prefix_extraclass")(prefix_extraclass)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stepinterval != null) __obj.updateDynamic("stepinterval")(stepinterval.asInstanceOf[js.Any])
    if (stepintervaldelay != null) __obj.updateDynamic("stepintervaldelay")(stepintervaldelay.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalbuttons)) __obj.updateDynamic("verticalbuttons")(verticalbuttons)
    if (verticaldownclass != null) __obj.updateDynamic("verticaldownclass")(verticaldownclass)
    if (verticalupclass != null) __obj.updateDynamic("verticalupclass")(verticalupclass)
    __obj.asInstanceOf[TouchSpinOptions]
  }
}

