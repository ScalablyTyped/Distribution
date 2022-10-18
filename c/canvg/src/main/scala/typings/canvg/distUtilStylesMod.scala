package typings.canvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilStylesMod {
  
  @JSImport("canvg/dist/util/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSelectorSpecificity(selector: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectorSpecificity")(selector.asInstanceOf[js.Any]).asInstanceOf[String]
}
