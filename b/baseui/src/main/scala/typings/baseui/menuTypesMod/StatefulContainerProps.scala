package typings.baseui.menuTypesMod

import typings.baseui.anon.PartialStatefulContainerS
import typings.baseui.anon.`14`
import typings.baseui.baseuiStrings.character
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.enter_
import typings.baseui.baseuiStrings.focus
import typings.baseui.baseuiStrings.mouseEnter
import typings.baseui.baseuiStrings.mouseLeave
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveUp
import typings.baseui.baseuiStrings.reset
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulContainerProps extends StObject {
  
  var addMenuToNesting: js.UndefOr[js.Function1[/* ref */ `14`, Unit]] = js.undefined
  
  /** Child as function pattern. */
  def children(a: RenderProps): ReactNode
  
  var forceHighlight: Boolean
  
  var getChildMenu: js.UndefOr[js.Function1[/* ref */ `14`, js.UndefOr[`14` | Null]]] = js.undefined
  
  var getParentMenu: js.UndefOr[js.Function1[/* ref */ `14`, js.UndefOr[`14` | Null]]] = js.undefined
  
  /** Function to get props for each rendered item. This will have some defaults needed for keyboard
    * bindings to work properly. Every rendered item should call this.
    */
  var getRequiredItemProps: GetRequiredItemPropsFn
  
  /** Initial state of the stateful menu. */
  var initialState: InitialState
  
  var isNestedMenuVisible: js.UndefOr[js.Function1[/* ref */ `14`, Boolean]] = js.undefined
  
  /** List of menu items. */
  var items: Items
  
  /** Node for menu's keyboard listener. Default is null and keyboard handlers will listen on menu root. */
  var keyboardControlNode: `14`
  
  var nestedMenuHoverIndex: js.UndefOr[Double] = js.undefined
  
  var onActiveDescendantChange: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Any]] = js.undefined
  
  /** Callback executed on menu item clicks. */
  var onItemSelect: OnItemSelectFn
  
  var removeMenuFromNesting: js.UndefOr[js.Function1[/* ref */ `14`, Unit]] = js.undefined
  
  /** Ref for the menu container element. Used to capture key events for navigation */
  var rootRef: js.UndefOr[RootRef] = js.undefined
  
  /** State reducer to intercept state changes and return new internal state */
  var stateReducer: StateReducerFn
  
  /** whether has keyboard type-ahead function */
  var typeAhead: Boolean
}
object StatefulContainerProps {
  
  inline def apply(
    children: RenderProps => ReactNode,
    forceHighlight: Boolean,
    getRequiredItemProps: (/* item */ Item, /* index */ Double) => RenderItemProps,
    initialState: InitialState,
    items: Items,
    keyboardControlNode: `14`,
    onItemSelect: /* a */ typings.baseui.anon.Item => Any,
    stateReducer: (/* changeType */ js.UndefOr[
      click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
    ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState,
    typeAhead: Boolean
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), forceHighlight = forceHighlight.asInstanceOf[js.Any], getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), initialState = initialState.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], keyboardControlNode = keyboardControlNode.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction1(onItemSelect), stateReducer = js.Any.fromFunction3(stateReducer), typeAhead = typeAhead.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
  
  extension [Self <: StatefulContainerProps](x: Self) {
    
    inline def setAddMenuToNesting(value: /* ref */ `14` => Unit): Self = StObject.set(x, "addMenuToNesting", js.Any.fromFunction1(value))
    
    inline def setAddMenuToNestingUndefined: Self = StObject.set(x, "addMenuToNesting", js.undefined)
    
    inline def setChildren(value: RenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setForceHighlight(value: Boolean): Self = StObject.set(x, "forceHighlight", value.asInstanceOf[js.Any])
    
    inline def setGetChildMenu(value: /* ref */ `14` => js.UndefOr[`14` | Null]): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
    
    inline def setGetChildMenuUndefined: Self = StObject.set(x, "getChildMenu", js.undefined)
    
    inline def setGetParentMenu(value: /* ref */ `14` => js.UndefOr[`14` | Null]): Self = StObject.set(x, "getParentMenu", js.Any.fromFunction1(value))
    
    inline def setGetParentMenuUndefined: Self = StObject.set(x, "getParentMenu", js.undefined)
    
    inline def setGetRequiredItemProps(value: (/* item */ Item, /* index */ Double) => RenderItemProps): Self = StObject.set(x, "getRequiredItemProps", js.Any.fromFunction2(value))
    
    inline def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setIsNestedMenuVisible(value: /* ref */ `14` => Boolean): Self = StObject.set(x, "isNestedMenuVisible", js.Any.fromFunction1(value))
    
    inline def setIsNestedMenuVisibleUndefined: Self = StObject.set(x, "isNestedMenuVisible", js.undefined)
    
    inline def setItems(value: Items): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeyboardControlNode(value: `14`): Self = StObject.set(x, "keyboardControlNode", value.asInstanceOf[js.Any])
    
    inline def setNestedMenuHoverIndex(value: Double): Self = StObject.set(x, "nestedMenuHoverIndex", value.asInstanceOf[js.Any])
    
    inline def setNestedMenuHoverIndexUndefined: Self = StObject.set(x, "nestedMenuHoverIndex", js.undefined)
    
    inline def setOnActiveDescendantChange(value: /* id */ js.UndefOr[String] => Any): Self = StObject.set(x, "onActiveDescendantChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveDescendantChangeUndefined: Self = StObject.set(x, "onActiveDescendantChange", js.undefined)
    
    inline def setOnItemSelect(value: /* a */ typings.baseui.anon.Item => Any): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction1(value))
    
    inline def setRemoveMenuFromNesting(value: /* ref */ `14` => Unit): Self = StObject.set(x, "removeMenuFromNesting", js.Any.fromFunction1(value))
    
    inline def setRemoveMenuFromNestingUndefined: Self = StObject.set(x, "removeMenuFromNesting", js.undefined)
    
    inline def setRootRef(value: RootRef): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
    
    inline def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    
    inline def setStateReducer(
      value: (/* changeType */ js.UndefOr[
          click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
        ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setTypeAhead(value: Boolean): Self = StObject.set(x, "typeAhead", value.asInstanceOf[js.Any])
  }
}
