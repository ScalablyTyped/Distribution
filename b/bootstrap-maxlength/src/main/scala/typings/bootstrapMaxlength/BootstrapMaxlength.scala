package typings.bootstrapMaxlength

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapMaxlength {
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowOverMax(value: Boolean): Self = StObject.set(x, "allowOverMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowOverMaxUndefined: Self = StObject.set(x, "allowOverMax", js.undefined)
      
      @scala.inline
      def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowUndefined: Self = StObject.set(x, "alwaysShow", js.undefined)
      
      @scala.inline
      def setAppendToParent(value: Boolean): Self = StObject.set(x, "appendToParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToParentUndefined: Self = StObject.set(x, "appendToParent", js.undefined)
      
      @scala.inline
      def setCustomMaxAttribute(value: String): Self = StObject.set(x, "customMaxAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMaxAttributeUndefined: Self = StObject.set(x, "customMaxAttribute", js.undefined)
      
      @scala.inline
      def setLimitReachedClass(value: String): Self = StObject.set(x, "limitReachedClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitReachedClassUndefined: Self = StObject.set(x, "limitReachedClass", js.undefined)
      
      @scala.inline
      def setMessage(value: String | (js.Function2[/* currentText */ String, /* maxLength */ Number, String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFunction2(value: (/* currentText */ String, /* maxLength */ Number) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: String | PlacementOptions | (js.Function3[
              /* currentInput */ JQuery, 
              /* maxLengthIndicator */ JQuery, 
              /* currentInputPosition */ PositionParam, 
              Unit
            ])
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementFunction3(
        value: (/* currentInput */ JQuery, /* maxLengthIndicator */ JQuery, /* currentInputPosition */ PositionParam) => Unit
      ): Self = StObject.set(x, "placement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPostText(value: String): Self = StObject.set(x, "postText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostTextUndefined: Self = StObject.set(x, "postText", js.undefined)
      
      @scala.inline
      def setPreText(value: String): Self = StObject.set(x, "preText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreTextUndefined: Self = StObject.set(x, "preText", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setShowCharsTyped(value: Boolean): Self = StObject.set(x, "showCharsTyped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCharsTypedUndefined: Self = StObject.set(x, "showCharsTyped", js.undefined)
      
      @scala.inline
      def setShowMaxLength(value: Boolean): Self = StObject.set(x, "showMaxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMaxLengthUndefined: Self = StObject.set(x, "showMaxLength", js.undefined)
      
      @scala.inline
      def setShowOnReady(value: Boolean): Self = StObject.set(x, "showOnReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnReadyUndefined: Self = StObject.set(x, "showOnReady", js.undefined)
      
      @scala.inline
      def setThreshold(value: Number): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setTwoCharLinebreak(value: Boolean): Self = StObject.set(x, "twoCharLinebreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoCharLinebreakUndefined: Self = StObject.set(x, "twoCharLinebreak", js.undefined)
      
      @scala.inline
      def setUtf8(value: Boolean): Self = StObject.set(x, "utf8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf8Undefined: Self = StObject.set(x, "utf8", js.undefined)
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setWarningClass(value: String): Self = StObject.set(x, "warningClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningClassUndefined: Self = StObject.set(x, "warningClass", js.undefined)
    }
  }
  
  /**
    * Possible options for the position of the counter. (passed to $.fn.css)
    */
  @js.native
  trait PlacementOptions extends StObject {
    
    /**
      * The bottom position of the counter (Number of pixels, or a px or percent string)
      */
    var bottom: js.UndefOr[Number | String] = js.native
    
    /**
      * The left position of the counter (Number of pixels, or a px or percent string)
      */
    var left: js.UndefOr[Number | String] = js.native
    
    /**
      * The positioning to use. For example 'relative', 'absolute'
      */
    var position: js.UndefOr[String] = js.native
    
    /**
      * The right position of the counter (Number of pixels, or a px or percent string)
      */
    var right: js.UndefOr[Number | String] = js.native
    
    /**
      * The top position of the counter (Number of pixels, or a px or percent string)
      */
    var top: js.UndefOr[Number | String] = js.native
  }
  object PlacementOptions {
    
    @scala.inline
    def apply(): PlacementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlacementOptions]
    }
    
    @scala.inline
    implicit class PlacementOptionsMutableBuilder[Self <: PlacementOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Number | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Number | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRight(value: Number | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Number | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /**
    * Representation of the current input position
    */
  @js.native
  trait PositionParam extends StObject {
    
    var bottom: Number = js.native
    
    var height: Number = js.native
    
    var left: Number = js.native
    
    var right: Number = js.native
    
    var top: Number = js.native
    
    var width: Number = js.native
  }
  object PositionParam {
    
    @scala.inline
    def apply(bottom: Number, height: Number, left: Number, right: Number, top: Number, width: Number): PositionParam = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionParam]
    }
    
    @scala.inline
    implicit class PositionParamMutableBuilder[Self <: PositionParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Number): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Number): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Number): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Number): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Number): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Number): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
