package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersBinaryMod {
  
  @JSImport("crocks/helpers/binary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C](fn: js.Function1[/* repeated */ Any, C]): js.Function1[/* a */ Any, js.Function1[/* b */ Any, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, js.Function1[/* b */ Any, C]]]
  
  inline def default_C_Function2[C](fn: js.Function1[/* repeated */ Any, C]): js.Function2[/* a */ Any, /* b */ Any, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, C]]
}
