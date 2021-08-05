package typings.bezierEasing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(x1: Double, y1: Double, x2: Double, y2: Double): EasingFunction = (^.asInstanceOf[js.Dynamic].apply(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[EasingFunction]
  
  @JSImport("bezier-easing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type EasingFunction = js.Function1[/* input */ Double, Double]
}
