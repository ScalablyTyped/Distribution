package typings.beforeAfterHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AfterHook[O, R] = js.Function2[/* result */ R, /* options */ O, scala.Unit]
  type AnyHook[O, R, E] = typings.beforeAfterHook.mod.BeforeHook[O] | (typings.beforeAfterHook.mod.ErrorHook[O, E]) | (typings.beforeAfterHook.mod.AfterHook[O, R]) | (typings.beforeAfterHook.mod.WrapHook[O, R])
  type BeforeHook[O] = js.Function1[/* options */ O, scala.Unit]
  type Collection = org.scalablytyped.runtime.Instantiable0[typings.beforeAfterHook.mod.HookCollection]
  type ErrorHook[O, E] = js.Function2[/* error */ E, /* options */ O, scala.Unit]
  type HookMethod[O, R] = js.Function1[/* options */ O, R | js.Promise[R]]
  type Singular = org.scalablytyped.runtime.Instantiable0[typings.beforeAfterHook.mod.HookSingular[js.Object, js.Object, js.Object]]
  type WrapHook[O, R] = js.Function2[
    /* hookMethod */ typings.beforeAfterHook.mod.HookMethod[O, R], 
    /* options */ O, 
    R | js.Promise[R]
  ]
}
