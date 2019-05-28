package typings
package bluebirdDashGlobalLib.bluebirdDashGlobalMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Patch all instance method
  */
@js.native
trait Promise[T] extends js.Object {
  @JSName("asCallback")
  var asCallback_Original: bluebirdDashGlobalLib.Fn_Callback[T] = js.native
  @JSName("bind")
  var bind_Original: js.Function1[/* thisArg */ js.Any, bluebirdLib.bluebirdMod.Bluebird[T]] = js.native
  @JSName("call")
  var call_Original: js.ThisFunction2[
    /* this */ bluebirdLib.bluebirdMod.Bluebird[_], 
    /* propertyName */ java.lang.String, 
    /* repeated */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[
      stdLib.ReturnType[
        /* import warning: ImportType.apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ]
  ] = js.native
  @JSName("cancel")
  var cancel_Original: js.Function0[scala.Unit] = js.native
  @JSName("catchReturn")
  var catchReturn_Original: bluebirdDashGlobalLib.Fn_Filter1[T] = js.native
  @JSName("catchThrow")
  var catchThrow_Original: bluebirdDashGlobalLib.Fn_Filter1Filter2[T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  @JSName("caught")
  var caught_Original: bluebirdLib.Fn_Error[T] with bluebirdDashGlobalLib.Fn_Error[T] = js.native
  @JSName("delay")
  var delay_Original: js.Function1[/* ms */ scala.Double, bluebirdLib.bluebirdMod.Bluebird[T]] = js.native
  @JSName("disposer")
  var disposer_Original: js.Function1[
    /* disposeFn */ js.Function2[
      /* arg */ T, 
      /* promise */ bluebirdLib.bluebirdMod.Bluebird[T], 
      bluebirdLib.bluebirdMod.Resolvable[scala.Unit]
    ], 
    bluebirdLib.bluebirdMod.Disposer[T]
  ] = js.native
  @JSName("done")
  var done_Original: bluebirdDashGlobalLib.Fn_ErrorOnFulfilled[T] = js.native
  @JSName("error")
  var error_Original: js.Function1[
    /* onReject */ js.Function1[/* reason */ js.Any, bluebirdLib.bluebirdMod.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ] = js.native
  // finally: Bluebird<T>["finally"]; // Provided by lib.es2018.promise.d.ts
  @JSName("get")
  var get_Original: js.Function1[
    /* key */ java.lang.String, 
    bluebirdLib.bluebirdMod.Bluebird[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  @JSName("isCancelled")
  var isCancelled_Original: js.Function0[scala.Boolean] = js.native
  @JSName("isFulfilled")
  var isFulfilled_Original: js.Function0[scala.Boolean] = js.native
  @JSName("isPending")
  var isPending_Original: js.Function0[scala.Boolean] = js.native
  @JSName("isRejected")
  var isRejected_Original: js.Function0[scala.Boolean] = js.native
  @JSName("isResolved")
  var isResolved_Original: js.Function0[scala.Boolean] = js.native
  @JSName("lastly")
  var lastly_Original: js.Function1[
    /* handler */ js.Function0[bluebirdLib.bluebirdMod.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ] = js.native
  @JSName("nodeify")
  var nodeify_Original: bluebirdDashGlobalLib.Fn_Callback[T] = js.native
  @JSName("props")
  var props_Original: bluebirdDashGlobalLib.Fn_This = js.native
  @JSName("reason")
  var reason_Original: js.Function0[_] = js.native
  @JSName("reflect")
  var reflect_Original: bluebirdDashGlobalLib.Fn_Any[T] = js.native
  @JSName("return")
  var return_Original: bluebirdDashGlobalLib.Fn_Value = js.native
  @JSName("suppressUnhandledRejections")
  var suppressUnhandledRejections_Original: js.Function0[scala.Unit] = js.native
  @JSName("tapCatch")
  var tapCatch_Original: bluebirdDashGlobalLib.Fn_ErrorFilter1[T] = js.native
  @JSName("tap")
  var tap_Original: js.Function1[
    /* onFulFill */ js.Function1[/* value */ T, bluebirdLib.bluebirdMod.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ] = js.native
  // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
  @JSName("thenReturn")
  var thenReturn_Original: bluebirdDashGlobalLib.Fn_Value = js.native
  @JSName("thenThrow")
  var thenThrow_Original: js.Function1[/* reason */ stdLib.Error, bluebirdLib.bluebirdMod.Bluebird[scala.Nothing]] = js.native
  @JSName("throw")
  var throw_Original: js.Function1[/* reason */ stdLib.Error, bluebirdLib.bluebirdMod.Bluebird[scala.Nothing]] = js.native
  @JSName("timeout")
  var timeout_Original: bluebirdDashGlobalLib.Fn_Message[T] = js.native
  @JSName("toJSON")
  var toJSON_Original: js.Function0[js.Object] = js.native
  @JSName("toString")
  var toString_Original: js.Function0[java.lang.String] = js.native
  @JSName("value")
  var value_Original: js.Function0[T] = js.native
  def all(): bluebirdLib.bluebirdMod.^[scala.Nothing] = js.native
  def all(`this`: Promise[stdLib.Iterable[js.Object]]): bluebirdLib.bluebirdMod.^[T] = js.native
  def any(): bluebirdLib.bluebirdMod.^[scala.Nothing] = js.native
  def any[Q](`this`: Promise[T with stdLib.Iterable[Q]]): bluebirdLib.bluebirdMod.^[Q] = js.native
  def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit]): this.type = js.native
  def asCallback(
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit],
    options: bluebirdLib.bluebirdMod.SpreadOption
  ): this.type = js.native
  def asCallback(sink: js.Any*): this.type = js.native
  def bind(thisArg: js.Any): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def call[U /* <: java.lang.String */, Q](`this`: bluebirdLib.bluebirdMod.Bluebird[Q], propertyName: U, args: js.Any*): bluebirdLib.bluebirdMod.Bluebird[
    stdLib.ReturnType[/* import warning: ImportType.apply Failed type conversion: Q[U] */ js.Any]
  ] = js.native
  def cancel(): scala.Unit = js.native
  /*
    * TypeScript disallows adding overrides via `catch: typeof Bluebird.prototype.catch`. Copy&paste them then.
    *
    * @todo Duplication of code is never ideal. See whether there's a better way of achieving this.
    */
  def `catch`(
    predicate: js.Function1[/* error */ js.Any, scala.Boolean],
    onReject: js.Function1[/* error */ js.Any, T | js.Thenable[T] | scala.Unit | js.Thenable[scala.Unit]]
  ): bluebirdLib.bluebirdMod.^[T] = js.native
  def `catch`(
    predicate: js.Object,
    onReject: js.Function1[/* error */ js.Any, T | js.Thenable[T] | scala.Unit | js.Thenable[scala.Unit]]
  ): bluebirdLib.bluebirdMod.^[T] = js.native
  def `catch`[TResult](): Promise[T | TResult] = js.native
  def `catch`[E /* <: stdLib.Error */](
    ErrorClass: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, E],
    onReject: js.Function1[/* error */ E, T | js.Thenable[T] | scala.Unit | js.Thenable[scala.Unit]]
  ): bluebirdLib.bluebirdMod.^[T] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter5: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    // tslint:disable-next-line:unified-signatures
  filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter5: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    value: U
  ): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error], value: U): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchReturn[U](value: U): bluebirdLib.bluebirdMod.Bluebird[T | U] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter5: bluebirdLib.bluebirdMod.Constructor[stdLib.Error] | bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    // tslint:disable-next-line:unified-signatures
  filter1: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter5: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter4: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter3: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(
    filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    filter2: bluebirdLib.bluebirdMod.Constructor[stdLib.Error],
    reason: stdLib.Error
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(filter1: bluebirdLib.bluebirdMod.Constructor[stdLib.Error], reason: stdLib.Error): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def catchThrow(reason: stdLib.Error): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  @JSName("catch")
  def catch_EErrorU[E /* <: stdLib.Error */, U](
    ErrorClass: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, E],
    onReject: js.Function1[/* error */ E, U | js.Thenable[U]]
  ): bluebirdLib.bluebirdMod.^[U | T] = js.native
  @JSName("catch")
  def catch_U[U](
    predicate: js.Function1[/* error */ js.Any, scala.Boolean],
    onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]
  ): bluebirdLib.bluebirdMod.^[U | T] = js.native
  @JSName("catch")
  def catch_U[U](predicate: js.Object, onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]): bluebirdLib.bluebirdMod.^[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U](): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U](onReject: js.Function1[/* error */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1](
    // tslint:disable-next-line:unified-signatures
  filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1] | bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2] | bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3] | bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4] | bluebirdLib.bluebirdMod.CatchFilter[E4],
    filter5: bluebirdLib.bluebirdMod.Constructor[E5] | bluebirdLib.bluebirdMod.CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  def caught[U, E1, E2, E3, E4, E5](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    filter5: bluebirdLib.bluebirdMod.Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | T] = js.native
  def delay(ms: scala.Double): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def disposer(
    disposeFn: js.Function2[
      /* arg */ T, 
      /* promise */ bluebirdLib.bluebirdMod.Bluebird[T], 
      bluebirdLib.bluebirdMod.Resolvable[scala.Unit]
    ]
  ): bluebirdLib.bluebirdMod.Disposer[T] = js.native
  def done[U](): scala.Unit = js.native
  def done[U](onFulfilled: js.Function1[/* value */ T, bluebirdLib.bluebirdMod.Resolvable[U]]): scala.Unit = js.native
  def done[U](
    onFulfilled: js.Function1[/* value */ T, bluebirdLib.bluebirdMod.Resolvable[U]],
    onRejected: js.Function1[/* error */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): scala.Unit = js.native
  def each[Q](`this`: Promise[T with stdLib.Iterable[Q]], iterator: IterateFunction[Q, _]): bluebirdLib.bluebirdMod.^[T] = js.native
  def error[U](onReject: js.Function1[/* reason */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]): bluebirdLib.bluebirdMod.Bluebird[U] = js.native
  def filter[Q](`this`: Promise[T with stdLib.Iterable[Q]], filterer: IterateFunction[Q, scala.Boolean]): bluebirdLib.bluebirdMod.^[T] = js.native
  def filter[Q](
    `this`: Promise[T with stdLib.Iterable[Q]],
    filterer: IterateFunction[Q, scala.Boolean],
    options: bluebirdLib.bluebirdMod.ConcurrencyOption
  ): bluebirdLib.bluebirdMod.^[T] = js.native
  /*
    * See comments above `then` for the reason why this is needed. Taken from es2018.promise.d.ts.
    *
    * #std-lib-copy&paste-to-remove
    *
    * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
    */
  def `finally`(): Promise[T] = js.native
  def `finally`(onfinally: js.Function0[scala.Unit]): Promise[T] = js.native
  // finally: Bluebird<T>["finally"]; // Provided by lib.es2018.promise.d.ts
  def get[U /* <: java.lang.String */](key: U): bluebirdLib.bluebirdMod.Bluebird[/* import warning: ImportType.apply Failed type conversion: T[U] */ js.Any] = js.native
  def isCancelled(): scala.Boolean = js.native
  def isFulfilled(): scala.Boolean = js.native
  def isPending(): scala.Boolean = js.native
  def isRejected(): scala.Boolean = js.native
  def isResolved(): scala.Boolean = js.native
  def lastly(handler: js.Function0[bluebirdLib.bluebirdMod.Resolvable[_]]): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def map[U, Q](`this`: Promise[T with stdLib.Iterable[Q]], mapper: IterateFunction[Q, U]): bluebirdLib.bluebirdMod.^[js.Array[U]] = js.native
  def map[U, Q](
    `this`: Promise[T with stdLib.Iterable[Q]],
    mapper: IterateFunction[Q, U],
    options: bluebirdLib.bluebirdMod.ConcurrencyOption
  ): bluebirdLib.bluebirdMod.^[js.Array[U]] = js.native
  def mapSeries[U, Q](`this`: Promise[T with stdLib.Iterable[Q]], iterator: IterateFunction[Q, U]): bluebirdLib.bluebirdMod.^[js.Array[U]] = js.native
  def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit]): this.type = js.native
  def nodeify(
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit],
    options: bluebirdLib.bluebirdMod.SpreadOption
  ): this.type = js.native
  def nodeify(sink: js.Any*): this.type = js.native
  def props[T](`this`: js.Thenable[bluebirdLib.bluebirdMod.ResolvableProps[T]]): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  @JSName("props")
  def props_KV[K, V](`this`: js.Thenable[stdLib.Map[K, bluebirdLib.bluebirdMod.Resolvable[V]]]): bluebirdLib.bluebirdMod.Bluebird[stdLib.Map[K, V]] = js.native
  def race(): bluebirdLib.bluebirdMod.^[scala.Nothing] = js.native
  def race[Q](`this`: Promise[T with stdLib.Iterable[Q]]): bluebirdLib.bluebirdMod.^[Q] = js.native
  def reason(): js.Any = js.native
  def reduce[U, Q](
    `this`: Promise[T with stdLib.Iterable[Q]],
    reducer: js.Function4[
      /* memo */ U, 
      /* item */ Q, 
      /* index */ scala.Double, 
      /* arrayLength */ scala.Double, 
      U | js.Thenable[U]
    ]
  ): bluebirdLib.bluebirdMod.^[U] = js.native
  def reduce[U, Q](
    `this`: Promise[T with stdLib.Iterable[Q]],
    reducer: js.Function4[
      /* memo */ U, 
      /* item */ Q, 
      /* index */ scala.Double, 
      /* arrayLength */ scala.Double, 
      U | js.Thenable[U]
    ],
    initialValue: U
  ): bluebirdLib.bluebirdMod.^[U] = js.native
  def reflect(): bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.bluebirdMod.Inspection[T]] = js.native
  def `return`(): bluebirdLib.bluebirdMod.Bluebird[scala.Unit] = js.native
  def `return`[U](value: U): bluebirdLib.bluebirdMod.Bluebird[U] = js.native
  def some(`this`: Promise[stdLib.Iterable[js.Object]], count: scala.Double): bluebirdLib.bluebirdMod.^[T] = js.native
  def spread[U, Q](
    `this`: bluebirdLib.bluebirdMod.^[T with stdLib.Iterable[Q]],
    fulfilledHandler: js.Function1[/* repeated */ Q, U | js.Thenable[U]]
  ): bluebirdLib.bluebirdMod.^[U] = js.native
  def suppressUnhandledRejections(): scala.Unit = js.native
  def tap(onFulFill: js.Function1[/* value */ T, bluebirdLib.bluebirdMod.Resolvable[_]]): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch(onReject: js.Function1[/* error */ js.UndefOr[js.Any], bluebirdLib.bluebirdMod.Resolvable[_]]): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1](
    // tslint:disable-next-line:unified-signatures
  filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1] | bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2] | bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3] | bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4] | bluebirdLib.bluebirdMod.CatchFilter[E4],
    filter5: bluebirdLib.bluebirdMod.Constructor[E5] | bluebirdLib.bluebirdMod.CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    filter5: bluebirdLib.bluebirdMod.Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.bluebirdMod.Resolvable[_]]
  ): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  /*
    * Copy&paste ::then and ::catch from lib.es5.promise.d.ts, because Bluebird's typings are not
    * in line with the standard lib.
    *
    * #std-lib-copy&paste-to-remove
    *
    * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
    */
  def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
  def thenReturn(): bluebirdLib.bluebirdMod.Bluebird[scala.Unit] = js.native
  // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
  def thenReturn[U](value: U): bluebirdLib.bluebirdMod.Bluebird[U] = js.native
  def thenThrow(reason: stdLib.Error): bluebirdLib.bluebirdMod.Bluebird[scala.Nothing] = js.native
  def `throw`(reason: stdLib.Error): bluebirdLib.bluebirdMod.Bluebird[scala.Nothing] = js.native
  def timeout(ms: scala.Double): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def timeout(ms: scala.Double, message: java.lang.String): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def timeout(ms: scala.Double, message: stdLib.Error): bluebirdLib.bluebirdMod.Bluebird[T] = js.native
  def toJSON(): js.Object = js.native
  def value(): T = js.native
}

@JSGlobal("Promise")
@js.native
class PromiseCls[T] protected () extends Promise[T] {
  def this(callback: js.Function3[
      /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[T | js.Thenable[T]], scala.Unit], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]], 
      scala.Unit
    ]) = this()
}

