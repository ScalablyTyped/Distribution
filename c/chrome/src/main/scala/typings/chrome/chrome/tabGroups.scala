package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Tab Groups
////////////////////
/**
  * Use the chrome.tabGroups API to interact with the browser's tab grouping system. You can use this API to modify and rearrange tab groups in the browser. To group and ungroup tabs, or to query what tabs are in groups, use the chrome.tabs API.
  * Permissions:  "tabGroups"
  * @since Chrome 89. Manifest V3 and above.
  */
object tabGroups {
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.grey
    - typings.chrome.chromeStrings.blue
    - typings.chrome.chromeStrings.red
    - typings.chrome.chromeStrings.yellow
    - typings.chrome.chromeStrings.green
    - typings.chrome.chromeStrings.pink
    - typings.chrome.chromeStrings.purple
    - typings.chrome.chromeStrings.cyan
    - typings.chrome.chromeStrings.orange
  */
  trait ColorEnum extends StObject
  object ColorEnum {
    
    inline def blue: typings.chrome.chromeStrings.blue = "blue".asInstanceOf[typings.chrome.chromeStrings.blue]
    
    inline def cyan: typings.chrome.chromeStrings.cyan = "cyan".asInstanceOf[typings.chrome.chromeStrings.cyan]
    
    inline def green: typings.chrome.chromeStrings.green = "green".asInstanceOf[typings.chrome.chromeStrings.green]
    
    inline def grey: typings.chrome.chromeStrings.grey = "grey".asInstanceOf[typings.chrome.chromeStrings.grey]
    
    inline def orange: typings.chrome.chromeStrings.orange = "orange".asInstanceOf[typings.chrome.chromeStrings.orange]
    
    inline def pink: typings.chrome.chromeStrings.pink = "pink".asInstanceOf[typings.chrome.chromeStrings.pink]
    
    inline def purple: typings.chrome.chromeStrings.purple = "purple".asInstanceOf[typings.chrome.chromeStrings.purple]
    
    inline def red: typings.chrome.chromeStrings.red = "red".asInstanceOf[typings.chrome.chromeStrings.red]
    
    inline def yellow: typings.chrome.chromeStrings.yellow = "yellow".asInstanceOf[typings.chrome.chromeStrings.yellow]
  }
  
  trait MoveProperties extends StObject {
    
    /** The position to move the group to. Use -1 to place the group at the end of the window. */
    var index: Double
    
    /** Optional. The window to move the group to. Defaults to the window the group is currently in. Note that groups can only be moved to and from windows with chrome.windows.WindowType type "normal". */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object MoveProperties {
    
    inline def apply(index: Double): MoveProperties = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveProperties]
    }
    
    extension [Self <: MoveProperties](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  trait QueryInfo extends StObject {
    
    /** Optional. Whether the groups are collapsed. */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The color of the groups. */
    var color: js.UndefOr[ColorEnum] = js.undefined
    
    /** Optional. Match group titles against a pattern. */
    var title: js.UndefOr[String] = js.undefined
    
    /** Optional. The ID of the window that contains the group. */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object QueryInfo {
    
    inline def apply(): QueryInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryInfo]
    }
    
    extension [Self <: QueryInfo](x: Self) {
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setColor(value: ColorEnum): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  trait TabGroup extends StObject {
    
    /** Whether the group is collapsed. A collapsed group is one whose tabs are hidden. */
    var collapsed: Boolean
    
    /** The group's color. */
    var color: ColorEnum
    
    /** The ID of the group. Group IDs are unique within a browser session. */
    var id: Double
    
    /** Optional. The title of the group. */
    var title: js.UndefOr[String] = js.undefined
    
    /** The ID of the window that contains the group. */
    var windowId: Double
  }
  object TabGroup {
    
    inline def apply(collapsed: Boolean, color: ColorEnum, id: Double, windowId: Double): TabGroup = {
      val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabGroup]
    }
    
    extension [Self <: TabGroup](x: Self) {
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setColor(value: ColorEnum): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    }
  }
  
  type TabGroupCreatedEvent = Event[js.Function1[/* group */ TabGroup, Unit]]
  
  type TabGroupMovedEvent = Event[js.Function1[/* group */ TabGroup, Unit]]
  
  type TabGroupRemovedEvent = Event[js.Function1[/* group */ TabGroup, Unit]]
  
  type TabGroupUpdated = Event[js.Function1[/* group */ TabGroup, Unit]]
  
  trait UpdateProperties extends StObject {
    
    /** Optional. Whether the group should be collapsed. */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The color of the group. */
    var color: js.UndefOr[ColorEnum] = js.undefined
    
    /** Optional. The title of the group. */
    var title: js.UndefOr[String] = js.undefined
  }
  object UpdateProperties {
    
    inline def apply(): UpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProperties]
    }
    
    extension [Self <: UpdateProperties](x: Self) {
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setColor(value: ColorEnum): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
