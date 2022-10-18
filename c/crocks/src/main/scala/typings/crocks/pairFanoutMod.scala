package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.starStarMod.Star
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairFanoutMod {
  
  @JSImport("crocks/Pair/fanout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn1: typings.crocks.arrowMod.default): js.Function1[/* fn2 */ typings.crocks.arrowMod.default, typings.crocks.pairPairMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn2 */ typings.crocks.arrowMod.default, typings.crocks.pairPairMod.default]]
  inline def default(fn1: typings.crocks.arrowMod.default, fn2: typings.crocks.arrowMod.default): typings.crocks.pairPairMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[typings.crocks.pairPairMod.default]
  inline def default(fn1: UnaryFunction): js.Function1[
    /* fn2 */ UnaryFunction, 
    js.Function1[/* val */ Any, typings.crocks.pairPairMod.default]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fn2 */ UnaryFunction, 
    js.Function1[/* val */ Any, typings.crocks.pairPairMod.default]
  ]]
  /**
    * fanout :: (a -> b) -> (a -> c) -> (a -> Pair b c)
    * fanout :: Arrow a b -> Arrow a c -> Arrow a (Pair b c)
    * fanout :: Monad m => Star a (m b) -> Star a (m c) -> Star a (m (Pair b c))
    */
  inline def default(fn1: UnaryFunction, fn2: UnaryFunction): js.Function1[/* val */ Any, typings.crocks.pairPairMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* val */ Any, typings.crocks.pairPairMod.default]]
  inline def default(fn1: Star): js.Function1[/* fn2 */ Star, typings.crocks.pairPairMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn2 */ Star, typings.crocks.pairPairMod.default]]
  inline def default(fn1: Star, fn2: Star): typings.crocks.pairPairMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[typings.crocks.pairPairMod.default]
}
