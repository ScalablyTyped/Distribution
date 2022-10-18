package typings.baconjs

import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTransformMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWithstatemachineMod {
  
  @JSImport("baconjs/types/withstatemachine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[In, State, Out](initState: State, f: StateF[In, State, Out], src: typings.baconjs.typesObservableMod.default[In]): typings.baconjs.typesObservableMod.default[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initState.asInstanceOf[js.Any], f.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.typesObservableMod.default[Out]]
  
  inline def withStateMachine[In, State, Out](initState: State, f: StateF[In, State, Out], src: default[In]): default[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStateMachine")(initState.asInstanceOf[js.Any], f.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[default[Out]]
  
  inline def withStateMachineT[In, State, Out](initState: State, f: StateF[In, State, Out]): Transformer[In, Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStateMachineT")(initState.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Transformer[In, Out]]
  
  type StateF[In, State, Out] = js.Function2[
    /* state */ State, 
    /* event */ typings.baconjs.typesEventMod.default[In], 
    js.Tuple2[State, js.Array[typings.baconjs.typesEventMod.default[Out]]]
  ]
}
