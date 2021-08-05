package typings.chunkd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chunkd/dist/chunkd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](array: js.Array[T], index: Double, total: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
