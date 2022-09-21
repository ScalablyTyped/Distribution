package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapMod {
  
  @JSImport("crocks/helpers/tap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](fn: js.Function1[/* a */ A, Any]): js.Function1[/* a */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, A]]
}
