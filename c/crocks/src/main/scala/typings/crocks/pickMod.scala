package typings.crocks

import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickMod {
  
  @JSImport("crocks/helpers/pick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[O, K /* <: String */](ks: js.Array[K]): js.Function1[
    /* o */ O, 
    Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ks.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* o */ O, 
    Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]]
  ]]
  inline def default[O, K /* <: String */](ks: js.Array[K], o: O): Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ks.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]]]
}
