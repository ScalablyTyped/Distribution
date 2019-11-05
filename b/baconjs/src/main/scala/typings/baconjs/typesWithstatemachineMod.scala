package typings.baconjs

import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTransformMod.Transformer
import typings.baconjs.typesWithstatemachineMod.StateF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/withstatemachine", JSImport.Namespace)
@js.native
object typesWithstatemachineMod extends js.Object {
  def default[In, State, Out](initState: State, f: StateF[In, State, Out], src: typings.baconjs.typesObservableMod.default[In]): typings.baconjs.typesObservableMod.default[Out] = js.native
  def withStateMachine[In, State, Out](initState: State, f: StateF[In, State, Out], src: default[In]): default[Out] = js.native
  def withStateMachineT[In, State, Out](initState: State, f: StateF[In, State, Out]): Transformer[In, Out] = js.native
  type StateF[In, State, Out] = js.Function2[
    /* state */ State, 
    /* event */ typings.baconjs.typesEventMod.default[In], 
    js.Tuple2[State, js.Array[typings.baconjs.typesEventMod.default[Out]]]
  ]
}

