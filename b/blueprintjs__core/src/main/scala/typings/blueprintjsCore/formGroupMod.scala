package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formGroupMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/formGroup", "FormGroup")
  @js.native
  class FormGroup protected ()
    extends AbstractPureComponent2[IFormGroupProps, js.Object, js.Object] {
    def this(props: IFormGroupProps) = this()
    def this(props: IFormGroupProps, context: js.Any) = this()
    
    var getClassName: js.Any = js.native
  }
  /* static members */
  object FormGroup {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/formGroup", "FormGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/formGroup", "FormGroup.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IFormGroupProps
    extends IIntentProps
       with IProps {
    
    /**
      * A space-delimited list of class names to pass along to the
      * `Classes.FORM_CONTENT` element that contains `children`.
      */
    var contentClassName: js.UndefOr[String] = js.native
    
    /**
      * Whether form group should appear as non-interactive.
      * Remember that `input` elements must be disabled separately.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional helper text. The given content will be wrapped in
      * `Classes.FORM_HELPER_TEXT` and displayed beneath `children`.
      * Helper text color is determined by the `intent`.
      */
    var helperText: js.UndefOr[ReactNode] = js.native
    
    /** Whether to render the label and children on a single line. */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /** Label of this form group. */
    var label: js.UndefOr[ReactNode] = js.native
    
    /**
      * `id` attribute of the labelable form element that this `FormGroup` controls,
      * used as `<label for>` attribute.
      */
    var labelFor: js.UndefOr[String] = js.native
    
    /**
      * Optional secondary text that appears after the label.
      */
    var labelInfo: js.UndefOr[ReactNode] = js.native
    
    /** CSS properties to apply to the root element. */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object IFormGroupProps {
    
    @scala.inline
    def apply(): IFormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFormGroupProps]
    }
    
    @scala.inline
    implicit class IFormGroupPropsMutableBuilder[Self <: IFormGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHelperText(value: ReactNode): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFor(value: String): Self = StObject.set(x, "labelFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelForUndefined: Self = StObject.set(x, "labelFor", js.undefined)
      
      @scala.inline
      def setLabelInfo(value: ReactNode): Self = StObject.set(x, "labelInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelInfoUndefined: Self = StObject.set(x, "labelInfo", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
