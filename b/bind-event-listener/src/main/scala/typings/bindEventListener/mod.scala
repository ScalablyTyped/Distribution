package typings.bindEventListener

import typings.bindEventListener.distTypesMod.Binding
import typings.bindEventListener.distTypesMod.UnbindFn
import typings.std.AddEventListenerOptions
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bind-event-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind[Target /* <: EventTarget */, Type /* <: String */](target: Target, param1: Binding[Target, Type]): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  
  inline def bindAll(target: EventTarget, bindings: js.Array[Binding[EventTarget, String]]): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll(target: EventTarget, bindings: js.Array[Binding[EventTarget, String]], sharedOptions: Boolean): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll(
    target: EventTarget,
    bindings: js.Array[Binding[EventTarget, String]],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type /* <: String */](target: Target, bindings: js.Array[Binding[Target, Type]]): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type /* <: String */](target: Target, bindings: js.Array[Binding[Target, Type]], sharedOptions: Boolean): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type /* <: String */](target: Target, bindings: js.Array[Binding[Target, Type]], sharedOptions: AddEventListenerOptions): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */](target: Target, bindings: js.Tuple2[Binding[Target, Type1], Binding[Target, Type2]]): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */](
    target: Target,
    bindings: js.Tuple2[Binding[Target, Type1], Binding[Target, Type2]],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */](
    target: Target,
    bindings: js.Tuple2[Binding[Target, Type1], Binding[Target, Type2]],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */](
    target: Target,
    bindings: js.Tuple3[Binding[Target, Type1], Binding[Target, Type2], Binding[Target, Type3]]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */](
    target: Target,
    bindings: js.Tuple3[Binding[Target, Type1], Binding[Target, Type2], Binding[Target, Type3]],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */](
    target: Target,
    bindings: js.Tuple3[Binding[Target, Type1], Binding[Target, Type2], Binding[Target, Type3]],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */](
    target: Target,
    bindings: js.Tuple4[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4]
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */](
    target: Target,
    bindings: js.Tuple4[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4]
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */](
    target: Target,
    bindings: js.Tuple4[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4]
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */](
    target: Target,
    bindings: js.Tuple5[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5]
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */](
    target: Target,
    bindings: js.Tuple5[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5]
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */](
    target: Target,
    bindings: js.Tuple5[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5]
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */](
    target: Target,
    bindings: js.Tuple6[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6]
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */](
    target: Target,
    bindings: js.Tuple6[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6]
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */](
    target: Target,
    bindings: js.Tuple6[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6]
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */](
    target: Target,
    bindings: js.Tuple7[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7]
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */](
    target: Target,
    bindings: js.Tuple7[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7]
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */](
    target: Target,
    bindings: js.Tuple7[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7]
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */](
    target: Target,
    bindings: js.Tuple8[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8]
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */](
    target: Target,
    bindings: js.Tuple8[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8]
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */](
    target: Target,
    bindings: js.Tuple8[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8]
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */](
    target: Target,
    bindings: js.Tuple9[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9]
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */](
    target: Target,
    bindings: js.Tuple9[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9]
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */](
    target: Target,
    bindings: js.Tuple9[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9]
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */, Type10 /* <: String */](
    target: Target,
    bindings: js.Tuple10[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9], 
      Binding[Target, Type10]
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */, Type10 /* <: String */](
    target: Target,
    bindings: js.Tuple10[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9], 
      Binding[Target, Type10]
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */, Type10 /* <: String */](
    target: Target,
    bindings: js.Tuple10[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9], 
      Binding[Target, Type10]
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */, Type10 /* <: String */, Type11 /* <: String */](
    target: Target,
    bindings: js.Tuple11[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9], 
      Binding[Target, Type10], 
      Binding[Target, Type11]
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */, Type10 /* <: String */, Type11 /* <: String */](
    target: Target,
    bindings: js.Tuple11[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9], 
      Binding[Target, Type10], 
      Binding[Target, Type11]
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */, Type10 /* <: String */, Type11 /* <: String */](
    target: Target,
    bindings: js.Tuple11[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9], 
      Binding[Target, Type10], 
      Binding[Target, Type11]
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */, Type10 /* <: String */, Type11 /* <: String */, Type12 /* <: String */](
    target: Target,
    bindings: js.Tuple12[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9], 
      Binding[Target, Type10], 
      Binding[Target, Type11], 
      Binding[Target, Type12]
    ]
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */, Type10 /* <: String */, Type11 /* <: String */, Type12 /* <: String */](
    target: Target,
    bindings: js.Tuple12[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9], 
      Binding[Target, Type10], 
      Binding[Target, Type11], 
      Binding[Target, Type12]
    ],
    sharedOptions: Boolean
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
  inline def bindAll[Target /* <: EventTarget */, Type1 /* <: String */, Type2 /* <: String */, Type3 /* <: String */, Type4 /* <: String */, Type5 /* <: String */, Type6 /* <: String */, Type7 /* <: String */, Type8 /* <: String */, Type9 /* <: String */, Type10 /* <: String */, Type11 /* <: String */, Type12 /* <: String */](
    target: Target,
    bindings: js.Tuple12[
      Binding[Target, Type1], 
      Binding[Target, Type2], 
      Binding[Target, Type3], 
      Binding[Target, Type4], 
      Binding[Target, Type5], 
      Binding[Target, Type6], 
      Binding[Target, Type7], 
      Binding[Target, Type8], 
      Binding[Target, Type9], 
      Binding[Target, Type10], 
      Binding[Target, Type11], 
      Binding[Target, Type12]
    ],
    sharedOptions: AddEventListenerOptions
  ): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(target.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], sharedOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
}
