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
@JSImport("@codemirror/state", "StateEffect")
@js.native
open class StateEffect[Value] () extends StObject {
  
  /**
    Tells you whether this effect object is of a given
    [type](https://codemirror.net/6/docs/ref/#state.StateEffectType).
    */
  def is[T](`type`: StateEffectType[T]): /* is @codemirror/state.@codemirror/state.StateEffect<T> */ Boolean = js.native
  
  /**
    Map this effect through a position mapping. Will return
    `undefined` when that ends up deleting the effect.
    */
  def map(mapping: ChangeDesc): js.UndefOr[StateEffect[Value]] = js.native
  
  /**
    The value of this effect.
    */
  val value: Value = js.native
}
object StateEffect {
  
  @JSImport("@codemirror/state", "StateEffect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Append extensions to the top-level configuration of the editor.
    */
  /* static member */
  @JSImport("@codemirror/state", "StateEffect.appendConfig")
  @js.native
  def appendConfig: StateEffectType[Extension] = js.native
  inline def appendConfig_=(x: StateEffectType[Extension]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendConfig")(x.asInstanceOf[js.Any])
  
  /**
    Define a new effect type. The type parameter indicates the type
    of values that his effect holds. It should be a type that
    doesn't include `undefined`, since that is used in
    [mapping](https://codemirror.net/6/docs/ref/#state.StateEffect.map) to indicate that an effect is
    removed.
    */
  /* static member */
  inline def define[Value](): StateEffectType[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[StateEffectType[Value]]
  inline def define[Value](spec: StateEffectSpec[Value]): StateEffectType[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(spec.asInstanceOf[js.Any]).asInstanceOf[StateEffectType[Value]]
  
  /**
    Map an array of effects through a change set.
    */
  /* static member */
  inline def mapEffects(effects: js.Array[StateEffect[Any]], mapping: ChangeDesc): js.Array[StateEffect[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapEffects")(effects.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[js.Array[StateEffect[Any]]]
  
  /**
    This effect can be used to reconfigure the root extensions of
    the editor. Doing this will discard any extensions
    [appended](https://codemirror.net/6/docs/ref/#state.StateEffect^appendConfig), but does not reset
    the content of [reconfigured](https://codemirror.net/6/docs/ref/#state.Compartment.reconfigure)
    compartments.
    */
  /* static member */
  @JSImport("@codemirror/state", "StateEffect.reconfigure")
  @js.native
  def reconfigure: StateEffectType[Extension] = js.native
  inline def reconfigure_=(x: StateEffectType[Extension]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reconfigure")(x.asInstanceOf[js.Any])
}
