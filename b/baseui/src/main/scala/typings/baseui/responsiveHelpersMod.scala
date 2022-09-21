package typings.baseui

import typings.baseui.themesTypesMod.Breakpoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveHelpersMod {
  
  @JSImport("baseui/helpers/responsive-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMediaQueries(breakpoints: Breakpoints): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMediaQueries")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getMediaQuery(breakpoint: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMediaQuery")(breakpoint.asInstanceOf[js.Any]).asInstanceOf[String]
}
