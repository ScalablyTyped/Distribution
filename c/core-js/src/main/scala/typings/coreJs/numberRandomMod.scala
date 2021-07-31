package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberRandomMod {
  
  /* was `typeof core.Number.random` */
  @scala.inline
  def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  @scala.inline
  def apply(lim: Double): Double = ^.asInstanceOf[js.Dynamic].apply(lim.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("core-js/library/fn/number/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
