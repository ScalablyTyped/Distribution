package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.RegExpLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExpLiteral_
  extends Node
     with Expression
     with Literal {
  
  var flags: js.UndefOr[String] = js.native
  
  var pattern: String = js.native
  
  @JSName("type")
  var type_RegExpLiteral_ : RegExpLiteral = js.native
}
object RegExpLiteral_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, pattern: String, start: Double, `type`: RegExpLiteral): RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral_]
  }
  
  @scala.inline
  implicit class RegExpLiteral_MutableBuilder[Self <: RegExpLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RegExpLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
