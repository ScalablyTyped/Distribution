package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.blueprintjsIcons.libEsmGeneratedIcons16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsFormsInputSharedPropsMod {
  
  trait InputSharedProps
    extends StObject
       with IIntentProps
       with IProps {
    
    /**
      * Whether the input is non-interactive.
      *
      * Note that the content in `rightElement` must be disabled separately if defined;
      * this prop will not affect it.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the component should take up the full width of its container.
      */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Class name to apply to the `<input>` element (not the InputGroup container).
      */
    var inputClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Ref attached to the HTML `<input>` element backing this component.
      */
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    /**
      * Element to render on the left side of input.
      * This prop is mutually exclusive with `leftIcon`.
      */
    var leftElement: js.UndefOr[Element] = js.undefined
    
    /**
      * Name of a Blueprint UI icon to render on the left side of the input group,
      * before the user's cursor.
      *
      * This prop is mutually exclusive with `leftElement`.
      *
      * Note: setting a JSX.Element here is deprecated; use the `leftElement` prop instead.
      */
    var leftIcon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
    /**
      * Placeholder text in the absence of any value.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Element to render on right side of input.
      * For best results, use a minimal button, tag, or small spinner.
      */
    var rightElement: js.UndefOr[Element] = js.undefined
  }
  object InputSharedProps {
    
    inline def apply(): InputSharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputSharedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputSharedProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setLeftElement(value: Element): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
      
      inline def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
      
      inline def setLeftIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconNull: Self = StObject.set(x, "leftIcon", null)
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRightElement(value: Element): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
      
      inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    }
  }
}
