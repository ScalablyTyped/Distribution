package typings
package beforeDashAfterDashHookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object beforeDashAfterDashHookMod {
  type AfterHook[O, R] = js.Function2[/* result */ R, /* options */ O, scala.Unit]
  type AnyHook[O, R, E] = BeforeHook[O] | (ErrorHook[O, E]) | (AfterHook[O, R]) | (WrapHook[O, R])
  type BeforeHook[O] = js.Function1[/* options */ O, scala.Unit]
  type Collection = org.scalablytyped.runtime.Instantiable0[HookCollection]
  type ErrorHook[O, E] = js.Function2[/* error */ E, /* options */ O, scala.Unit]
  type HookMethod[O, R] = js.Function1[/* options */ O, R | js.Promise[R]]
  type Singular = org.scalablytyped.runtime.Instantiable0[HookSingular[js.Object, js.Object, js.Object]]
  type WrapHook[O, R] = js.Function2[/* hookMethod */ HookMethod[O, R], /* options */ O, R | js.Promise[R]]
}
