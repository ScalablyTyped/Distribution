package typings.baconjs

import typings.baconjs.observableMod.default
import typings.baconjs.transformMod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/withstatemachine", JSImport.Namespace)
@js.native
object withstatemachineMod extends js.Object {
  def default[In, State, Out](initState: State, f: StateF[In, State, Out], src: typings.baconjs.observableMod.default[In]): typings.baconjs.observableMod.default[Out] = js.native
  def withStateMachine[In, State, Out](initState: State, f: StateF[In, State, Out], src: default[In]): default[Out] = js.native
  def withStateMachineT[In, State, Out](initState: State, f: StateF[In, State, Out]): Transformer[In, Out] = js.native
  type StateF[In, State, Out] = js.Function2[
    /* state */ State, 
    /* event */ typings.baconjs.eventMod.default[In], 
    js.Tuple2[State, js.Array[typings.baconjs.eventMod.default[Out]]]
  ]
}

