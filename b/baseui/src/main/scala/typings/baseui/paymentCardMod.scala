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
    inline def cardholderName(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardholderName")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    inline def cardholderName(value: js.Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardholderName")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    inline def cardholderName_=(x: js.Function1[/* value */ String | js.Any, Verification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.creditCardType")
    @js.native
    def creditCardType: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]] = js.native
    inline def creditCardType(cardNumber: String): js.Array[CreditCardType] = ^.asInstanceOf[js.Dynamic].applyDynamic("creditCardType")(cardNumber.asInstanceOf[js.Any]).asInstanceOf[js.Array[CreditCardType]]
    inline def creditCardType_=(x: js.Function1[/* cardNumber */ String, js.Array[CreditCardType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("creditCardType")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.cvv")
    @js.native
    def cvv: js.Function2[
        /* value */ String | js.Any, 
        /* maxLength */ js.UndefOr[Double | js.Array[Double]], 
        Verification
      ] = js.native
    inline def cvv(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    inline def cvv(value: String, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
    inline def cvv(value: String, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
    inline def cvv(value: js.Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    inline def cvv(value: js.Any, maxLength: js.Array[Double]): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
    inline def cvv(value: js.Any, maxLength: Double): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("cvv")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Verification]
    inline def cvv_=(
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
    inline def expirationDate(value: String): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
    inline def expirationDate(value: String, maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
    inline def expirationDate(value: js.Any): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
    inline def expirationDate(value: js.Any, maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
    inline def expirationDate(value: Record[String, String | Double]): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
    inline def expirationDate(value: Record[String, String | Double], maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
    inline def expirationDate_=(
      x: js.Function2[
          /* value */ String | (Record[String, String | Double]) | js.Any, 
          /* maxElapsedYear */ js.UndefOr[Double], 
          ExpirationDateVerification
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.expirationMonth")
    @js.native
    def expirationMonth: js.Function1[/* value */ String | js.Any, ExpirationMonthVerification] = js.native
    inline def expirationMonth(value: String): ExpirationMonthVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationMonth")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationMonthVerification]
    inline def expirationMonth(value: js.Any): ExpirationMonthVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationMonth")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationMonthVerification]
    inline def expirationMonth_=(x: js.Function1[/* value */ String | js.Any, ExpirationMonthVerification]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.expirationYear")
    @js.native
    def expirationYear: js.Function2[
        /* value */ String | js.Any, 
        /* maxElapsedYear */ js.UndefOr[Double], 
        ExpirationYearVerification
      ] = js.native
    inline def expirationYear(value: String): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
    inline def expirationYear(value: String, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
    inline def expirationYear(value: js.Any): ExpirationYearVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationYearVerification]
    inline def expirationYear(value: js.Any, maxElapsedYear: Double): ExpirationYearVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationYear")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationYearVerification]
    inline def expirationYear_=(
      x: js.Function2[
          /* value */ String | js.Any, 
          /* maxElapsedYear */ js.UndefOr[Double], 
          ExpirationYearVerification
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.number")
    @js.native
    def number: Double = js.native
    inline def number_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/payment-card", "valid.postalCode")
    @js.native
    def postalCode: js.Function2[
        /* value */ String | js.Any, 
        /* options */ js.UndefOr[PostalCodeOptions], 
        Verification
      ] = js.native
    inline def postalCode(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    inline def postalCode(value: String, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
    inline def postalCode(value: js.Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
    inline def postalCode(value: js.Any, options: PostalCodeOptions): Verification = (^.asInstanceOf[js.Dynamic].applyDynamic("postalCode")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verification]
    inline def postalCode_=(
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
    
    inline def apply(): PaymentCardOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentCardOverrides]
    }
    
    extension [Self <: PaymentCardOverrides](x: Self) {
      
      inline def setAfter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "After", js.undefined)
      
      inline def setBefore(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "Before", js.undefined)
      
      inline def setClearIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "ClearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "ClearIconContainer", value.asInstanceOf[js.Any])
      
      inline def setClearIconContainerUndefined: Self = StObject.set(x, "ClearIconContainer", js.undefined)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "ClearIcon", js.undefined)
      
      inline def setEndEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "EndEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "EndEnhancer", js.undefined)
      
      inline def setIconWrapper(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "IconWrapper", value.asInstanceOf[js.Any])
      
      inline def setIconWrapperUndefined: Self = StObject.set(x, "IconWrapper", js.undefined)
      
      inline def setInput(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "InputContainer", value.asInstanceOf[js.Any])
      
      inline def setInputContainerUndefined: Self = StObject.set(x, "InputContainer", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setMaskToggleButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "MaskToggleButton", value.asInstanceOf[js.Any])
      
      inline def setMaskToggleButtonUndefined: Self = StObject.set(x, "MaskToggleButton", js.undefined)
      
      inline def setMaskToggleHideIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "MaskToggleHideIcon", value.asInstanceOf[js.Any])
      
      inline def setMaskToggleHideIconUndefined: Self = StObject.set(x, "MaskToggleHideIcon", js.undefined)
      
      inline def setMaskToggleShowIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "MaskToggleShowIcon", value.asInstanceOf[js.Any])
      
      inline def setMaskToggleShowIconUndefined: Self = StObject.set(x, "MaskToggleShowIcon", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setStartEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "StartEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "StartEnhancer", js.undefined)
    }
  }
  
  trait PaymentCardProps
    extends StObject
       with InputProps {
    
    @JSName("overrides")
    var overrides_PaymentCardProps: js.UndefOr[PaymentCardOverrides] = js.undefined
  }
  object PaymentCardProps {
    
    inline def apply(): PaymentCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentCardProps]
    }
    
    extension [Self <: PaymentCardProps](x: Self) {
      
      inline def setOverrides(value: PaymentCardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
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
    
    inline def apply(): StatefulPaymentCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulPaymentCardProps]
    }
    
    extension [Self <: StatefulPaymentCardProps](x: Self) {
      
      inline def setChildren(value: scala.Nothing | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOverrides(value: PaymentCardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
