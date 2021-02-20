package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.BooleanLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanLiteral_
  extends Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_BooleanLiteral_ : BooleanLiteral = js.native
  
  var value: Boolean = js.native
}
object BooleanLiteral_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: BooleanLiteral, value: Boolean): BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteral_]
  }
  
  @scala.inline
  implicit class BooleanLiteral_MutableBuilder[Self <: BooleanLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BooleanLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
