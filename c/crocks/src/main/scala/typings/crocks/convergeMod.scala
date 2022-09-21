package typings.crocks

import typings.crocks.typesMod.BinaryFunction
import typings.crocks.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convergeMod {
  
  @JSImport("crocks/combinators/converge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(f: BinaryFunction): js.Function1[/* g */ UnaryFunction, js.Function1[/* h */ UnaryFunction, UnaryFunction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* g */ UnaryFunction, js.Function1[/* h */ UnaryFunction, UnaryFunction]]]
  inline def default(f: BinaryFunction, g: UnaryFunction): js.Function1[/* h */ UnaryFunction, UnaryFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* h */ UnaryFunction, UnaryFunction]]
  /**
    * The Phoenix or Starling Prime
    * converge :: (b -> c -> d) -> (a -> b) -> (a -> c) -> a -> d
    */
  inline def default(f: BinaryFunction, g: UnaryFunction, h: UnaryFunction): UnaryFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction]
}
