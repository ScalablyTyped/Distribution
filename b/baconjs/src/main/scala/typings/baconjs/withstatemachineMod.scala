package typings.baconjs

import typings.baconjs.observableMod.default
import typings.baconjs.transformMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withstatemachineMod {
  
  @JSImport("baconjs/types/withstatemachine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[In, State, Out](initState: State, f: StateF[In, State, Out], src: typings.baconjs.observableMod.default[In]): typings.baconjs.observableMod.default[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initState.asInstanceOf[js.Any], f.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[Out]]
  
  @scala.inline
  def withStateMachine[In, State, Out](initState: State, f: StateF[In, State, Out], src: default[In]): default[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStateMachine")(initState.asInstanceOf[js.Any], f.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[default[Out]]
  
  @scala.inline
  def withStateMachineT[In, State, Out](initState: State, f: StateF[In, State, Out]): Transformer[In, Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStateMachineT")(initState.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Transformer[In, Out]]
  
  type StateF[In, State, Out] = js.Function2[
    /* state */ State, 
    /* event */ typings.baconjs.eventMod.default[In], 
    js.Tuple2[State, js.Array[typings.baconjs.eventMod.default[Out]]]
  ]
}
