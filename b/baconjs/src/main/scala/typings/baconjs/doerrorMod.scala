package typings.baconjs

import typings.baconjs.transformMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doerrorMod {
  
  @JSImport("baconjs/types/doerror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](f: js.Function): Transformer[V, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[Transformer[V, V]]
}
