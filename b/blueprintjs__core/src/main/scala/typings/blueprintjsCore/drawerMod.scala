package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.overlayMod.IBackdropProps
import typings.blueprintjsCore.overlayMod.IOverlayableProps
import typings.blueprintjsCore.positionMod.Position
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer")
  @js.native
  class Drawer protected ()
    extends AbstractPureComponent2[IDrawerProps, js.Object, js.Object] {
    def this(props: IDrawerProps) = this()
    def this(props: IDrawerProps, context: js.Any) = this()
    
    var maybeRenderCloseButton: js.Any = js.native
    
    var maybeRenderHeader: js.Any = js.native
  }
  /* static members */
  object Drawer {
    
    @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer.SIZE_LARGE")
    @js.native
    val SIZE_LARGE: /* "90%" */ String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer.SIZE_SMALL")
    @js.native
    val SIZE_SMALL: /* "360px" */ String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer.SIZE_STANDARD")
    @js.native
    val SIZE_STANDARD: /* "50%" */ String = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer.defaultProps")
    @js.native
    def defaultProps: IDrawerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDrawerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDrawerProps
    extends IOverlayableProps
       with IBackdropProps
       with IProps {
    
    /**
      * Name of a Blueprint UI icon (or an icon element) to render in the
      * drawer's header. Note that the header will only be rendered if `title` is
      * provided.
      */
    var icon: js.UndefOr[IconName | MaybeElement] = js.native
    
    /**
      * Whether to show the close button in the dialog's header.
      * Note that the header will only be rendered if `title` is provided.
      * @default true
      */
    var isCloseButtonShown: js.UndefOr[Boolean] = js.native
    
    /**
      * Toggles the visibility of the overlay and its children.
      * This prop is required because the component is controlled.
      */
    var isOpen: Boolean = js.native
    
    /**
      * Position of a drawer. All angled positions will be casted into pure positions
      * (TOP, BOTTOM, LEFT or RIGHT).
      * @default Position.RIGHT
      */
    var position: js.UndefOr[Position] = js.native
    
    /**
      * CSS size of the drawer. This sets `width` if `vertical={false}` (default)
      * and `height` otherwise.
      *
      * Constants are available for common sizes:
      * - `Drawer.SIZE_SMALL = 360px`
      * - `Drawer.SIZE_STANDARD = 50%`
      * - `Drawer.SIZE_LARGE = 90%`
      *
      * @default Drawer.SIZE_STANDARD = "50%"
      */
    var size: js.UndefOr[Double | String] = js.native
    
    /**
      * CSS styles to apply to the dialog.
      * @default {}
      */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Title of the dialog. If provided, an element with `Classes.DIALOG_HEADER`
      * will be rendered inside the dialog before any children elements.
      */
    var title: js.UndefOr[ReactNode] = js.native
    
    /**
      * Name of the transition for internal `CSSTransition`. Providing your own
      * name here will require defining new CSS transition properties.
      */
    var transitionName: js.UndefOr[String] = js.native
    
    /**
      * Whether the drawer should appear with vertical styling.
      * It will be ignored if `position` prop is set
      * @default false
      * @deprecated use `position` instead
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object IDrawerProps {
    
    @scala.inline
    def apply(isOpen: Boolean): IDrawerProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDrawerProps]
    }
    
    @scala.inline
    implicit class IDrawerPropsMutableBuilder[Self <: IDrawerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsCloseButtonShown(value: Boolean): Self = StObject.set(x, "isCloseButtonShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCloseButtonShownUndefined: Self = StObject.set(x, "isCloseButtonShown", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
