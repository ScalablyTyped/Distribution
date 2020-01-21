package typings.bluebirdGlobal.mod._Global_

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Patch all static methods and the constructor
  */
@js.native
trait PromiseConstructor
  extends Instantiable1[
      /* callback */ js.Function3[
        /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[js.Object | js.Thenable[js.Object]], Unit], 
        /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
        /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
        Unit
      ], 
      Promise[js.Object]
    ] {
  // all: typeof Bluebird.all; // Provided by lib.es2015.d.ts
  var any: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.any */ js.Any = js.native
  var attempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.attempt */ js.Any = js.native
  var bind: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.bind */ js.Any = js.native
  var cast: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.cast */ js.Any = js.native
  var config: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.config */ js.Any = js.native
  var coroutine: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.coroutine */ js.Any = js.native
  var defer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.defer */ js.Any = js.native
  var delay: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.delay */ js.Any = js.native
  var each: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.each */ js.Any = js.native
  var filter: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.filter */ js.Any = js.native
  var fromCallback: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.fromCallback */ js.Any = js.native
  var fromNode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.fromNode */ js.Any = js.native
  var is: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.is */ js.Any = js.native
  var join: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.join */ js.Any = js.native
  var longStackTraces: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.longStackTraces */ js.Any = js.native
  var map: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.map */ js.Any = js.native
  var mapSeries: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.mapSeries */ js.Any = js.native
  var method: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.method */ js.Any = js.native
  var onPossiblyUnhandledRejection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.onPossiblyUnhandledRejection */ js.Any = js.native
  var promisify: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.promisify */ js.Any = js.native
  var promisifyAll: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.promisifyAll */ js.Any = js.native
  var props: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.props */ js.Any = js.native
  // race: typeof Bluebird.race; // Provided by lib.es2015.d.ts
  var reduce: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.reduce */ js.Any = js.native
  // reject: typeof Bluebird.reject; // Provided by lib.es2015.d.ts
  // resolve: typeof Bluebird.resolve; // Provided by lib.es2015.d.ts
  var some: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.some */ js.Any = js.native
  var `try`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.try */ js.Any = js.native
  var using: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Bluebird.using */ js.Any = js.native
  def all[T](values: js.Array[T | js.Thenable[T]]): Promise[js.Array[T]] = js.native
  def all[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): Promise[js.Tuple2[T1, T2]] = js.native
  def all[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): Promise[js.Tuple3[T1, T2, T3]] = js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
  ): Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5]
    ]
  ): Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6]
    ]
  ): Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7]
    ]
  ): Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7], 
      T8 | js.Thenable[T8]
    ]
  ): Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7], 
      T8 | js.Thenable[T8], 
      T9 | js.Thenable[T9]
    ]
  ): Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  /*
    * Copy&paste from lib.es2015.promise.d.ts, because Bluebird's typings are not in line with the standard lib.
    *
    * #std-lib-copy&paste-to-remove
    *
    * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
    */
  def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7], 
      T8 | js.Thenable[T8], 
      T9 | js.Thenable[T9], 
      T10 | js.Thenable[T10]
    ]
  ): Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
  def race[T](values: js.Array[T | js.Thenable[T]]): Promise[T] = js.native
  def race[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): Promise[T1 | T2] = js.native
  def race[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): Promise[T1 | T2 | T3] = js.native
  def race[T1, T2, T3, T4](
    values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
  ): Promise[T1 | T2 | T3 | T4] = js.native
  def race[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5] = js.native
  def race[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7], 
      T8 | js.Thenable[T8]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7], 
      T8 | js.Thenable[T8], 
      T9 | js.Thenable[T9]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | js.Thenable[T1], 
      T2 | js.Thenable[T2], 
      T3 | js.Thenable[T3], 
      T4 | js.Thenable[T4], 
      T5 | js.Thenable[T5], 
      T6 | js.Thenable[T6], 
      T7 | js.Thenable[T7], 
      T8 | js.Thenable[T8], 
      T9 | js.Thenable[T9], 
      T10 | js.Thenable[T10]
    ]
  ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  def reject(reason: js.Any): Promise[scala.Nothing] = js.native
  @JSName("reject")
  def reject_T[T](reason: js.Any): Promise[T] = js.native
  def resolve(): Promise[Unit] = js.native
  def resolve[T](value: T): Promise[T] = js.native
  def resolve[T](value: js.Thenable[T]): Promise[T] = js.native
}

