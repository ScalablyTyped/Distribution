package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolMod {
  
  @JSImport("baconjs/types/symbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def symbol(key: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
