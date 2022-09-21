package typings.bluebirdGlobal

import typings.bluebird.mod.Bluebird
import typings.bluebird.mod.CatchFilter
import typings.bluebird.mod.ConcurrencyOption
import typings.bluebird.mod.Constructor
import typings.bluebird.mod.CoroutineOptions
import typings.bluebird.mod.Disposer
import typings.bluebird.mod.FromNodeOptions
import typings.bluebird.mod.IterateFunction
import typings.bluebird.mod.PromisifyAllOptions
import typings.bluebird.mod.PromisifyAll_
import typings.bluebird.mod.PromisifyOptions
import typings.bluebird.mod.Resolvable
import typings.bluebird.mod.ResolvableProps
import typings.bluebird.mod.Resolver
import typings.bluebird.mod.SpreadOption
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0[T] extends StObject {
    
    def apply(onReject: js.Function1[/* error */ js.UndefOr[Any], Resolvable[Any]]): Bluebird[T] = js.native
    def apply[E1](
      // tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[E1],
      onReject: js.Function1[/* error */ E1, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[Any]]): Bluebird[T] = js.native
    def apply[E1, E2](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
    def apply[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[T] = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply[R](value: Resolvable[R]): Bluebird[R] = js.native
  }
  
  @js.native
  trait Fn2 extends StObject {
    
    def apply[R](): Resolver[R] = js.native
  }
  
  @js.native
  trait Fn3 extends StObject {
    
    def apply[R, U](values: Resolvable[js.Iterable[Resolvable[R]]], iterator: IterateFunction[R, U]): Bluebird[js.Array[U]] = js.native
  }
  
  @js.native
  trait Fn4 extends StObject {
    
    def apply[R](fn: js.Function0[Resolvable[R]]): js.Function0[Bluebird[R]] = js.native
    def apply[R](fn: js.Function1[/* repeated */ Any, Resolvable[R]]): js.Function1[/* repeated */ Any, Bluebird[R]] = js.native
    def apply[R, A1, A2](fn: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[R]] = js.native
    def apply[R, A1, A2, A3](fn: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[R]] = js.native
    def apply[R, A1, A2, A3, A4](fn: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[R]] = js.native
    def apply[R, A1, A2, A3, A4, A5](
      fn: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
    ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[R]] = js.native
  }
  
  @js.native
  trait FnCall[T] extends StObject {
    
    def apply(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
    def apply(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
    def apply(sink: Any*): this.type = js.native
  }
  
  @js.native
  trait FnCallArg1Arg2Arg3Arg4Arg5Handler extends StObject {
    
    def apply[R](values: Resolvable[R]*): Bluebird[js.Array[R]] = js.native
    def apply[R, A1](arg1: Resolvable[A1], handler: js.Function1[/* arg1 */ A1, Resolvable[R]]): Bluebird[R] = js.native
    def apply[R, A1, A2](
      arg1: Resolvable[A1],
      arg2: Resolvable[A2],
      handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]
    ): Bluebird[R] = js.native
    def apply[R, A1, A2, A3](
      arg1: Resolvable[A1],
      arg2: Resolvable[A2],
      arg3: Resolvable[A3],
      handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]
    ): Bluebird[R] = js.native
    def apply[R, A1, A2, A3, A4](
      arg1: Resolvable[A1],
      arg2: Resolvable[A2],
      arg3: Resolvable[A3],
      arg4: Resolvable[A4],
      handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]
    ): Bluebird[R] = js.native
    def apply[R, A1, A2, A3, A4, A5](
      arg1: Resolvable[A1],
      arg2: Resolvable[A2],
      arg3: Resolvable[A3],
      arg4: Resolvable[A4],
      arg5: Resolvable[A5],
      handler: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
    ): Bluebird[R] = js.native
  }
  
  @js.native
  trait FnCallDisposerDisposer2Disposer3Executor extends StObject {
    
    def apply[R, T](disposer: Disposer[R], executor: js.Function1[/* transaction */ R, js.Thenable[T]]): Bluebird[T] = js.native
    def apply[R1, R2, T](
      disposer: Disposer[R1],
      disposer2: Disposer[R2],
      executor: js.Function2[/* transaction1 */ R1, /* transaction2 */ R2, js.Thenable[T]]
    ): Bluebird[T] = js.native
    def apply[R1, R2, R3, T](
      disposer: Disposer[R1],
      disposer2: Disposer[R2],
      disposer3: Disposer[R3],
      executor: js.Function3[/* transaction1 */ R1, /* transaction2 */ R2, /* transaction3 */ R3, js.Thenable[T]]
    ): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCallFilter1Filter2Filter3Filter4Filter5OnReject[T] extends StObject {
    
    def apply[U](): Bluebird[U | T] = js.native
    def apply[U](onReject: js.Function1[/* error */ Any, Resolvable[U]]): Bluebird[U | T] = js.native
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
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | T] = js.native
    def apply[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
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
  trait FnCallFilter1Filter2Filter3Filter4Filter5Reason[T] extends StObject {
    
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(filter1: CatchFilter[js.Error], filter2: CatchFilter[js.Error], reason: js.Error): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(filter1: CatchFilter[js.Error], filter2: Constructor[js.Error], reason: js.Error): Bluebird[T] = js.native
    def apply(// tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[js.Error], reason: js.Error): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(filter1: Constructor[js.Error], filter2: CatchFilter[js.Error], reason: js.Error): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[T] = js.native
    def apply(filter1: Constructor[js.Error], filter2: Constructor[js.Error], reason: js.Error): Bluebird[T] = js.native
    def apply(filter1: Constructor[js.Error], reason: js.Error): Bluebird[T] = js.native
    def apply(reason: js.Error): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCallFilter1Filter2Filter3Filter4Filter5Value[T] extends StObject {
    
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: CatchFilter[js.Error], filter2: CatchFilter[js.Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: CatchFilter[js.Error], filter2: Constructor[js.Error], value: U): Bluebird[T | U] = js.native
    def apply[U](// tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[js.Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[js.Error], filter2: CatchFilter[js.Error], value: U): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      value: U
    ): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[js.Error], filter2: Constructor[js.Error], value: U): Bluebird[T | U] = js.native
    def apply[U](filter1: Constructor[js.Error], value: U): Bluebird[T | U] = js.native
    def apply[U](value: U): Bluebird[T | U] = js.native
  }
  
  @js.native
  trait FnCallFn extends StObject {
    
    def apply[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = js.native
  }
  
  @js.native
  trait FnCallGeneratorFunctionOptions extends StObject {
    
    def apply[T](generatorFunction: js.Function0[IterableIterator[Any]]): js.Function0[Bluebird[T]] = js.native
    def apply[T](generatorFunction: js.Function0[IterableIterator[Any]], options: CoroutineOptions): js.Function0[Bluebird[T]] = js.native
    def apply[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[Any]]): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
    def apply[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[Any]], options: CoroutineOptions): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
    def apply[T, A1, A2](generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[Any]]): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
    def apply[T, A1, A2](
      generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[Any]],
      options: CoroutineOptions
    ): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3](generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[Any]]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3](
      generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[Any]],
      options: CoroutineOptions
    ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4](
      generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[Any]]
    ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4](
      generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[Any]],
      options: CoroutineOptions
    ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4, A5](
      generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[Any]]
    ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4, A5](
      generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[Any]],
      options: CoroutineOptions
    ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4, A5, A6](
      generatorFunction: js.Function6[
          /* a1 */ A1, 
          /* a2 */ A2, 
          /* a3 */ A3, 
          /* a4 */ A4, 
          /* a5 */ A5, 
          /* a6 */ A6, 
          IterableIterator[Any]
        ]
    ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4, A5, A6](
      generatorFunction: js.Function6[
          /* a1 */ A1, 
          /* a2 */ A2, 
          /* a3 */ A3, 
          /* a4 */ A4, 
          /* a5 */ A5, 
          /* a6 */ A6, 
          IterableIterator[Any]
        ],
      options: CoroutineOptions
    ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4, A5, A6, A7](
      generatorFunction: js.Function7[
          /* a1 */ A1, 
          /* a2 */ A2, 
          /* a3 */ A3, 
          /* a4 */ A4, 
          /* a5 */ A5, 
          /* a6 */ A6, 
          /* a7 */ A7, 
          IterableIterator[Any]
        ]
    ): js.Function7[
        /* a1 */ A1, 
        /* a2 */ A2, 
        /* a3 */ A3, 
        /* a4 */ A4, 
        /* a5 */ A5, 
        /* a6 */ A6, 
        /* a7 */ A7, 
        Bluebird[T]
      ] = js.native
    def apply[T, A1, A2, A3, A4, A5, A6, A7](
      generatorFunction: js.Function7[
          /* a1 */ A1, 
          /* a2 */ A2, 
          /* a3 */ A3, 
          /* a4 */ A4, 
          /* a5 */ A5, 
          /* a6 */ A6, 
          /* a7 */ A7, 
          IterableIterator[Any]
        ],
      options: CoroutineOptions
    ): js.Function7[
        /* a1 */ A1, 
        /* a2 */ A2, 
        /* a3 */ A3, 
        /* a4 */ A4, 
        /* a5 */ A5, 
        /* a6 */ A6, 
        /* a7 */ A7, 
        Bluebird[T]
      ] = js.native
    def apply[T, A1, A2, A3, A4, A5, A6, A7, A8](
      generatorFunction: js.Function8[
          /* a1 */ A1, 
          /* a2 */ A2, 
          /* a3 */ A3, 
          /* a4 */ A4, 
          /* a5 */ A5, 
          /* a6 */ A6, 
          /* a7 */ A7, 
          /* a8 */ A8, 
          IterableIterator[Any]
        ]
    ): js.Function8[
        /* a1 */ A1, 
        /* a2 */ A2, 
        /* a3 */ A3, 
        /* a4 */ A4, 
        /* a5 */ A5, 
        /* a6 */ A6, 
        /* a7 */ A7, 
        /* a8 */ A8, 
        Bluebird[T]
      ] = js.native
    def apply[T, A1, A2, A3, A4, A5, A6, A7, A8](
      generatorFunction: js.Function8[
          /* a1 */ A1, 
          /* a2 */ A2, 
          /* a3 */ A3, 
          /* a4 */ A4, 
          /* a5 */ A5, 
          /* a6 */ A6, 
          /* a7 */ A7, 
          /* a8 */ A8, 
          IterableIterator[Any]
        ],
      options: CoroutineOptions
    ): js.Function8[
        /* a1 */ A1, 
        /* a2 */ A2, 
        /* a3 */ A3, 
        /* a4 */ A4, 
        /* a5 */ A5, 
        /* a6 */ A6, 
        /* a7 */ A7, 
        /* a8 */ A8, 
        Bluebird[T]
      ] = js.native
  }
  
  @js.native
  trait FnCallHandler extends StObject {
    
    def apply(): Unit = js.native
    def apply(handler: js.Function1[/* reason */ Any, Any]): Unit = js.native
    def apply(handler: js.Function2[/* error */ js.Error, /* promise */ Bluebird[Any], Unit]): Unit = js.native
  }
  
  @js.native
  trait FnCallMsMessage[T] extends StObject {
    
    def apply(ms: Double): Bluebird[T] = js.native
    def apply(ms: Double, message: String): Bluebird[T] = js.native
    def apply(ms: Double, message: js.Error): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCallMsValue extends StObject {
    
    def apply(ms: Double): Bluebird[Unit] = js.native
    def apply[R](ms: Double, value: Resolvable[R]): Bluebird[R] = js.native
  }
  
  @js.native
  trait FnCallNodeFunctionOptions extends StObject {
    
    def apply(nodeFunction: js.Function1[/* repeated */ Any, Unit]): js.Function1[/* repeated */ Any, Bluebird[Any]] = js.native
    def apply(nodeFunction: js.Function1[/* repeated */ Any, Unit], options: PromisifyOptions): js.Function1[/* repeated */ Any, Bluebird[Any]] = js.native
    def apply[T, A1](
      func: js.Function2[
          /* arg1 */ A1, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
    def apply[T, A1](
      func: js.Function2[
          /* arg1 */ A1, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ],
      options: PromisifyOptions
    ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
    def apply[T, A1, A2](
      func: js.Function3[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
    def apply[T, A1, A2](
      func: js.Function3[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ],
      options: PromisifyOptions
    ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3](
      func: js.Function4[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3](
      func: js.Function4[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ],
      options: PromisifyOptions
    ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4](
      func: js.Function5[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* arg4 */ A4, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4](
      func: js.Function5[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* arg4 */ A4, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ],
      options: PromisifyOptions
    ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4, A5](
      func: js.Function6[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* arg4 */ A4, 
          /* arg5 */ A5, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
    def apply[T, A1, A2, A3, A4, A5](
      func: js.Function6[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* arg4 */ A4, 
          /* arg5 */ A5, 
          /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ],
      options: PromisifyOptions
    ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
  }
  
  @js.native
  trait FnCallObject extends StObject {
    
    def apply[T](`object`: js.Thenable[ResolvableProps[T]]): Bluebird[T] = js.native
    def apply[T](`object`: ResolvableProps[T]): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCallOnFulfilledOnRejected[T] extends StObject {
    
    def apply[U](): Unit = js.native
    def apply[U](onFulfilled: js.Function1[/* value */ T, Resolvable[U]]): Unit = js.native
    def apply[U](
      onFulfilled: js.Function1[/* value */ T, Resolvable[U]],
      onRejected: js.Function1[/* error */ Any, Resolvable[U]]
    ): Unit = js.native
    def apply[U](onFulfilled: Unit, onRejected: js.Function1[/* error */ Any, Resolvable[U]]): Unit = js.native
  }
  
  @js.native
  trait FnCallResolverOptions extends StObject {
    
    def apply[T](
      resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit]
    ): Bluebird[T] = js.native
    def apply[T](
      resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit],
      options: FromNodeOptions
    ): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCallTargetOptions extends StObject {
    
    def apply[T /* <: js.Object */](target: T): PromisifyAll_[T] = js.native
    def apply[T /* <: js.Object */](target: T, options: PromisifyAllOptions[T]): PromisifyAll_[T] = js.native
  }
  
  @js.native
  trait FnCallThis extends StObject {
    
    def apply[T](): Bluebird[T] = js.native
  }
  
  @js.native
  trait FnCallValue extends StObject {
    
    def apply(): Bluebird[Unit] = js.native
    def apply[U](value: U): Bluebird[U] = js.native
  }
  
  @js.native
  trait FnCallValues extends StObject {
    
    def apply[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[R] = js.native
  }
  
  @js.native
  trait FnCallValuesCount extends StObject {
    
    def apply[R](values: Resolvable[js.Iterable[Resolvable[R]]], count: Double): Bluebird[js.Array[R]] = js.native
  }
  
  @js.native
  trait FnCallValuesFiltererOption extends StObject {
    
    def apply[R](values: Resolvable[js.Iterable[Resolvable[R]]], filterer: IterateFunction[R, Boolean]): Bluebird[js.Array[R]] = js.native
    def apply[R](
      values: Resolvable[js.Iterable[Resolvable[R]]],
      filterer: IterateFunction[R, Boolean],
      option: ConcurrencyOption
    ): Bluebird[js.Array[R]] = js.native
  }
  
  @js.native
  trait FnCallValuesIterator extends StObject {
    
    def apply[R](values: Resolvable[js.Iterable[Resolvable[R]]], iterator: IterateFunction[R, Any]): Bluebird[js.Array[R]] = js.native
  }
  
  @js.native
  trait FnCallValuesMapperOptions extends StObject {
    
    def apply[R, U](values: Resolvable[js.Iterable[Resolvable[R]]], mapper: IterateFunction[R, U]): Bluebird[js.Array[U]] = js.native
    def apply[R, U](
      values: Resolvable[js.Iterable[Resolvable[R]]],
      mapper: IterateFunction[R, U],
      options: ConcurrencyOption
    ): Bluebird[js.Array[U]] = js.native
  }
  
  @js.native
  trait FnCallValuesReducerInitialValue extends StObject {
    
    def apply[R, U](
      values: Resolvable[js.Iterable[Resolvable[R]]],
      reducer: js.Function4[
          /* total */ U, 
          /* current */ R, 
          /* index */ Double, 
          /* arrayLength */ Double, 
          Resolvable[U]
        ]
    ): Bluebird[U] = js.native
    def apply[R, U](
      values: Resolvable[js.Iterable[Resolvable[R]]],
      reducer: js.Function4[
          /* total */ U, 
          /* current */ R, 
          /* index */ Double, 
          /* arrayLength */ Double, 
          Resolvable[U]
        ],
      initialValue: U
    ): Bluebird[U] = js.native
  }
}
