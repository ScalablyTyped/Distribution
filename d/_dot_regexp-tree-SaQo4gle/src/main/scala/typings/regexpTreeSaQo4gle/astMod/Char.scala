package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.control
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.decimal
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.hex
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.meta
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.oct
import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.unicode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTreeSaQo4gle.astMod.SimpleChar
  - typings.regexpTreeSaQo4gle.astMod.SpecialChar
*/
trait Char
  extends StObject
     with Expression
object Char {
  
  inline def SimpleChar(codePoint: Double, value: String): typings.regexpTreeSaQo4gle.astMod.SimpleChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = "simple", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.SimpleChar]
  }
  
  inline def SpecialChar(codePoint: Double, kind: meta | control | hex | decimal | oct | unicode, value: String): typings.regexpTreeSaQo4gle.astMod.SpecialChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typings.regexpTreeSaQo4gle.astMod.SpecialChar]
  }
}
