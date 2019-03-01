package typings
package bootstrapDashMaxlengthLib.BootstrapMaxlengthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Will allow the input to be over the customMaxLength. Useful in soft max situations.
    * @default false
    */
  var allowOverMax: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true the threshold will be ignored and the remaining length indication will be always showing up while typing or on focus on the input
    * @default false
    */
  var alwaysShow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Appends the maxlength indicator badge to the parent of the input rather than to the body.
    * @default false
    */
  var appendToParent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows a custom attribute to display indicator without triggering native maxlength behaviour.
    * Ignored if value greater than a native maxlength attribute.
    * 'overmax' class gets added when exceeded to allow user to implement form validation.
    * @default null (use the maxlength attribute and browser functionality)
    */
  var customMaxAttribute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * It's the class the element gets when the limit is reached. Default is "label label-important label-danger" (to support Bootstrap 2 and 3).
    * @default 'label label-important label-danger'
    */
  var limitReachedClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An alternative way to provide the message text.
    * String example: 'You have typed %charsTyped% chars, %charsRemaining% of %charsTotal% remaining'.
    * %charsTyped%, %charsRemaining% and %charsTotal% will be replaced by the actual values. This overrides the options separator, preText, postText and showMaxLength.
    * Alternatively you may supply a function that the current text and max length and returns the string to be displayed.
    * Function example: function(currentText, maxLength) { return '' + Math.ceil(currentText.length / 160) + ' SMS Message(s)'; }
    * @default null
    */
  var message: js.UndefOr[
    java.lang.String | (js.Function2[/* currentText */ java.lang.String, /* maxLength */ stdLib.Number, java.lang.String])
  ] = js.undefined
  /**
    * Is a string, define where to output the counter.
    * Options:  bottom, left, top, right, bottom-right, top-right, top-left, bottom-left and centered-right
    * @default 'bottom'
    */
  var placement: js.UndefOr[
    java.lang.String | PlacementOptions | (js.Function3[
      /* currentInput */ bootstrapDashMaxlengthLib.JQuery, 
      /* maxLengthIndicator */ bootstrapDashMaxlengthLib.JQuery, 
      /* currentInputPosition */ PositionParam, 
      scala.Unit
    ])
  ] = js.undefined
  /**
    * Is a string outputted after the indicator.
    * @default ''
    */
  var postText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Is a string of text that can be outputted in front of the indicator.
    * @default ''
    */
  var preText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Represents the separator between the number of typed chars and total number of available chars.
    * @default ' / '
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If false, will display just the remaining length, e.g. will display remaining lenght instead of number of typed characters.
    * @default true
    */
  var showCharsTyped: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false, will display just the number of typed characters, e.g. will not display the max length.
    * @default true
    */
  var showMaxLength: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows the badge as soon as it is added to the page, similar to alwaysShow
    * @default false
    */
  var showOnReady: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This is a number indicating how many chars are left to start displaying the indications
    * @default 10
    */
  var threshold: js.UndefOr[stdLib.Number] = js.undefined
  /**
    * Count linebreak as 2 characters to match IE/Chrome textarea validation. As well as DB storage.
    * @default true
    */
  var twoCharLinebreak: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true the input will count using utf8 bytesize/encoding. For example: the '¢' character is counted as two characters.
    * @default false
    */
  var utf8: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If the browser doesn't support the maxlength attribute, attempt to type more than
    * the indicated chars, will be prevented.
    * @default false
    */
  var validate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It's the class of the element with the indicator. By default is the bootstrap "label label-success" but can be changed to anything you'd like.
    * @default 'label label-success'
    */
  var warningClass: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowOverMax: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysShow: js.UndefOr[scala.Boolean] = js.undefined,
    appendToParent: js.UndefOr[scala.Boolean] = js.undefined,
    customMaxAttribute: java.lang.String = null,
    limitReachedClass: java.lang.String = null,
    message: java.lang.String | (js.Function2[/* currentText */ java.lang.String, /* maxLength */ stdLib.Number, java.lang.String]) = null,
    placement: java.lang.String | PlacementOptions | (js.Function3[
      /* currentInput */ bootstrapDashMaxlengthLib.JQuery, 
      /* maxLengthIndicator */ bootstrapDashMaxlengthLib.JQuery, 
      /* currentInputPosition */ PositionParam, 
      scala.Unit
    ]) = null,
    postText: java.lang.String = null,
    preText: java.lang.String = null,
    separator: java.lang.String = null,
    showCharsTyped: js.UndefOr[scala.Boolean] = js.undefined,
    showMaxLength: js.UndefOr[scala.Boolean] = js.undefined,
    showOnReady: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: stdLib.Number = null,
    twoCharLinebreak: js.UndefOr[scala.Boolean] = js.undefined,
    utf8: js.UndefOr[scala.Boolean] = js.undefined,
    validate: js.UndefOr[scala.Boolean] = js.undefined,
    warningClass: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverMax)) __obj.updateDynamic("allowOverMax")(allowOverMax)
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow)
    if (!js.isUndefined(appendToParent)) __obj.updateDynamic("appendToParent")(appendToParent)
    if (customMaxAttribute != null) __obj.updateDynamic("customMaxAttribute")(customMaxAttribute)
    if (limitReachedClass != null) __obj.updateDynamic("limitReachedClass")(limitReachedClass)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (postText != null) __obj.updateDynamic("postText")(postText)
    if (preText != null) __obj.updateDynamic("preText")(preText)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(showCharsTyped)) __obj.updateDynamic("showCharsTyped")(showCharsTyped)
    if (!js.isUndefined(showMaxLength)) __obj.updateDynamic("showMaxLength")(showMaxLength)
    if (!js.isUndefined(showOnReady)) __obj.updateDynamic("showOnReady")(showOnReady)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold)
    if (!js.isUndefined(twoCharLinebreak)) __obj.updateDynamic("twoCharLinebreak")(twoCharLinebreak)
    if (!js.isUndefined(utf8)) __obj.updateDynamic("utf8")(utf8)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    if (warningClass != null) __obj.updateDynamic("warningClass")(warningClass)
    __obj.asInstanceOf[Options]
  }
}

