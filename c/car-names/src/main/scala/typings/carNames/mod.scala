package typings.carNames

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("car-names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("car-names", "all")
  @js.native
  val all: js.Array[String] = js.native
  
  inline def random(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[String]
}
