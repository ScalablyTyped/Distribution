package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasPropMod {
  
  @JSImport("crocks/predicates/hasProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(prop: String): js.Function1[/* val */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, Boolean]]
  inline def default(prop: String, `val`: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(prop: Double): js.Function1[/* val */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, Boolean]]
  inline def default(prop: Double, `val`: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
