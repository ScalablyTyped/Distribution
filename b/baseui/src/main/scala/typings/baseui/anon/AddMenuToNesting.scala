package typings.baseui.anon

import typings.baseui.baseuiStrings.character
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.enter_
import typings.baseui.baseuiStrings.focus
import typings.baseui.baseuiStrings.mouseEnter
import typings.baseui.baseuiStrings.mouseLeave
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveUp
import typings.baseui.baseuiStrings.reset
import typings.baseui.menuTypesMod.StateReducerFn
import typings.baseui.menuTypesMod.StatefulContainerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddMenuToNesting extends StObject {
  
  def addMenuToNesting(): Unit
  
  def children(): Any
  
  var forceHighlight: Boolean
  
  def getChildMenu(): Unit
  
  def getParentMenu(): Unit
  
  def getRequiredItemProps(): js.Object
  
  var initialState: HighlightedIndex
  
  def isNestedMenuVisible(): Boolean
  
  var keyboardControlNode: Current
  
  var nestedMenuHoverIndex: Double
  
  def onItemSelect(): Unit
  
  def removeMenuFromNesting(): Unit
  
  var stateReducer: StateReducerFn
  
  var typeAhead: Boolean
}
object AddMenuToNesting {
  
  inline def apply(
    addMenuToNesting: () => Unit,
    children: () => Any,
    forceHighlight: Boolean,
    getChildMenu: () => Unit,
    getParentMenu: () => Unit,
    getRequiredItemProps: () => js.Object,
    initialState: HighlightedIndex,
    isNestedMenuVisible: () => Boolean,
    keyboardControlNode: Current,
    nestedMenuHoverIndex: Double,
    onItemSelect: () => Unit,
    removeMenuFromNesting: () => Unit,
    stateReducer: (/* changeType */ js.UndefOr[
      click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
    ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState,
    typeAhead: Boolean
  ): AddMenuToNesting = {
    val __obj = js.Dynamic.literal(addMenuToNesting = js.Any.fromFunction0(addMenuToNesting), children = js.Any.fromFunction0(children), forceHighlight = forceHighlight.asInstanceOf[js.Any], getChildMenu = js.Any.fromFunction0(getChildMenu), getParentMenu = js.Any.fromFunction0(getParentMenu), getRequiredItemProps = js.Any.fromFunction0(getRequiredItemProps), initialState = initialState.asInstanceOf[js.Any], isNestedMenuVisible = js.Any.fromFunction0(isNestedMenuVisible), keyboardControlNode = keyboardControlNode.asInstanceOf[js.Any], nestedMenuHoverIndex = nestedMenuHoverIndex.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction0(onItemSelect), removeMenuFromNesting = js.Any.fromFunction0(removeMenuFromNesting), stateReducer = js.Any.fromFunction3(stateReducer), typeAhead = typeAhead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMenuToNesting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddMenuToNesting] (val x: Self) extends AnyVal {
    
    inline def setAddMenuToNesting(value: () => Unit): Self = StObject.set(x, "addMenuToNesting", js.Any.fromFunction0(value))
    
    inline def setChildren(value: () => Any): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
    
    inline def setForceHighlight(value: Boolean): Self = StObject.set(x, "forceHighlight", value.asInstanceOf[js.Any])
    
    inline def setGetChildMenu(value: () => Unit): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction0(value))
    
    inline def setGetParentMenu(value: () => Unit): Self = StObject.set(x, "getParentMenu", js.Any.fromFunction0(value))
    
    inline def setGetRequiredItemProps(value: () => js.Object): Self = StObject.set(x, "getRequiredItemProps", js.Any.fromFunction0(value))
    
    inline def setInitialState(value: HighlightedIndex): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setIsNestedMenuVisible(value: () => Boolean): Self = StObject.set(x, "isNestedMenuVisible", js.Any.fromFunction0(value))
    
    inline def setKeyboardControlNode(value: Current): Self = StObject.set(x, "keyboardControlNode", value.asInstanceOf[js.Any])
    
    inline def setNestedMenuHoverIndex(value: Double): Self = StObject.set(x, "nestedMenuHoverIndex", value.asInstanceOf[js.Any])
    
    inline def setOnItemSelect(value: () => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction0(value))
    
    inline def setRemoveMenuFromNesting(value: () => Unit): Self = StObject.set(x, "removeMenuFromNesting", js.Any.fromFunction0(value))
    
    inline def setStateReducer(
      value: (/* changeType */ js.UndefOr[
          click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
        ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setTypeAhead(value: Boolean): Self = StObject.set(x, "typeAhead", value.asInstanceOf[js.Any])
  }
}
