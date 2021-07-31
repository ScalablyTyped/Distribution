package typings.baseui

import typings.baseui.baseuiStrings.change_
import typings.baseui.inputMod.InputProps
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
import typings.react.mod.ReactNode
import typings.std.Record
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    @scala.inline
    def cardholderName(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardholderName")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    @scala.inline
    def cardholderName(value: js.Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardholderName")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    @scala.inline
    def cardholderName_=(x: js.Function1[/* value */ String | js.Any, Verification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.creditCardType")
    @js.native
    def creditCardType: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]] = js.native
    @scala.inline
    def creditCardType(cardNumber: String): js.Array[CreditCardType] = ^.asInstanceOf[js.Dynamic].applyDynamic("creditCardType")(cardNumber.asInstanceOf[js.Any]).asInstanceOf[js.Array[CreditCardType]]
    @scala.inline
    def creditCardType_=(x: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("creditCardType")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.cvv")
    @js.native
    def cvv: js.Function2[
        /* value */ String | js.Any, 
        /* maxLength */ js.UndefOr[Double | js.Array[Double]], 
        Verification
      ] = js.native
    @scala.inline
    def cvv(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    @scala.inline
    def cvv(value: String, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
    @scala.inline
    def cvv(value: String, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
    @scala.inline
    def cvv(value: js.Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    @scala.inline
    def cvv(value: js.Any, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
    @scala.inline
    def cvv(value: js.Any, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
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
    @scala.inline
    def expirationDate(value: String): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
    @scala.inline
    def expirationDate(value: String, maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
    @scala.inline
    def expirationDate(value: js.Any): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
    @scala.inline
    def expirationDate(value: js.Any, maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
    @scala.inline
    def expirationDate(value: Record[String, String | Double]): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
    @scala.inline
    def expirationDate(value: Record[String, String | Double], maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
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
    @scala.inline
    def expirationMonth(value: String): ExpirationMonthVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationMonth")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationMonthVerification]
    @scala.inline
    def expirationMonth(value: js.Any): ExpirationMonthVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationMonth")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationMonthVerification]
    @scala.inline
    def expirationMonth_=(x: js.Function1[/* value */ String | js.Any, ExpirationMonthVerification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.expirationYear")
    @js.native
    def expirationYear: js.Function2[
        /* value */ String | js.Any, 
        /* maxElapsedYear */ js.UndefOr[Double], 
        ExpirationYearVerification
      ] = js.native
    @scala.inline
    def expirationYear(value: String): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
    @scala.inline
    def expirationYear(value: String, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
    @scala.inline
    def expirationYear(value: js.Any): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
    @scala.inline
    def expirationYear(value: js.Any, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
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
    @scala.inline
    def postalCode(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    @scala.inline
    def postalCode(value: String, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
    @scala.inline
    def postalCode(value: js.Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    @scala.inline
    def postalCode(value: js.Any, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
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
  trait PaymentCardOverrides extends StObject {
    
    var After: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var Before: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var ClearIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var ClearIconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var EndEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var IconWrapper: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Input: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var InputContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var MaskToggleButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var MaskToggleHideIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var MaskToggleShowIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
    
    var StartEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.undefined
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
  
  trait PaymentCardProps
    extends StObject
       with InputProps {
    
    @JSName("overrides")
    var overrides_PaymentCardProps: js.UndefOr[PaymentCardOverrides] = js.undefined
  }
  object PaymentCardProps {
    
    @scala.inline
    def apply(): PaymentCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentCardProps]
    }
    
    @scala.inline
    implicit class PaymentCardPropsMutableBuilder[Self <: PaymentCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverrides(value: PaymentCardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.baseui.inputMod.StatefulContainerProps because var conflicts: onChange. Inlined children, initialState, stateReducer */ trait StatefulPaymentCardProps
    extends StObject
       with InputProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    @JSName("overrides")
    var overrides_StatefulPaymentCardProps: js.UndefOr[PaymentCardOverrides] = js.undefined
    
    var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.undefined
  }
  object StatefulPaymentCardProps {
    
    @scala.inline
    def apply(): StatefulPaymentCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulPaymentCardProps]
    }
    
    @scala.inline
    implicit class StatefulPaymentCardPropsMutableBuilder[Self <: StatefulPaymentCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: scala.Nothing | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setOverrides(value: PaymentCardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
