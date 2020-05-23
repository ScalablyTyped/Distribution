package typings.bluebirdGlobal

import typings.bluebird.mod.Bluebird
import typings.bluebird.mod.CatchFilter
import typings.bluebird.mod.Constructor
import typings.bluebird.mod.Resolvable
import typings.bluebird.mod.SpreadOption
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Fn0[T] extends js.Object {
    def apply(onReject: js.Function1[/* error */ js.UndefOr[js.Any], Resolvable[_]]): Bluebird[T] = js.native
    def apply[E1](
      // tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[E1],
      onReject: js.Function1[/* error */ E1, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[_]]): Bluebird[T] = js.native
    def apply[E1, E2](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1] | CatchFilter[E1],
      filter2: Constructor[E2] | CatchFilter[E2],
      filter3: Constructor[E3] | CatchFilter[E3],
      filter4: Constructor[E4] | CatchFilter[E4],
      filter5: Constructor[E5] | CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCall[T] extends js.Object {
    def apply(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
    def apply(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
    def apply(sink: js.Any*): this.type = js.native
  }
  
  @js.native
  trait FnCallFilter1Filter2Filter3Filter4Filter5OnReject[T] extends js.Object {
    def apply[U](): Bluebird[U | T] = js.native
    def apply[U](onReject: js.Function1[/* error */ js.Any, Resolvable[U]]): Bluebird[U | T] = js.native
    def apply[U, E1](
      // tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[E1],
      onReject: js.Function1[/* error */ E1, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | T] = js.native
    def apply[U, E1, E2](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1] | CatchFilter[E1],
      filter2: Constructor[E2] | CatchFilter[E2],
      filter3: Constructor[E3] | CatchFilter[E3],
      filter4: Constructor[E4] | CatchFilter[E4],
      filter5: Constructor[E5] | CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
  }
  
  @js.native
  trait FnCallFilter1Filter2Filter3Filter4Filter5Reason[T] extends js.Object {
    def apply(
      filter1: Constructor[Error] | CatchFilter[Error],
      filter2: Constructor[Error] | CatchFilter[Error],
      filter3: Constructor[Error] | CatchFilter[Error],
      filter4: Constructor[Error] | CatchFilter[Error],
      filter5: Constructor[Error] | CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(filter1: CatchFilter[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(filter1: CatchFilter[Error], filter2: Constructor[Error], reason: Error): Bluebird[T] = js.native
    def apply(// tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(filter1: Constructor[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      reason: Error
    ): Bluebird[T] = js.native
    def apply(filter1: Constructor[Error], filter2: Constructor[Error], reason: Error): Bluebird[T] = js.native
    def apply(filter1: Constructor[Error], reason: Error): Bluebird[T] = js.native
    def apply(reason: Error): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCallFilter1Filter2Filter3Filter4Filter5Value[T] extends js.Object {
    def apply[U](
      filter1: Constructor[Error] | CatchFilter[Error],
      filter2: Constructor[Error] | CatchFilter[Error],
      filter3: Constructor[Error] | CatchFilter[Error],
      filter4: Constructor[Error] | CatchFilter[Error],
      filter5: Constructor[Error] | CatchFilter[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](filter1: CatchFilter[Error], filter2: Constructor[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](// tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[Error], filter2: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[Error], filter2: Constructor[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[Error], value: U): Bluebird[T | U] = js.native
    def apply[U](value: U): Bluebird[T | U] = js.native
  }
  
  @js.native
  trait FnCallMsMessage[T] extends js.Object {
    def apply(ms: Double): Bluebird[T] = js.native
    def apply(ms: Double, message: String): Bluebird[T] = js.native
    def apply(ms: Double, message: Error): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCallOnFulfilledOnRejected[T] extends js.Object {
    def apply[U](): Unit = js.native
    def apply[U](onFulfilled: js.Function1[/* value */ T, Resolvable[U]]): Unit = js.native
    def apply[U](
      onFulfilled: js.Function1[/* value */ T, Resolvable[U]],
      onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallThis extends js.Object {
    def apply[T](): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCallValue extends js.Object {
    def apply(): Bluebird[Unit] = js.native
    def apply[U](value: U): Bluebird[U] = js.native
  }
  
}

