package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
State effects can be used to represent additional effects
associated with a [transaction](https://codemirror.net/6/docs/ref/#state.Transaction.effects). They
are often useful to model changes to custom [state
fields](https://codemirror.net/6/docs/ref/#state.StateField), when those changes aren't implicit in
document or selection changes.
*/
trait StateEffect[Value] extends StObject {
  
  /**
    Tells you whether this effect object is of a given
    [type](https://codemirror.net/6/docs/ref/#state.StateEffectType).
    */
  def is[T](`type`: StateEffectType[T]): /* is @codemirror/state.@codemirror/state.StateEffect<T> */ Boolean
  
  /**
    Map this effect through a position mapping. Will return
    `undefined` when that ends up deleting the effect.
    */
  def map(mapping: ChangeDesc): js.UndefOr[StateEffect[Value]]
  
  /**
    The value of this effect.
    */
  val value: Value
}
object StateEffect {
  
  inline def apply[Value](
    is: StateEffectType[Any] => /* is @codemirror/state.@codemirror/state.StateEffect<T> */ Boolean,
    map: ChangeDesc => js.UndefOr[StateEffect[Value]],
    value: Value
  ): StateEffect[Value] = {
    val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is), map = js.Any.fromFunction1(map), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateEffect[Value]]
  }
  
  extension [Self <: StateEffect[?], Value](x: Self & StateEffect[Value]) {
    
    inline def setIs(value: StateEffectType[Any] => /* is @codemirror/state.@codemirror/state.StateEffect<T> */ Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setMap(value: ChangeDesc => js.UndefOr[StateEffect[Value]]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
