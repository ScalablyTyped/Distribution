package typings.bezierEasing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bezier-easing", JSImport.Namespace)
  @js.native
  def apply(x1: Double, y1: Double, x2: Double, y2: Double): EasingFunction = js.native
  
  type EasingFunction = js.Function1[/* input */ Double, Double]
}
