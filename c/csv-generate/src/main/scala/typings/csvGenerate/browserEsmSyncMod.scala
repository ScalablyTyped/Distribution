package typings.csvGenerate

import typings.csvGenerate.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object browserEsmSyncMod {
  
  @JSImport("csv-generate/browser/esm/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate[T](options: Double): String & js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String & js.Array[T]]
  inline def generate[T](options: Options): String & js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String & js.Array[T]]
}
