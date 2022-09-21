package typings.dequal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liteMod {
  
  @JSImport("dequal/lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dequal(foo: Any, bar: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dequal")(foo.asInstanceOf[js.Any], bar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
