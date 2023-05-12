package typings.csstoolsCssCalc

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUnitConversionsMod {
  
  @JSImport("@csstools/css-calc/dist/unit-conversions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/css-calc/dist/unit-conversions", "conversions")
  @js.native
  val conversions: Map[String, Map[String, js.Function1[/* number */ Double, Double]]] = js.native
  
  inline def convertUnit[T /* <: CSSToken */](a: CSSToken, b: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUnit")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def toCanonicalUnit[T /* <: CSSToken */](a: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanonicalUnit")(a.asInstanceOf[js.Any]).asInstanceOf[T]
}
