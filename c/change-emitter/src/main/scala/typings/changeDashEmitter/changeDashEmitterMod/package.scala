package typings.changeDashEmitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object changeDashEmitterMod {
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
  type ListenerOf0 = js.Function0[Unit]
  type ListenerOf1[T] = js.Function1[/* value */ T, Unit]
  type ListenerOf2[T1, T2] = js.Function2[/* value1 */ T1, /* value2 */ T2, Unit]
  type ListenerOf3[T1, T2, T3] = js.Function3[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, Unit]
  type ListenerOf4[T1, T2, T3, T4] = js.Function4[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, Unit]
  type ListenerOf5[T1, T2, T3, T4, T5] = js.Function5[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, /* value5 */ T5, Unit]
  type Unlisten = js.Function0[Unit]
}
