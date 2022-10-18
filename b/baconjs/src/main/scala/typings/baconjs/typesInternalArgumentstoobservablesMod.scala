package typings.baconjs

import typings.baconjs.typesObservableMod.default
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalArgumentstoobservablesMod {
  
  @JSImport("baconjs/types/internal/argumentstoobservables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argumentsToObservables[T](args: js.Array[default[T] | js.Array[default[T]] | T]): js.Array[default[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentsToObservables")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[default[T]]]
  
  inline def argumentsToObservablesAndFunction[V](args: IArguments): js.Tuple2[js.Array[default[Any]], js.Function1[/* repeated */ Any, V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentsToObservablesAndFunction")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[default[Any]], js.Function1[/* repeated */ Any, V]]]
}
