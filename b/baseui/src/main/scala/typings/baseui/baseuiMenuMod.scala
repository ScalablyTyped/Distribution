package typings.baseui

import typings.baseui.anon.AddMenuToNesting
import typings.baseui.anon.StyledPropsitemanyundefin
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.enter_
import typings.baseui.baseuiStrings.h6
import typings.baseui.baseuiStrings.img
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.p
import typings.baseui.baseuiStrings.ul
import typings.baseui.menuStyledComponentsMod.StyledProps
import typings.baseui.menuTypesMod.ArrayItems
import typings.baseui.menuTypesMod.GetRequiredItemPropsFn
import typings.baseui.menuTypesMod.GroupedItems
import typings.baseui.menuTypesMod.Item
import typings.baseui.menuTypesMod.Items
import typings.baseui.menuTypesMod.MenuProps
import typings.baseui.menuTypesMod.NestedMenuContextProps
import typings.baseui.menuTypesMod.OnItemSelectFn
import typings.baseui.menuTypesMod.OptionListProps
import typings.baseui.menuTypesMod.OptionProfileProps
import typings.baseui.menuTypesMod.StateReducerFn
import typings.baseui.menuTypesMod.StatefulContainerProps
import typings.baseui.menuTypesMod.StatelessMenuProps
import typings.baseui.nestedMenusMod.default
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.NamedExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseuiMenuMod {
  
  @JSImport("baseui/menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object KEY_STRINGS {
    
    @JSImport("baseui/menu", "KEY_STRINGS.ArrowDown")
    @js.native
    val ArrowDown: typings.baseui.baseuiStrings.ArrowDown = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.ArrowLeft")
    @js.native
    val ArrowLeft: typings.baseui.baseuiStrings.ArrowLeft = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.ArrowRight")
    @js.native
    val ArrowRight: typings.baseui.baseuiStrings.ArrowRight = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.ArrowUp")
    @js.native
    val ArrowUp: typings.baseui.baseuiStrings.ArrowUp = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Backspace")
    @js.native
    val Backspace: typings.baseui.baseuiStrings.Backspace = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.End")
    @js.native
    val End: typings.baseui.baseuiStrings.End = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Enter")
    @js.native
    val Enter: typings.baseui.baseuiStrings.Enter = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Escape")
    @js.native
    val Escape: typings.baseui.baseuiStrings.Escape = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Home")
    @js.native
    val Home: typings.baseui.baseuiStrings.Home = js.native
    
    @JSImport("baseui/menu", "KEY_STRINGS.Space")
    @js.native
    val Space: typings.baseui.baseuiStrings.Space = js.native
  }
  
  inline def Menu(props: StatelessMenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Menu")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/menu", "NestedMenuContext")
  @js.native
  val NestedMenuContext: Context[NestedMenuContextProps] = js.native
  
  @JSImport("baseui/menu", "NestedMenus")
  @js.native
  open class NestedMenus () extends default
  
  @JSImport("baseui/menu", "OptionList")
  @js.native
  val OptionList: NamedExoticComponent[OptionListProps] = js.native
  
  @JSImport("baseui/menu", "OptionProfile")
  @js.native
  val OptionProfile: ForwardRefExoticComponent[OptionProfileProps & RefAttributes[HTMLElement]] = js.native
  
  object STATE_CHANGE_TYPES {
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.character")
    @js.native
    val character: typings.baseui.baseuiStrings.character = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.click")
    @js.native
    val click: typings.baseui.baseuiStrings.click = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.enter")
    @js.native
    val enter: enter_ = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.focus")
    @js.native
    val focus: typings.baseui.baseuiStrings.focus = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.mouseEnter")
    @js.native
    val mouseEnter: typings.baseui.baseuiStrings.mouseEnter = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.mouseLeave")
    @js.native
    val mouseLeave: typings.baseui.baseuiStrings.mouseLeave = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.moveDown")
    @js.native
    val moveDown: typings.baseui.baseuiStrings.moveDown = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.moveUp")
    @js.native
    val moveUp: typings.baseui.baseuiStrings.moveUp = js.native
    
    @JSImport("baseui/menu", "STATE_CHANGE_TYPES.reset")
    @js.native
    val reset: typings.baseui.baseuiStrings.reset = js.native
  }
  
  object StatefulContainer {
    
    inline def apply(props: StatefulContainerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/menu", "StatefulContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/menu", "StatefulContainer.defaultProps")
    @js.native
    def defaultProps: AddMenuToNesting = js.native
    inline def defaultProps_=(x: AddMenuToNesting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/menu", "StatefulMenu")
  @js.native
  open class StatefulMenu ()
    extends typings.baseui.statefulMenuMod.default
  
  @JSImport("baseui/menu", "StyledEmptyState")
  @js.native
  val StyledEmptyState: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledList")
  @js.native
  val StyledList: StyletronComponent[ul, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledListItem")
  @js.native
  val StyledListItem: StyletronComponent[li_, StyledPropsitemanyundefin] = js.native
  
  @JSImport("baseui/menu", "StyledListItemProfile")
  @js.native
  val StyledListItemProfile: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledMenuDivider")
  @js.native
  val StyledMenuDivider: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledProfileBody")
  @js.native
  val StyledProfileBody: StyletronComponent[p, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledProfileImg")
  @js.native
  val StyledProfileImg: StyletronComponent[img, js.Object] = js.native
  
  @JSImport("baseui/menu", "StyledProfileImgContainer")
  @js.native
  val StyledProfileImgContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/menu", "StyledProfileLabelsContainer")
  @js.native
  val StyledProfileLabelsContainer: StyletronComponent[div, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledProfileSubtitle")
  @js.native
  val StyledProfileSubtitle: StyletronComponent[p, StyledProps] = js.native
  
  @JSImport("baseui/menu", "StyledProfileTitle")
  @js.native
  val StyledProfileTitle: StyletronComponent[h6, StyledProps] = js.native
  
  type ArrayItemsT = ArrayItems
  
  type BaseMenuPropsT = MenuProps
  
  type GetRequiredItemProps = GetRequiredItemPropsFn
  
  type GroupedItemsT = GroupedItems
  
  type ItemT = Item
  
  type ItemsT = Items
  
  type OnItemSelect = OnItemSelectFn
  
  type StateReducer = StateReducerFn
}
