package typings.cypress.JQuery

import typings.cypress.Anon_HandleObjHandleObject
import typings.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SpecialEventHook[TTarget, TData] extends js.Object

object _SpecialEventHook {
  @scala.inline
  def Anon_NoBubble[TTarget, TData](noBubble: Boolean): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(noBubble = noBubble.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_Add[TTarget, TData](add: HandleObject[TTarget, TData] => Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DataEvent[TTarget, TData](trigger: (Event, TData) => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction2(trigger))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_Event[TTarget, TData](preDispatch: Event => `false` | Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_HandleObj[TTarget, TData](remove: HandleObject[TTarget, TData] => Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DataDefault[TTarget, TData](_default: (TriggeredEvent[TTarget, TData, _, _], TData) => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(_default = js.Any.fromFunction2(_default))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_EventPostDispatch[TTarget, TData](postDispatch: Event => Unit): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_BindType[TTarget, TData](bindType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(bindType = bindType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DelegateType[TTarget, TData](delegateType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(delegateType = delegateType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_Data[TTarget, TData](setup: (TData, String, EventHandler[TTarget, TData]) => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(setup = js.Any.fromFunction3(setup))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_False[TTarget, TData](teardown: () => Unit | `false`): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DataEventHandle[TTarget, TData](
    handle: ((TriggeredEvent[TTarget, TData, _, _]) with (Anon_HandleObjHandleObject[TTarget, TData]), /* repeated */ TData) => Unit
  ): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
}

