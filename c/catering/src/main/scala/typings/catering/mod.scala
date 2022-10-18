package typings.catering

import typings.catering.anon.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("catering", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCallback[T](): Callback[T] & Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")().asInstanceOf[Callback[T] & Promise[T]]
  inline def fromCallback[T](callback: Callback[T]): Callback[T] & Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Callback[T] & Promise[T]]
  inline def fromCallback[T, S /* <: js.Symbol */](callback: Unit, symbol: S): Callback[T] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in S ]:? std.Promise<T>} */ js.Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")(callback.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[Callback[T] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in S ]:? std.Promise<T>} */ js.Any)]
  inline def fromCallback[T, S /* <: js.Symbol */](callback: Callback[T], symbol: S): Callback[T] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in S ]:? std.Promise<T>} */ js.Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")(callback.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[Callback[T] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in S ]:? std.Promise<T>} */ js.Any)]
  
  inline def fromPromise[T](promise: js.Promise[T]): js.UndefOr[js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[T]]]
  inline def fromPromise[T](promise: js.Promise[T], callback: Callback[T]): js.UndefOr[js.Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[T]]]
  
  type Callback[T] = js.Function2[/* err */ js.Error | Null, /* result */ T, Unit]
}
