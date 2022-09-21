package typings.crocks

import typings.crocks.writerWriterMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerToPairMod {
  
  @JSImport("crocks/Pair/writerToPair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: js.Function1[/* val */ Any, Writer]): js.Function1[/* val */ Any, typings.crocks.pairPairMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, typings.crocks.pairPairMod.default]]
  /**
    * writerToPair :: Monoid m => Writer m a -> Pair m a
    * writerToPair :: Monoid m => (a -> Writer m b) -> a -> Pair m b
    */
  inline def default(`val`: Writer): typings.crocks.pairPairMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.pairPairMod.default]
}
