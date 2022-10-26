package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonAlignmentMod.Alignment
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.AriaAttributes
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.DOMAttributes
import typings.react.mod.HTMLInputTypeAttribute
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.reactStrings.decimal
import typings.react.reactStrings.done
import typings.react.reactStrings.email
import typings.react.reactStrings.enter
import typings.react.reactStrings.environment
import typings.react.reactStrings.go
import typings.react.reactStrings.inherit
import typings.react.reactStrings.next
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.previous
import typings.react.reactStrings.search
import typings.react.reactStrings.send
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.url
import typings.react.reactStrings.user
import typings.react.reactStrings.yes
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsFormsControlsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Checkbox")
  @js.native
  open class Checkbox protected ()
    extends AbstractPureComponent2[CheckboxProps, ICheckboxState, js.Object] {
    def this(props: CheckboxProps) = this()
    def this(props: CheckboxProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MCheckbox(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCheckbox(prevProps: CheckboxProps): Unit = js.native
    
    /* private */ var handleChange: Any = js.native
    
    /* private */ var handleInputRef: Any = js.native
    
    var input: HTMLInputElement | Null = js.native
    
    /* private */ var updateIndeterminate: Any = js.native
  }
  /* static members */
  object Checkbox {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Checkbox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Checkbox.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(param0: CheckboxProps): ICheckboxState | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(param0.asInstanceOf[js.Any]).asInstanceOf[ICheckboxState | Null]
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Radio")
  @js.native
  open class Radio protected ()
    extends AbstractPureComponent2[RadioProps, js.Object, js.Object] {
    def this(props: RadioProps) = this()
    def this(props: RadioProps, context: Any) = this()
  }
  /* static members */
  object Radio {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Radio")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Radio.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Switch")
  @js.native
  open class Switch protected ()
    extends AbstractPureComponent2[SwitchProps, js.Object, js.Object] {
    def this(props: SwitchProps) = this()
    def this(props: SwitchProps, context: Any) = this()
  }
  /* static members */
  object Switch {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Switch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Switch.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type CheckboxProps = ICheckboxProps
  
  type ControlProps = IControlProps
  
  trait ICheckboxProps
    extends StObject
       with IControlProps {
    
    /** Whether this checkbox is initially indeterminate (uncontrolled mode). */
    var defaultIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this checkbox is indeterminate, or "partially checked."
      * The checkbox will appear with a small dash instead of a tick to indicate that the value
      * is not exactly true or false.
      *
      * Note that this prop takes precendence over `checked`: if a checkbox is marked both
      * `checked` and `indeterminate` via props, it will appear as indeterminate in the DOM.
      */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
  }
  object ICheckboxProps {
    
    inline def apply(): ICheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckboxProps]
    }
    
    extension [Self <: ICheckboxProps](x: Self) {
      
      inline def setDefaultIndeterminate(value: Boolean): Self = StObject.set(x, "defaultIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setDefaultIndeterminateUndefined: Self = StObject.set(x, "defaultIndeterminate", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    }
  }
  
  trait ICheckboxState extends StObject {
    
    var indeterminate: Boolean
  }
  object ICheckboxState {
    
    inline def apply(indeterminate: Boolean): ICheckboxState = {
      val __obj = js.Dynamic.literal(indeterminate = indeterminate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICheckboxState]
    }
    
    extension [Self <: ICheckboxState](x: Self) {
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, nonce, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, placeholder, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, unselectable, role, datatype, itemProp, title, autoCorrect, results
  - typings.react.mod.InputHTMLAttributes because var conflicts: className. Inlined formAction, alt, src, max, required, multiple, height, enterKeyHint, min, capture, size, maxLength, formEncType, pattern, form, accept, step, value, minLength, readOnly, name, disabled, formMethod, width, formTarget, autoFocus, crossOrigin, `type`, checked, onChange_InputHTMLAttributes, formNoValidate, list, autoComplete */ trait IControlProps
    extends StObject
       with IProps
       with AriaAttributes
       with DOMAttributes[HTMLInputElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.undefined
    
    var accept: js.UndefOr[String] = js.undefined
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.undefined
    
    /**
      * Alignment of the indicator within container.
      *
      * @default Alignment.LEFT
      */
    var alignIndicator: js.UndefOr[Alignment] = js.undefined
    
    var alt: js.UndefOr[String] = js.undefined
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var autoCorrect: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSave: js.UndefOr[String] = js.undefined
    
    var capture: js.UndefOr[Boolean | user | environment] = js.undefined
    
    /** Whether the control is checked. */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
    
    var contextMenu: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var datatype: js.UndefOr[String] = js.undefined
    
    /** Whether the control is initially checked (uncontrolled mode). */
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    /** Whether the control is non-interactive. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Booleanish] = js.undefined
    
    var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
    
    var form: js.UndefOr[String] = js.undefined
    
    var formAction: js.UndefOr[String] = js.undefined
    
    var formEncType: js.UndefOr[String] = js.undefined
    
    var formMethod: js.UndefOr[String] = js.undefined
    
    var formNoValidate: js.UndefOr[Boolean] = js.undefined
    
    var formTarget: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    /** Whether the control should appear as an inline element. */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var inlist: js.UndefOr[Any] = js.undefined
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
    
    /** Ref handler that receives HTML `<input>` element backing this component. */
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.undefined
    
    var itemID: js.UndefOr[String] = js.undefined
    
    var itemProp: js.UndefOr[String] = js.undefined
    
    var itemRef: js.UndefOr[String] = js.undefined
    
    var itemScope: js.UndefOr[Boolean] = js.undefined
    
    var itemType: js.UndefOr[String] = js.undefined
    
    /**
      * Text label for the control.
      *
      * Use `children` or `labelElement` to supply JSX content. This prop actually supports JSX elements,
      * but TypeScript will throw an error because `HTMLAttributes` only allows strings.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * JSX Element label for the control.
      *
      * This prop is a workaround for TypeScript consumers as the type definition for `label` only
      * accepts strings. JavaScript consumers can provide a JSX element directly to `label`.
      */
    var labelElement: js.UndefOr[ReactNode] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    /** Whether this control should use large styles. */
    var large: js.UndefOr[Boolean] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    @JSName("onChange")
    var onChange_InputHTMLAttributes: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[Double] = js.undefined
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var security: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var spellCheck: js.UndefOr[Booleanish] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
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
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
      ] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[yes | no] = js.undefined
    
    var `type`: js.UndefOr[HTMLInputTypeAttribute] = js.undefined
    
    var typeof: js.UndefOr[String] = js.undefined
    
    var unselectable: js.UndefOr[on | off] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
    
    var vocab: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object IControlProps {
    
    inline def apply(): IControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlProps]
    }
    
    extension [Self <: IControlProps](x: Self) {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setAlignIndicator(value: Alignment): Self = StObject.set(x, "alignIndicator", value.asInstanceOf[js.Any])
      
      inline def setAlignIndicatorUndefined: Self = StObject.set(x, "alignIndicator", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
      
      inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelElement(value: ReactNode): Self = StObject.set(x, "labelElement", value.asInstanceOf[js.Any])
      
      inline def setLabelElementUndefined: Self = StObject.set(x, "labelElement", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTagName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(value: HTMLInputTypeAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type IRadioProps = ControlProps
  
  trait ISwitchProps
    extends StObject
       with IControlProps {
    
    /**
      * Text to display inside the switch indicator when unchecked.
      */
    var innerLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Text to display inside the switch indicator when checked.
      * If `innerLabel` is provided and this prop is omitted, then `innerLabel`
      * will be used for both states.
      *
      * @default innerLabel
      */
    var innerLabelChecked: js.UndefOr[String] = js.undefined
  }
  object ISwitchProps {
    
    inline def apply(): ISwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISwitchProps]
    }
    
    extension [Self <: ISwitchProps](x: Self) {
      
      inline def setInnerLabel(value: String): Self = StObject.set(x, "innerLabel", value.asInstanceOf[js.Any])
      
      inline def setInnerLabelChecked(value: String): Self = StObject.set(x, "innerLabelChecked", value.asInstanceOf[js.Any])
      
      inline def setInnerLabelCheckedUndefined: Self = StObject.set(x, "innerLabelChecked", js.undefined)
      
      inline def setInnerLabelUndefined: Self = StObject.set(x, "innerLabel", js.undefined)
    }
  }
  
  type RadioProps = IRadioProps
  
  type SwitchProps = ISwitchProps
}
