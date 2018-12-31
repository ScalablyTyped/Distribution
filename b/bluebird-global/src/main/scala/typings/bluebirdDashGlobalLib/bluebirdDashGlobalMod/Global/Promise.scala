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
  var all: js.Function0[bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.IterableOrNever[T]]] = js.native
  var any: js.Function0[bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.IterableItem[T]]] = js.native
  var asCallback: (js.Function1[
    /* callback */ js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit], 
    this.type
  ]) | (js.Function2[
    /* callback */ js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit], 
    /* options */ bluebirdLib.bluebirdMod.BluebirdNs.SpreadOption, 
    this.type
  ]) | (js.Function1[/* repeated */ js.Any, this.type]) = js.native
  var bind: js.Function1[/* thisArg */ js.Any, bluebirdLib.bluebirdMod.Bluebird[T]] = js.native
  var call: js.Function2[
    /* propertyName */ java.lang.String, 
    /* repeated */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[
      stdLib.ReturnType[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]
  ] = js.native
  var cancel: js.Function0[scala.Unit] = js.native
  var catchReturn: (js.Function1[/* value */ js.Any, bluebirdLib.bluebirdMod.Bluebird[T | _]]) | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter5 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter5 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* value */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[T | _]
  ]) = js.native
  var catchThrow: (js.Function1[/* reason */ stdLib.Error, bluebirdLib.bluebirdMod.Bluebird[T]]) | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter5 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter5 */ bluebirdLib.Constructor[stdLib.Error] | bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter4 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter3 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* filter2 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.Constructor[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.CatchFilter[stdLib.Error], 
    /* reason */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) = js.native
  // catch: Bluebird<T>["catch"]; // Provided by lib.es5.d.ts
  var caught: (js.Function1[
    /* onReject */ js.UndefOr[(js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]]) | scala.Null], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* filter5 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter5 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_ | T]
  ]) = js.native
  var delay: js.Function1[/* ms */ scala.Double, bluebirdLib.bluebirdMod.Bluebird[T]] = js.native
  var disposer: js.Function1[
    /* disposeFn */ js.Function2[
      /* arg */ T, 
      /* promise */ bluebirdLib.bluebirdMod.Bluebird[T], 
      bluebirdLib.Resolvable[scala.Unit]
    ], 
    bluebirdLib.bluebirdMod.BluebirdNs.Disposer[T]
  ] = js.native
  var done: js.Function0[scala.Unit] | (js.Function1[
    /* onFulfilled */ js.Function1[/* value */ T, bluebirdLib.Resolvable[_]], 
    scala.Unit
  ]) | (js.Function2[
    /* onFulfilled */ js.Function1[/* value */ T, bluebirdLib.Resolvable[_]], 
    /* onRejected */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    scala.Unit
  ]) = js.native
  var each: js.Function1[
    /* iterator */ bluebirdLib.IterateFunction[bluebirdLib.IterableItem[T], _], 
    bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.IterableOrNever[T]]
  ] = js.native
  var error: js.Function1[
    /* onReject */ js.Function1[/* reason */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ] = js.native
  var filter: (js.Function1[
    /* filterer */ bluebirdLib.IterateFunction[bluebirdLib.IterableItem[T], scala.Boolean], 
    bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.IterableOrNever[T]]
  ]) | (js.Function2[
    /* filterer */ bluebirdLib.IterateFunction[bluebirdLib.IterableItem[T], scala.Boolean], 
    /* options */ bluebirdLib.bluebirdMod.BluebirdNs.ConcurrencyOption, 
    bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.IterableOrNever[T]]
  ]) = js.native
  // finally: Bluebird<T>["finally"]; // Provided by lib.es2018.promise.d.ts
  var get: js.Function1[
    /* key */ java.lang.String, 
    bluebirdLib.bluebirdMod.Bluebird[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  var isCancelled: js.Function0[scala.Boolean] = js.native
  var isFulfilled: js.Function0[scala.Boolean] = js.native
  var isPending: js.Function0[scala.Boolean] = js.native
  var isRejected: js.Function0[scala.Boolean] = js.native
  var isResolved: js.Function0[scala.Boolean] = js.native
  var lastly: js.Function1[
    /* handler */ js.Function0[bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ] = js.native
  var map: (js.Function1[
    /* mapper */ bluebirdLib.IterateFunction[bluebirdLib.IterableItem[T], _], 
    bluebirdLib.bluebirdMod.Bluebird[js.Array[_]]
  ]) | (js.Function2[
    /* mapper */ bluebirdLib.IterateFunction[bluebirdLib.IterableItem[T], _], 
    /* options */ bluebirdLib.bluebirdMod.BluebirdNs.ConcurrencyOption, 
    bluebirdLib.bluebirdMod.Bluebird[js.Array[_]]
  ]) = js.native
  var mapSeries: js.Function1[
    /* iterator */ bluebirdLib.IterateFunction[bluebirdLib.IterableItem[T], _], 
    bluebirdLib.bluebirdMod.Bluebird[js.Array[_]]
  ] = js.native
  var nodeify: (js.Function1[
    /* callback */ js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit], 
    this.type
  ]) | (js.Function2[
    /* callback */ js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], scala.Unit], 
    /* options */ bluebirdLib.bluebirdMod.BluebirdNs.SpreadOption, 
    this.type
  ]) | (js.Function1[/* repeated */ js.Any, this.type]) = js.native
  var props: (js.ThisFunction0[
    /* this */ js.Thenable[stdLib.Map[_, bluebirdLib.Resolvable[_]]], 
    bluebirdLib.bluebirdMod.Bluebird[stdLib.Map[_, _]]
  ]) | (js.ThisFunction0[
    /* this */ js.Thenable[bluebirdLib.bluebirdMod.BluebirdNs.ResolvableProps[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) = js.native
  var race: js.Function0[bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.IterableItem[T]]] = js.native
  var reason: js.Function0[_] = js.native
  var reduce: (js.Function1[
    /* reducer */ js.Function4[
      /* memo */ js.Any, 
      /* item */ bluebirdLib.IterableItem[T], 
      /* index */ scala.Double, 
      /* arrayLength */ scala.Double, 
      bluebirdLib.Resolvable[_]
    ], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) | (js.Function2[
    /* reducer */ js.Function4[
      /* memo */ js.Any, 
      /* item */ bluebirdLib.IterableItem[T], 
      /* index */ scala.Double, 
      /* arrayLength */ scala.Double, 
      bluebirdLib.Resolvable[_]
    ], 
    /* initialValue */ js.Any, 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ]) = js.native
  var reflect: (js.Function0[
    bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.bluebirdMod.BluebirdNs.Inspection[T]]
  ]) | (js.Function0[
    bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.bluebirdMod.BluebirdNs.Inspection[_]]
  ]) = js.native
  var `return`: js.Function0[bluebirdLib.bluebirdMod.Bluebird[scala.Unit]] | (js.Function1[/* value */ js.Any, bluebirdLib.bluebirdMod.Bluebird[_]]) = js.native
  var some: js.Function1[
    /* count */ scala.Double, 
    bluebirdLib.bluebirdMod.Bluebird[bluebirdLib.IterableOrNever[T]]
  ] = js.native
  var spread: js.Function1[
    /* fulfilledHandler */ js.Function1[/* repeated */ bluebirdLib.IterableItem[T], bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[_]
  ] = js.native
  var suppressUnhandledRejections: js.Function0[scala.Unit] = js.native
  var tap: js.Function1[
    /* onFulFill */ js.Function1[/* value */ T, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ] = js.native
  var tapCatch: (js.Function1[
    /* onReject */ js.Function1[/* error */ js.UndefOr[js.Any], bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* filter5 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function6[
    /* filter1 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* filter5 */ bluebirdLib.Constructor[_] | bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function5[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* filter4 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function4[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* filter3 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function3[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* filter2 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.Constructor[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function2[
    /* filter1 */ bluebirdLib.CatchFilter[_], 
    /* onReject */ js.Function1[/* error */ js.Any, bluebirdLib.Resolvable[_]], 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) = js.native
  // then: Bluebird<T>["then"]; // Provided by lib.es5.d.ts
  var thenReturn: js.Function0[bluebirdLib.bluebirdMod.Bluebird[scala.Unit]] | (js.Function1[/* value */ js.Any, bluebirdLib.bluebirdMod.Bluebird[_]]) = js.native
  var thenThrow: js.Function1[/* reason */ stdLib.Error, bluebirdLib.bluebirdMod.Bluebird[scala.Nothing]] = js.native
  var `throw`: js.Function1[/* reason */ stdLib.Error, bluebirdLib.bluebirdMod.Bluebird[scala.Nothing]] = js.native
  var timeout: (js.Function1[/* ms */ scala.Double, bluebirdLib.bluebirdMod.Bluebird[T]]) | (js.Function2[
    /* ms */ scala.Double, 
    /* message */ java.lang.String, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) | (js.Function2[
    /* ms */ scala.Double, 
    /* message */ stdLib.Error, 
    bluebirdLib.bluebirdMod.Bluebird[T]
  ]) = js.native
  var toJSON: js.Function0[js.Object] = js.native
  @JSName("toString")
  var toString_FPromise: js.Function0[java.lang.String] = js.native
  var value: js.Function0[T] = js.native
  /*
    * TypeScript disallows adding overrides via `catch: typeof Bluebird.prototype.catch`. Copy&paste them then.
    *
    * @todo Duplication of code is never ideal. See whether there's a better way of achieving this.
    */
  def `catch`(
    predicate: js.Function1[/* error */ js.Any, scala.Boolean],
    onReject: js.Function1[/* error */ js.Any, T | js.Thenable[T] | scala.Unit | js.Thenable[scala.Unit]]
  ): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def `catch`(
    predicate: js.Object,
    onReject: js.Function1[/* error */ js.Any, T | js.Thenable[T] | scala.Unit | js.Thenable[scala.Unit]]
  ): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def `catch`[TResult](): Promise[T | TResult] = js.native
  def `catch`[E /* <: stdLib.Error */](
    ErrorClass: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, E],
    onReject: js.Function1[/* error */ E, T | js.Thenable[T] | scala.Unit | js.Thenable[scala.Unit]]
  ): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
  @JSName("catch")
  def catch_EErrorU[E /* <: stdLib.Error */, U](
    ErrorClass: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, E],
    onReject: js.Function1[/* error */ E, U | js.Thenable[U]]
  ): bluebirdLib.bluebirdMod.namespaced[U | T] = js.native
  @JSName("catch")
  def catch_U[U](
    predicate: js.Function1[/* error */ js.Any, scala.Boolean],
    onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]
  ): bluebirdLib.bluebirdMod.namespaced[U | T] = js.native
  @JSName("catch")
  def catch_U[U](predicate: js.Object, onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]): bluebirdLib.bluebirdMod.namespaced[U | T] = js.native
  /*
    * See comments above `then` for the reason why this is needed. Taken from es2018.promise.d.ts.
    *
    * #std-lib-copy&paste-to-remove
    *
    * @todo See the comment near the top of the file about code marked with #std-lib-copy&paste-to-remove
    */
  def `finally`(): Promise[T] = js.native
  def `finally`(onfinally: js.Function0[scala.Unit]): Promise[T] = js.native
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
}

