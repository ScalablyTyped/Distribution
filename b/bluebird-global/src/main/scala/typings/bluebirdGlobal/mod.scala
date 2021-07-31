package typings.bluebirdGlobal

import org.scalablytyped.runtime.Instantiable1
import typings.bluebird.anon.Cancellation
import typings.bluebird.mod.Bluebird
import typings.bluebird.mod.CatchFilter
import typings.bluebird.mod.ConcurrencyOption
import typings.bluebird.mod.Constructor
import typings.bluebird.mod.CoroutineOptions
import typings.bluebird.mod.Disposer
import typings.bluebird.mod.FromNodeOptions
import typings.bluebird.mod.Inspection
import typings.bluebird.mod.PromisifyAllOptions
import typings.bluebird.mod.PromisifyOptions
import typings.bluebird.mod.Resolvable
import typings.bluebird.mod.ResolvableProps
import typings.bluebird.mod.Resolver
import typings.bluebird.mod.SpreadOption
import typings.bluebird.mod.^
import typings.bluebirdGlobal.anon.Fn0
import typings.bluebirdGlobal.anon.Fn1
import typings.bluebirdGlobal.anon.Fn2
import typings.bluebirdGlobal.anon.Fn3
import typings.bluebirdGlobal.anon.Fn4
import typings.bluebirdGlobal.anon.FnCall
import typings.bluebirdGlobal.anon.FnCallArg1Arg2Arg3Arg4Arg5Handler
import typings.bluebirdGlobal.anon.FnCallDisposerDisposer2Disposer3Executor
import typings.bluebirdGlobal.anon.FnCallFilter1Filter2Filter3Filter4Filter5OnReject
import typings.bluebirdGlobal.anon.FnCallFilter1Filter2Filter3Filter4Filter5Reason
import typings.bluebirdGlobal.anon.FnCallFilter1Filter2Filter3Filter4Filter5Value
import typings.bluebirdGlobal.anon.FnCallFn
import typings.bluebirdGlobal.anon.FnCallGeneratorFunctionOptions
import typings.bluebirdGlobal.anon.FnCallHandler
import typings.bluebirdGlobal.anon.FnCallMsMessage
import typings.bluebirdGlobal.anon.FnCallMsValue
import typings.bluebirdGlobal.anon.FnCallNodeFunctionOptions
import typings.bluebirdGlobal.anon.FnCallObject
import typings.bluebirdGlobal.anon.FnCallOnFulfilledOnRejected
import typings.bluebirdGlobal.anon.FnCallResolverOptions
import typings.bluebirdGlobal.anon.FnCallTargetOptions
import typings.bluebirdGlobal.anon.FnCallThis
import typings.bluebirdGlobal.anon.FnCallValue
import typings.bluebirdGlobal.anon.FnCallValues
import typings.bluebirdGlobal.anon.FnCallValuesCount
import typings.bluebirdGlobal.anon.FnCallValuesFiltererOption
import typings.bluebirdGlobal.anon.FnCallValuesIterator
import typings.bluebirdGlobal.anon.FnCallValuesMapperOptions
import typings.bluebirdGlobal.anon.FnCallValuesReducerInitialValue
import typings.std.Error
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Map
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    /*
      * Patch all instance method
      */
    @js.native
    trait Promise[T] extends StObject {
      
      def all(): ^[T] = js.native
      
      def any(): ^[scala.Nothing] = js.native
      @JSName("any")
      def any_Q[Q](): ^[Q] = js.native
      
      def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
      def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
      def asCallback(sink: js.Any*): this.type = js.native
      @JSName("asCallback")
      var asCallback_Original: FnCall[T] = js.native
      
      def bind(thisArg: js.Any): Bluebird[T] = js.native
      @JSName("bind")
      var bind_Original: js.Function1[/* thisArg */ js.Any, Bluebird[T]] = js.native
      
      def call[U /* <: /* keyof Q */ String */, Q](propertyName: U, args: js.Any*): Bluebird[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: Q[U] */ js.Any
            ]
          ] = js.native
      @JSName("call")
      var call_Original: js.ThisFunction2[
            /* this */ Bluebird[js.Any], 
            /* keyof any */ /* propertyName */ String, 
            /* repeated */ js.Any, 
            Bluebird[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
              ]
            ]
          ] = js.native
      
      def cancel(): Unit = js.native
      @JSName("cancel")
      var cancel_Original: js.Function0[Unit] = js.native
      
      /*
        * TypeScript disallows adding overrides via `catch: typeof Bluebird.prototype.catch`. Copy&paste them then.
        *
        * @todo Duplication of code is never ideal. See whether there's a better way of achieving this.
        */
      def `catch`(
        predicate: js.Function1[/* error */ js.Any, Boolean],
        onReject: js.Function1[/* error */ js.Any, T | (js.Thenable[T | Unit]) | Unit]
      ): ^[T] = js.native
      def `catch`(
        predicate: js.Object,
        onReject: js.Function1[/* error */ js.Any, T | (js.Thenable[T | Unit]) | Unit]
      ): ^[T] = js.native
      def `catch`[TResult](): Promise[T | TResult] = js.native
      def `catch`[E /* <: Error */](
        ErrorClass: Instantiable1[/* args (repeated) */ js.Any, E],
        onReject: js.Function1[/* error */ E, T | (js.Thenable[T | Unit]) | Unit]
      ): ^[T] = js.native
      def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
      
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](// tslint:disable-next-line:unified-signatures
      filter1: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        value: U
      ): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](filter1: Constructor[Error], value: U): Bluebird[T | U] = js.native
      def catchReturn[U](value: U): Bluebird[T | U] = js.native
      @JSName("catchReturn")
      var catchReturn_Original: FnCallFilter1Filter2Filter3Filter4Filter5Value[T] = js.native
      
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(filter1: CatchFilter[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: CatchFilter[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(filter1: CatchFilter[Error], filter2: Constructor[Error], reason: Error): Bluebird[T] = js.native
      def catchThrow(// tslint:disable-next-line:unified-signatures
      filter1: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: CatchFilter[Error],
        filter3: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(filter1: Constructor[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        filter4: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: CatchFilter[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        filter5: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        filter4: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(
        filter1: Constructor[Error],
        filter2: Constructor[Error],
        filter3: Constructor[Error],
        reason: Error
      ): Bluebird[T] = js.native
      def catchThrow(filter1: Constructor[Error], filter2: Constructor[Error], reason: Error): Bluebird[T] = js.native
      def catchThrow(filter1: Constructor[Error], reason: Error): Bluebird[T] = js.native
      def catchThrow(reason: Error): Bluebird[T] = js.native
      @JSName("catchThrow")
      var catchThrow_Original: FnCallFilter1Filter2Filter3Filter4Filter5Reason[T] = js.native
      
      @JSName("catch")
      def catch_E_ErrorU[E /* <: Error */, U](
        ErrorClass: Instantiable1[/* args (repeated) */ js.Any, E],
        onReject: js.Function1[/* error */ E, U | js.Thenable[U]]
      ): ^[U | T] = js.native
      @JSName("catch")
      def catch_U[U](
        predicate: js.Function1[/* error */ js.Any, Boolean],
        onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]
      ): ^[U | T] = js.native
      @JSName("catch")
      def catch_U[U](predicate: js.Object, onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]): ^[U | T] = js.native
      
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U](): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U](onReject: js.Function1[/* error */ js.Any, Resolvable[U]]): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1](
        // tslint:disable-next-line:unified-signatures
      filter1: CatchFilter[E1],
        onReject: js.Function1[/* error */ E1, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      def caught[U, E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
      ): Bluebird[U | T] = js.native
      // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
      @JSName("caught")
      var caught_Original: typings.bluebird.anon.FnCall[T] & FnCallFilter1Filter2Filter3Filter4Filter5OnReject[T] = js.native
      
      def delay(ms: Double): Bluebird[T] = js.native
      @JSName("delay")
      var delay_Original: js.Function1[/* ms */ Double, Bluebird[T]] = js.native
      
      def disposer(disposeFn: js.Function2[/* arg */ T, /* promise */ Bluebird[T], Resolvable[Unit]]): Disposer[T] = js.native
      @JSName("disposer")
      var disposer_Original: js.Function1[
            /* disposeFn */ js.Function2[/* arg */ T, /* promise */ Bluebird[T], Resolvable[Unit]], 
            Disposer[T]
          ] = js.native
      
      def done[U](): Unit = js.native
      def done[U](onFulfilled: js.Function1[/* value */ T, Resolvable[U]]): Unit = js.native
      def done[U](
        onFulfilled: js.Function1[/* value */ T, Resolvable[U]],
        onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]
      ): Unit = js.native
      def done[U](onFulfilled: Unit, onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]): Unit = js.native
      @JSName("done")
      var done_Original: FnCallOnFulfilledOnRejected[T] = js.native
      
      def each[Q](iterator: IterateFunction[Q, js.Any]): ^[T] = js.native
      
      def error[U](onReject: js.Function1[/* reason */ js.Any, Resolvable[U]]): Bluebird[U] = js.native
      @JSName("error")
      var error_Original: js.Function1[
            /* onReject */ js.Function1[/* reason */ js.Any, Resolvable[js.Any]], 
            Bluebird[js.Any]
          ] = js.native
      
      def filter[Q](filterer: IterateFunction[Q, Boolean]): ^[T] = js.native
      def filter[Q](filterer: IterateFunction[Q, Boolean], options: ConcurrencyOption): ^[T] = js.native
      
      /*
        * See comments above `then` for the reason why this is needed. Taken from es2018.promise.d.ts.
        *
        * #std-lib-copy&paste-to-remove
        *
        * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
        */
      def `finally`(): Promise[T] = js.native
      def `finally`(onfinally: js.Function0[Unit]): Promise[T] = js.native
      
      // finally: Bluebird<T>["finally"]; // Provided by lib.es2018.promise.d.ts
      def get[U /* <: /* keyof T */ String */](key: U): Bluebird[
            /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any
          ] = js.native
      // finally: Bluebird<T>["finally"]; // Provided by lib.es2018.promise.d.ts
      @JSName("get")
      var get_Original: js.Function1[
            /* keyof T */ /* key */ String, 
            Bluebird[
              /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
            ]
          ] = js.native
      
      def isCancelled(): Boolean = js.native
      @JSName("isCancelled")
      var isCancelled_Original: js.Function0[Boolean] = js.native
      
      def isFulfilled(): Boolean = js.native
      @JSName("isFulfilled")
      var isFulfilled_Original: js.Function0[Boolean] = js.native
      
      def isPending(): Boolean = js.native
      @JSName("isPending")
      var isPending_Original: js.Function0[Boolean] = js.native
      
      def isRejected(): Boolean = js.native
      @JSName("isRejected")
      var isRejected_Original: js.Function0[Boolean] = js.native
      
      def isResolved(): Boolean = js.native
      @JSName("isResolved")
      var isResolved_Original: js.Function0[Boolean] = js.native
      
      def lastly(handler: js.Function0[Resolvable[js.Any]]): Bluebird[T] = js.native
      @JSName("lastly")
      var lastly_Original: js.Function1[/* handler */ js.Function0[Resolvable[js.Any]], Bluebird[T]] = js.native
      
      def map[U, Q](mapper: IterateFunction[Q, U]): ^[js.Array[U]] = js.native
      def map[U, Q](mapper: IterateFunction[Q, U], options: ConcurrencyOption): ^[js.Array[U]] = js.native
      
      def mapSeries[U, Q](iterator: IterateFunction[Q, U]): ^[js.Array[U]] = js.native
      
      def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
      def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
      def nodeify(sink: js.Any*): this.type = js.native
      @JSName("nodeify")
      var nodeify_Original: FnCall[T] = js.native
      
      def props[T](): Bluebird[T] = js.native
      @JSName("props")
      def props_KV[K, V](): Bluebird[Map[K, V]] = js.native
      @JSName("props")
      var props_Original: FnCallThis = js.native
      
      def race(): ^[scala.Nothing] = js.native
      @JSName("race")
      def race_Q[Q](): ^[Q] = js.native
      
      def reason(): js.Any = js.native
      @JSName("reason")
      var reason_Original: js.Function0[js.Any] = js.native
      
      def reduce[U, Q](
        reducer: js.Function4[
              /* memo */ U, 
              /* item */ Q, 
              /* index */ Double, 
              /* arrayLength */ Double, 
              U | js.Thenable[U]
            ]
      ): ^[U] = js.native
      def reduce[U, Q](
        reducer: js.Function4[
              /* memo */ U, 
              /* item */ Q, 
              /* index */ Double, 
              /* arrayLength */ Double, 
              U | js.Thenable[U]
            ],
        initialValue: U
      ): ^[U] = js.native
      
      def reflect(): Bluebird[Inspection[T]] = js.native
      @JSName("reflect")
      var reflect_Original: js.Function0[Bluebird[Inspection[T]]] = js.native
      
      def `return`(): Bluebird[Unit] = js.native
      def `return`[U](value: U): Bluebird[U] = js.native
      @JSName("return")
      var return_Original: FnCallValue = js.native
      
      def some(count: Double): ^[T] = js.native
      
      def spread[U, Q](fulfilledHandler: js.Function1[/* repeated */ Q, U | js.Thenable[U]]): ^[U] = js.native
      
      def suppressUnhandledRejections(): Unit = js.native
      @JSName("suppressUnhandledRejections")
      var suppressUnhandledRejections_Original: js.Function0[Unit] = js.native
      
      def tap(onFulFill: js.Function1[/* value */ T, Resolvable[js.Any]]): Bluebird[T] = js.native
      
      def tapCatch(onReject: js.Function1[/* error */ js.UndefOr[js.Any], Resolvable[js.Any]]): Bluebird[T] = js.native
      def tapCatch[E1](
        // tslint:disable-next-line:unified-signatures
      filter1: CatchFilter[E1],
        onReject: js.Function1[/* error */ E1, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[js.Any]]): Bluebird[T] = js.native
      def tapCatch[E1, E2](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        onReject: js.Function1[/* error */ E1 | E2, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: CatchFilter[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: CatchFilter[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: CatchFilter[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: CatchFilter[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: CatchFilter[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      def tapCatch[E1, E2, E3, E4, E5](
        filter1: Constructor[E1],
        filter2: Constructor[E2],
        filter3: Constructor[E3],
        filter4: Constructor[E4],
        filter5: Constructor[E5],
        onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
      ): Bluebird[T] = js.native
      @JSName("tapCatch")
      var tapCatch_Original: Fn0[T] = js.native
      
      @JSName("tap")
      var tap_Original: js.Function1[/* onFulFill */ js.Function1[/* value */ T, Resolvable[js.Any]], Bluebird[T]] = js.native
      
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
      def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): Promise[TResult1 | TResult2] = js.native
      def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): Promise[TResult1 | TResult2] = js.native
      
      // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
      def thenReturn(): Bluebird[Unit] = js.native
      // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
      def thenReturn[U](value: U): Bluebird[U] = js.native
      // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
      @JSName("thenReturn")
      var thenReturn_Original: FnCallValue = js.native
      
      def thenThrow(reason: Error): Bluebird[scala.Nothing] = js.native
      @JSName("thenThrow")
      var thenThrow_Original: js.Function1[/* reason */ Error, Bluebird[scala.Nothing]] = js.native
      
      def `throw`(reason: Error): Bluebird[scala.Nothing] = js.native
      @JSName("throw")
      var throw_Original: js.Function1[/* reason */ Error, Bluebird[scala.Nothing]] = js.native
      
      def timeout(ms: Double): Bluebird[T] = js.native
      def timeout(ms: Double, message: String): Bluebird[T] = js.native
      def timeout(ms: Double, message: Error): Bluebird[T] = js.native
      @JSName("timeout")
      var timeout_Original: FnCallMsMessage[T] = js.native
      
      def toJSON(): js.Object = js.native
      @JSName("toJSON")
      var toJSON_Original: js.Function0[js.Object] = js.native
      
      @JSName("toString")
      var toString_Original: js.Function0[String] = js.native
      
      def value(): T = js.native
      @JSName("value")
      var value_Original: js.Function0[T] = js.native
    }
    /*
      * Declare the `Promise` variable. This is needed for es5 only and is a no-op for all other targets.
      *
      * #std-lib-copy&paste-to-remove
      *
      * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
      */
    @JSGlobal("Promise")
    @js.native
    def Promise: PromiseConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Promise")
    @js.native
    class PromiseCls[T] protected ()
      extends StObject
         with Promise[T] {
      def this(callback: js.Function3[
                /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[T | js.Thenable[T]], Unit], 
                /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
                /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
                Unit
              ]) = this()
    }
    
    @scala.inline
    def Promise_=(x: PromiseConstructor): Unit = js.Dynamic.global.updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    type IterateFunction[T, R] = js.Function3[/* item */ T, /* index */ Double, /* arrayLength */ Double, R | js.Thenable[R]]
    
    /*
      * Patch all static methods and the constructor
      */
    @js.native
    trait PromiseConstructor
      extends StObject
         with Instantiable1[
              /* callback */ js.Function3[
                /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[js.Object | js.Thenable[js.Object]], Unit], 
                /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
                /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
                Unit
              ], 
              Promise[js.Object]
            ] {
      
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
      
      // all: typeof Bluebird.all; // Provided by lib.es2015.d.ts
      def any[R](values: Resolvable[Iterable[Resolvable[R]]]): Bluebird[R] = js.native
      // all: typeof Bluebird.all; // Provided by lib.es2015.d.ts
      @JSName("any")
      var any_Original: FnCallValues = js.native
      
      def attempt[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = js.native
      @JSName("attempt")
      var attempt_Original: FnCallFn = js.native
      
      def bind(thisArg: js.Any): Bluebird[Unit] = js.native
      @JSName("bind")
      var bind_Original: js.Function1[/* thisArg */ js.Any, Bluebird[Unit]] = js.native
      
      def cast[R](value: Resolvable[R]): Bluebird[R] = js.native
      @JSName("cast")
      var cast_Original: Fn1 = js.native
      
      def config(options: Cancellation): Unit = js.native
      @JSName("config")
      var config_Original: js.Function1[/* options */ Cancellation, Unit] = js.native
      
      def coroutine[T](generatorFunction: js.Function0[IterableIterator[js.Any]]): js.Function0[Bluebird[T]] = js.native
      def coroutine[T](generatorFunction: js.Function0[IterableIterator[js.Any]], options: CoroutineOptions): js.Function0[Bluebird[T]] = js.native
      def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[js.Any]]): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
      def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[js.Any]], options: CoroutineOptions): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
      def coroutine[T, A1, A2](generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[js.Any]]): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
      def coroutine[T, A1, A2](
        generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[js.Any]],
        options: CoroutineOptions
      ): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3](generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[js.Any]]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3](
        generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[js.Any]],
        options: CoroutineOptions
      ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4](
        generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[js.Any]]
      ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4](
        generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[js.Any]],
        options: CoroutineOptions
      ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5](
        generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[js.Any]]
      ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5](
        generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[js.Any]],
        options: CoroutineOptions
      ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5, A6](
        generatorFunction: js.Function6[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              IterableIterator[js.Any]
            ]
      ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5, A6](
        generatorFunction: js.Function6[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              IterableIterator[js.Any]
            ],
        options: CoroutineOptions
      ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
      def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
        generatorFunction: js.Function7[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              /* a7 */ A7, 
              IterableIterator[js.Any]
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
      def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
        generatorFunction: js.Function7[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              /* a7 */ A7, 
              IterableIterator[js.Any]
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
      def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
        generatorFunction: js.Function8[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              /* a7 */ A7, 
              /* a8 */ A8, 
              IterableIterator[js.Any]
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
      def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
        generatorFunction: js.Function8[
              /* a1 */ A1, 
              /* a2 */ A2, 
              /* a3 */ A3, 
              /* a4 */ A4, 
              /* a5 */ A5, 
              /* a6 */ A6, 
              /* a7 */ A7, 
              /* a8 */ A8, 
              IterableIterator[js.Any]
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
      @JSName("coroutine")
      var coroutine_Original: FnCallGeneratorFunctionOptions = js.native
      
      def defer[R](): Resolver[R] = js.native
      @JSName("defer")
      var defer_Original: Fn2 = js.native
      
      def delay(ms: Double): Bluebird[Unit] = js.native
      def delay[R](ms: Double, value: Resolvable[R]): Bluebird[R] = js.native
      @JSName("delay")
      var delay_Original: FnCallMsValue = js.native
      
      def each[R](
        values: Resolvable[Iterable[Resolvable[R]]],
        iterator: typings.bluebird.mod.IterateFunction[R, js.Any]
      ): Bluebird[js.Array[R]] = js.native
      @JSName("each")
      var each_Original: FnCallValuesIterator = js.native
      
      def filter[R](
        values: Resolvable[Iterable[Resolvable[R]]],
        filterer: typings.bluebird.mod.IterateFunction[R, Boolean]
      ): Bluebird[js.Array[R]] = js.native
      def filter[R](
        values: Resolvable[Iterable[Resolvable[R]]],
        filterer: typings.bluebird.mod.IterateFunction[R, Boolean],
        option: ConcurrencyOption
      ): Bluebird[js.Array[R]] = js.native
      @JSName("filter")
      var filter_Original: FnCallValuesFiltererOption = js.native
      
      def fromCallback[T](
        resolver: js.Function1[
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): Bluebird[T] = js.native
      def fromCallback[T](
        resolver: js.Function1[
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: FromNodeOptions
      ): Bluebird[T] = js.native
      @JSName("fromCallback")
      var fromCallback_Original: FnCallResolverOptions = js.native
      
      def fromNode[T](
        resolver: js.Function1[
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): Bluebird[T] = js.native
      def fromNode[T](
        resolver: js.Function1[
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: FromNodeOptions
      ): Bluebird[T] = js.native
      @JSName("fromNode")
      var fromNode_Original: FnCallResolverOptions = js.native
      
      def is(value: js.Any): Boolean = js.native
      @JSName("is")
      var is_Original: js.Function1[/* value */ js.Any, Boolean] = js.native
      
      def join[R](values: Resolvable[R]*): Bluebird[js.Array[R]] = js.native
      def join[R, A1](arg1: Resolvable[A1], handler: js.Function1[/* arg1 */ A1, Resolvable[R]]): Bluebird[R] = js.native
      def join[R, A1, A2](
        arg1: Resolvable[A1],
        arg2: Resolvable[A2],
        handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]
      ): Bluebird[R] = js.native
      def join[R, A1, A2, A3](
        arg1: Resolvable[A1],
        arg2: Resolvable[A2],
        arg3: Resolvable[A3],
        handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]
      ): Bluebird[R] = js.native
      def join[R, A1, A2, A3, A4](
        arg1: Resolvable[A1],
        arg2: Resolvable[A2],
        arg3: Resolvable[A3],
        arg4: Resolvable[A4],
        handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]
      ): Bluebird[R] = js.native
      def join[R, A1, A2, A3, A4, A5](
        arg1: Resolvable[A1],
        arg2: Resolvable[A2],
        arg3: Resolvable[A3],
        arg4: Resolvable[A4],
        arg5: Resolvable[A5],
        handler: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
      ): Bluebird[R] = js.native
      @JSName("join")
      var join_Original: FnCallArg1Arg2Arg3Arg4Arg5Handler = js.native
      
      def longStackTraces(): Unit = js.native
      @JSName("longStackTraces")
      var longStackTraces_Original: js.Function0[Unit] = js.native
      
      def map[R, U](values: Resolvable[Iterable[Resolvable[R]]], mapper: typings.bluebird.mod.IterateFunction[R, U]): Bluebird[js.Array[U]] = js.native
      def map[R, U](
        values: Resolvable[Iterable[Resolvable[R]]],
        mapper: typings.bluebird.mod.IterateFunction[R, U],
        options: ConcurrencyOption
      ): Bluebird[js.Array[U]] = js.native
      
      def mapSeries[R, U](values: Resolvable[Iterable[Resolvable[R]]], iterator: typings.bluebird.mod.IterateFunction[R, U]): Bluebird[js.Array[U]] = js.native
      @JSName("mapSeries")
      var mapSeries_Original: Fn3 = js.native
      
      @JSName("map")
      var map_Original: FnCallValuesMapperOptions = js.native
      
      def method[R](fn: js.Function0[Resolvable[R]]): js.Function0[Bluebird[R]] = js.native
      def method[R](fn: js.Function1[/* repeated */ js.Any, Resolvable[R]]): js.Function1[/* repeated */ js.Any, Bluebird[R]] = js.native
      def method[R, A1, A2](fn: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[R]] = js.native
      def method[R, A1, A2, A3](fn: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[R]] = js.native
      def method[R, A1, A2, A3, A4](fn: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[R]] = js.native
      def method[R, A1, A2, A3, A4, A5](
        fn: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
      ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[R]] = js.native
      @JSName("method")
      var method_Original: Fn4 = js.native
      @JSName("method")
      def method_RA1[R, A1](fn: js.Function1[/* arg1 */ A1, Resolvable[R]]): js.Function1[/* arg1 */ A1, Bluebird[R]] = js.native
      
      def onPossiblyUnhandledRejection(): Unit = js.native
      def onPossiblyUnhandledRejection(handler: js.Function1[/* reason */ js.Any, js.Any]): Unit = js.native
      def onPossiblyUnhandledRejection(handler: js.Function2[/* error */ Error, /* promise */ Bluebird[js.Any], Unit]): Unit = js.native
      @JSName("onPossiblyUnhandledRejection")
      var onPossiblyUnhandledRejection_Original: FnCallHandler = js.native
      
      def promisify(nodeFunction: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Bluebird[js.Any]] = js.native
      def promisify(nodeFunction: js.Function1[/* repeated */ js.Any, Unit], options: PromisifyOptions): js.Function1[/* repeated */ js.Any, Bluebird[js.Any]] = js.native
      def promisify[T, A1](
        func: js.Function2[
              /* arg1 */ A1, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
      def promisify[T, A1](
        func: js.Function2[
              /* arg1 */ A1, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
      def promisify[T, A1, A2](
        func: js.Function3[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
      def promisify[T, A1, A2](
        func: js.Function3[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3](
        func: js.Function4[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3](
        func: js.Function4[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3, A4](
        func: js.Function5[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* arg4 */ A4, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3, A4](
        func: js.Function5[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* arg4 */ A4, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3, A4, A5](
        func: js.Function6[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* arg4 */ A4, 
              /* arg5 */ A5, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
      def promisify[T, A1, A2, A3, A4, A5](
        func: js.Function6[
              /* arg1 */ A1, 
              /* arg2 */ A2, 
              /* arg3 */ A3, 
              /* arg4 */ A4, 
              /* arg5 */ A5, 
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
      
      def promisifyAll[T /* <: js.Object */](target: T): T = js.native
      def promisifyAll[T /* <: js.Object */](target: T, options: PromisifyAllOptions[T]): T = js.native
      @JSName("promisifyAll")
      var promisifyAll_Original: FnCallTargetOptions = js.native
      
      @JSName("promisify")
      var promisify_Original: FnCallNodeFunctionOptions = js.native
      @JSName("promisify")
      def promisify_T_Function0[T](
        func: js.Function1[
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ]
      ): js.Function0[Bluebird[T]] = js.native
      @JSName("promisify")
      def promisify_T_Function0[T](
        func: js.Function1[
              /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
              Unit
            ],
        options: PromisifyOptions
      ): js.Function0[Bluebird[T]] = js.native
      
      def props[T](`object`: js.Thenable[ResolvableProps[T]]): Bluebird[T] = js.native
      def props[T](`object`: ResolvableProps[T]): Bluebird[T] = js.native
      @JSName("props")
      def props_KV[K, V](map: Resolvable[Map[K, Resolvable[V]]]): Bluebird[Map[K, V]] = js.native
      @JSName("props")
      var props_Original: FnCallObject = js.native
      
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
      
      // race: typeof Bluebird.race; // Provided by lib.es2015.d.ts
      def reduce[R, U](
        values: Resolvable[Iterable[Resolvable[R]]],
        reducer: js.Function4[
              /* total */ U, 
              /* current */ R, 
              /* index */ Double, 
              /* arrayLength */ Double, 
              Resolvable[U]
            ]
      ): Bluebird[U] = js.native
      // race: typeof Bluebird.race; // Provided by lib.es2015.d.ts
      def reduce[R, U](
        values: Resolvable[Iterable[Resolvable[R]]],
        reducer: js.Function4[
              /* total */ U, 
              /* current */ R, 
              /* index */ Double, 
              /* arrayLength */ Double, 
              Resolvable[U]
            ],
        initialValue: U
      ): Bluebird[U] = js.native
      // race: typeof Bluebird.race; // Provided by lib.es2015.d.ts
      @JSName("reduce")
      var reduce_Original: FnCallValuesReducerInitialValue = js.native
      
      def reject(reason: js.Any): Promise[scala.Nothing] = js.native
      @JSName("reject")
      def reject_T[T](reason: js.Any): Promise[T] = js.native
      
      def resolve(): Promise[Unit] = js.native
      def resolve[T](value: T): Promise[T] = js.native
      def resolve[T](value: js.Thenable[T]): Promise[T] = js.native
      
      // reject: typeof Bluebird.reject; // Provided by lib.es2015.d.ts
      // resolve: typeof Bluebird.resolve; // Provided by lib.es2015.d.ts
      def some[R](values: Resolvable[Iterable[Resolvable[R]]], count: Double): Bluebird[js.Array[R]] = js.native
      // reject: typeof Bluebird.reject; // Provided by lib.es2015.d.ts
      // resolve: typeof Bluebird.resolve; // Provided by lib.es2015.d.ts
      @JSName("some")
      var some_Original: FnCallValuesCount = js.native
      
      def `try`[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = js.native
      @JSName("try")
      var try_Original: FnCallFn = js.native
      
      def `using`[R, T](disposer: Disposer[R], executor: js.Function1[/* transaction */ R, js.Thenable[T]]): Bluebird[T] = js.native
      def `using`[R1, R2, T](
        disposer: Disposer[R1],
        disposer2: Disposer[R2],
        executor: js.Function2[/* transaction1 */ R1, /* transaction2 */ R2, js.Thenable[T]]
      ): Bluebird[T] = js.native
      def `using`[R1, R2, R3, T](
        disposer: Disposer[R1],
        disposer2: Disposer[R2],
        disposer3: Disposer[R3],
        executor: js.Function3[/* transaction1 */ R1, /* transaction2 */ R2, /* transaction3 */ R3, js.Thenable[T]]
      ): Bluebird[T] = js.native
      @JSName("using")
      var using_Original: FnCallDisposerDisposer2Disposer3Executor = js.native
    }
  }
}
