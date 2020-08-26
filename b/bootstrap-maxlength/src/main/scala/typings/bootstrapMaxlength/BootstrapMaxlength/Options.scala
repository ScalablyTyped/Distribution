package typings.bootstrapMaxlength.BootstrapMaxlength

import typings.bootstrapMaxlength.JQuery
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Will allow the input to be over the customMaxLength. Useful in soft max situations.
    * @default false
    */
  var allowOverMax: js.UndefOr[Boolean] = js.native
  /**
    * If true the threshold will be ignored and the remaining length indication will be always showing up while typing or on focus on the input
    * @default false
    */
  var alwaysShow: js.UndefOr[Boolean] = js.native
  /**
    * Appends the maxlength indicator badge to the parent of the input rather than to the body.
    * @default false
    */
  var appendToParent: js.UndefOr[Boolean] = js.native
  /**
    * Allows a custom attribute to display indicator without triggering native maxlength behaviour.
    * Ignored if value greater than a native maxlength attribute.
    * 'overmax' class gets added when exceeded to allow user to implement form validation.
    * @default null (use the maxlength attribute and browser functionality)
    */
  var customMaxAttribute: js.UndefOr[String] = js.native
  /**
    * It's the class the element gets when the limit is reached. Default is "label label-important label-danger" (to support Bootstrap 2 and 3).
    * @default 'label label-important label-danger'
    */
  var limitReachedClass: js.UndefOr[String] = js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * Is a string outputted after the indicator.
    * @default ''
    */
  var postText: js.UndefOr[String] = js.native
  /**
    * Is a string of text that can be outputted in front of the indicator.
    * @default ''
    */
  var preText: js.UndefOr[String] = js.native
  /**
    * Represents the separator between the number of typed chars and total number of available chars.
    * @default ' / '
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * If false, will display just the remaining length, e.g. will display remaining lenght instead of number of typed characters.
    * @default true
    */
  var showCharsTyped: js.UndefOr[Boolean] = js.native
  /**
    * If false, will display just the number of typed characters, e.g. will not display the max length.
    * @default true
    */
  var showMaxLength: js.UndefOr[Boolean] = js.native
  /**
    * Shows the badge as soon as it is added to the page, similar to alwaysShow
    * @default false
    */
  var showOnReady: js.UndefOr[Boolean] = js.native
  /**
    * This is a number indicating how many chars are left to start displaying the indications
    * @default 10
    */
  var threshold: js.UndefOr[Number] = js.native
  /**
    * Count linebreak as 2 characters to match IE/Chrome textarea validation. As well as DB storage.
    * @default true
    */
  var twoCharLinebreak: js.UndefOr[Boolean] = js.native
  /**
    * If true the input will count using utf8 bytesize/encoding. For example: the '¢' character is counted as two characters.
    * @default false
    */
  var utf8: js.UndefOr[Boolean] = js.native
  /**
    * If the browser doesn't support the maxlength attribute, attempt to type more than
    * the indicated chars, will be prevented.
    * @default false
    */
  var validate: js.UndefOr[Boolean] = js.native
  /**
    * It's the class of the element with the indicator. By default is the bootstrap "label label-success" but can be changed to anything you'd like.
    * @default 'label label-success'
    */
  var warningClass: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowOverMax(value: Boolean): Self = this.set("allowOverMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowOverMax: Self = this.set("allowOverMax", js.undefined)
    @scala.inline
    def setAlwaysShow(value: Boolean): Self = this.set("alwaysShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShow: Self = this.set("alwaysShow", js.undefined)
    @scala.inline
    def setAppendToParent(value: Boolean): Self = this.set("appendToParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendToParent: Self = this.set("appendToParent", js.undefined)
    @scala.inline
    def setCustomMaxAttribute(value: String): Self = this.set("customMaxAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMaxAttribute: Self = this.set("customMaxAttribute", js.undefined)
    @scala.inline
    def setLimitReachedClass(value: String): Self = this.set("limitReachedClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitReachedClass: Self = this.set("limitReachedClass", js.undefined)
    @scala.inline
    def setMessageFunction2(value: (/* currentText */ String, /* maxLength */ Number) => String): Self = this.set("message", js.Any.fromFunction2(value))
    @scala.inline
    def setMessage(value: String | (js.Function2[/* currentText */ String, /* maxLength */ Number, String])): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPlacementFunction3(
      value: (/* currentInput */ JQuery, /* maxLengthIndicator */ JQuery, /* currentInputPosition */ PositionParam) => Unit
    ): Self = this.set("placement", js.Any.fromFunction3(value))
    @scala.inline
    def setPlacement(
      value: String | PlacementOptions | (js.Function3[
          /* currentInput */ JQuery, 
          /* maxLengthIndicator */ JQuery, 
          /* currentInputPosition */ PositionParam, 
          Unit
        ])
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPostText(value: String): Self = this.set("postText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostText: Self = this.set("postText", js.undefined)
    @scala.inline
    def setPreText(value: String): Self = this.set("preText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreText: Self = this.set("preText", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setShowCharsTyped(value: Boolean): Self = this.set("showCharsTyped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCharsTyped: Self = this.set("showCharsTyped", js.undefined)
    @scala.inline
    def setShowMaxLength(value: Boolean): Self = this.set("showMaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMaxLength: Self = this.set("showMaxLength", js.undefined)
    @scala.inline
    def setShowOnReady(value: Boolean): Self = this.set("showOnReady", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnReady: Self = this.set("showOnReady", js.undefined)
    @scala.inline
    def setThreshold(value: Number): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setTwoCharLinebreak(value: Boolean): Self = this.set("twoCharLinebreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwoCharLinebreak: Self = this.set("twoCharLinebreak", js.undefined)
    @scala.inline
    def setUtf8(value: Boolean): Self = this.set("utf8", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtf8: Self = this.set("utf8", js.undefined)
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setWarningClass(value: String): Self = this.set("warningClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarningClass: Self = this.set("warningClass", js.undefined)
  }
  
}

