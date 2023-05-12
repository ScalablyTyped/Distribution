package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsDialogDialogFooterMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialogFooter", "DialogFooter")
  @js.native
  open class DialogFooter protected ()
    extends AbstractPureComponent2[DialogFooterProps, js.Object, js.Object] {
    def this(props: DialogFooterProps) = this()
    def this(props: DialogFooterProps, context: Any) = this()
    
    /** Optionally render the footer actions (right aligned). */
    /* private */ var maybeRenderActionsSection: Any = js.native
    
    /** Render the main footer section (left aligned). */
    /* private */ var renderMainSection: Any = js.native
  }
  /* static members */
  object DialogFooter {
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialogFooter", "DialogFooter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialogFooter", "DialogFooter.defaultProps")
    @js.native
    def defaultProps: DialogFooterProps = js.native
    inline def defaultProps_=(x: DialogFooterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait DialogFooterProps
    extends StObject
       with IProps {
    
    /** Dialog actions (typically buttons) are rendered on the right side of the footer. */
    var actions: js.UndefOr[ReactNode] = js.undefined
    
    /** Child contents are rendered on the left side of the footer. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Use a "minimal" appearance for the footer, simply applying an HTML role and
      * some visual padding. This is useful for small dialogs, and should not be used
      * with `<DialogBody useOverflowScrollContainer>`.
      *
      * Note that this is the default behavior when using the CSS API, since that's
      * how the `-dialog-footer` class was first introduced, so these styles are
      * applied without a "modifier" class.
      *
      * When using the JS component API, `minimal` is false by default.
      *
      * Show the footer close from the content.
      * Do not use with scroll body
      * Use for small dialogs (confirm)
      *
      * @default false;
      */
    var minimal: js.UndefOr[Boolean] = js.undefined
  }
  object DialogFooterProps {
    
    inline def apply(): DialogFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogFooterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogFooterProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: ReactNode): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
    }
  }
}
