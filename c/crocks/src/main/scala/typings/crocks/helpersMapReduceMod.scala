package typings.crocks

import typings.crocks.internalTypesMod.BinaryFunction
import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMapReduceMod {
  
  @JSImport("crocks/helpers/mapReduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C](fn1: UnaryFunction): js.Function1[
    /* fn2 */ BinaryFunction, 
    js.Function1[/* c */ C, js.Function1[/* f */ js.Array[Any], C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fn2 */ BinaryFunction, 
    js.Function1[/* c */ C, js.Function1[/* f */ js.Array[Any], C]]
  ]]
  inline def default[C](fn1: UnaryFunction, fn2: BinaryFunction): js.Function1[/* c */ C, js.Function1[/* f */ js.Array[Any], C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* c */ C, js.Function1[/* f */ js.Array[Any], C]]]
  inline def default[C](fn1: UnaryFunction, fn2: BinaryFunction, c: C): js.Function1[/* f */ js.Array[Any], C] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Array[Any], C]]
  /**
    * mapReduce :: Foldable f => (a -> b) -> (c -> b -> c) -> c -> f a -> c
    */
  inline def default[C](fn1: UnaryFunction, fn2: BinaryFunction, c: C, f: js.Array[Any]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], c.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[C]
}
