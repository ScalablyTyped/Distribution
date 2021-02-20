package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringLiteral_
  extends Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_StringLiteral_ : StringLiteral = js.native
  
  var value: String = js.native
}
object StringLiteral_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: StringLiteral, value: String): StringLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
