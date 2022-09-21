package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPathOrMod {
  
  @JSImport("crocks/helpers/getPathOr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A /* <: Any */](a: A): js.Function1[/* p */ js.Array[String | Double], js.Function1[/* b */ Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p */ js.Array[String | Double], js.Function1[/* b */ Any, A]]]
  inline def default[A /* <: Any */](a: A, p: js.Array[String | Double]): js.Function1[/* b */ Any, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ Any, A]]
  inline def default[A /* <: Any */](a: A, p: js.Array[String | Double], b: Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
}
