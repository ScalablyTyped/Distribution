package typings.blueprintjsCore

import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonUtilsIsDarkThemeMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/isDarkTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDarkTheme(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDarkTheme")().asInstanceOf[Boolean]
  inline def isDarkTheme(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDarkTheme")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDarkTheme(element: Text): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDarkTheme")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
