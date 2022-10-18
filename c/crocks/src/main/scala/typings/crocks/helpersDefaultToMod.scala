package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersDefaultToMod {
  
  @JSImport("crocks/helpers/defaultTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](a: A): js.Function1[/* b */ Any, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ Any, A]]
  inline def default[A](a: A, b: Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
}
