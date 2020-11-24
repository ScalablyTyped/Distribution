package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object menuMod {
  
  type ArrayItemsT = js.Array[typings.baseui.menuMod.ItemT]
  
  type GetRequiredItemProps = js.Function2[/* item */ js.Any, /* index */ scala.Double, typings.baseui.menuMod.RenderItemProps]
  
  type ItemT = js.Any
  
  type ItemsT = typings.baseui.menuMod.ArrayItemsT | typings.baseui.menuMod.GroupedItemsT
  
  type OnItemSelect = js.Function1[/* args */ typings.baseui.anon.Item, js.Any]
  
  type StateReducer = js.Function3[
    /* changeType */ typings.baseui.baseuiStrings.moveDown | typings.baseui.baseuiStrings.moveUp | typings.baseui.baseuiStrings.reset | typings.baseui.baseuiStrings.enter_ | typings.baseui.baseuiStrings.click | typings.baseui.baseuiStrings.character | typings.baseui.baseuiStrings.focus | typings.baseui.baseuiStrings.mouseEnter, 
    /* changes */ typings.baseui.menuMod.StatefulContainerState, 
    /* currentState */ typings.baseui.menuMod.StatefulContainerState, 
    typings.baseui.menuMod.StatefulContainerState
  ]
  
  type StatefulMenuProps = typings.baseui.menuMod.StatefulContainerProps with typings.baseui.menuMod.MenuProps
  
  type StatelessMenuProps = typings.baseui.menuMod.SharedStatelessProps with typings.baseui.menuMod.MenuProps
}
