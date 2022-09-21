package typings.bigRat

import typings.bigRat.mod.Rat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recipMod {
  
  inline def apply(a: Rat): Rat = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[Rat]
  
  @JSImport("big-rat/recip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
