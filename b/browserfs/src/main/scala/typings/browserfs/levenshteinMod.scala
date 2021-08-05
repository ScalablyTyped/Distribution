package typings.browserfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object levenshteinMod {
  
  @JSImport("browserfs/dist/node/core/levenshtein", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
