package typings.bootstrapMaxlength

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapMaxlength {
  
  trait Options extends StObject {
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowOverMax(value: Boolean): Self = StObject.set(x, "allowOverMax", value.asInstanceOf[js.Any])
      
      inline def setAllowOverMaxUndefined: Self = StObject.set(x, "allowOverMax", js.undefined)
      
      inline def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowUndefined: Self = StObject.set(x, "alwaysShow", js.undefined)
      
      inline def setAppendToParent(value: Boolean): Self = StObject.set(x, "appendToParent", value.asInstanceOf[js.Any])
      
      inline def setAppendToParentUndefined: Self = StObject.set(x, "appendToParent", js.undefined)
      
      inline def setCustomMaxAttribute(value: String): Self = StObject.set(x, "customMaxAttribute", value.asInstanceOf[js.Any])
      
      inline def setCustomMaxAttributeUndefined: Self = StObject.set(x, "customMaxAttribute", js.undefined)
      
      inline def setLimitReachedClass(value: String): Self = StObject.set(x, "limitReachedClass", value.asInstanceOf[js.Any])
      
      inline def setLimitReachedClassUndefined: Self = StObject.set(x, "limitReachedClass", js.undefined)
      
      inline def setMessage(value: String | (js.Function2[/* currentText */ String, /* maxLength */ Number, String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction2(value: (/* currentText */ String, /* maxLength */ Number) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPlacement(
        value: String | PlacementOptions | (js.Function3[
              /* currentInput */ JQuery, 
              /* maxLengthIndicator */ JQuery, 
              /* currentInputPosition */ PositionParam, 
              Unit
            ])
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementFunction3(
        value: (/* currentInput */ JQuery, /* maxLengthIndicator */ JQuery, /* currentInputPosition */ PositionParam) => Unit
      ): Self = StObject.set(x, "placement", js.Any.fromFunction3(value))
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPostText(value: String): Self = StObject.set(x, "postText", value.asInstanceOf[js.Any])
      
      inline def setPostTextUndefined: Self = StObject.set(x, "postText", js.undefined)
      
      inline def setPreText(value: String): Self = StObject.set(x, "preText", value.asInstanceOf[js.Any])
      
      inline def setPreTextUndefined: Self = StObject.set(x, "preText", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setShowCharsTyped(value: Boolean): Self = StObject.set(x, "showCharsTyped", value.asInstanceOf[js.Any])
      
      inline def setShowCharsTypedUndefined: Self = StObject.set(x, "showCharsTyped", js.undefined)
      
      inline def setShowMaxLength(value: Boolean): Self = StObject.set(x, "showMaxLength", value.asInstanceOf[js.Any])
      
      inline def setShowMaxLengthUndefined: Self = StObject.set(x, "showMaxLength", js.undefined)
      
      inline def setShowOnReady(value: Boolean): Self = StObject.set(x, "showOnReady", value.asInstanceOf[js.Any])
      
      inline def setShowOnReadyUndefined: Self = StObject.set(x, "showOnReady", js.undefined)
      
      inline def setThreshold(value: Number): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTwoCharLinebreak(value: Boolean): Self = StObject.set(x, "twoCharLinebreak", value.asInstanceOf[js.Any])
      
      inline def setTwoCharLinebreakUndefined: Self = StObject.set(x, "twoCharLinebreak", js.undefined)
      
      inline def setUtf8(value: Boolean): Self = StObject.set(x, "utf8", value.asInstanceOf[js.Any])
      
      inline def setUtf8Undefined: Self = StObject.set(x, "utf8", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setWarningClass(value: String): Self = StObject.set(x, "warningClass", value.asInstanceOf[js.Any])
      
      inline def setWarningClassUndefined: Self = StObject.set(x, "warningClass", js.undefined)
    }
  }
  
  /**
    * Possible options for the position of the counter. (passed to $.fn.css)
    */
  trait PlacementOptions extends StObject {
    
    /**
      * The bottom position of the counter (Number of pixels, or a px or percent string)
      */
    var bottom: js.UndefOr[Number | String] = js.undefined
    
    /**
      * The left position of the counter (Number of pixels, or a px or percent string)
      */
    var left: js.UndefOr[Number | String] = js.undefined
    
    /**
      * The positioning to use. For example 'relative', 'absolute'
      */
    var position: js.UndefOr[String] = js.undefined
    
    /**
      * The right position of the counter (Number of pixels, or a px or percent string)
      */
    var right: js.UndefOr[Number | String] = js.undefined
    
    /**
      * The top position of the counter (Number of pixels, or a px or percent string)
      */
    var top: js.UndefOr[Number | String] = js.undefined
  }
  object PlacementOptions {
    
    inline def apply(): PlacementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlacementOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlacementOptions] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Number | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Number | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRight(value: Number | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Number | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /**
    * Representation of the current input position
    */
  trait PositionParam extends StObject {
    
    var bottom: Number
    
    var height: Number
    
    var left: Number
    
    var right: Number
    
    var top: Number
    
    var width: Number
  }
  object PositionParam {
    
    inline def apply(bottom: Number, height: Number, left: Number, right: Number, top: Number, width: Number): PositionParam = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionParam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PositionParam] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Number): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Number): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Number): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Number): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Number): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Number): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
