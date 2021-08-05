package typings.bindPonyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: js.Function, that: js.Any, args: js.Any*): js.Function = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], that.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @JSImport("bind-ponyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
