package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersComposePMod {
  
  @JSImport("crocks/helpers/composeP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Z](
    f: js.Array[js.Function1[/* y */ Any, js.Array[js.Promise[Z]]]],
    g: js.Function1[/* repeated */ js.Promise[Any], Any]
  ): js.Promise[Z] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Z]]
}
