package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.ObservableConstructor
import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import typings.baconjs.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/when", JSImport.Namespace)
@js.native
object whenMod extends js.Object {
  def default[O](patterns: Pattern[O]*): EventStream[O] = js.native
  def extractRawPatterns[O](patterns: js.Array[Pattern[O]]): js.Array[RawPattern] = js.native
  def when[O](patterns: Pattern[O]*): EventStream[O] = js.native
  def whenP[O](patterns: Pattern[O]*): Property[O] = js.native
  def when_[O](ctor: ObservableConstructor, patterns: js.Array[Pattern[O]]): default[O] = js.native
  type AnyFunction = js.Function
  type AnyObservable = default[js.Any]
  type AnyObservableOrSource = AnyObservable | AnySource
  type AnySource = Source[js.Any, js.Any]
  type ObservableOrSource[V] = default[V] | (Source[js.Any, V])
  type Pattern[O] = (Pattern1[js.Any, O]) | (Pattern2[js.Any, js.Any, O]) | (Pattern3[js.Any, js.Any, js.Any, O]) | (Pattern4[js.Any, js.Any, js.Any, js.Any, O]) | (Pattern5[js.Any, js.Any, js.Any, js.Any, js.Any, O]) | (Pattern6[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, O]) | RawPattern
  type Pattern1[I1, O] = js.Tuple2[ObservableOrSource[I1], O | (js.Function1[/* a */ I1, O])]
  type Pattern2[I1, I2, O] = js.Tuple3[
    ObservableOrSource[I1], 
    ObservableOrSource[I1], 
    O | (js.Function2[/* a */ I1, /* b */ I2, O])
  ]
  type Pattern3[I1, I2, I3, O] = js.Tuple4[
    ObservableOrSource[I1], 
    ObservableOrSource[I1], 
    ObservableOrSource[I3], 
    O | (js.Function3[/* a */ I1, /* b */ I2, /* c */ I3, O])
  ]
  type Pattern4[I1, I2, I3, I4, O] = js.Tuple5[
    ObservableOrSource[I1], 
    ObservableOrSource[I1], 
    ObservableOrSource[I3], 
    ObservableOrSource[I4], 
    O | (js.Function4[/* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, O])
  ]
  type Pattern5[I1, I2, I3, I4, I5, O] = js.Tuple6[
    ObservableOrSource[I1], 
    ObservableOrSource[I1], 
    ObservableOrSource[I3], 
    ObservableOrSource[I4], 
    ObservableOrSource[I5], 
    O | (js.Function5[/* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, /* e */ I5, O])
  ]
  type Pattern6[I1, I2, I3, I4, I5, I6, O] = js.Tuple7[
    ObservableOrSource[I1], 
    ObservableOrSource[I1], 
    ObservableOrSource[I3], 
    ObservableOrSource[I4], 
    ObservableOrSource[I5], 
    ObservableOrSource[I6], 
    O | (js.Function6[/* a */ I1, /* b */ I2, /* c */ I3, /* d */ I4, /* e */ I5, /* f */ I6, O])
  ]
  type RawPattern = js.Tuple2[js.Array[AnyObservableOrSource], AnyFunction]
}

