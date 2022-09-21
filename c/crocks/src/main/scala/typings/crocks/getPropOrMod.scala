package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPropOrMod {
  
  @JSImport("crocks/helpers/getPropOr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A /* <: Any */](a: A): js.Function1[/* p */ String | Double, js.Function1[/* b */ Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p */ String | Double, js.Function1[/* b */ Any, A]]]
  inline def default[A /* <: Any */](a: A, p: String): js.Function1[/* b */ Any, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ Any, A]]
  inline def default[A /* <: Any */](a: A, p: String, b: Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
  inline def default[A /* <: Any */](a: A, p: Double): js.Function1[/* b */ Any, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ Any, A]]
  inline def default[A /* <: Any */](a: A, p: Double, b: Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
}
