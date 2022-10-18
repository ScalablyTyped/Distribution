package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicatesHasPropPathMod {
  
  @JSImport("crocks/predicates/hasPropPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: js.Array[String | Double]): js.Function1[/* val */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, Boolean]]
  inline def default(path: js.Array[String | Double], `val`: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
