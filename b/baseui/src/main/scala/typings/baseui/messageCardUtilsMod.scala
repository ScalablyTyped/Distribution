package typings.baseui

import typings.baseui.baseuiStrings.dark
import typings.baseui.baseuiStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageCardUtilsMod {
  
  @JSImport("baseui/message-card/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBackgroundColorType(backgroundColor: String): dark | light = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundColorType")(backgroundColor.asInstanceOf[js.Any]).asInstanceOf[dark | light]
}
