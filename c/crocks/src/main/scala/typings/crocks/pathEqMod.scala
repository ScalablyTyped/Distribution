package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathEqMod {
  
  @JSImport("crocks/predicates/pathEq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: js.Array[String | Double]): js.Function1[/* val */ Any, js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, js.Function1[/* obj */ js.Object, Boolean]]]
  inline def default(path: js.Array[String | Double], `val`: Any): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  inline def default(path: js.Array[String | Double], `val`: Any, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
