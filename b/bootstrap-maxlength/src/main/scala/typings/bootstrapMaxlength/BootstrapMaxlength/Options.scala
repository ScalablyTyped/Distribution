package typings.bootstrapMaxlength.BootstrapMaxlength

import typings.bootstrapMaxlength.JQuery
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Will allow the input to be over the customMaxLength. Useful in soft max situations.
    * @default false
    */
  var allowOverMax: js.UndefOr[Boolean] = js.undefined
  /**
    * If true the threshold will be ignored and the remaining length indication will be always showing up while typing or on focus on the input
    * @default false
    */
  var alwaysShow: js.UndefOr[Boolean] = js.undefined
  /**
    * Appends the maxlength indicator badge to the parent of the input rather than to the body.
    * @default false
    */
  var appendToParent: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows a custom attribute to display indicator without triggering native maxlength behaviour.
    * Ignored if value greater than a native maxlength attribute.
    * 'overmax' class gets added when exceeded to allow user to implement form validation.
    * @default null (use the maxlength attribute and browser functionality)
    */
  var customMaxAttribute: js.UndefOr[String] = js.undefined
  /**
    * It's the class the element gets when the limit is reached. Default is "label label-important label-danger" (to support Bootstrap 2 and 3).
    * @default 'label label-important label-danger'
    */
  var limitReachedClass: js.UndefOr[String] = js.undefined
  /**
    * An alternative way to provide the message text.
    * String example: 'You have typed %charsTyped% chars, %charsRemaining% of %charsTotal% remaining'.
    * %charsTyped%, %charsRemaining% and %charsTotal% will be replaced by the actual values. This overrides the options separator, preText, postText and showMaxLength.
    * Alternatively you may supply a function that the current text and max length and returns the string to be displayed.
    * Function example: function(currentText, maxLength) { return '' + Math.ceil(currentText.length / 160) + ' SMS Message(s)'; }
    * @default null
    */
  var message: js.UndefOr[
    String | (js.Function2[/* currentText */ String, /* maxLength */ Number, String])
  ] = js.undefined
  /**
    * Is a string, define where to output the counter.
    * Options:  bottom, left, top, right, bottom-right, top-right, top-left, bottom-left and centered-right
    * @default 'bottom'
    */
  var placement: js.UndefOr[
    String | PlacementOptions | (js.Function3[
      /* currentInput */ JQuery, 
      /* maxLengthIndicator */ JQuery, 
      /* currentInputPosition */ PositionParam, 
      Unit
    ])
  ] = js.undefined
  /**
    * Is a string outputted after the indicator.
    * @default ''
    */
  var postText: js.UndefOr[String] = js.undefined
  /**
    * Is a string of text that can be outputted in front of the indicator.
    * @default ''
    */
  var preText: js.UndefOr[String] = js.undefined
  /**
    * Represents the separator between the number of typed chars and total number of available chars.
    * @default ' / '
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * If false, will display just the remaining length, e.g. will display remaining lenght instead of number of typed characters.
    * @default true
    */
  var showCharsTyped: js.UndefOr[Boolean] = js.undefined
  /**
    * If false, will display just the number of typed characters, e.g. will not display the max length.
    * @default true
    */
  var showMaxLength: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows the badge as soon as it is added to the page, similar to alwaysShow
    * @default false
    */
  var showOnReady: js.UndefOr[Boolean] = js.undefined
  /**
    * This is a number indicating how many chars are left to start displaying the indications
    * @default 10
    */
  var threshold: js.UndefOr[Number] = js.undefined
  /**
    * Count linebreak as 2 characters to match IE/Chrome textarea validation. As well as DB storage.
    * @default true
    */
  var twoCharLinebreak: js.UndefOr[Boolean] = js.undefined
  /**
    * If true the input will count using utf8 bytesize/encoding. For example: the '¢' character is counted as two characters.
    * @default false
    */
  var utf8: js.UndefOr[Boolean] = js.undefined
  /**
    * If the browser doesn't support the maxlength attribute, attempt to type more than
    * the indicated chars, will be prevented.
    * @default false
    */
  var validate: js.UndefOr[Boolean] = js.undefined
  /**
    * It's the class of the element with the indicator. By default is the bootstrap "label label-success" but can be changed to anything you'd like.
    * @default 'label label-success'
    */
  var warningClass: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowOverMax: js.UndefOr[Boolean] = js.undefined,
    alwaysShow: js.UndefOr[Boolean] = js.undefined,
    appendToParent: js.UndefOr[Boolean] = js.undefined,
    customMaxAttribute: String = null,
    limitReachedClass: String = null,
    message: String | (js.Function2[/* currentText */ String, /* maxLength */ Number, String]) = null,
    placement: String | PlacementOptions | (js.Function3[
      /* currentInput */ JQuery, 
      /* maxLengthIndicator */ JQuery, 
      /* currentInputPosition */ PositionParam, 
      Unit
    ]) = null,
    postText: String = null,
    preText: String = null,
    separator: String = null,
    showCharsTyped: js.UndefOr[Boolean] = js.undefined,
    showMaxLength: js.UndefOr[Boolean] = js.undefined,
    showOnReady: js.UndefOr[Boolean] = js.undefined,
    threshold: Number = null,
    twoCharLinebreak: js.UndefOr[Boolean] = js.undefined,
    utf8: js.UndefOr[Boolean] = js.undefined,
    validate: js.UndefOr[Boolean] = js.undefined,
    warningClass: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverMax)) __obj.updateDynamic("allowOverMax")(allowOverMax.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow.asInstanceOf[js.Any])
    if (!js.isUndefined(appendToParent)) __obj.updateDynamic("appendToParent")(appendToParent.asInstanceOf[js.Any])
    if (customMaxAttribute != null) __obj.updateDynamic("customMaxAttribute")(customMaxAttribute.asInstanceOf[js.Any])
    if (limitReachedClass != null) __obj.updateDynamic("limitReachedClass")(limitReachedClass.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (postText != null) __obj.updateDynamic("postText")(postText.asInstanceOf[js.Any])
    if (preText != null) __obj.updateDynamic("preText")(preText.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(showCharsTyped)) __obj.updateDynamic("showCharsTyped")(showCharsTyped.asInstanceOf[js.Any])
    if (!js.isUndefined(showMaxLength)) __obj.updateDynamic("showMaxLength")(showMaxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnReady)) __obj.updateDynamic("showOnReady")(showOnReady.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(twoCharLinebreak)) __obj.updateDynamic("twoCharLinebreak")(twoCharLinebreak.asInstanceOf[js.Any])
    if (!js.isUndefined(utf8)) __obj.updateDynamic("utf8")(utf8.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warningClass != null) __obj.updateDynamic("warningClass")(warningClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

