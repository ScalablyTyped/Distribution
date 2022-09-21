package typings.baseui

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagUtilsMod {
  
  @JSImport("baseui/tag/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTextFromChildren(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextFromChildren")().asInstanceOf[String]
  inline def getTextFromChildren(children: ReactNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[String]
}
