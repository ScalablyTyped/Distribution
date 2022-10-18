package typings.blueprintjsPopover2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPopupKindMod {
  
  @js.native
  sealed trait PopupKind extends StObject
  @JSImport("@blueprintjs/popover2/lib/esm/popupKind", "PopupKind")
  @js.native
  object PopupKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PopupKind & String] = js.native
    
    /** The popup is a dialog. */
    @js.native
    sealed trait DIALOG
      extends StObject
         with PopupKind
    /* "dialog" */ val DIALOG: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.DIALOG & String = js.native
    
    /** The popup is a grid. */
    @js.native
    sealed trait GRID
      extends StObject
         with PopupKind
    /* "grid" */ val GRID: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.GRID & String = js.native
    
    /** The popup is a listbox. */
    @js.native
    sealed trait LISTBOX
      extends StObject
         with PopupKind
    /* "listbox" */ val LISTBOX: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.LISTBOX & String = js.native
    
    /** The popup is a menu. */
    @js.native
    sealed trait MENU
      extends StObject
         with PopupKind
    /* "menu" */ val MENU: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.MENU & String = js.native
    
    /** The popup is a tree. */
    @js.native
    sealed trait TREE
      extends StObject
         with PopupKind
    /* "tree" */ val TREE: typings.blueprintjsPopover2.libEsmPopupKindMod.PopupKind.TREE & String = js.native
  }
}
