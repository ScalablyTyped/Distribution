package typings.bindPonyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: js.Function, that: Any, args: Any*): js.Function = (^.asInstanceOf[js.Dynamic].apply((scala.List(fn.asInstanceOf[js.Any], that.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function]
  
  @JSImport("bind-ponyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
