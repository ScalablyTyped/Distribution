package typings.cssSelectorParser

import org.scalablytyped.runtime.StringDictionary
import typings.cssSelectorParser.cssSelectorParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-selector-parser/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def escapeIdentifier(s: String): String = js.native
  
  def escapeStr(s: String): String = js.native
  
  def isHex(c: String): Boolean = js.native
  
  def isIdent(c: String): Boolean = js.native
  
  def isIdentStart(c: String): Boolean = js.native
  
  @js.native
  object doubleQuotesEscapeChars extends /* char */ StringDictionary[String]
  
  @js.native
  object identSpecialChars extends /* char */ StringDictionary[`true`]
  
  @js.native
  object singleQuoteEscapeChars extends /* char */ StringDictionary[String]
  
  @js.native
  object strReplacementsRev extends /* char */ StringDictionary[String]
}
