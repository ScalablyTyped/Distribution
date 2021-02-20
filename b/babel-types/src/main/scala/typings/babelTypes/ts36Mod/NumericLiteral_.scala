package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.NumericLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericLiteral_
  extends Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_NumericLiteral_ : NumericLiteral = js.native
  
  var value: Double = js.native
}
object NumericLiteral_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: NumericLiteral, value: Double): NumericLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteral_]
  }
  
  @scala.inline
  implicit class NumericLiteral_MutableBuilder[Self <: NumericLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
