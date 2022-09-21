package typings.colord

import typings.colord.colordMod.Colord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  @JSImport("colord/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def random(): Colord_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Colord_]
}
