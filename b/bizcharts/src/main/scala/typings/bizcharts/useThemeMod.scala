package typings.bizcharts

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useThemeMod {
  
  @JSImport("bizcharts/lib/hooks/useTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[LooseObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[LooseObject]]
  inline def default(defaultThemeName: String): js.Array[LooseObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultThemeName.asInstanceOf[js.Any]).asInstanceOf[js.Array[LooseObject]]
}
