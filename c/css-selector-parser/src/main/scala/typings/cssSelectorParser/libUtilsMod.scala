package typings.cssSelectorParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("css-selector-parser/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeIdentifier(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeIdentifier")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeStr(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeStr")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isHex(c: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHex")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIdent(c: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdent")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIdentStart(c: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentStart")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
