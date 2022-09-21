package typings.charToString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("char-to-string/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(character: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(character.asInstanceOf[js.Any]).asInstanceOf[String]
}
