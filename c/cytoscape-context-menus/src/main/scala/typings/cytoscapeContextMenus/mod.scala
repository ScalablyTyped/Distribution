package typings.cytoscapeContextMenus

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.Core
import typings.cytoscape.mod.Ext
import typings.cytoscapeContextMenus.anon.CoreAsWell
import typings.cytoscapeContextMenus.anon.Height
import typings.cytoscapeContextMenus.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-context-menus", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  @js.native
  trait ContextMenu extends StObject {
    
    /**
      * Appends given menu item to the menu items list.
      * If parentID is specified, the item is inserted to the submenu of the item with parentID.
      * If the parent has no submenu then it will automatically be created.
      * Otherwise, the specified item will be inserted to the root of the context menu.
      * @param item Menu item to append.
      * @param parentID [optional] ID of the parent menu item.
      */
    def appendMenuItem(item: MenuItem): js.UndefOr[Core] = js.native
    def appendMenuItem(item: MenuItem, parentID: String): js.UndefOr[Core] = js.native
    
    /**
      * Appends given menu items to the menu items list.
      * @param items Menu items to append.
      * @param parentID [optional] ID of the parent menu item.
      */
    def appendMenuItems(items: js.Array[MenuItem]): js.UndefOr[Core] = js.native
    def appendMenuItems(items: js.Array[MenuItem], parentID: String): js.UndefOr[Core] = js.native
    
    /**
      * Destroys the extension instance.
      */
    def destroy(): js.UndefOr[Core] = js.native
    
    /**
      * Disables the menu item with the given ID.
      * @param itemID ID of the menu item to disable.
      */
    def disableMenuItem(itemID: String): js.UndefOr[Core] = js.native
    
    /**
      * Enables the menu item with the given ID.
      * @param itemID ID of the menu item to enable.
      */
    def enableMenuItem(itemID: String): js.UndefOr[Core] = js.native
    
    /**
      * Hides the menu item with the given ID.
      * @param itemID ID of the menu item to hide.
      */
    def hideMenuItem(itemID: String): js.UndefOr[Core] = js.native
    
    /**
      * Inserts given item before the existing item with the given ID.
      * @param item Menu item to insert.
      * @param existingItemID ID of the existing menu item.
      */
    def insertBeforeMenuItem(item: MenuItem, existingItemID: String): js.UndefOr[Core] = js.native
    
    /**
      * Returns whether the extension is active.
      */
    def isActive(): js.UndefOr[Boolean] = js.native
    
    /**
      * Inserts the item before the existing item with the given ID and moves it to the submenu that contains the existing item.
      * @param itemID ID of the menu item to move.
      * @param existingItemID ID of the existing menu item.
      */
    def moveBeforeOtherMenuItem(itemID: String, existingItemID: String): js.UndefOr[Core] = js.native
    
    /**
      * Moves the item with the given ID to the submenu of the parent with the given ID or to the root with the specified options.
      *
      * If options is a string, then it is the Id of the parent.
      * If options is an object, then old properties are overwritten by them and the menu item is moved to the root.
      * Otherwise, the item is not moved.
      * If options is null or not provided, then the item is moved the root.
      * @param itemID ID of the menu item to move.
      * @param options [optional] Object with menu item properties coreAsWell and/or selector.
      */
    def moveToSubmenu(itemID: String): js.UndefOr[Core] = js.native
    def moveToSubmenu(itemID: String, options: String): js.UndefOr[Core] = js.native
    def moveToSubmenu(itemID: String, options: CoreAsWell): js.UndefOr[Core] = js.native
    
    /**
      * Removes the menu item with the given ID and its submenu along with it.
      * @param itemID ID of the menu item to remove.
      */
    def removeMenuItem(itemID: String): js.UndefOr[Core] = js.native
    
    /**
      * Sets whether the menu item with given ID will have a following divider.
      * @param itemID ID of the menu item.
      * @param status Whether the menu item will have a following divider.
      */
    def setTrailingDivider(itemID: String, status: Boolean): js.UndefOr[Core] = js.native
    
    /**
      * Shows the menu item with the given ID.
      * @param itemID ID of the menu item to show.
      */
    def showMenuItem(itemID: String): js.UndefOr[Core] = js.native
  }
  
  trait MenuItem extends StObject {
    
    /**
      * Display content of the menu item.
      */
    var content: String
    
    /**
      * Whether the core instance will have this item on context menu event.
      */
    var coreAsWell: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the item be initially disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the menu item will have a trailing divider.
      */
    var hasTrailingDivider: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ID of the menu item.
      */
    var id: String
    
    /**
      * Menu icon.
      */
    var image: js.UndefOr[Src] = js.undefined
    
    /**
      * The function to be executed when the menu item is clicked.
      */
    var onClickFunction: js.UndefOr[Any] = js.undefined
    
    /**
      * Filters the elements to have this menu item on the context menu event.
      * If the selector is not truthy, no elements will have this menu item.
      */
    var selector: String
    
    /**
      * Whether the item will be shown.
      */
    var show: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shows the listed menu items as a submenu for this item.
      * An item must have either a submenu or onClickFunction or both.
      */
    var submenu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tooltip text of the menu item.
      */
    var tooltipText: js.UndefOr[String] = js.undefined
  }
  object MenuItem {
    
    inline def apply(content: String, id: String, selector: String): MenuItem = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setCoreAsWell(value: Boolean): Self = StObject.set(x, "coreAsWell", value.asInstanceOf[js.Any])
      
      inline def setCoreAsWellUndefined: Self = StObject.set(x, "coreAsWell", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHasTrailingDivider(value: Boolean): Self = StObject.set(x, "hasTrailingDivider", value.asInstanceOf[js.Any])
      
      inline def setHasTrailingDividerUndefined: Self = StObject.set(x, "hasTrailingDivider", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Src): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setOnClickFunction(value: Any): Self = StObject.set(x, "onClickFunction", value.asInstanceOf[js.Any])
      
      inline def setOnClickFunctionUndefined: Self = StObject.set(x, "onClickFunction", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSubmenu(value: Boolean): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
      
      inline def setTooltipText(value: String): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
      
      inline def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
    }
  }
  
  trait MenuOptions extends StObject {
    
    /**
      * List of css classes to apply to the context menu.
      * Default: ['cy-context-menus-cxt-menu']
      */
    var contextMenuClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The event that brings up the context menu.
      * Possible options: https://js.cytoscape.org/#events/user-input-device-events
      * Default: 'cxttap'
      */
    var evtType: js.UndefOr[String] = js.undefined
    
    /**
      * List of css classes to apply to the menu items.
      * Default: ['cy-context-menus-cxt-menuitem']
      */
    var menuItemClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * List of initial menu items.
      * Default: []
      */
    var menuItems: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    /**
      * Indicates that the menu item has a submenu.
      * Default: { src: 'assets/submenu-indicator-default.svg', width: 12, height: 12 }
      */
    var submenuIndicator: js.UndefOr[Height] = js.undefined
  }
  object MenuOptions {
    
    inline def apply(): MenuOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
      
      inline def setContextMenuClasses(value: js.Array[String]): Self = StObject.set(x, "contextMenuClasses", value.asInstanceOf[js.Any])
      
      inline def setContextMenuClassesUndefined: Self = StObject.set(x, "contextMenuClasses", js.undefined)
      
      inline def setContextMenuClassesVarargs(value: String*): Self = StObject.set(x, "contextMenuClasses", js.Array(value*))
      
      inline def setEvtType(value: String): Self = StObject.set(x, "evtType", value.asInstanceOf[js.Any])
      
      inline def setEvtTypeUndefined: Self = StObject.set(x, "evtType", js.undefined)
      
      inline def setMenuItemClasses(value: js.Array[String]): Self = StObject.set(x, "menuItemClasses", value.asInstanceOf[js.Any])
      
      inline def setMenuItemClassesUndefined: Self = StObject.set(x, "menuItemClasses", js.undefined)
      
      inline def setMenuItemClassesVarargs(value: String*): Self = StObject.set(x, "menuItemClasses", js.Array(value*))
      
      inline def setMenuItems(value: js.Array[MenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
      
      inline def setMenuItemsVarargs(value: MenuItem*): Self = StObject.set(x, "menuItems", js.Array(value*))
      
      inline def setSubmenuIndicator(value: Height): Self = StObject.set(x, "submenuIndicator", value.asInstanceOf[js.Any])
      
      inline def setSubmenuIndicatorUndefined: Self = StObject.set(x, "submenuIndicator", js.undefined)
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
  
  object global {
    
    object cytoscape {
      
      @js.native
      trait Core extends StObject {
        
        def contextMenus(options: String): ContextMenu = js.native
        /**
          * Initializes and/or returns the context menu instance.
          * @param options The options for the context menu or "get" to get the current instance.
          */
        def contextMenus(options: MenuOptions): ContextMenu = js.native
      }
    }
  }
}
