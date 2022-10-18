package typings.baconjs

import typings.baconjs.typesTransformMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDologMod {
  
  @JSImport("baconjs/types/dolog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](args: js.Array[Any]): Transformer[V, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[Transformer[V, V]]
}
