package typings.bigRat

import typings.bigRat.mod.Rat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signMod {
  
  inline def apply(a: Rat): Double = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("big-rat/sign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
