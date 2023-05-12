package typings.blueprintjsCore

import typings.blueprintjsCore.anon.ClassName
import typings.blueprintjsCore.anon.IsActive
import typings.blueprintjsCore.blueprintjsCoreStrings.button
import typings.blueprintjsCore.blueprintjsCoreStrings.reset
import typings.blueprintjsCore.blueprintjsCoreStrings.submit
import typings.blueprintjsCore.libEsmCommonAlignmentMod.Alignment
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.ActionProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IElementRefProps
import typings.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.blueprintjsIcons.libEsmGeneratedIcons16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsButtonAbstractButtonMod {
  
  /* note: abstract class */ @JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
  @js.native
  open class AbstractButton[E /* <: HTMLButtonElement | HTMLAnchorElement */] protected ()
    extends AbstractPureComponent2[
          ButtonProps[E] & (/* import warning: importer.ImportType#apply Failed type conversion: E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement> */ js.Any), 
          IButtonState, 
          js.Object
        ] {
    def this(props: ButtonProps[E] & (/* import warning: importer.ImportType#apply Failed type conversion: E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement> */ js.Any)) = this()
    def this(
      props: ButtonProps[E] & (/* import warning: importer.ImportType#apply Failed type conversion: E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement> */ js.Any),
      context: Any
    ) = this()
    
    /* protected */ var buttonRef: HTMLElement | Null = js.native
    
    /* private */ var currentKeyDown: Any = js.native
    
    /* protected */ def getCommonButtonProps(): ClassName[E] = js.native
    
    /* protected */ def handleBlur(e: FocusEvent[Any, Element]): Unit = js.native
    
    /* protected */ def handleKeyDown(e: KeyboardEvent[Any]): Unit = js.native
    
    /* protected */ def handleKeyUp(e: KeyboardEvent[Any]): Unit = js.native
    
    /* protected */ def renderChildren(): ReactNode = js.native
    
    @JSName("state")
    var state_AbstractButton: IsActive = js.native
  }
  
  type AnchorButtonProps = IAnchorButtonProps
  
  trait ButtonProps[E /* <: HTMLButtonElement | HTMLAnchorElement */]
    extends StObject
       with ActionProps[HTMLElement]
       with IElementRefProps[E] {
    
    /**
      * If set to `true`, the button will display in an active state.
      * This is equivalent to setting `className={Classes.ACTIVE}`.
      *
      * @default false
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text alignment within button. By default, icons and text will be centered
      * within the button. Passing `"left"` or `"right"` will align the button
      * text to that side and push `icon` and `rightIcon` to either edge. Passing
      * `"center"` will center the text and icons together.
      *
      * @default Alignment.CENTER
      */
    var alignText: js.UndefOr[Alignment] = js.undefined
    
    /** Button contents. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Whether this button should expand to fill its container. */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /** Whether this button should use large styles. */
    var large: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true`, the button will display a centered loading spinner instead of its contents
      * and the button will be disabled (_even if_ `disabled={false}`). The width of the button is
      * not affected by the value of this prop.
      *
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /** Whether this button should use minimal styles. */
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    /** Whether this button should use outlined styles. */
    var outlined: js.UndefOr[Boolean] = js.undefined
    
    /** Name of a Blueprint UI icon (or an icon element) to render after the text. */
    var rightIcon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
    /** Whether this button should use small styles. */
    var small: js.UndefOr[Boolean] = js.undefined
    
    /**
      * HTML `type` attribute of button. Accepted values are `"button"`, `"submit"`, and `"reset"`.
      * Note that this prop has no effect on `AnchorButton`; it only affects `Button`.
      *
      * @default "button"
      */
    var `type`: js.UndefOr[submit | reset | button] = js.undefined
  }
  object ButtonProps {
    
    inline def apply[E /* <: HTMLButtonElement | HTMLAnchorElement */](): ButtonProps[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonProps[?], E /* <: HTMLButtonElement | HTMLAnchorElement */] (val x: Self & ButtonProps[E]) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAlignText(value: Alignment): Self = StObject.set(x, "alignText", value.asInstanceOf[js.Any])
      
      inline def setAlignTextUndefined: Self = StObject.set(x, "alignText", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setOutlined(value: Boolean): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setOutlinedUndefined: Self = StObject.set(x, "outlined", js.undefined)
      
      inline def setRightIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      inline def setRightIconNull: Self = StObject.set(x, "rightIcon", null)
      
      inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type IAnchorButtonProps = ButtonProps[HTMLAnchorElement]
  
  type IButtonProps[E /* <: HTMLButtonElement | HTMLAnchorElement */] = ButtonProps[E]
  
  trait IButtonState extends StObject {
    
    var isActive: Boolean
  }
  object IButtonState {
    
    inline def apply(isActive: Boolean): IButtonState = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[IButtonState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IButtonState] (val x: Self) extends AnyVal {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
}
