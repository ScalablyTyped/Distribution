package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object menuMod {
  
  type ArrayItemsT = js.Array[typings.baseui.menuMod.ItemT]
  
  type GetRequiredItemProps = js.Function2[/* item */ js.Any, /* index */ scala.Double, typings.baseui.menuMod.RenderItemProps]
  
  type ItemT = js.Any
  
  type ItemsT = typings.baseui.menuMod.ArrayItemsT | typings.baseui.menuMod.GroupedItemsT
  
  @scala.inline
  def Menu: typings.react.mod.FC[typings.baseui.menuMod.StatelessMenuProps] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("Menu").asInstanceOf[typings.react.mod.FC[typings.baseui.menuMod.StatelessMenuProps]]
  
  type OnItemSelect = js.Function1[/* args */ typings.baseui.anon.Item, js.Any]
  
  @scala.inline
  def OptionList: typings.react.mod.FC[typings.baseui.menuMod.OptionListProps] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("OptionList").asInstanceOf[typings.react.mod.FC[typings.baseui.menuMod.OptionListProps]]
  
  @scala.inline
  def OptionProfile: typings.react.mod.FC[typings.baseui.menuMod.OptionProfileProps] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("OptionProfile").asInstanceOf[typings.react.mod.FC[typings.baseui.menuMod.OptionProfileProps]]
  
  type StateReducer = js.Function3[
    /* changeType */ typings.baseui.baseuiStrings.moveDown | typings.baseui.baseuiStrings.moveUp | typings.baseui.baseuiStrings.reset | typings.baseui.baseuiStrings.enter_ | typings.baseui.baseuiStrings.click | typings.baseui.baseuiStrings.character | typings.baseui.baseuiStrings.focus | typings.baseui.baseuiStrings.mouseEnter, 
    /* changes */ typings.baseui.menuMod.StatefulContainerState, 
    /* currentState */ typings.baseui.menuMod.StatefulContainerState, 
    typings.baseui.menuMod.StatefulContainerState
  ]
  
  type StatefulMenuProps = typings.baseui.menuMod.StatefulContainerProps with typings.baseui.menuMod.MenuProps
  
  type StatelessMenuProps = typings.baseui.menuMod.SharedStatelessProps with typings.baseui.menuMod.MenuProps
  
  @scala.inline
  def StyledEmptyState: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledEmptyState").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledList: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledList").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledListItem: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledListItem").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledListItemProfile: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledListItemProfile").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileBody: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileBody").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileImg: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileImg").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileImgContainer: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileImgContainer").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileLabelsContainer: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileLabelsContainer").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileSubtitle: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileSubtitle").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileTitle: typings.styletronReact.mod.StyletronComponent[js.Any] = typings.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileTitle").asInstanceOf[typings.styletronReact.mod.StyletronComponent[js.Any]]
}
