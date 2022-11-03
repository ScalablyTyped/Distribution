package typings.bessel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bessel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def besseli(value: Double, order: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("besseli")(value.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def besselj(value: Double, order: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("besselj")(value.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def besselk(value: Double, order: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("besselk")(value.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bessely(value: Double, order: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bessely")(value.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("bessel", "version")
  @js.native
  val version: String = js.native
}
