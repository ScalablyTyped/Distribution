package typings.bigRat

import typings.bigRat.mod.Rat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toStringMod {
  
  inline def apply(value: Rat): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("big-rat/to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
