package typings.baseui

import typings.baseui.baseuiStrings.both
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.right
import typings.baseui.inputMod.InputOverrides
import typings.baseui.inputMod.SharedProps
import typings.baseui.inputMod.State
import typings.baseui.inputMod.StatefulContainerProps
import typings.cardValidator.expirationDateMod.ExpirationDateVerification
import typings.cardValidator.expirationMonthMod.ExpirationMonthVerification
import typings.cardValidator.expirationYearMod.ExpirationYearVerification
import typings.cardValidator.postalCodeMod.PostalCodeOptions
import typings.cardValidator.typesMod.Verification
import typings.creditCardType.typesMod.CreditCardType
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import typings.std.Record
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentCardMod {
  
  @JSImport("baseui/payment-card", "PaymentCard")
  @js.native
  class PaymentCard protected ()
    extends Component[PaymentCardProps, js.Object, js.Any] {
    def this(props: PaymentCardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaymentCardProps, context: js.Any) = this()
  }
  
  @JSImport("baseui/payment-card", "SIZE")
  @js.native
  val SIZE: typings.baseui.inputMod.SIZE = js.native
  
  @JSImport("baseui/payment-card", "StatefulContainer")
  @js.native
  val StatefulContainer: FC[StatefulContainerProps] = js.native
  
  @JSImport("baseui/payment-card", "StatefulPaymentCard")
  @js.native
  val StatefulPaymentCard: FC[StatefulPaymentCardProps] = js.native
  
  @JSImport("baseui/payment-card", "StyledIconWrapper")
  @js.native
  val StyledIconWrapper: StyletronComponent[js.Any] = js.native
  
  object valid {
    
    @JSImport("baseui/payment-card", "valid")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/payment-card", "valid.cardholderName")
    @js.native
    def cardholderName: js.Function1[/* value */ String | js.Any, Verification] = js.native
    @JSImport("baseui/payment-card", "valid.cardholderName")
    @js.native
    def cardholderName(value: String): Verification = js.native
    @JSImport("baseui/payment-card", "valid.cardholderName")
    @js.native
    def cardholderName(value: js.Any): Verification = js.native
    @scala.inline
    def cardholderName_=(x: js.Function1[/* value */ String | js.Any, Verification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.creditCardType")
    @js.native
    def creditCardType: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]] = js.native
    @JSImport("baseui/payment-card", "valid.creditCardType")
    @js.native
    def creditCardType(cardNumber: String): js.Array[CreditCardType] = js.native
    @scala.inline
    def creditCardType_=(x: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("creditCardType")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.cvv")
    @js.native
    def cvv: js.Function2[
        /* value */ String | js.Any, 
        /* maxLength */ js.UndefOr[Double | js.Array[Double]], 
        Verification
      ] = js.native
    @JSImport("baseui/payment-card", "valid.cvv")
    @js.native
    def cvv(value: String): Verification = js.native
    @JSImport("baseui/payment-card", "valid.cvv")
    @js.native
    def cvv(value: String, maxLength: js.Array[Double]): Verification = js.native
    @JSImport("baseui/payment-card", "valid.cvv")
    @js.native
    def cvv(value: String, maxLength: Double): Verification = js.native
    @JSImport("baseui/payment-card", "valid.cvv")
    @js.native
    def cvv(value: js.Any): Verification = js.native
    @JSImport("baseui/payment-card", "valid.cvv")
    @js.native
    def cvv(value: js.Any, maxLength: js.Array[Double]): Verification = js.native
    @JSImport("baseui/payment-card", "valid.cvv")
    @js.native
    def cvv(value: js.Any, maxLength: Double): Verification = js.native
    @scala.inline
    def cvv_=(
      x: js.Function2[
          /* value */ String | js.Any, 
          /* maxLength */ js.UndefOr[Double | js.Array[Double]], 
          Verification
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cvv")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.expirationDate")
    @js.native
    def expirationDate: js.Function2[
        /* value */ String | (Record[String, String | Double]) | js.Any, 
        /* maxElapsedYear */ js.UndefOr[Double], 
        ExpirationDateVerification
      ] = js.native
    @JSImport("baseui/payment-card", "valid.expirationDate")
    @js.native
    def expirationDate(value: String): ExpirationDateVerification = js.native
    @JSImport("baseui/payment-card", "valid.expirationDate")
    @js.native
    def expirationDate(value: String, maxElapsedYear: Double): ExpirationDateVerification = js.native
    @JSImport("baseui/payment-card", "valid.expirationDate")
    @js.native
    def expirationDate(value: js.Any): ExpirationDateVerification = js.native
    @JSImport("baseui/payment-card", "valid.expirationDate")
    @js.native
    def expirationDate(value: js.Any, maxElapsedYear: Double): ExpirationDateVerification = js.native
    @JSImport("baseui/payment-card", "valid.expirationDate")
    @js.native
    def expirationDate(value: Record[String, String | Double]): ExpirationDateVerification = js.native
    @JSImport("baseui/payment-card", "valid.expirationDate")
    @js.native
    def expirationDate(value: Record[String, String | Double], maxElapsedYear: Double): ExpirationDateVerification = js.native
    @scala.inline
    def expirationDate_=(
      x: js.Function2[
          /* value */ String | (Record[String, String | Double]) | js.Any, 
          /* maxElapsedYear */ js.UndefOr[Double], 
          ExpirationDateVerification
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.expirationMonth")
    @js.native
    def expirationMonth: js.Function1[/* value */ String | js.Any, ExpirationMonthVerification] = js.native
    @JSImport("baseui/payment-card", "valid.expirationMonth")
    @js.native
    def expirationMonth(value: String): ExpirationMonthVerification = js.native
    @JSImport("baseui/payment-card", "valid.expirationMonth")
    @js.native
    def expirationMonth(value: js.Any): ExpirationMonthVerification = js.native
    @scala.inline
    def expirationMonth_=(x: js.Function1[/* value */ String | js.Any, ExpirationMonthVerification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.expirationYear")
    @js.native
    def expirationYear: js.Function2[
        /* value */ String | js.Any, 
        /* maxElapsedYear */ js.UndefOr[Double], 
        ExpirationYearVerification
      ] = js.native
    @JSImport("baseui/payment-card", "valid.expirationYear")
    @js.native
    def expirationYear(value: String): ExpirationYearVerification = js.native
    @JSImport("baseui/payment-card", "valid.expirationYear")
    @js.native
    def expirationYear(value: String, maxElapsedYear: Double): ExpirationYearVerification = js.native
    @JSImport("baseui/payment-card", "valid.expirationYear")
    @js.native
    def expirationYear(value: js.Any): ExpirationYearVerification = js.native
    @JSImport("baseui/payment-card", "valid.expirationYear")
    @js.native
    def expirationYear(value: js.Any, maxElapsedYear: Double): ExpirationYearVerification = js.native
    @scala.inline
    def expirationYear_=(
      x: js.Function2[
          /* value */ String | js.Any, 
          /* maxElapsedYear */ js.UndefOr[Double], 
          ExpirationYearVerification
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.number")
    @js.native
    def number: Double = js.native
    @scala.inline
    def number_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.postalCode")
    @js.native
    def postalCode: js.Function2[
        /* value */ String | js.Any, 
        /* options */ js.UndefOr[PostalCodeOptions], 
        Verification
      ] = js.native
    @JSImport("baseui/payment-card", "valid.postalCode")
    @js.native
    def postalCode(value: String): Verification = js.native
    @JSImport("baseui/payment-card", "valid.postalCode")
    @js.native
    def postalCode(value: String, options: PostalCodeOptions): Verification = js.native
    @JSImport("baseui/payment-card", "valid.postalCode")
    @js.native
    def postalCode(value: js.Any): Verification = js.native
    @JSImport("baseui/payment-card", "valid.postalCode")
    @js.native
    def postalCode(value: js.Any, options: PostalCodeOptions): Verification = js.native
    @scala.inline
    def postalCode_=(
      x: js.Function2[
          /* value */ String | js.Any, 
          /* options */ js.UndefOr[PostalCodeOptions], 
          Verification
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined baseui.baseui/input.InputOverrides & {  IconWrapper :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> * / any | undefined} */
  @js.native
  trait PaymentCardOverrides extends StObject {
    
    var After: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var Before: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var ClearIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var ClearIconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var EndEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var IconWrapper: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Input: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var InputContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var MaskToggleButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var MaskToggleHideIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var MaskToggleShowIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var StartEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
  }
  object PaymentCardOverrides {
    
    @scala.inline
    def apply(): PaymentCardOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentCardOverrides]
    }
    
    @scala.inline
    implicit class PaymentCardOverridesMutableBuilder[Self <: PaymentCardOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "After", js.undefined)
      
      @scala.inline
      def setBefore(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "Before", js.undefined)
      
      @scala.inline
      def setClearIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "ClearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "ClearIconContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconContainerUndefined: Self = StObject.set(x, "ClearIconContainer", js.undefined)
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "ClearIcon", js.undefined)
      
      @scala.inline
      def setEndEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "EndEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerUndefined: Self = StObject.set(x, "EndEnhancer", js.undefined)
      
      @scala.inline
      def setIconWrapper(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "IconWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconWrapperUndefined: Self = StObject.set(x, "IconWrapper", js.undefined)
      
      @scala.inline
      def setInput(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "InputContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainerUndefined: Self = StObject.set(x, "InputContainer", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      @scala.inline
      def setMaskToggleButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "MaskToggleButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskToggleButtonUndefined: Self = StObject.set(x, "MaskToggleButton", js.undefined)
      
      @scala.inline
      def setMaskToggleHideIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "MaskToggleHideIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskToggleHideIconUndefined: Self = StObject.set(x, "MaskToggleHideIcon", js.undefined)
      
      @scala.inline
      def setMaskToggleShowIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "MaskToggleShowIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskToggleShowIconUndefined: Self = StObject.set(x, "MaskToggleShowIcon", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setStartEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "StartEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerUndefined: Self = StObject.set(x, "StartEnhancer", js.undefined)
    }
  }
  
  /* Inlined baseui.baseui/input.InputProps & {  overrides :baseui.baseui/payment-card.PaymentCardOverrides | undefined} */
  @js.native
  trait PaymentCardProps extends StObject {
    
    var adjoined: js.UndefOr[none | left | right | both] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var clearOnEscape: js.UndefOr[Boolean] = js.native
    
    var clearable: js.UndefOr[Boolean] = js.native
    
    var `data-baseweb`: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputMode: js.UndefOr[String] = js.native
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var overrides: js.UndefOr[InputOverrides] with js.UndefOr[PaymentCardOverrides] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var positive: js.UndefOr[Boolean] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.native
    
    var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object PaymentCardProps {
    
    @scala.inline
    def apply(overrides: js.UndefOr[InputOverrides] with js.UndefOr[PaymentCardOverrides]): PaymentCardProps = {
      val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentCardProps]
    }
    
    @scala.inline
    implicit class PaymentCardPropsMutableBuilder[Self <: PaymentCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjoined(value: none | left | right | both): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      @scala.inline
      def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      @scala.inline
      def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEndEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOverrides(value: js.UndefOr[InputOverrides] with js.UndefOr[PaymentCardOverrides]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStartEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined baseui.baseui/input.InputProps & baseui.baseui/input.StatefulContainerProps & {  children :never | undefined,   overrides :baseui.baseui/payment-card.PaymentCardOverrides | undefined} */
  @js.native
  trait StatefulPaymentCardProps extends StObject {
    
    var adjoined: js.UndefOr[none | left | right | both] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactNode] with js.UndefOr[scala.Nothing] = js.native
    
    var clearOnEscape: js.UndefOr[Boolean] = js.native
    
    var clearable: js.UndefOr[Boolean] = js.native
    
    var `data-baseweb`: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var initialState: js.UndefOr[State] = js.native
    
    var inputMode: js.UndefOr[String] = js.native
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var overrides: js.UndefOr[InputOverrides] with js.UndefOr[PaymentCardOverrides] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var positive: js.UndefOr[Boolean] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.native
    
    var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.native
    
    var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object StatefulPaymentCardProps {
    
    @scala.inline
    def apply(
      children: js.UndefOr[ReactNode] with js.UndefOr[scala.Nothing],
      overrides: js.UndefOr[InputOverrides] with js.UndefOr[PaymentCardOverrides]
    ): StatefulPaymentCardProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPaymentCardProps]
    }
    
    @scala.inline
    implicit class StatefulPaymentCardPropsMutableBuilder[Self <: StatefulPaymentCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjoined(value: none | left | right | both): Self = StObject.set(x, "adjoined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjoinedUndefined: Self = StObject.set(x, "adjoined", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: js.UndefOr[ReactNode] with js.UndefOr[scala.Nothing]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      @scala.inline
      def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      @scala.inline
      def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEndEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOverrides(value: js.UndefOr[InputOverrides] with js.UndefOr[PaymentCardOverrides]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStartEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
