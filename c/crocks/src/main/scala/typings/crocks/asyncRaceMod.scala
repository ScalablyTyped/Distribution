package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncRaceMod {
  
  @JSImport("crocks/Async/race", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(val1: typings.crocks.asyncAsyncMod.default): js.Function1[
    /* val2 */ typings.crocks.asyncAsyncMod.default, 
    typings.crocks.asyncAsyncMod.default
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(val1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* val2 */ typings.crocks.asyncAsyncMod.default, 
    typings.crocks.asyncAsyncMod.default
  ]]
  /**
    * race :: Async e a -> Async e a -> Async e a
    */
  inline def default(val1: typings.crocks.asyncAsyncMod.default, val2: typings.crocks.asyncAsyncMod.default): typings.crocks.asyncAsyncMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[typings.crocks.asyncAsyncMod.default]
}
