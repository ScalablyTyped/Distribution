package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.overlayMod.IBackdropProps
import typings.blueprintjsCore.overlayMod.IOverlayableProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialog", "Dialog")
  @js.native
  class Dialog protected ()
    extends AbstractPureComponent2[IDialogProps, js.Object, js.Object] {
    def this(props: IDialogProps) = this()
    def this(props: IDialogProps, context: js.Any) = this()
    
    /* private */ var maybeRenderCloseButton: js.Any = js.native
    
    /* private */ var maybeRenderHeader: js.Any = js.native
  }
  /* static members */
  object Dialog {
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialog", "Dialog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialog", "Dialog.defaultProps")
    @js.native
    def defaultProps: IDialogProps = js.native
    inline def defaultProps_=(x: IDialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialog", "Dialog.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IDialogProps
    extends StObject
       with IOverlayableProps
       with IBackdropProps
       with IProps {
    
    /**
      * Name of a Blueprint UI icon (or an icon element) to render in the
      * dialog's header. Note that the header will only be rendered if `title` is
      * provided.
      */
    var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
    
    /**
      * Whether to show the close button in the dialog's header.
      * Note that the header will only be rendered if `title` is provided.
      * @default true
      */
    var isCloseButtonShown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Toggles the visibility of the overlay and its children.
      * This prop is required because the component is controlled.
      */
    var isOpen: Boolean
    
    /**
      * CSS styles to apply to the dialog.
      * @default {}
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Title of the dialog. If provided, an element with `Classes.DIALOG_HEADER`
      * will be rendered inside the dialog before any children elements.
      */
    var title: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Name of the transition for internal `CSSTransition`. Providing your own
      * name here will require defining new CSS transition properties.
      */
    var transitionName: js.UndefOr[String] = js.undefined
  }
  object IDialogProps {
    
    inline def apply(isOpen: Boolean): IDialogProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogProps]
    }
    
    extension [Self <: IDialogProps](x: Self) {
      
      inline def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsCloseButtonShown(value: Boolean): Self = StObject.set(x, "isCloseButtonShown", value.asInstanceOf[js.Any])
      
      inline def setIsCloseButtonShownUndefined: Self = StObject.set(x, "isCloseButtonShown", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
}
