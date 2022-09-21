package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Representation of a type of state effect. Defined with
[`StateEffect.define`](https://codemirror.net/6/docs/ref/#state.StateEffect^define).
*/
@JSImport("@codemirror/state", "StateEffectType")
@js.native
open class StateEffectType[Value] () extends StObject {
  
  /**
    @internal
    */
  def map(value: Any, mapping: ChangeDesc): js.UndefOr[Any] = js.native
  
  /**
    Create a [state effect](https://codemirror.net/6/docs/ref/#state.StateEffect) instance of this
    type.
    */
  def of(value: Value): StateEffect[Value] = js.native
}
