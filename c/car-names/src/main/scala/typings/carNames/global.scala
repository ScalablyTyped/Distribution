package typings.carNames

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object carNames {
    
    @JSGlobal("carNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("carNames.all")
    @js.native
    val all: js.Array[String] = js.native
    
    inline def random(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[String]
  }
}
