package typings.cssSelectorParser

import typings.cssSelectorParser.selectorMod.SelectorEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("css-selector-parser/lib/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderEntity(entity: SelectorEntity): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[String]
}
