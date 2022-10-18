package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPositionMod.Position
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.blueprintjsCore.libEsmComponentsOverlayOverlayMod.IBackdropProps
import typings.blueprintjsCore.libEsmComponentsOverlayOverlayMod.IOverlayableProps
import typings.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsDrawerDrawerMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer")
  @js.native
  open class Drawer protected ()
    extends AbstractPureComponent2[DrawerProps, js.Object, js.Object] {
    def this(props: DrawerProps) = this()
    def this(props: DrawerProps, context: Any) = this()
    
    /* private */ var maybeRenderCloseButton: Any = js.native
    
    /* private */ var maybeRenderHeader: Any = js.native
  }
  /* static members */
  object Drawer {
    
    @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer.defaultProps")
    @js.native
    def defaultProps: DrawerProps = js.native
    inline def defaultProps_=(x: DrawerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "Drawer.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait DrawerSize extends StObject
  @JSImport("@blueprintjs/core/lib/esm/components/drawer/drawer", "DrawerSize")
  @js.native
  object DrawerSize extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DrawerSize & String] = js.native
    
    @js.native
    sealed trait LARGE
      extends StObject
         with DrawerSize
    /* "90%" */ val LARGE: typings.blueprintjsCore.libEsmComponentsDrawerDrawerMod.DrawerSize.LARGE & String = js.native
    
    @js.native
    sealed trait SMALL
      extends StObject
         with DrawerSize
    /* "360px" */ val SMALL: typings.blueprintjsCore.libEsmComponentsDrawerDrawerMod.DrawerSize.SMALL & String = js.native
    
    @js.native
    sealed trait STANDARD
      extends StObject
         with DrawerSize
    /* "50%" */ val STANDARD: typings.blueprintjsCore.libEsmComponentsDrawerDrawerMod.DrawerSize.STANDARD & String = js.native
  }
  
  type DrawerProps = IDrawerProps
  
  trait IDrawerProps
    extends StObject
       with IOverlayableProps
       with IBackdropProps
       with IProps {
    
    /** Drawer contents. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Name of a Blueprint UI icon (or an icon element) to render in the
      * drawer's header. Note that the header will only be rendered if `title` is
      * provided.
      */
    var icon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
    /**
      * Whether to show the close button in the dialog's header.
      * Note that the header will only be rendered if `title` is provided.
      *
      * @default true
      */
    var isCloseButtonShown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Toggles the visibility of the overlay and its children.
      * This prop is required because the component is controlled.
      */
    var isOpen: Boolean
    
    /**
      * Position of a drawer. All angled positions will be casted into pure positions
      * (TOP, BOTTOM, LEFT or RIGHT).
      *
      * @default Position.RIGHT
      */
    var position: js.UndefOr[Position] = js.undefined
    
    /**
      * CSS size of the drawer. This sets `width` if horizontal position (default)
      * and `height` otherwise.
      *
      * Constants are available for common sizes:
      * - `DrawerSize.SMALL = 360px`
      * - `DrawerSize.STANDARD = 50%`
      * - `DrawerSize.LARGE = 90%`
      *
      * @default DrawerSize.STANDARD = "50%"
      */
    var size: js.UndefOr[Double | String] = js.undefined
    
    /**
      * CSS styles to apply to the dialog.
      *
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
  object IDrawerProps {
    
    inline def apply(isOpen: Boolean): IDrawerProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDrawerProps]
    }
    
    extension [Self <: IDrawerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsCloseButtonShown(value: Boolean): Self = StObject.set(x, "isCloseButtonShown", value.asInstanceOf[js.Any])
      
      inline def setIsCloseButtonShownUndefined: Self = StObject.set(x, "isCloseButtonShown", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
}
