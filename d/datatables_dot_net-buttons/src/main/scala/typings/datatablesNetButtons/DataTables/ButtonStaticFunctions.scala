package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonStaticFunctions
  extends StObject
     with Instantiable2[
      /* dt */ Api, 
      (/* settings */ js.Array[ButtonSettings | String]) | (/* settings */ Boolean) | (/* settings */ ButtonsSettings), 
      Unit
    ] {
  
  var defaults: ButtonsSettings = js.native
  
  var version: String = js.native
}
