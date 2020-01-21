package typings.bootstrapTouchspin

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
  var boostat: js.UndefOr[Double] = js.undefined
  /**
    * If enabled, the the spinner is continually becoming faster as holding the button.
    */
  var booster: js.UndefOr[Boolean] = js.undefined
  /**
    * Class(es) of down button.
    */
  var buttondown_class: js.UndefOr[String] = js.undefined
  /**
    * Class(es) of up button.
    */
  var buttonup_class: js.UndefOr[String] = js.undefined
  /**
    * Number of decimal points.
    */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * How to force the value to be divisible by step value: 'none' | 'round' | 'floor' | 'ceil'
    */
  var forcestepdivisibility: js.UndefOr[String] = js.undefined
  /**
    * Applied when no explicit value is set on the input with the value attribute.
    * Empty string means that the value remains empty on initialization.
    */
  var initval: js.UndefOr[Double | String] = js.undefined
  /**
    * Maximum value.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Maximum step when boosted.
    */
  var maxboostedstep: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Minimum value.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Enables the mouse wheel to change the value of the input.
    */
  var mousewheel: js.UndefOr[Boolean] = js.undefined
  /**
    * Text after the input.
    */
  var postfix: js.UndefOr[String] = js.undefined
  /**
    * Extra class(es) for postfix.
    */
  var postfix_extraclass: js.UndefOr[String] = js.undefined
  /**
    * Text before the input.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Extra class(es) for prefix.
    */
  var prefix_extraclass: js.UndefOr[String] = js.undefined
  /**
    * Incremental/decremental step on up/down change.
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Refresh rate of the spinner in milliseconds.
    */
  var stepinterval: js.UndefOr[Double] = js.undefined
  /**
    * Time in milliseconds before the spinner starts to spin.
    */
  var stepintervaldelay: js.UndefOr[Double] = js.undefined
  /**
    * Enables the traditional up/down buttons.
    */
  var verticalbuttons: js.UndefOr[Boolean] = js.undefined
  /**
    * Class of the down button with vertical buttons mode enabled.
    */
  var verticaldownclass: js.UndefOr[String] = js.undefined
  /**
    * Class of the up button with vertical buttons mode enabled.
    */
  var verticalupclass: js.UndefOr[String] = js.undefined
}

object TouchSpinOptions {
  @scala.inline
  def apply(
    boostat: Int | Double = null,
    booster: js.UndefOr[Boolean] = js.undefined,
    buttondown_class: String = null,
    buttonup_class: String = null,
    decimals: Int | Double = null,
    forcestepdivisibility: String = null,
    initval: Double | String = null,
    max: Int | Double = null,
    maxboostedstep: Double | Boolean = null,
    min: Int | Double = null,
    mousewheel: js.UndefOr[Boolean] = js.undefined,
    postfix: String = null,
    postfix_extraclass: String = null,
    prefix: String = null,
    prefix_extraclass: String = null,
    step: Int | Double = null,
    stepinterval: Int | Double = null,
    stepintervaldelay: Int | Double = null,
    verticalbuttons: js.UndefOr[Boolean] = js.undefined,
    verticaldownclass: String = null,
    verticalupclass: String = null
  ): TouchSpinOptions = {
    val __obj = js.Dynamic.literal()
    if (boostat != null) __obj.updateDynamic("boostat")(boostat.asInstanceOf[js.Any])
    if (!js.isUndefined(booster)) __obj.updateDynamic("booster")(booster.asInstanceOf[js.Any])
    if (buttondown_class != null) __obj.updateDynamic("buttondown_class")(buttondown_class.asInstanceOf[js.Any])
    if (buttonup_class != null) __obj.updateDynamic("buttonup_class")(buttonup_class.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (forcestepdivisibility != null) __obj.updateDynamic("forcestepdivisibility")(forcestepdivisibility.asInstanceOf[js.Any])
    if (initval != null) __obj.updateDynamic("initval")(initval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxboostedstep != null) __obj.updateDynamic("maxboostedstep")(maxboostedstep.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(mousewheel)) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (postfix_extraclass != null) __obj.updateDynamic("postfix_extraclass")(postfix_extraclass.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefix_extraclass != null) __obj.updateDynamic("prefix_extraclass")(prefix_extraclass.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stepinterval != null) __obj.updateDynamic("stepinterval")(stepinterval.asInstanceOf[js.Any])
    if (stepintervaldelay != null) __obj.updateDynamic("stepintervaldelay")(stepintervaldelay.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalbuttons)) __obj.updateDynamic("verticalbuttons")(verticalbuttons.asInstanceOf[js.Any])
    if (verticaldownclass != null) __obj.updateDynamic("verticaldownclass")(verticaldownclass.asInstanceOf[js.Any])
    if (verticalupclass != null) __obj.updateDynamic("verticalupclass")(verticalupclass.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchSpinOptions]
  }
}

