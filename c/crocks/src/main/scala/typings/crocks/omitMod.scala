package typings.crocks

import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object omitMod {
  
  @JSImport("crocks/helpers/omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[O, K /* <: String */](ks: js.Array[K]): js.Function1[/* o */ O, Omit[O, K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ks.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* o */ O, Omit[O, K]]]
  inline def default[O, K /* <: String */](ks: js.Array[K], o: O): Omit[O, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ks.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Omit[O, K]]
}
