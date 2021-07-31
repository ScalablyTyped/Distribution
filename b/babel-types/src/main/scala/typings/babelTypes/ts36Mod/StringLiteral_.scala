package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringLiteral_
  extends StObject
     with Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_StringLiteral_ : StringLiteral
  
  var value: String
}
object StringLiteral_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, value: String): StringLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[StringLiteral_]
  }
  
  @scala.inline
  implicit class StringLiteral_MutableBuilder[Self <: StringLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
