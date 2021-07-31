package typings.baseui.datepickerMod

import typings.baseui.anon.Date
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.mouseLeave
import typings.baseui.baseuiStrings.mouseOver
import typings.baseui.baseuiStrings.moveDown
import typings.baseui.baseuiStrings.moveLeft
import typings.baseui.baseuiStrings.moveRight
import typings.baseui.baseuiStrings.moveUp
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulContainerProps[T] extends StObject {
  
  var children: js.UndefOr[js.Function1[/* args */ T, ReactNode]] = js.undefined
  
  var initialState: js.UndefOr[ContainerState] = js.undefined
  
  var onChange: js.UndefOr[typings.baseui.datepickerMod.onChange] = js.undefined
  
  var range: js.UndefOr[Boolean] = js.undefined
  
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}
object StatefulContainerProps {
  
  @scala.inline
  def apply[T](): StatefulContainerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulContainerProps[T]]
  }
  
  @scala.inline
  implicit class StatefulContainerPropsMutableBuilder[Self <: StatefulContainerProps[?], T] (val x: Self & StatefulContainerProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* args */ T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setInitialState(value: ContainerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ Date => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => ContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
