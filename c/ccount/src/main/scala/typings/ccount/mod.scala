package typings.ccount

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ccount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ccount(value: String, character: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ccount")(value.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Double]
}
