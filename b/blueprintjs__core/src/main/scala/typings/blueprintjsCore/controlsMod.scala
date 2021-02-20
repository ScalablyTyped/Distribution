package typings.blueprintjsCore

import typings.blueprintjsCore.alignmentMod.Alignment
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Checkbox")
  @js.native
  class Checkbox protected ()
    extends AbstractPureComponent2[ICheckboxProps, ICheckboxState, js.Object] {
    def this(props: ICheckboxProps) = this()
    def this(props: ICheckboxProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MCheckbox(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCheckbox(): Unit = js.native
    
    var handleChange: js.Any = js.native
    
    var handleInputRef: js.Any = js.native
    
    var input: js.Any = js.native
    
    var updateIndeterminate: js.Any = js.native
  }
  /* static members */
  object Checkbox {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Checkbox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Checkbox.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Checkbox.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(hasIndeterminate: ICheckboxProps): ICheckboxState | Null = js.native
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Radio")
  @js.native
  class Radio protected ()
    extends AbstractPureComponent2[IRadioProps, js.Object, js.Object] {
    def this(props: IRadioProps) = this()
    def this(props: IRadioProps, context: js.Any) = this()
  }
  /* static members */
  object Radio {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Radio")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Radio.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Switch")
  @js.native
  class Switch protected ()
    extends AbstractPureComponent2[ISwitchProps, js.Object, js.Object] {
    def this(props: ISwitchProps) = this()
    def this(props: ISwitchProps, context: js.Any) = this()
  }
  /* static members */
  object Switch {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Switch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Switch.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ICheckboxProps extends IControlProps {
    
    /** Whether this checkbox is initially indeterminate (uncontrolled mode). */
    var defaultIndeterminate: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether this checkbox is indeterminate, or "partially checked."
      * The checkbox will appear with a small dash instead of a tick to indicate that the value
      * is not exactly true or false.
      *
      * Note that this prop takes precendence over `checked`: if a checkbox is marked both
      * `checked` and `indeterminate` via props, it will appear as indeterminate in the DOM.
      */
    var indeterminate: js.UndefOr[Boolean] = js.native
  }
  object ICheckboxProps {
    
    @scala.inline
    def apply(): ICheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckboxProps]
    }
    
    @scala.inline
    implicit class ICheckboxPropsMutableBuilder[Self <: ICheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultIndeterminate(value: Boolean): Self = StObject.set(x, "defaultIndeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIndeterminateUndefined: Self = StObject.set(x, "defaultIndeterminate", js.undefined)
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    }
  }
  
  @js.native
  trait ICheckboxState extends StObject {
    
    var indeterminate: Boolean = js.native
  }
  object ICheckboxState {
    
    @scala.inline
    def apply(indeterminate: Boolean): ICheckboxState = {
      val __obj = js.Dynamic.literal(indeterminate = indeterminate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICheckboxState]
    }
    
    @scala.inline
    implicit class ICheckboxStateMutableBuilder[Self <: ICheckboxState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait IControlProps extends InputHTMLAttributes[HTMLInputElement] {
    
    /**
      * Alignment of the indicator within container.
      * @default Alignment.LEFT
      */
    var alignIndicator: js.UndefOr[Alignment] = js.native
    
    /** Whether the control should appear as an inline element. */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /** Ref handler that receives HTML `<input>` element backing this component. */
    var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLInputElement | Null, _]] = js.native
    
    /**
      * Text label for the control.
      *
      * Use `children` or `labelElement` to supply JSX content. This prop actually supports JSX elements,
      * but TypeScript will throw an error because `HTMLAttributes` only allows strings.
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * JSX Element label for the control.
      *
      * This prop is a workaround for TypeScript consumers as the type definition for `label` only
      * accepts strings. JavaScript consumers can provide a JSX element directly to `label`.
      */
    var labelElement: js.UndefOr[ReactNode] = js.native
    
    /** Whether this control should use large styles. */
    var large: js.UndefOr[Boolean] = js.native
    
    /**
      * Name of the HTML tag that wraps the checkbox.
      *
      * By default a `<label>` is used, which effectively enlarges the click
      * target to include all of its children. Supply a different tag name if
      * this behavior is undesirable or you're listening to click events from a
      * parent element (as the label can register duplicate clicks).
      *
      * @default "label"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
  }
  object IControlProps {
    
    @scala.inline
    def apply(): IControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlProps]
    }
    
    @scala.inline
    implicit class IControlPropsMutableBuilder[Self <: IControlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignIndicator(value: Alignment): Self = StObject.set(x, "alignIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignIndicatorUndefined: Self = StObject.set(x, "alignIndicator", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* ref */ HTMLInputElement | Null => _): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelElement(value: ReactNode): Self = StObject.set(x, "labelElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelElementUndefined: Self = StObject.set(x, "labelElement", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
  
  type IRadioProps = IControlProps
  
  @js.native
  trait ISwitchProps extends IControlProps {
    
    /**
      * Text to display inside the switch indicator when unchecked.
      */
    var innerLabel: js.UndefOr[String] = js.native
    
    /**
      * Text to display inside the switch indicator when checked.
      * If `innerLabel` is provided and this prop is omitted, then `innerLabel`
      * will be used for both states.
      * @default innerLabel
      */
    var innerLabelChecked: js.UndefOr[String] = js.native
  }
  object ISwitchProps {
    
    @scala.inline
    def apply(): ISwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISwitchProps]
    }
    
    @scala.inline
    implicit class ISwitchPropsMutableBuilder[Self <: ISwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerLabel(value: String): Self = StObject.set(x, "innerLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerLabelChecked(value: String): Self = StObject.set(x, "innerLabelChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerLabelCheckedUndefined: Self = StObject.set(x, "innerLabelChecked", js.undefined)
      
      @scala.inline
      def setInnerLabelUndefined: Self = StObject.set(x, "innerLabel", js.undefined)
    }
  }
}
