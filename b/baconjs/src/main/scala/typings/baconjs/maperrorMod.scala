package typings.baconjs

import typings.baconjs.transformMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maperrorMod {
  
  @JSImport("baconjs/types/maperror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](f: V): Transformer[V, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[Transformer[V, V]]
  @scala.inline
  def default[V](f: js.Function1[/* error */ js.Any, V]): Transformer[V, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[Transformer[V, V]]
}
