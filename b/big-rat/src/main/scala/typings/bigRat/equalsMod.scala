package typings.bigRat

import typings.bigRat.mod.Rat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalsMod {
  
  inline def apply(a: Rat, b: Rat): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("big-rat/equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
