package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseIntMod {
  
  /* was `typeof core.Number.parseInt` */
  inline def apply(string: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(string: java.lang.String, radix: Double): Double = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("core-js/fn/number/parse-int", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
