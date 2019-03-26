package typings
package bluebirdDashGlobalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Error[T] extends js.Object {
  def apply[U](): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U](onReject: js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[U]]): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1](
    // tslint:disable-next-line:unified-signatures
  filter1: bluebirdLib.CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1](
    filter1: bluebirdLib.Constructor[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    filter4: bluebirdLib.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    filter4: bluebirdLib.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.Constructor[E3],
    filter4: bluebirdLib.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.Constructor[E3],
    filter4: bluebirdLib.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    filter4: bluebirdLib.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    filter4: bluebirdLib.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.Constructor[E3],
    filter4: bluebirdLib.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.Constructor[E3],
    filter4: bluebirdLib.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    filter4: bluebirdLib.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    filter4: bluebirdLib.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.Constructor[E3],
    filter4: bluebirdLib.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.Constructor[E3],
    filter4: bluebirdLib.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    filter4: bluebirdLib.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.CatchFilter[E3],
    filter4: bluebirdLib.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.Constructor[E3],
    filter4: bluebirdLib.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.Constructor[E3],
    filter4: bluebirdLib.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: bluebirdLib.Constructor[E1] | bluebirdLib.CatchFilter[E1],
    filter2: bluebirdLib.Constructor[E2] | bluebirdLib.CatchFilter[E2],
    filter3: bluebirdLib.Constructor[E3] | bluebirdLib.CatchFilter[E3],
    filter4: bluebirdLib.Constructor[E4] | bluebirdLib.CatchFilter[E4],
    filter5: bluebirdLib.Constructor[E5] | bluebirdLib.CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: bluebirdLib.Constructor[E1],
    filter2: bluebirdLib.Constructor[E2],
    filter3: bluebirdLib.Constructor[E3],
    filter4: bluebirdLib.Constructor[E4],
    filter5: bluebirdLib.Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
}

